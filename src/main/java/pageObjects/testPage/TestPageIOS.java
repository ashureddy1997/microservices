package pageObjects.testPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.time.Duration;
import java.util.List;

public class TestPageIOS extends BasePage implements TestPage{
    SoftAssert softAssert=null;
    public TestPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Create Test\"]")
    private WebElement CreateYourOwnTest;

    @FindBy(xpath = "//*[@text='Take Test']")
    private WebElement takeTestButton;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")})
    private List<WebElement> allHeader;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Custom Tests\"]")
    private WebElement My_Custom_Tests;

    @FindBy(linkText = "Choose one or more subjects")
    private WebElement Choose_one_or_more_subjects;

    @FindBy(id = "tv_title")
    private WebElement createOwnTestTitle;

    @FindBy(id = "iv_back")
    private WebElement backNavigation;

    @FindBy(id = "iv_select_test")
    private WebElement image;

    @FindBy(id = "tv_generate_text")
    private WebElement Generate_custom_tests;

    @FindBy(id = "tv_step_one")
    private WebElement Step_One_Select_Subjects;

    @FindBy(id = "cl_root")
    private WebElement mathematics;

    @FindBys({@FindBy(id="cl_root")})
    private List<WebElement> ListOfSubject;

    @FindBy(className = "android.widget.LinearLayout")
    private WebElement science;

    @FindBy(id = "btn_continue")
    private WebElement ContinueOne;

    @FindBy(id = "tv_step_two")
    private WebElement stepTwoSelectChapter;

    @FindBy(id = "tv_choose_one_or_more")
    private WebElement choose_one_or_more_Chapter;

    @FindBy(id = "cl_subject_root")
    private WebElement mathematicsSubject;

    @FindBys({@FindBy(id = "cl_subject_root")})
    private List<WebElement> expandSubject;

    @FindBy(id = "btn_back")
    private WebElement backButton;

    @FindBy(id = "btn_continue")
    private WebElement continueButtonTwo;

    @FindBys({@FindBy(id = "tv_chapter_name")})
    private List<WebElement> ListOfMathChapters;

    @FindBys({@FindBy(id="testBannerCardView")})
    private List<WebElement> testTilesList;

    @FindBy(id = "txt_custom_test_title")
    private WebElement CustomTestTile;

    @FindBy(id = "status_name")
    private WebElement testTimer;

    @FindBy(id = "subject_name")
    private WebElement CreatedTest;

    @FindBy(id = "subject_name")
    private WebElement subject_name;

    @FindBy(id = "btn_quick_five_min_test")
    private WebElement btn_quick_five_min_test;

    @FindBys({@FindBy(id = "subject_name_holder")})
    private List<WebElement> ListOfChapterTest;

    @FindBy(xpath = "//android.widget.TextView[@text='Step 3: Select Your Test Settings']")
    private WebElement stepThreeSelectYourSettings;

    @FindBy(id = "et_test_name")
    private WebElement test_name;

    @FindBys({@FindBy(xpath = "//android.widget.TextView[@text='Easy']")})
    private List<WebElement> Difficulty_Level;

    @FindBys({@FindBy(xpath = "//android.widget.TextView[@text='15']")})
    private List<WebElement> duration;

    @FindBy(id = "iv_increment_correct_ans")
    private WebElement Correct_Answer_marks_Increment;

    @FindBy(id = "iv_decrement_incorrect_ans")
    private WebElement Incorrect_Answer_marks_Decrement;

    @FindBy(id = "btn_back")
    private WebElement navBack;

    @FindBy(id = "btn_create_test")
    private WebElement createTest;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell[1]//XCUIElementTypeStaticText")})
    private List<WebElement> heroBannerName;

    @FindBy(xpath = "//XCUIElementTypeCell[1]")
    private WebElement heroBanner;

  @FindBys({@FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")})
  private List<WebElement> HeroBannerAvatar;


    @FindBy(xpath = "//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]")
    private WebElement heroBannerDescription;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Take Test\"]")
    private WebElement TakeTestButton;

    @FindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeButton[2]")
    private WebElement heroBanner_action_goal_switch;

    @FindBy(id = "txt_HeroBannerDuration")
    private WebElement txt_HeroBannerDuration;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"gold_embium\"]")
    private WebElement txt_HeroBannerCoins;

    @FindBy(id = "txt_action")
    private WebElement practiceNow;

    @FindBy(id = "imgBanner")
    private WebElement practiceNow_imgBanner;

    @FindBy(id = "txt_AdName")
    private WebElement practiceBanner_Name;

    @FindBy(id = "txt_AdDescription")
    private WebElement practiceNow_Banner_Description;

    @FindBy(id = "txt_action")
    private WebElement archiveNow;


    @FindBys({@FindBy(id = "txt_action")})
    private List<WebElement> adBanners;

    @FindBy(id = "imgBanner")
    private WebElement archiveNow_imgBanner;

    @FindBy(id = "txt_AdName")
    private WebElement archiveNowBanner_Name;

    @FindBy(id = "txt_AdDescription")
    private WebElement archiveNow_Banner_Description;

    @FindBy(xpath= "//XCUIElementTypeCell/XCUIElementTypeButton[@name=\"Learn Now\"]")
    private WebElement learnNow;

    @FindBy(xpath = "imgBanner")
    private WebElement learneNow_imgBanner;

    @FindBy(id = "txt_AdName")
    private WebElement learnNowBanner_Name;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Want to improve your conceptual grip on JEE Main topics?\"][1]")
    private WebElement learnNow_Banner_Description;

    @FindBy(xpath = "txt_HeroBannerName")
    private WebElement testName;

    @FindBy(id = "ivBack")
    private WebElement back;

    @FindBy(id ="exo_ad_overlay")
    private WebElement addBanner;

    @FindBy(id ="addBannerMuteButton")
    private WebElement addBannerMuteButton;

    @FindBy(id = "//div[@class='sc-ezipRf bSkNQK question-text']")
    private WebElement Question;

    @FindBys({@FindBy(xpath = "//div[@class='sc-boeKoK iuauoy']")})
    private List<WebElement> ListOfOptions;

    @FindBy(className ="android.widget.TextView")
    private WebElement GeneratingYourCustomTest;

    @FindBy(id ="progressbar_create_test")
    private WebElement Progressbar;

    @FindBy(id ="tv_progress")
    private WebElement tv_progress;

    public void verifyTestCreatingProgress(){
        waitForElementToBeVisible(Progressbar);
        Assert.assertEquals(GeneratingYourCustomTest.isEnabled(), true, "GeneratingYourCustomTest is not displayed");
        Assert.assertEquals(Progressbar.isEnabled(), true, "Progressbar is not displayed");
        Assert.assertEquals(tv_progress.isEnabled(), true, "tv_progress is name not displayed");
        softAssert.assertAll();
    }

    public void clickOnTakeTest(){
        scrollToText("Take Test");
        waitForElementToBeVisible(takeTestButton);
        takeTestButton.click();
    }
    public void verifyTakeTestButtonInHeroBanner(){
        waitForElementToBeVisible(takeTestButton);
        softAssert.assertEquals(takeTestButton.isEnabled(),true,"takeTestButton is not displayed" );
    }

    @Override
    public void verifyChapterTests() {

    }


    @Override
    public void clickOnGoal() {
//waitForElementToBeVisible(heroBanner_action_goal_switch);
    heroBanner_action_goal_switch.click();
    }

    @Override
    public void clickOnMuteButtonOfAdBannerOfLearnNow() {

    }

    @Override
    public void clickOnUnMuteButtonOfAdBannerOfLearnNow() {

    }

    @Override
    public void clickOnMuteButtonOfAdBannerOfPracticeNow() {

    }

    @Override
    public void clickOnUnMuteButtonOfAdBannerOfPracticeNow() {

    }

    @Override
    public void clickOnMuteButtonOfAdBannerOfAchieveNow() {

    }

    @Override
    public void clickOnUnMuteButtonOfAdBannerOfAchieveNow() {

    }

    @Override
    public void clickOnMuteButtonOfAdBannerOfHerobanner() {

    }

    @Override
    public void clickOnUnMuteButtonOfAdBannerOfHerobanner() {

    }

    public String VerifyHeroBannerNameDisplay() {
        waitForElementToBeVisible(heroBannerName.get(0));
        String heroBanner=heroBannerName.get(0).getText();
        Assert.assertEquals(heroBannerName.get(0).isEnabled(), true, "Hero banner name not displayed");
        System.out.println("Name is :"+heroBannerName.get(0).getText());
        return heroBanner;
    }

    public void VerifyHeroBannerDisplay() {
        waitForElementToBeVisible(heroBanner);
        Assert.assertEquals(heroBanner.isEnabled(), true, "Hero banner  not displayed");
    }
    public void VerifyAddBanner(){
        //scrollToText("Achieve Now");
        softAssert.assertEquals(addBanner.isEnabled(),true,"Practice thumbnail is not Displayed");
        softAssert.assertEquals(addBannerMuteButton.isEnabled(),true,"Practice thumbnail is not Displayed");
        softAssert.assertAll();
    }
    public void verifyHeaderPresent(String headerName){

        waitForElementToBeVisible(allHeader.get(0));

        scrollToText(headerName);
        for(int i=0;i<allHeader.size();i++){
            if(allHeader.get(i).getText().equalsIgnoreCase(headerName)){
                int x= allHeader.get(i).getLocation().x;
                int y= allHeader.get(i).getLocation().y;
                System.out.println(x+" "+y+"point header");
                allHeader.get(i).getLocation().moveBy(x,119);
            }
        }



    }

    public void clickOnTestTile(int index){
        waitForElementToBeVisible(testTilesList.get(0));

        Dimension windowSize = driver().manage().window().getSize();
        int x= windowSize.height;
        int y=windowSize.width;
        int z=x/2;
        testTilesList.get(1).getLocation().move(z,y/2);
        System.out.println("vipin"+testTilesList.get(0).getLocation().getX());
        TouchAction action =new TouchAction(driver());
        action.moveTo(PointOption.point(650, 680))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(PointOption.point(100, 680))
                .release();
        testTilesList.get(index).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void verifyElementsMyCustomTestsSection(){
        scrollToText("My Custom Tests");
        waitForElementToBeVisible(My_Custom_Tests);
        softAssert.assertEquals(My_Custom_Tests.isEnabled(),true,"My_Custom_Tests is not visible");
        scrollToText("Create your own test");
        softAssert.assertEquals(CreateYourOwnTest.isEnabled(),true,"CreateYourOwnTest is not visible");
        softAssert.assertAll();
    }

    public void verifyAllElementsOnCreateYourOwnTestScreen(){
        waitForElementToBeVisible(createOwnTestTitle);
        softAssert.assertEquals(ContinueOne.isEnabled(),true,"Continue button is visible");
        softAssert.assertEquals(createOwnTestTitle.isEnabled(),true,"Choose_one_or_more_subjects is not visible");
//        softAssert.assertEquals(backNavigation.isEnabled(),true,"Navigation button is not available");
        softAssert.assertEquals(image.isEnabled(),true,"Screen Image is not available");
        softAssert.assertEquals(Generate_custom_tests.isEnabled(),true,"Generate custom tests, based on your learnings with 3 simple steps, is not available");
        softAssert.assertEquals(Step_One_Select_Subjects.isEnabled(),true,"Step_One_Select_Subjects is not available");
        softAssert.assertEquals(mathematics.isEnabled(),true,"mathematics tab is not available");
        softAssert.assertEquals(science.isEnabled(),true,"science tab is not available");
        softAssert.assertEquals(ContinueOne.isEnabled(),true,"Continue button is not available");
        softAssert.assertAll();

    }
    public void selectASubject(int index){
        waitForElementToBeVisible(ListOfSubject.get(0));
        ListOfSubject.get(index).click();
    }
    public void clickOnContinueButtonFromStepOne(){
        waitForElementToBeVisible(ContinueOne);
        ContinueOne.click();
    }
    public void verifyElementsOnSelectChapterScreen(){
        waitForElementToBeVisible(stepTwoSelectChapter);
        softAssert.assertEquals(stepTwoSelectChapter.isEnabled(),true,"Step 2: Select Chapters is visible");
        softAssert.assertEquals(choose_one_or_more_Chapter.isEnabled(),true,"Choose one or more chapters is visible");
        softAssert.assertEquals(mathematicsSubject.isEnabled(),true,"Mathematics subject is available");
        softAssert.assertEquals(expandSubject.get(0).isEnabled(),true,"Expand subject icon is available");
//        softAssert.assertEquals(backButton.isEnabled(),true,"Back option is available");
        softAssert.assertEquals(continueButtonTwo.isEnabled(),true,"Continue option is available");
        softAssert.assertAll();
    }
    public void clickOnExpandSubject(int index){
        waitForElementToBeVisible(expandSubject.get(index));
        expandSubject.get(index).click();
    }


    public void verifyAllTheChapters(int i){
        waitForElementToBeVisible(ListOfMathChapters.get(i));
        String chapterName=ListOfMathChapters.get(i).getText();
        Assert.assertEquals(ListOfMathChapters.get(i).isEnabled(),true,"mathematics chapters not displayed");
        softAssert.assertAll();

    }
    public void selectChapters(int index){
        waitForElementToBeVisible(ListOfMathChapters.get(0));
        ListOfMathChapters.get(index).click();

    }
    public void clickOnContinueInSelectChaptersScreen(){
        waitForElementToBeVisible(continueButtonTwo);
        continueButtonTwo.click();
    }
    public void clickOnBackButton(){
        waitForElementToBeVisible(backButton);
        backButton.click();
    }
    public void enterYourTestName(String name){
        waitForElementToBeVisible(test_name);
        test_name.sendKeys(name);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setDifficultyLevel(){
        System.out.println(Difficulty_Level.size()+"Difficulty_Level");
        waitForElementToBeVisible(Difficulty_Level.get(0));
        Difficulty_Level.get(0).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Difficulty_Level.get(0).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void setDuration(){
        System.out.println(duration.size()+"Duration");
        waitForElementToBeVisible(duration.get(0));
        duration.get(0).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        duration.get(0).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void setMarkForCorrectAnswer(){
        waitForElementToBeVisible(Correct_Answer_marks_Increment);
        Correct_Answer_marks_Increment.click();
    }
    public void setMarkForIncorrectAnswer(){
        waitForElementToBeVisible(Incorrect_Answer_marks_Decrement);
        Incorrect_Answer_marks_Decrement.click();
    }
    public void clickOnCreateTestButton(){
        waitForElementToBeVisible(createTest);
        createTest.click();
    }
    public void clickOnBackButtonFromStepThree(){
        waitForElementToBeVisible(navBack);
        navBack.click();
    }

    public void verifyAllTheElementsInCreateYourSettingsScreen(){
        waitForElementToBeVisible(stepThreeSelectYourSettings);
        softAssert.assertEquals(stepThreeSelectYourSettings.isEnabled(),true,"step 3 Select Your Settings is visible");
        softAssert.assertEquals(test_name.isEnabled(),true,"Enter Your Test name Field is visible");

        waitForElementToBeVisible(Difficulty_Level.get(0));
        softAssert.assertEquals(Difficulty_Level.get(0).isEnabled(),true,"Difficulty level field is available");
        softAssert.assertEquals(duration.get(0).isEnabled(),true,"Duration field is available");
        softAssert.assertEquals(Correct_Answer_marks_Increment.isEnabled(),true,"Correct answer marks field is available");
        softAssert.assertEquals(Incorrect_Answer_marks_Decrement.isEnabled(),true,"Incorrect answer's mark field is available");
        softAssert.assertAll();
    }

    public void clickOnCreateYourOwnTest(){
        scrollToText("Create your own test");
        waitForElementToBeVisible(CreateYourOwnTest);
        CreateYourOwnTest.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void verifyCreatedTest(){
        swipeScreen(Direction.DOWN);
        scrollToText("Take Chapter Tests");
        waitForElementToBeVisible(CustomTestTile);
        System.out.println("create test is :"+CustomTestTile.getText());
        softAssert.assertEquals(CustomTestTile.isEnabled(),true,"Created test is not available");
        softAssert.assertEquals(CreatedTest.isEnabled(),true,"My created test is not displayed");
        softAssert.assertAll();
    }

    @Override
    public void clickOnMyFirstTest() {

    }

    public void clickOnCreatedTest(){
        waitForElementToBeVisible(CreatedTest);
        CreatedTest.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String verifyCreatedTestTypeIsCorrect(){
        swipeScreen(Direction.DOWN);
        scrollToText("Take Chapter Tests");
        // scrollUsingResourceID("textView");
        waitForElementToBeVisible(CreatedTest);
        String created_Test=CreatedTest.getText();
        System.out.println("test type :"+CreatedTest.getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        softAssert.assertEquals(CreatedTest.isEnabled(),true,"CreatedTest type is not displayed");
        softAssert.assertEquals(CreatedTest.getText(), "Chemistry", "wrong test type");

        return created_Test;
    }

    public void clickOnQuickTestButton(){
        waitForElementToBeVisible(btn_quick_five_min_test);
        btn_quick_five_min_test.click();
    }


    public void verifyAllThecarosuelsArePresentOnTest(List<String> list) {
        boolean result=false;
        waitForElementToBeVisible(allHeader.get(0));
        for(int i=1;i<list.size();i++){
            scrollToText(list.get(i));
            for(int j=0;j<allHeader.size();j++){
                if(allHeader.get(j).getText().equalsIgnoreCase(list.get(i))){
                    result=true;
                    break;
                }

            }
            softAssert.assertEquals(result,true,list.get(i)+" carousel is not displaying");
        }
        softAssert.assertAll();
    }

    public void verifyHeroBannerAvatar(){
        waitForElementToBeVisible(HeroBannerAvatar.get(0));
        softAssert.assertEquals(HeroBannerAvatar.get(0).isEnabled(),true,"HeroBannerAvatar is not displayed");
    }
    public void verifyHeroBannerDescription(){
        waitForElementToBeVisible(heroBannerDescription);
        softAssert.assertEquals(heroBannerDescription.isEnabled(),true,"Hero banner description is not displayed");
    }
    public void verifyTakeTestButton(){
        waitForElementToBeVisible(TakeTestButton);
        softAssert.assertEquals(TakeTestButton.isEnabled(),true,"Take test button is not displayed in hero banner");
    }
    public void verifyTakeTestButtonIsFunctioning(){
        waitForElementToBeVisible(TakeTestButton);
        TakeTestButton.click();
    }
    public void clickOnTakeTestButton(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        refresh();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(TakeTestButton);
        TakeTestButton.click();
    }

    public String  verifyHeroBannerActionGoalSwitch(){
      //  waitForElementToBeVisible(heroBanner_action_goal_switch);
        String goalName=heroBanner_action_goal_switch.getText();
        System.out.println("goal name: "+heroBanner_action_goal_switch.getText());

        softAssert.assertEquals(heroBanner_action_goal_switch.isEnabled(),true,"Goal is not displayed in hero banner");
        return goalName;
    }
    public String verifyGradeNameInTestSummary(){
        waitForElementToBeVisible(heroBanner_action_goal_switch);
        String Grade =heroBanner_action_goal_switch.getText();
        System.out.println("Grade Name is :"+heroBanner_action_goal_switch.getText());
        softAssert.assertEquals(heroBanner_action_goal_switch.isEnabled(),true,"Grade is not displayed in hero banner");
        return Grade;
    }
    public void verifyHeroBannerDuration(){
        waitForElementToBeVisible(txt_HeroBannerDuration);
        softAssert.assertEquals(txt_HeroBannerDuration.isEnabled(),true,"Duration is not displayed in hero banner");
    }
    public void verifyHeroBannerCoins(){
        //waitForElementToBeVisible(txt_HeroBannerCoins);
        softAssert.assertEquals(txt_HeroBannerCoins.isEnabled(),true,"HeroBannerCoins is not displayed");
        softAssert.assertAll();

    }

    public void verifyAllTheElementsOnMarketingBannersForPractice(){
        scrollToText("Practice Now");
        waitForElementToBeVisible(practiceNow);
        softAssert.assertEquals(practiceNow.isEnabled(),true,"practiceNow button is not displayed");
        softAssert.assertEquals(practiceNow_imgBanner.isEnabled(),true,"practiceNow_imgBanner is not displayed");
        softAssert.assertEquals(practiceBanner_Name.isEnabled(),true,"practiceBanner_Name is not displayed");
//        softAssert.assertEquals(practiceNow_Banner_Description.isEnabled(),true,"practiceNow_Banner_Description is not displayed");
        softAssert.assertAll();
    }

    public void clickOnPracticeNowInTestScreen(){
        scrollToText("Practice makes you perfect");
        waitForElementToBeVisible(practiceNow);
        practiceNow.click();
    }
    public void verifyAllTheElementsOnMarketingBannersForAchieve(){
        swipeScreen(Direction.DOWN);
        scrollToText("Coming Soon");
        //  verticalSwipeByPercentages(0.14, 0.2, 0.5);
        waitForElementToBeVisible(archiveNow_imgBanner);
        softAssert.assertEquals(archiveNow.isEnabled(),true,"archiveNow button is not displayed");
        softAssert.assertEquals(archiveNow_imgBanner.isEnabled(),true,"archiveNow_imgBanner is not displayed");
        softAssert.assertEquals(archiveNowBanner_Name.isEnabled(),true,"archiveNowBanner_Name is not displayed");
//        softAssert.assertEquals(archiveNow_Banner_Description.isEnabled(),true,"archiveNow_Banner_Description is not displayed");
        softAssert.assertAll();
    }
    public void clickOnArchiveNowInTestScreen(){
       /* swipeScreen(Direction.DOWN);
        scrollToText("Take Chapter Tests");*/
        waitForElementToBeVisible(archiveNow);
        archiveNow.click();
//        System.out.println("Tab name : "+archiveNow.getText());

    }
    public void verifyAllTheElementsOnMarketingBannersForLearn(){
        swipeScreen(Direction.UP);
        scrollToElementIos(learnNow);
        softAssert.assertEquals(learnNow.isEnabled(),true,"archiveNow button is not displayed");
         softAssert.assertAll();
    }
    public void clickOnLearnNowInTestScreen(){
        waitForElementToBeVisible(learnNow);
        learnNow.click();
    }
    public void verifyPracticeNow(){
        scrollToText("Practice makes you perfect");
        waitForElementToBeVisible(practiceNow);
        softAssert.assertEquals(practiceNow.isEnabled(),true,"not displayed");
        System.out.println("name "+practiceNow);
    }

    @FindBy(xpath = "//*[@text='Continue Tests']")
    private WebElement continueTests;

    public void getContinueLearningCarousel(){
        swipeScreen(Direction.DOWN);
        scrollToText("Continue Test");
        // verticalSwipeByPercentages(0.1, 0.1, 0.1);

        waitForElementToBeVisible(continueTests);
        System.out.println("Header name : "+continueTests.getText());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void getContinueLearningCarouselTile(){
        swipeScreen(Direction.DOWN);
        scrollToText("Take Chapter Tests");
        waitForElementToBeVisible(testTilesList.get(0));
        System.out.println("Tile name : "+allHeader.get(0).getText());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public String verifyCountDownTimerForPendingTest(){
        waitForElementToBeVisible(testTimer);
        String timer= testTimer.getText();
        softAssert.assertEquals(testTimer.isEnabled(),true,"Timer not displayed");
        System.out.println("test status :"+testTimer.getText() );
        return timer;
    }
    public void clickOnPendingTest(){
        waitForElementToBeVisible(testTimer);
        testTimer.click();
    }
    @FindBy(xpath = "//*[@text='Resume Test']")
    private WebElement resumeTest;

    public void clickOnResumeTest() {
        waitForElementToBeVisible(resumeTest);
        resumeTest.click();

    }
    public void clickOnTakeChapterTestTile(){
        swipeScreen(Direction.DOWN);
        scrollToText("Take Chapter Tests");
        waitForElementToBeVisible(ListOfChapterTest.get(0));
        ListOfChapterTest.get(0).click();

    }
    public void getMyBookmarkedTestsCarousel(){
        waitForElementToBeVisible(allHeader.get(3));
        System.out.println("Header name : "+allHeader.get(3).getText());
    }
    public String verifyIfOpenedTestNameIsSameAsSelectedTestFromTestTiles(){
        waitForElementToBeVisible(testName);
        String test= testName.getText();
        System.out.println("test name"+testName.getText());
        return test;
    }
    public void clickOnBackButtonFromTestSummaryDetails(){
        waitForElementToBeVisible(back);
        back.click();
    }
    public String getTakeFullTestTile(){
        swipeScreen(Direction.DOWN);
        scrollToText("Take Full Tests");
        waitForElementToBeVisible(testTilesList.get(0));
        String tile= testTilesList.get(0).getText();
        System.out.println("Tile name is: "+testTilesList.get(0).getText());
        return tile;
    }
    public void VerifyQuestionAndFourOptionsAreAppearing(){
        waitForElementToBeVisible(Question);
        softAssert.assertEquals(Question.isEnabled(),true,"Question is not displayed");
        System.out.println("Question is :"+ Question.getText());
        softAssert.assertEquals(ListOfOptions.get(0).isEnabled(),true,"Option 1 is not displayed");
        softAssert.assertEquals(ListOfOptions.get(1).isEnabled(),true,"Option 2 is not displayed");
        softAssert.assertEquals(ListOfOptions.get(2).isEnabled(),true,"Option 3 is not displayed");
        softAssert.assertEquals(ListOfOptions.get(3).isEnabled(),true,"Option 4 is not displayed");
        softAssert.assertAll();
    }
    public void clickOnTestTileOfMathematicsChapters(){
        scrollToText("Take Mathematics Full Tests");
        waitForElementToBeVisible(testTilesList.get(0));
        testTilesList.get(0).click();
    }
    public void clickOnTestTilePhysicsChapters(){
        scrollToText("Take Mathematics Full Tests");
        waitForElementToBeVisible(testTilesList.get(0));
        testTilesList.get(0).click();
    }
    public void clickOnTestTileChemistryChapters(){
        scrollToText("Take Biology Full Tests");
        waitForElementToBeVisible(testTilesList.get(0));
        testTilesList.get(0).click();
    }
    public void clickOnTestTileOfBiologyChapters(){
        scrollToText("Take Chemistry Chapter Tests");
        waitForElementToBeVisible(testTilesList.get(0));
        testTilesList.get(0).click();
    }
    public void verifyBookMarkedTestAppearing(){
        scrollToText("My Custom Tests");
        waitForElementToBeVisible(testTilesList.get(0));
        testTilesList.get(0).click();

    }
    public void clickOnTakePhysicsFullTestTestTile(){
        scrollToText("Take Mathematics Full Tests");
        waitForElementToBeVisible(testTilesList.get(0));
        testTilesList.get(0).click();
    }

}
