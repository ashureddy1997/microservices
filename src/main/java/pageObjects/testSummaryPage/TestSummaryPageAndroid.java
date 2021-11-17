package pageObjects.testSummaryPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class TestSummaryPageAndroid  extends BasePage implements TestSummaryPage{
    SoftAssert softAssert=null;
    public TestSummaryPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

  @FindBy(xpath = "//android.widget.TextView[@text='Take Full Tests']")
   private WebElement TakeFullTests;

    @FindBys({@FindBy(id = "group")})
    private List<WebElement> testCardViewList;

    @FindBy(id="txt_HeroBannerName")
    private WebElement HeroBannerName;

    @FindBy(id = "txt_HeroBannerSubject")
    private WebElement HeroBannerSubject;

    @FindBy(id = "txt_HeroBannerCoins")
    private WebElement HeroBannerCoins;

    @FindBy(id = "txt_heroBannerDescription")
    private WebElement heroBannerDescription;

    @FindBy(linkText = "view more")
    private WebElement viewMore;

    @FindBy(linkText = "view less")
    private WebElement viewLess;

    @FindBy(id = "tvSummaryBookmark")
    private  WebElement Bookmark;

    @FindBy(xpath = "//*[@text='Bookmarked']")
    private WebElement BookMarked;

    @FindBy(id = "tvSummaryLike")
    private WebElement Like;

    @FindBy(id = "jar_recall")
    private WebElement jar_recall;

    @FindBy(id = "jar_conceptual_thinking")
    private WebElement jar_conceptual_thinking;

    @FindBy(id = "jar_analytical_thinking")
    private WebElement jar_analytical_thinking;

    @FindBy(id = "jar_wasted_attempt_new")
    private WebElement jar_wasted_attempt_new;

    @FindBy(id = "iv_play")
    private WebElement iv_play;

    @FindBy(id = "lv_jar")
    private WebElement lv_jar;

    @FindBy(id = "tv_header")
    private WebElement tv_header;

    @FindBy(id = "tv_topic")
    private WebElement tv_topic;

    @FindBy(id = "tv_description")
    private WebElement tv_description;

    @FindBy(id = "btnTakeTest")
    private WebElement TakeTest;

    @FindBy(id = "btnTakeTest")
    private WebElement viewFeedback;

    @FindBy(id = "imgBanner")
    private WebElement heroBanner;

    @FindBy(id = "tvSummaryGraphTitle")
    private  WebElement Here_is_where_you_stand;

    @FindBy(id = "primaryWebViewCL")
    private WebElement PrimaryProgressImage;

    @FindBy(className = "android.widget.TextView")
    private WebElement TestReadiness;

    @FindBy(id = "ivSincerityScoreImg")
    private WebElement SincerityScoreImg;

    @FindBy(id = "tv_header")
    private WebElement SincerityScoreHeader;

    @FindBy(id = "tv_description")
    private WebElement SincerityScoreDescription;

    @FindBy(id = "ivSincerityScorePlay")
    private WebElement ivSincerityScorePlay;

    @FindBy(id = "btn_quit")
    private WebElement  quit;

    @FindBy(id = "tv_topic")
    private WebElement IDK;

    @FindBy(id = "ivSincerityScoreImg")
    private WebElement IDK_Image;

    @FindBy(id = "cardAttemptQuality")
    private WebElement cardAttemptQuality;

    @FindBy(id = "layout_four_jars")
    private WebElement attemptQualityImage;

    @FindBy(id = "tv_header")
    private WebElement attemptQualityHeader;

    @FindBy(id = "tv_description")
    private WebElement attemptQualityDescription;

    @FindBy(className = "android.widget.LinearLayout")
    private WebElement attemptQualityJar;

    @FindBys({@FindBy(className = "android.view.ViewGroup")})
    private List<WebElement> Jars;

    @FindBy(id = "layoutAboutTest")
    private WebElement About_the_Test;

    @FindBy(id = "iv_test_quality_score")
    private WebElement test_quality_scoreImage;

    @FindBy(id = "materialTextView")
    private WebElement test_quality_scoreText;

    @FindBy(id = "tv_percentage_att")
    private WebElement percentageText;

    @FindBy(xpath = "//android.widget.TextView[@text='Aligned to \n" +
            "Your exams']")
    private  WebElement Aligned_to_Your_exams;

    @FindBy(id = "ll_test_duration")
    private WebElement test_duration;

    @FindBy(id = "ll_no_questions")
    private WebElement questions;

    @FindBy(id = "ll_marks_item")
    private WebElement marks;

    @FindBy(id = "txt_text_analysis_title")
    private  WebElement Test_AnalysisTitle;

    @FindBy(id = "cl_test_progress")
    private WebElement testAnalysisReport;

    @FindBy(id = "constraintProgressKeys")
    private WebElement ProgressKeys;

    @FindBys({@FindBy(id = "thumbPracticeForChapterIV")})
    private List<WebElement> ListOfRecommendedLearning;

    @FindBys({@FindBy(id = "subject_name")})
    private List<WebElement> ListOfSubjectHolder;

    @FindBys({@FindBy(id = "video_lib_image_view")})
    private List<WebElement> video_lib_image_view;

    @FindBys({@FindBy(id = "thumbPracticeForChapterIV")})
    private List<WebElement> ListOfRecommendedPractice;

    @FindBys({@FindBy(id = "thumbPracticeForChapterIV")})
    private List<WebElement> ListOfPracticeHolder;

    @FindBys({@FindBy(id = "question_books_tag")})
    private List<WebElement> question_books_tag;

    @FindBys({@FindBy(id = "cl_custom_test_title")})
    private List<WebElement> ListOfMoreTests;

    @FindBys({@FindBy(id = "header")})
    private List<WebElement> allHeader;

    @FindBys({@FindBy(id = "rlCardView")})
    private List<WebElement> allHeader_Subjects;

    @FindBys({@FindBy(id = "tvSubjectName")})
    private List<WebElement> SubjectName;

    @FindBys({@FindBy(id = "llMain")})
    private List<WebElement> SubjectTile;

    @FindBys({@FindBy(id = "imgSubjectIcon")})
    private List<WebElement> imgSubjectIcon;

    @FindBys({@FindBy(id = "llMain")})
    private List<WebElement> cardSubject;

    @FindBy(id = "txt_heroBanner_action")
    private WebElement CreateYourOwnTestButton;

    public void clickOnCreateYourOwnTestButton(){
        waitForElementToBeVisible(CreateYourOwnTestButton);
        CreateYourOwnTestButton.click();
    }

    public void verifyElementsOfSubjectsCarousel(){
        waitForElementToBeVisible(allHeader_Subjects.get(1));
        softAssert.assertEquals(allHeader_Subjects.get(1).isDisplayed(),true,"Header 'Subjects' ,is not displayed");
        softAssert.assertEquals(SubjectName.get(0).isDisplayed(),true,"Subject card 1 is not displayed");
        softAssert.assertEquals(SubjectName.get(1).isDisplayed(),true,"Subject card 2 is not displayed");
        softAssert.assertEquals(imgSubjectIcon.get(0).isDisplayed(),true,"imgSubjectIcon 1 is not displayed");
//        softAssert.assertEquals(imgSubjectIcon.get(1).isDisplayed(),true,"imgSubjectIcon 2 is not displayed");
        softAssert.assertEquals(cardSubject.get(0).isDisplayed(),true,"cardSubject 1 is not displayed");
        softAssert.assertEquals(cardSubject.get(1).isDisplayed(),true,"cardSubject 2 is not displayed");
        softAssert.assertAll();
    }
    public String ClickOnSubjectTitleToFilterTheTestsOnTestScreen(int index){
        swipeScreen(Direction.UP);
        scrollToText("Subjects");
        waitForElementToBeVisible(SubjectName.get(1));
        String subject=SubjectName.get(1).getText();
        SubjectName.get(index).click();
        return subject;
    }

    public void ClickOnAllSubjectTitleToFilterTheTestsOnTestScreen(){
        waitForElementToBeVisible(SubjectName.get(0));
        SubjectName.get(0).click();
    }

    public void verifyClickOnGivenSubjectTileDisplayTestsRelatedOnlyToThat(String Subject1 ) {
        swipeScreen(Direction.DOWN);
        //scrollToText("Take Full Tests");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);

            waitForElementToBeVisible(allHeader.get(1));
            System.out.println(allHeader.get(1).getText() + "   " + Subject1);
            Assert.assertEquals(allHeader.get(1).getText().toUpperCase().contains(Subject1), true, "Not");

     /*   swipeScreen(Direction.UP);
        scrollToText("Take Test");*/

    }

    public void verifyElementsTakeFullTestCart() {
        scrollToText("Take Full Tests");
        waitForElementToBeVisible(TakeFullTests);
        softAssert.assertEquals(TakeFullTests.isDisplayed(), true, "TakeFullTests is not available");
//        softAssert.assertEquals(ListOfSubjectHolder.get(0).isDisplayed(),true,"ListOfSubjectHolder is not available");
        System.out.println("name :"+ TakeFullTests.getText());
        softAssert.assertAll();

    }
    public String clickOnTakeFullTestsTile(){
        scrollToText("Take Full Tests");
        waitForElementToBeVisible(testCardViewList.get(0));
        String test =testCardViewList.get(0).getText();
        System.out.println("name is: "+testCardViewList.get(0).getText());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testCardViewList.get(0).click();
        return test;
    }
    public String clickOnTestTile(){
        scrollToText("Take Full Tests");
        waitForElementToBeVisible(testCardViewList.get(0));
        String test =testCardViewList.get(0).getText();
        System.out.println("name is: "+testCardViewList.get(0).getText());
        testCardViewList.get(0).click();
        return test;
    }
    public void clickOnTest(String testName){
        scrollToText(testName);
        waitForElementToBeVisible(testCardViewList.get(0));
        testCardViewList.get(0).click();
    }

    public String clickOnTakeTest(){
        swipeScreen(Direction.UP);
        scrollToText("Take Test");
        waitForElementToBeVisible(TakeTest);
        String takeTest=TakeTest.getText();
        System.out.println("Name is:"+ TakeTest.getText());
        TakeTest.click();
        return takeTest;
    }

    public void verifyDifferentJarInAttemptQuality(){
        swipeScreen(Direction.DOWN);
        scrollToText("Attempt Quality");
        waitForElementToBeVisible(jar_recall);
        softAssert.assertEquals(jar_recall.isDisplayed(),true,"jar_recall is not displayed");
        softAssert.assertEquals(jar_conceptual_thinking.isDisplayed(),true,"jar_conceptual_thinking is not displayed");
        softAssert.assertEquals(jar_analytical_thinking.isDisplayed(),true,"jar_analytical_thinking is not displayed");
        softAssert.assertEquals(jar_wasted_attempt_new.isDisplayed(),true,"jar_wasted_attempt_new is not displayed");
        softAssert.assertAll();
    }
    public void clickOnRecallJar(){
        waitForElementToBeVisible(jar_recall);
        jar_recall.click();
    }
    public void clickOnConceptualJar(){
        waitForElementToBeVisible(jar_conceptual_thinking);
        jar_conceptual_thinking.click();
    }
    public void clickOnAnalyticalThinkingJar(){
        swipeScreen(Direction.DOWN);
        scrollToText("Attempt Quality");
        waitForElementToBeVisible(jar_analytical_thinking);
        jar_analytical_thinking.click();
    }
    public void verifyAnalyticalThinkingJarElements(){
        waitForElementToBeVisible(iv_play);
        softAssert.assertEquals(iv_play.isDisplayed(),true,"iv_play is not displayed");
        softAssert.assertEquals(lv_jar.isDisplayed(),true,"lv_jar is not displayed");
        softAssert.assertEquals(tv_header.isDisplayed(),true,"tv_header is not displayed");
        softAssert.assertEquals(tv_topic.isDisplayed(),true,"tv_topic is not displayed");
        softAssert.assertEquals(tv_topic.isDisplayed(),true,"tv_topic is not displayed");
        softAssert.assertAll();
    }
    public void verifyRecallJarElements(){
        waitForElementToBeVisible(iv_play);
        softAssert.assertEquals(iv_play.isDisplayed(),true,"iv_play is not displayed");
        softAssert.assertEquals(lv_jar.isDisplayed(),true,"lv_jar is not displayed");
        softAssert.assertEquals(tv_header.isDisplayed(),true,"tv_header is not displayed");
        softAssert.assertEquals(tv_topic.isDisplayed(),true,"tv_topic is not displayed");
        softAssert.assertEquals(tv_topic.isDisplayed(),true,"tv_topic is not displayed");
        softAssert.assertAll();
    }
    public void verifyConceptualThinkingJarElements(){
        waitForElementToBeVisible(iv_play);
        softAssert.assertEquals(iv_play.isDisplayed(),true,"iv_play is not displayed");
        softAssert.assertEquals(lv_jar.isDisplayed(),true,"lv_jar is not displayed");
        softAssert.assertEquals(tv_header.isDisplayed(),true,"tv_header is not displayed");
        softAssert.assertEquals(tv_topic.isDisplayed(),true,"tv_topic is not displayed");
        softAssert.assertEquals(tv_topic.isDisplayed(),true,"tv_topic is not displayed");
        softAssert.assertAll();
    }

    public void clickOnPlay(){
        waitForElementToBeVisible(iv_play);
        iv_play.click();
    }
    public void verifyElementsOnHeroBanner(){
        waitForElementToBeVisible(HeroBannerName);
        softAssert.assertEquals(HeroBannerName.isDisplayed(),true,"HeroBannerName is not available");
//        softAssert.assertEquals(HeroBannerSubject.isDisplayed(),true,"HeroBannerSubject is not available");
//        softAssert.assertEquals(HeroBannerCoins.isDisplayed(),true,"Hero Banner coin is  not available");
        softAssert.assertEquals(heroBannerDescription.isDisplayed(),true,"heroBannerDescription is not available");
        softAssert.assertEquals(Bookmark.isDisplayed(),true,"SummaryBookmark is not available");
        //  softAssert.assertEquals(Like.isDisplayed(),true,"SummaryLike is not available");
        softAssert.assertEquals(TakeTest.isDisplayed(),true,"ViewFeedback is not available");
        softAssert.assertAll();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void verifyClickingOnATestTileTakesUserToTheTestSummaryPage(){
        waitForElementToBeVisible(heroBannerDescription);
        heroBannerDescription.getText();

    }
    public String verifyTestNameInTestSummary(){
        waitForElementToBeVisible(HeroBannerName);
        String testName=HeroBannerName.getText();
        System.out.println("Test Name is :"+HeroBannerName.getText());
        softAssert.assertEquals(HeroBannerName.isDisplayed(),true,"testName is not displayed");
        return testName;
    }
    public String verifySubjectNameInTestSummary(){
        waitForElementToBeVisible(HeroBannerSubject);
        String subjectName=HeroBannerSubject.getText();
        System.out.println("Subject Name is :"+HeroBannerSubject.getText());
        softAssert.assertEquals(HeroBannerSubject.isDisplayed(),true,"subjectName is not displayed");
        return subjectName;
    }
    public void verifyTestNameMatchesWithSubjectName(String TestName){
        waitForElementToBeVisible(HeroBannerSubject);
        System.out.println("test name :"+HeroBannerSubject.getText()+ " " + TestName.toUpperCase());
        Assert.assertEquals(HeroBannerSubject.getText().toUpperCase().contains(TestName.toUpperCase()),true,"not");

    }

    public int verifyEmbibePoints(){
        waitForElementToBeVisible(HeroBannerCoins);
        int points = Integer.parseInt(HeroBannerCoins.getText());
        System.out.println("credited point is : "+ HeroBannerCoins.getText());
        return points;
    }
    public void clickOnBookMark(){
        waitForElementToBeVisible(Bookmark);
        Bookmark.click();
    }
    public void clickOnUnBookMark(){
        waitForElementToBeVisible(Bookmark);
        Bookmark.click();
    }
    public void verifyIfTestIsBookMarked(){
        waitForElementToBeVisible(BookMarked);
        softAssert.assertEquals(BookMarked.isDisplayed(),true,"BookMarked is not visible");

    }
    public void clickOnLike(){
        waitForElementToBeVisible(Like);
        Like.click();
    }
    public void clickOnUnLike(){
        waitForElementToBeVisible(Like);
        Like.click();
    }

    public void verifyElementsOnHereIsWhereYouStandSection() {
        swipeScreen(Direction.DOWN);
        scrollToText("Here is where you stand");
        waitForElementToBeVisible(Here_is_where_you_stand);
        softAssert.assertEquals(PrimaryProgressImage.isDisplayed(),true,"PrimaryProgressImage is not available");
        softAssert.assertEquals(TestReadiness.isDisplayed(),true,"Test_Readiness is not available");
        scrollToText("Sincerity Score");
        softAssert.assertEquals(SincerityScoreImg.isDisplayed(),true,"SincerityScoreImg is not available");
        softAssert.assertEquals(SincerityScoreHeader.isDisplayed(),true,"SincerityScoreHeader is not displayed");
        scrollToText("IDK");
        //waitForElementToBeVisible(SincerityScoreDescription);
       // softAssert.assertEquals(SincerityScoreDescription.isDisplayed(),true,"SincerityScoreDescription is not displayed");
      //  softAssert.assertEquals(ivSincerityScorePlay.isDisplayed(),true,"ivSincerityScorePlay is not displayed");
        //softAssert.assertEquals(IDK.isDisplayed(),true,"IDK is not available");
//        softAssert.assertEquals(attemptQualityHeader.isDisplayed(),true," attemptQualityHeader is not available");
  //      waitForElementToBeVisible(attemptQualityDescription);
    //    softAssert.assertEquals(attemptQualityDescription.isDisplayed(),true," attemptQualityDescription is not available");
        softAssert.assertEquals(attemptQualityJar.isDisplayed(),true," attemptQualityJar is not available");
        softAssert.assertAll();

    }
    public void clickOnSincerityScorePlayButton(){
        waitForElementToBeVisible(ivSincerityScorePlay);
        ivSincerityScorePlay.click();
    }
    public void verifySincerityScoreWidget(){
        swipeScreen(Direction.DOWN);
        scrollToText("Test Readiness");
        waitForElementToBeVisible(ivSincerityScorePlay);
        softAssert.assertEquals(ivSincerityScorePlay.isDisplayed(),true,"SincerityScorePlay is not dipalyed");

        softAssert.assertAll();
    }
    public void clickOnSincerityScorewidgetTile(){
        waitForElementToBeVisible(ivSincerityScorePlay);
        ivSincerityScorePlay.click();
    }
    public void clickOnQuit(){
        try {
            waitForElementToBeVisible(quit);
            quit.click();
        }catch (Exception e){

        }

    }
    @FindBy(id = "tv_header")
    private WebElement header;

    @FindBy(id = "ivSincerityScoreImg")
    private WebElement animation;

    @FindBy(id = "tv_topic")
    private WebElement topic;

    @FindBy(id = "tv_description")
    private WebElement description;

    public void verifyAllTheElementsOfSincerityScoreWidget(){
        waitForElementToBeVisible(header);
        softAssert.assertEquals(header.isDisplayed(),true,"header is not displayed");
        softAssert.assertEquals(animation.isDisplayed(),true,"animation is not displayed");
        softAssert.assertEquals(topic.isDisplayed(),true,"topic is not displayed");
        softAssert.assertEquals(description.isDisplayed(),true,"description is not displayed");
        softAssert.assertAll();
    }

    public void verifyAllTheElementsOnAboutTheTestSection(){
        scrollToText("About the Test");
        waitForElementToBeVisible(About_the_Test);
        softAssert.assertEquals(About_the_Test.isDisplayed(),true,"About_the_Test is not available");
        softAssert.assertEquals(test_quality_scoreImage.isDisplayed(),true,"test_quality_scoreImage is not available");
        softAssert.assertEquals(test_quality_scoreText.isDisplayed(),true,"Material text is not available");
        softAssert.assertEquals(percentageText.isDisplayed(),true,"percentageText is not available");
        softAssert.assertEquals(Aligned_to_Your_exams.isDisplayed(),true,"Aligned_to_Your_exams ext is not available");
        softAssert.assertEquals(test_duration.isDisplayed(),true,"duration is not available");
        softAssert.assertEquals(questions.isDisplayed(),true,"questions is not available");
        softAssert.assertEquals(marks.isDisplayed(),true,"marks is not available");
        scrollToText("Test Analysis");
        softAssert.assertEquals(Test_AnalysisTitle.isDisplayed(),true,"Test analysis report is not available");
//        softAssert.assertEquals(ProgressKeys.isDisplayed(),true,"Progress keys is not available");
        softAssert.assertAll();

    }
    public void verifyElementsRecommendedLearningCarousel(){
        swipeScreen(Direction.DOWN);
       // scrollToText("Recommended Learning");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);

        waitForElementToBeVisible(ListOfRecommendedLearning.get(0));
        softAssert.assertEquals(allHeader.get(0).isDisplayed(),true,"Recommended Learning Carousel is not displayed");
        softAssert.assertEquals(ListOfRecommendedLearning.get(0).isDisplayed(),true,"Recommended Learning tile is not displayed");
        softAssert.assertEquals(ListOfSubjectHolder.get(0).isDisplayed(),true,"Subject Holder is not displayed");
        softAssert.assertEquals(video_lib_image_view.get(0).isDisplayed(),true,"video_lib_image_view is not displayed");
        softAssert.assertAll();
    }

    public String verifyCustomTestName() {
        waitForElementToBeVisible(HeroBannerSubject);
        softAssert.assertEquals(HeroBannerSubject.isDisplayed(), true, "HeroBannerSubject is not available");
        String test_name= HeroBannerSubject.getText();
        System.out.println("Subject name is :"+ HeroBannerSubject.getText());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return test_name;

    }

    public void clickOnRecommendedLearningTile(){
        scrollToText("Recommended Learning");
        waitForElementToBeVisible(ListOfRecommendedLearning.get(0));
        ListOfRecommendedLearning.get(0).click();
        WebDriverWait wait = new WebDriverWait(driver(), 30);
    }
    public void verifyElementsRecommendedPracticeCarousel(){
        scrollToText("More Tests");
        waitForElementToBeVisible(ListOfRecommendedPractice.get(0));
        softAssert.assertEquals(allHeader.get(0).isDisplayed(),true,"Recommended Practice Carousel is not displayed");
        softAssert.assertEquals(ListOfRecommendedPractice.get(0).isDisplayed(),true,"Recommended Practice is not displayed");
        softAssert.assertEquals(ListOfPracticeHolder.get(0).isDisplayed(),true," Practice holder is not displayed");
        //  softAssert.assertEquals(question_books_tag.get(0).isDisplayed(),true,"tag is not displayed");
        softAssert.assertAll();
    }
    public void clickOnRecommendedPracticeTile(){
        scrollToText("More Tests");
        waitForElementToBeVisible(ListOfRecommendedPractice.get(0));
        ListOfRecommendedPractice.get(0).click();
    }
    public void verifyElementsMoreTestsCarousel(){
        swipeScreen(Direction.DOWN);
        scrollToText("More Tests");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(ListOfMoreTests.get(0));
        softAssert.assertEquals(allHeader.get(0).isDisplayed(),true,"More Tests Carousel is not displayed");
        softAssert.assertEquals(ListOfMoreTests.get(0).isDisplayed(),true,"More test tile is not displayed");
    }
    public void clickOnMoreTestTile(){
        scrollToText("More Tests");
        ListOfMoreTests.get(0).click();
    }
    public String clickOnViewFeedback(){
        waitForElementToBeVisible(viewFeedback);
        String feedback= viewFeedback.getText();
        System.out.println("name is:"+ viewFeedback.getText());
        viewFeedback.click();
        return feedback;
    }

}

