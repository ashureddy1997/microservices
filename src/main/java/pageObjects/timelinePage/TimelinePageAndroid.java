package pageObjects.timelinePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class TimelinePageAndroid extends BasePage implements TimelinePage {

    SoftAssert softAssert=null;

    public TimelinePageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id="user_logo")
    private WebElement user_logo;

    @FindBy(id="username")
    private WebElement username;

    @FindBy(id="notification")
    private WebElement notification;

    @FindBy(id="bt_connect_child")
    private WebElement connectChildBtn;

    @FindBy(xpath="//android.widget.TextView[@text='Coming soon !!']")
    private WebElement ComingSoon;

    @FindBy(id="tvHeading")
    private WebElement Heading;

    @FindBys({@FindBy(id = "tvTime")})
    private List<WebElement> dateList;

    @FindBy(xpath = "//*[@text='Today']")
    private WebElement Today;

    @FindBys({@FindBy(id = "ivExpand")})
    private List<WebElement> expandButtons;

    @FindBys({@FindBy(id = "llLptSummary")})
    private List<WebElement> summaryList;

    @FindBys({@FindBy(id = "ivTime")})
    private List<WebElement> watchImages;

    @FindBys({@FindBy(id = "title")})
    private List<WebElement> titles_DailyTimeSpent;

    @FindBys({@FindBy(id = "username_toolbar")})
    private List<WebElement> ListOfChild;

    @FindBys({@FindBy(id = "user_logo_toolbar")})
    private List<WebElement> UserLogo;

    @FindBys({@FindBy(id = "tvTimespent")})
    private List<WebElement> timeSpent;

    @FindBys({@FindBy(id = "tvVideoCount")})
    private List<WebElement> VideoCount;

    @FindBys({@FindBy(id = "tvPracticeCount")})
    private List<WebElement> PracticeCount;

    @FindBys({@FindBy(id = "tvTestCount")})
    private List<WebElement> TestCount;

    @FindBys({@FindBy(xpath = "//android.widget.TextView[@text='Videos \n" +
            "Watched']")})
    private List<WebElement> text_VideosWatched;

    @FindBys({@FindBy(xpath = "//android.widget.TextView[@text='Practice \n" +
            "Activities']")})
    private List<WebElement> text_PracticeActivities;

    @FindBys({@FindBy(xpath = "//android.widget.TextView[@text='Tests \n" +
            "Taken']")})
    private List<WebElement> text_TestsTaken;

    @FindBy(className = "android.widget.LinearLayout")
    private WebElement SignedUp;

    @FindBy(id = "ivTest")
    private WebElement TestTile;

    @FindBy(id = "rlConceptSummarylayout")
    private WebElement testSummary;

    @FindBy(id = "tvTestTitle")
    private WebElement Test_Title;

    @FindBy(id = "tvDuration")
    private WebElement test_Duration;

    @FindBy(id = "tvQuestions")
    private WebElement test_Questions;

    @FindBy(id = "tvMarks")
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

    public int verifyTestCount(){
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.5, 0.1, 0.1);  waitForElementToBeVisible(TestCount.get(0));
        int testCount= Integer.parseInt(TestCount.get(0).getText());
        System.out.println("Test count is :"+TestCount.get(0).getText());
        return testCount;
    }
    public int verifyPracticeCount(){
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.5, 0.1, 0.1); waitForElementToBeVisible(PracticeCount.get(0));
        int testCount= Integer.parseInt(PracticeCount.get(0).getText());
        System.out.println("practice count is :"+PracticeCount.get(0).getText());
        return testCount;
    }
    public int verifyVideoCount(){
        refresh();
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.5, 0.1, 0.1);
        waitForElementToBeVisible(VideoCount.get(0));
        int testCount= Integer.parseInt(VideoCount.get(0).getText());
        System.out.println("video count is :"+VideoCount.get(0).getText());
        return testCount;
    }

    public String verifyTodayIsDisplayed() {
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.3, 0.1, 0.1);
        waitForElementToBeVisible(Today);
        softAssert.assertEquals(Today.isDisplayed(),true,"date is not displayed");
        String date=Today.getText();
        System.out.println("Date is :"+Today.getText());
        return date;
    }

    public void verifyTestDetailsTakenByChild(){
        refresh();
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.6, 0.1, 0.1);
        waitForElementToBeVisible(testSummary);
        softAssert.assertEquals(TestTile.isDisplayed(),true,"TestTile is not displayed");
        softAssert.assertEquals(testSummary.isDisplayed(),true,"testSummary is not displayed");
        softAssert.assertEquals(Test_Title.isDisplayed(),true,"Test_Title is not displayed");
        softAssert.assertEquals(test_Duration.isDisplayed(),true,"test_Duration is not displayed");
        softAssert.assertEquals(test_Questions.isDisplayed(),true,"test_Questions is not displayed");
        softAssert.assertEquals(test_tvMarks.isDisplayed(),true,"test_tvMarks is not displayed");
        softAssert.assertAll();
    }

    public void verifyPracticeDetailsTakenByChild(){
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.5, 0.1, 0.1); waitForElementToBeVisible(practice_summary);
        softAssert.assertEquals(PracticeTile.isDisplayed(),true,"PracticeTile is not displayed");
        softAssert.assertEquals(practice_title.isDisplayed(),true,"practice_title is not displayed");
        softAssert.assertEquals(practice_summary.isDisplayed(),true,"practice_summary is not displayed");
        softAssert.assertAll();
    }

    public void verifyVideoWatchedDetailsByChild(){
        refresh();
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.5, 0.1, 0.1);
        waitForElementToBeVisible(learn_summary);
        softAssert.assertEquals(learn_summary.isDisplayed(),true,"learn_summary is not displayed");
        softAssert.assertEquals(learn_video.isDisplayed(),true,"learn_video is not displayed");
        softAssert.assertEquals(learn_concept_summary.isDisplayed(),true,"learn_concept_summary is not displayed");
        softAssert.assertAll();
    }
    public void clickOnExpandButton(){
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.5, 0.1, 0.1);
        waitForElementToBeVisible(expandButtons.get(0));
        expandButtons.get(0).click();
    }

}
