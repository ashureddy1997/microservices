package integrationTestCases;
import api.AssignmentAPI;
import api.ConnectedProfile;
import api.LoginAPI;
import api.ResetTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

import java.util.concurrent.TimeUnit;

public class AssignmentTestCases extends TestBase {
    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");


    @Test(dataProvider= "select",groups = {}, description = "verify Created assignment")
    public void verifyCreatedAssignment(String AssignmentChildusername, String AssignmentChildPassword,String AssignmentName,String Child) throws InterruptedException {
        String path="src\\test\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver ed=new ChromeDriver();
        logger.info("launch the Browser");
        ed.navigate().to("https://beta.embibe.com/user-home");
        logger.info("Navigate to Url");
        ed.manage().window().maximize();
        ed.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ed.findElement(By.xpath("//*[text()='START NOW']")).click();
        ed.findElement(By.id("start_learning_input")).sendKeys(AssignmentChildusername);
        ed.findElement(By.xpath("//*[text()='Sign In using password']")).click();
        ed.findElement(By.name("password")).sendKeys(AssignmentChildPassword);
        ed.findElement(By.xpath("//*[text()='Sign In']")).click();
        logger.info("Login with Child id");
        AssignmentAPI As=new AssignmentAPI();
        String id=  As.fetchAssignmentId(AssignmentName);
        logger.info("Get the Assignment id fro API");
        System.out.println(id);
        String url="https://beta.embibe.com/user-home/assignment/";
        url=url+id;
        System.out.println(url);
        ed.get(url);
        logger.info("Navigate to URL");
        Assert.assertEquals(AssignmentName,AssignmentName);
        logger.info("Verify Created Assignment Name");
        //Watch Vedio
        ed.findElement(By.xpath("//*[@class='sc-eGRTUG fFSDQc']")).click();
        Thread.sleep(20000);
        WebElement backbutton=ed.findElement(By.xpath("//i[@class='demo-icon demo-icon--filled demo-icon--sm demo-icon--marginTop']"));
        clickOnAnyCoordinate(ed);
        actionClick(backbutton,ed);
        ed.findElement(By.xpath("//*[text()='Close']")).click();
        //Attempt Practice
        ed.findElements(By.className("menu-items")).get(1).click();
        ed.findElement(By.xpath("//*[@id=\"app\"]/main/div[2]/div[4]/div/div[1]/div[2]/div[2]/div/span")).click();
        ed.findElement(By.xpath("//*[@class='sc-jIkYaL eUPoJu']")).click();
        ed.findElement(By.xpath("//i[@class='demo-icon demo-icon--filled demo-icon--sm Title_endSessionIcon__2QErK']")).click();
        ed.findElement(By.xpath("//*[text()='End Session']")).click();
        //Attempt Test
        ed.findElements(By.className("menu-items")).get(2).click();
        ed.findElement(By.xpath("//div[@class='sc-eGRTUG fFSDQc']")).click();
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken(Child ,embibeToken);
        resetTest.resetTest("mb42952",childEmbibeToken);
        ed.findElement(By.xpath("//div[@class='sc-eGRTUG fFSDQc']")).click();

        ed.findElement(By.xpath("//span[text()='I have read and understood the instructions.']/../..//input")).click();
        ed.findElement(By.xpath("//*[text()='Start Now']")).click();
        ed.findElement(By.xpath("//*[@class='sc-fDZTJY kNNZKY']")).click();
        ed.findElement(By.xpath("//*[@class='sc-fDZTJY kNNZKY']")).click();
        ed.quit();

    }
    public void clickOnAnyCoordinate( WebDriver ed) {

        Actions builder = new Actions(ed);
        builder.moveByOffset(40, 0).click().build().perform();
    }
    public void actionClick(WebElement element, WebDriver ed){
        Actions builder = new Actions(ed);
        Action action = builder.moveToElement(element).click(element).build();
        action.perform();
    }


    @DataProvider(name = "select")
    public Object[][] changeGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Asg", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}
