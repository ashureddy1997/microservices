package pageObjects.StudentActivities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class StudentActivitiesAndroid extends BasePage implements StudentActivitiesPage {
    SoftAssert softAssert=null;
    public StudentActivitiesAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "navigation_learn")
    private WebElement navigation_learn;

    @FindBys({@FindBy(id = "adBannerCardView")})
    private List<WebElement> videoTileSubject;

    @FindBy(id ="ivSummaryHeroBannerPlay1")
    private WebElement videoPlayButton;

    @FindBy(id ="exo_subtitles")
    private WebElement exo_subtitles;

    @FindBy(id ="action_bar_root")
    private WebElement action_bar_root;

    @FindBy(id = "iv_back")
    private WebElement navBack;

    @FindBy(id = "btn_quit")
    private WebElement  quit;

    @FindBys({@FindBy(id = "group")})
    private List<WebElement> testCardViewList;

    @FindBy(id = "btnTakeTest")
    private WebElement TakeTest;

    @FindBy(id = "iv_checkbox")
    private WebElement checkbox;

    @FindBy(id = "btnSaveNext")
    private WebElement SaveAndNext;

    @FindBy(id = "btn_start")
    private WebElement startNow;

    @FindBy(id = "btnSubmitTest")
    private WebElement submitButton;

    @FindBy(xpath ="//android.widget.TextView[@text='Submit Test']")
    private WebElement submitTest;

    @FindBys({@FindBy(id = "smallLabel")})
    private List<WebElement> tab;

    @FindBy(id = "navigation_practice")
    private WebElement navigation_practice;

    @FindBy(id = "question_analysis")
    private WebElement question_wise;

    @FindBys({@FindBy(id = "video_banner_card_view")})
    private List<WebElement> bookList;

    @FindBys({@FindBy(id = "book_chapter_name")})
    private List<WebElement> chapterNameList;

    @FindBys({@FindBy(id="thumbPracticeForChapterIV")})
    private List<WebElement> chapterPracticeList;

    @FindBy(id = "btnContinueTest")
    private WebElement ContinueToTestFeedback;

    @FindBy(id ="tvSummaryLearnButton")
    private WebElement StartPractice;

    @FindBy(id ="txt_heroBanner_action_learn")
    private WebElement LearnButton;

    public void clickOnLearnButton(){
        waitForElementToBeVisible(LearnButton);
        LearnButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyClickOnPracticeTab() {
        waitForElementToBeVisible(tab.get(0));
        clickOnPracticeTab();
    }
    public void clickOnStartPracticeButton(){
        waitForElementToBeVisible(StartPractice);
        StartPractice.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void clickOnPracticeTab() {
        waitForElementToBeVisible(navigation_practice);
        navigation_practice.click();
    }
    public void clickOnQuestionWiseAnalysisWithSolutionsCard(){
        waitForElementToBeVisible(question_wise);
        question_wise.click();
    }
    public void verifyUserCanTakePractice() {
        waitForElementToBeVisible(chapterPracticeList.get(0));
        Assert.assertEquals(chapterPracticeList.get(0).isDisplayed(),true,"Practice thumbnail is not Displayed");
        chapterPracticeList.get(0).click();
    }
    public void clickOnBook(int index) {
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(bookList.get(0));
        bookList.get(index).click();
    }
    public String clickOnChapterName(int i) {
        waitForElementToBeVisible(chapterNameList.get(i));
        String chapterName = chapterNameList.get(i).getText();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chapterNameList.get(i).click();
        return chapterName;
    }
    public void clickOnLearnTab() {
        waitForElementToBeVisible(navigation_learn);
        navigation_learn.click();
    }
    public void clickOnContinueToTestFeedback(){
        waitForElementToBeVisible(ContinueToTestFeedback);
        ContinueToTestFeedback.click();
    }
    public void clickOnVideo() {
        swipeScreen(Direction.DOWN);
       // scrollUsingResourceID("imgOwnerIcon");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);

        waitForElementToBeVisible(videoTileSubject.get(0));
        videoTileSubject.get(0).click();

    }
    public void verifyNavigationToVideoScreen() {
        waitForElementToBeVisible(videoPlayButton);
        Assert.assertEquals(videoPlayButton.isDisplayed(),true,"Not able to navigate to the Video screen");
    }
    public void clickOnVideoPlayButton(){
        waitForElementToBeVisible(videoPlayButton);
        videoPlayButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnTestTile(){
        scrollToText("Take Full Tests");
        waitForElementToBeVisible(testCardViewList.get(0));
        testCardViewList.get(0).click();
    }
    public void clickOnTakeTest(){
        swipeScreen(Direction.UP);
        scrollToText("Take Test");
        waitForElementToBeVisible(TakeTest);
        TakeTest.click();

    }
    public void clickOnCheckBox(){
        waitForElementToBeVisible(checkbox);
        checkbox.click();
    }
    public void clickOnSaveAndNext(){
        waitForElementToBeVisible(SaveAndNext);
        SaveAndNext.click();
    }
    public void clickOnStartNowButton(){
        waitForElementToBeVisible(startNow);
        startNow.click();
    }
    public void clickOnSubmitButton(){
        waitForElementToBeVisible(submitButton);
        submitButton.click();
    }
    public void clickOnSubmitTestButton(){
        waitForElementToBeVisible(submitTest);
        submitTest.click();
    }
    public void clickOnQuit(){
        try {
            waitForElementToBeVisible(quit);
            quit.click();
        }catch (Exception e){

        }

    }
}
