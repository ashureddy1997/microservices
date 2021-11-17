package pageObjects.timelinePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class TimelinePageIOS extends BasePage implements TimelinePage {

    SoftAssert softAssert=null;

    public TimelinePageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    @FindBy(xpath="//XCUIElementTypeImage[@name=\"SignUpCell\"]")
    private WebElement user_logo;

    @FindBy(xpath="//XCUIElementTypeImage[@name=\"SignUpCell\"]")
    private WebElement username;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Notification\"]")
    private WebElement notification;

    @FindBy(id="bt_connect_child")
    private WebElement connectChildBtn;

    @FindBy(xpath="//android.widget.TextView[@text='Coming soon !!']")
    private WebElement ComingSoon;

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Hey! Take a look at Student_1's progress.\"]")
    private WebElement Heading;

    @FindBys({@FindBy(id = "tvTime")})
    private List<WebElement> dateList;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Today\"]")
    private WebElement Today;

    @FindBys({@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"+\"])[1]")})
    private List<WebElement> expandButtons;

    @FindBys({@FindBy(id = "llLptSummary")})
    private List<WebElement> summaryList;

    @FindBys({@FindBy(id = "ivTime")})
    private List<WebElement> watchImages;

    @FindBys({@FindBy(id = "title")})
    private List<WebElement> titles_DailyTimeSpent;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Embibe Parent\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]")})
    private List<WebElement> ListOfChild;

    @FindBys({@FindBy(xpath= "//XCUIElementTypeApplication[@name=\"Embibe Parent\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]")})
    private List<WebElement> UserLogo;

    @FindBys({@FindBy(id = "tvTimespent")})
    private List<WebElement> timeSpent;

    @FindBys({@FindBy(xpath= "//XCUIElementTypeStaticText[@name=\"1\"]")})
    private List<WebElement> VideoCount;

    @FindBys({@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"1\"])[1]")})
    private List<WebElement> PracticeCount;

    @FindBys({@FindBy(xpath= "(//XCUIElementTypeStaticText[@name=\"1\"])[2]\n")})
    private List<WebElement> TestCount;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Videos Watched\"]")})
    private List<WebElement> text_VideosWatched;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Practice Activity\"]")})
    private List<WebElement> text_PracticeActivities;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Test taken\"]")})
    private List<WebElement> text_TestsTaken;


    @FindBy(id = "ivTest")
    private WebElement TestTile;

    @FindBy(id = "rlConceptSummarylayout")
    private WebElement testSummary;

    @FindBy(id = "tvTestTitle")
    private WebElement Test_Title;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Duration\"]")
    private WebElement test_Duration;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Questions\"]")
    private WebElement test_Questions;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Marks\"]")
    private WebElement test_tvMarks;

    @FindBy(id = "ivPractice")
    private WebElement PracticeTile;

    @FindBy(id = "titleLayout")
    private WebElement practice_title;

    @FindBy(id = "rlConceptSummarylayout")
    private WebElement practice_summary;

    @FindBy(id = "llLptSummary")
    private WebElement learn_summary;

    @FindBy(id = "ivVideo")
    private WebElement learn_video;

    @FindBy(id = "rlConceptSummarylayout")
    private WebElement learn_concept_summary;


    public void clickOnConnectChild(){
        waitForElementToBeVisible(connectChildBtn);
        connectChildBtn.click();
    }
    public void verfiyUIofTrackScreen() {

    }
    public int verifyTestCount(){
        waitForElementToBeVisible(TestCount.get(0));
        int testCount= Integer.parseInt(TestCount.get(0).getText());
        System.out.println("Test count is :"+TestCount.get(0).getText());
        return testCount;
    }
    public int verifyPracticeCount(){
        waitForElementToBeVisible(PracticeCount.get(0));
        int testCount= Integer.parseInt(PracticeCount.get(0).getText());
        System.out.println("practice count is :"+PracticeCount.get(0).getText());
        return testCount;
    }
    public int verifyVideoCount(){
        waitForElementToBeVisible(VideoCount.get(0));
        System.out.println(VideoCount.size());
        softAssert.assertEquals(VideoCount.size(),3,"video count fail");
        softAssert.assertAll();


        int testCount= Integer.parseInt(VideoCount.get(0).getText());
        System.out.println("video count is :"+VideoCount.get(0).getText());
        return testCount;
    }

    public String verifyTodayIsDisplayed() {
        waitForElementToBeVisible(Today);
        softAssert.assertEquals(Today.isEnabled(),true,"date is not displayed");
        String date=Today.getText();
        System.out.println("Date is :"+Today.getText());
        return date;
    }
    public void clickOnUserLogo(){
        waitForElementToBeVisible(user_logo);
        user_logo.click();
    }

    public String selectChild(String ChildName){
        String str=ChildName;
     /*   waitForElementToBeVisible(ListOfChild.get(0));
        for (int i=0;i<ListOfChild.size();i++){
            System.out.println(ListOfChild.get(i).getText()+" Value of i");

            if(ListOfChild.get(i).getText().equalsIgnoreCase(ChildName)){
                str = ListOfChild.get(i).getText();
                UserLogo.get(i).click();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            }*/

        driver().findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+ChildName+"\"]")).click();
        return str;
    }

    public void verifyTestDetailsTakenByChild(){
        softAssert.assertEquals(test_Duration.isEnabled(),true,"test_Duration is not displayed");
        softAssert.assertEquals(test_Questions.isEnabled(),true,"test_Questions is not displayed");
        softAssert.assertEquals(test_tvMarks.isEnabled(),true,"test_tvMarks is not displayed");
        softAssert.assertAll();
    }

    public void verifyPracticeDetailsTakenByChild(){
/*
        softAssert.assertEquals(PracticeTile.isDisplayed(),true,"PracticeTile is not displayed");
        softAssert.assertEquals(practice_title.isDisplayed(),true,"practice_title is not displayed");
        softAssert.assertEquals(practice_summary.isDisplayed(),true,"practice_summary is not displayed");
        softAssert.assertAll();*/
    }

    public void verifyVideoWatchedDetailsByChild(){
      /*  verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(learn_summary);
        softAssert.assertEquals(learn_summary.isDisplayed(),true,"learn_summary is not displayed");
        softAssert.assertEquals(learn_video.isDisplayed(),true,"learn_video is not displayed");
        softAssert.assertEquals(learn_concept_summary.isDisplayed(),true,"learn_concept_summary is not displayed");
        softAssert.assertAll();*/
    }
    public void clickOnExpandButton(){
        waitForElementToBeVisible(expandButtons.get(0));
        expandButtons.get(0).click();
    }
    public void verifyAllTheElementsOnTrackScreen(){
        waitForElementToBeVisible(notification);

        softAssert.assertEquals(username.isEnabled(),true,"username is not displayed");
        softAssert.assertEquals(notification.isDisplayed(),true,"notification is not displayed");
        softAssert.assertEquals(expandButtons.get(0).isDisplayed(),true,"expandButtons is not displayed");
        softAssert.assertAll();
    }
}
