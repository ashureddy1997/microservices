package pageObjects.goalPage;

import constant.Goal;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class GoalPageIOS extends BasePage implements GoalPage{
    SoftAssert softAssert=null;
    public GoalPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select Goal\"]")
    private WebElement title;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeStaticText")})
    private List<WebElement> goalList;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Next\"]")
    private WebElement nextButton;

    @FindBy(id = "tvPrimaryExamNext")
    private WebElement MyClassnextButton;

    public void clickOnNextButton() {
        waitForElementToBeVisible(nextButton);
        nextButton.click();
    }
    public void clickOnNextButtonInMyClass() {
        waitForElementToBeVisible(MyClassnextButton);
        MyClassnextButton.click();
    }

    public void selectGoal(String GoalName) {
        //waitForElementToBeVisible(goalList.get(0));
       WebElement element= driver().findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+GoalName+"\"]"));
        scrollToElementIos(element);

       element.click();

      /*  for (int i = 0; i < goalList.size(); i++) {
            System.out.println(goalList.get(i).getText());
            if (goalList.get(i).getText().equalsIgnoreCase(GoalName)) {
                goalList.get(i).click();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            break;
        }*/
    }



    public void verifyAllTheElementPresent() {
        waitForElementToBeVisible(title);
        softAssert.assertEquals(title.getText(), Goal.Select_Goal,"Title not matched ");
        softAssert.assertEquals(goalList.get(0).isDisplayed(), true,"Goal Not displaying ");
        goalList.get(0).click();
        softAssert.assertEquals(nextButton.isDisplayed(),true,"Next button not displayed");
        softAssert.assertAll();
    }
}
