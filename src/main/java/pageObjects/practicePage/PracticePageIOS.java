package pageObjects.practicePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PracticePageIOS extends BasePage implements PracticePage{
    SoftAssert softAssert = null;

    public PracticePageIOS(AppiumDriver driver) {
        softAssert = new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeStaticText")})
    private List<WebElement> chapterNameList;

    @FindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]")
    private WebElement heroBanner;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")})
    private List<WebElement> imageBannerList;

    @FindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement heroBannername;


    @FindBy(xpath= "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    private WebElement heroBannerDescription;

    @FindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
    private WebElement HeroBannerSubject;

    @FindBy(xpath ="//XCUIElementTypeCell[2]/XCUIElementTypeButton")
    private WebElement StartPractice;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeStaticText[1]")})
    private List<WebElement> allHeader;


    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell[2]//XCUIElementTypeStaticText")})
    private List<WebElement> allSubjectList;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell[3]/XCUIElementTypeButton[2]")})
    private List<WebElement> allChapterPracticeList;


    @FindBy(id = "tvSummaryBookmark")
    private WebElement bookmark;

    @FindBy(id = "jar_recall")
    private WebElement attemptqualityrecall;

    @FindBy(id = "iv_play")
    private WebElement attemptqualityplay;

    @FindBy(id ="tvSummaryLike")
    private WebElement like;

    @FindBy(xpath ="//android.widget.TextView[@text='Mathematics']")
    private WebElement Mathematics;

    @FindBy(xpath ="//XCUIElementTypeButton[@name=\"Check Progress + Achievement\"]")
    private WebElement CheckProgress;

    @FindBy(xpath ="//android.view.View[@resource-id='lessonName']")
    private WebElement LessonName;

    @FindBy(xpath ="//android.view.View[@text='Progress']")
    private WebElement Progress;

    @FindBy(xpath ="//android.view.View[@text='Achievement']")
    private WebElement Achievement;

    @FindBy(xpath ="//android.widget.Button[@text='Full Solution']")
    private WebElement FullSolution;

    @FindBy(xpath ="//android.widget.Button[@text='Continue']")
    private WebElement Continue;

    @FindBy(xpath ="//XCUIElementTypeButton[@name=\"practice hint\"]")
    private WebElement HintButton;


    @FindBy(xpath ="//android.widget.Image[@text='bulb.0756ff74']")
    private WebElement bulbImage;


    @FindBy(xpath ="//android.widget.Button[@text='Solve With Us']")
    private WebElement SolveWithUs;

    @FindBy(xpath ="(//XCUIElementTypeStaticText[@name=\"Attempt Quality\"])[2]")
    private WebElement AttemptQuality;

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Sincerity Score\"]")
    private WebElement SincerityScore;

    @FindBy(xpath = "//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[5]")
    private WebElement heroBannerConcepts;

    @FindBy(xpath = "//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[5]")
    private WebElement heroBannerCoursedetails;

    @FindBy(xpath ="//android.view.View[@text='.']")
    private WebElement EndSession;

    @FindBy(xpath ="//android.view.View[@text='A']")
    private WebElement Answer;

    @FindBy(xpath ="//android.widget.Image[@text='milestone-active.67b781d7']")
    private WebElement SessionSummery;

    @FindBy(xpath ="//android.widget.TextView[@text='Session Summary']")
    private WebElement SessionSummerytext;

    @FindBy(xpath ="//android.widget.Button[@text='Check']")
    private WebElement CheckButton;

    @FindBys({@FindBy(id="adBannerCardView")})
    private List<WebElement> listOfChapters;

    @FindBys({@FindBy(id="ivTag")})
    private List<WebElement> listOfTags;


    @FindBy(xpath="//XCUIElementTypeCell[1] /XCUIElementTypeStaticText[3]")
    private WebElement goalSwitch;

    @FindBy(id="btn_continue_learning")
    private WebElement continuepractice;

    @FindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Chapter\"]")
    private WebElement cheatsheetTag;

    @FindBy(xpath= "//XCUIElementTypeButton[@name=\"search btn\"]")
    private WebElement searchIcon;

    @FindBy(id= "textChapter")
    private WebElement textChapter;

    @FindBy(id= "textPractice")
    private WebElement textPractice;

    @FindBy(id= "textDescription")
    private WebElement textDescription;

    @FindBy(id= "textTitleCheatSheet")
    private WebElement textTitleCheatSheet;

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Sincerity Score\"]")
    private WebElement careless;

    @FindBy(className = "android.widget.EditText")
    private WebElement c;

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Practice From Book\"]")
    private WebElement PracticeNowButton;

    @FindBy(id = "txt_action")
    private WebElement TakeTest;

    @FindBy(id = "tv_msg2")
    private WebElement tv_msg2;

    @FindBy(xpath ="//android.widget.TextView[@text='Session Summary']")
    private WebElement SessionSummeryText;

    @FindBy(xpath ="//android.widget.TextView[@text='Questions']")
    private WebElement Questions;

    @FindBy(xpath ="//android.widget.TextView[@text='Total time spent']")
    private WebElement Totaltimespent;

    @FindBy(xpath ="//android.widget.TextView[@text='Accuracy']")
    private WebElement Accuracy;

    @FindBy(xpath ="//android.widget.TextView[@text='Here is where you stand']")
    private WebElement Hereiswhereyoustand;

    @FindBy(xpath ="//android.widget.Image[@text='timer.3bdb8a53']")
    private WebElement Timer;

    @FindBy(className ="sc-exiMuG cJJjvU focused_0")
    private WebElement PracticeBookMarkce;

    /*@FindBys({@FindBy(className="android.view.View")})
    private List<WebElement> PractiBookMark;*/


    @FindBy(xpath ="//android.widget.Button[@text='Back']")
    private WebElement BackButton;

    @FindBy(xpath ="//android.widget.TextView[@text='Achieve Now']")
    private WebElement AchieveNow;

    @FindBy(xpath ="//div[@class='eds-row eds-row-center eds-row-top mobileAppDownload-wrapper--continue']")
    private WebElement ContinueOnWeb;

    @FindBy(xpath ="//android.widget.Image[@text='nxhdfbk7isAAAAAElFTkSuQmCC']")
    private WebElement BookImage;

    @FindBy(id ="tv_topic")
    private WebElement SincerityScorePlay;

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Recommended Learning To Ace This Practice\"]")
    private WebElement RecommendedLearningVideoButton;

    @FindBy(id ="jar_conceptual_thinking")
    private WebElement conceptual_thinking;

    @FindBy(id ="jar_analytical_thinking")
    private WebElement analytical_thinking;

    @FindBy(id ="tv_header")
    private WebElement attemptquality_header;

    @FindBy(id ="tv_topic")
    private WebElement attemptquality_topicname;

    @FindBy(id ="tv_description")
    private WebElement attemptquality_description;

    @FindBy(id ="jar_wasted_attempt_new")
    private WebElement wasted_attempt_new;

    @FindBy(xpath ="//XCUIElementTypeCell[4]//XCUIElementTypeStaticText[2]")
    private WebElement PracticeForChapter;



    @FindBy(xpath ="/XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement custom_title2;

    @FindBy(xpath ="//XCUIElementTypeCell[13]/XCUIElementTypeStaticText[1]")
    private WebElement TestOnThisChapter;

    @FindBy(id ="question_books_tag")
    private WebElement question_books_tag;

    @FindBy(xpath ="//XCUIElementTypeImage[@name=\"gold_embium\"]")
    private WebElement HeroBannerCoins;

    @FindBy(xpath ="//android.widget.Button[@text='Quit']")
    private WebElement quitBtn;

    @FindBy(id="btn_continue_learning")
    private WebElement goBack;

    @FindBy(xpath= "//android.widget.Button[@text='Hide Solution']")
    private WebElement HideSolution;

    @FindBy(xpath= "//android.widget.Button[@text='Reveal Answer']")
    private WebElement RevealAnswer;

    @FindBy(xpath= "//android.widget.TextView[@text='Are you sure you want to end your practice session?']")
    private WebElement EndPracticeSessionMsg;

    @FindBy(xpath= "//android.view.View[@text='Explanation']")
    private WebElement Explaination;

    @FindBy(xpath= "//android.widget.Image[@text='Bee']")
    private WebElement BeeImage;

    @FindBy(xpath= "//android.widget.TextView[@text='Earned']")
    private WebElement Earned;

    @FindBy(xpath= "//android.view.View[@text='The concepts used in this question are']")
    private WebElement The_concepts_used_in_this_question_are;

    @FindBy(xpath= "//android.view.View[@text='Primary Concept']")
    private WebElement Primary_Concept;

    @FindBy(xpath= "//android.view.View[@text='These videos will help you learn the above concepts']")
    private WebElement These_Videos_will_help_you_learn_these_Concepts;

    @FindBy(xpath= "//android.widget.TextView[@text='Books With Videos & Solutions - Science']")
    private WebElement Bookswithvedios;

    @FindBy(xpath= "//android.widget.Image[@text='desingmate_cateogry']")
    private WebElement desingmate_cateogry;

    @FindBys({@FindBy(xpath="//XCUIElementTypeCell//XCUIElementTypeImage")})
    private List<WebElement> chapterPracticeList;

    @FindBy(xpath= "//div[@id='PracticeConatiner']//span[contains(text(),'Question')]/..//span[2]")
    private WebElement questionType;


    @FindBy(id ="cheatWebView")
    private WebElement cheatWebView;

    @FindBy(id ="tvTitle")
    private WebElement Tittle;

    @FindBy(xpath ="//XCUIElementTypeButton[@name=\" Learn Now \"]")
    private WebElement addBanner;

    @FindBy(xpath ="//XCUIElementTypeCell[5]/XCUIElementTypeButton[2]")
    private WebElement addBannerMuteButton;

    @FindBy(xpath = "//span[@class='sc-ikPAkQ ceimHt']//child::span[2]")
    private WebElement questionId;

    //  @FindBys({@FindBy(className = "android.view.View")})
    @FindBy(xpath = "//span[@class='sc-ikPAkQ ceimHt']//child::span[2]")
    private List<WebElement> questionIds;

    @FindBy(className = "sc-ehsPrw mvhHH")
    private WebElement BookMarkedQuestions;

    @FindBy(xpath= "//android.widget.TextView[@text='You do not have any \n" + " bookmarked questions.']")
    private WebElement BookMarkedQuestionsmsg;

    @FindBy(xpath= "//android.widget.TextView[@text='Videos']")
    private WebElement BookMarkedVideos;

    @FindBy(xpath= "//android.widget.TextView[@text='Topics for Practice']")
    private WebElement TopicsforPractice;

    @FindBy(xpath= " //*[ text() = 'Full Solution' ]")
    private WebElement FullSolutionWeb;

    @FindBy(xpath= "//android.widget.TextView[@text='Tests on this chapter']")
    private WebElement Testonthischapter;

    @FindBy(xpath= "//android.widget.TextView[@text='You do not have any \n" + " bookmarked videos.']")
    private WebElement BookMarkedvideosmsg;

    @FindBy(xpath= "//android.widget.TextView[@text='Learn Chapters']")
    private WebElement Learn_Chapters;

    @FindBy(xpath= "//XCUIElementTypeCell//XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement books_available;

    @FindBy(xpath= "//XCUIElementTypeOther[@name=\"Recommended Learning To Ace This Practice\"]")
    private WebElement recommendedlearning;

    @FindBy(xpath= "//span[@class='sc-lgqmxq FGHoO text-ellipsis']")
    private WebElement topicname;

    @FindBy(xpath= "//span[@class='sc-lgqmxq FGHoO text-ellipsis' or @class='sc-dtTInj bRFhLZ text-ellipsis]")
    private WebElement topicname2;


    @FindBy(xpath= "//*[text()='Continue']")
    private WebElement ContinueWeb;

    @FindBy(xpath="//*[text()='Solve With Us']")
    private  WebElement solvewithusWeb;

    @FindBy(xpath="//button[@class='sc-eGCarw hNhLam swu-reveal-btn']")
    private WebElement revealanswerweb;

    @FindBy(xpath ="//*[text()='Check']" )
    private WebElement checkbuttonweb;

    @FindBy(xpath="//button[@class='sc-eGCarw hNhLam swu-reveal-btn']")
    private WebElement revealbuttonweb;

    @FindBy(xpath="//span [//*[@id='1932756_10']/span[2]']")
    private WebElement subjectiveinputweb;

    @FindBy(xpath="//span [//*[@id='1932756_10']/span[2]']")
    private WebElement integerinputbutton;

    @FindBy(xpath= "//span[text()='A']")
    private WebElement selectOption_A;

    @FindBy(xpath= "//span[@class='mq-root-block mq-empty']")
    private WebElement subjectiveanswerinput;

    @FindBy(xpath= "//span[contains(@id,'solve-wus')]")
    private WebElement integerinput;

    @FindBy(xpath= "//div[@class='sc-iWFSnp cmuvkJ dropdown--select-arrow']")
    private WebElement selectdropdown;

    @FindBy(xpath= "//div[@class='sc-eWVKcp sc-aKZfe sc-dkmKpi coSUJe fiTcEd ioWVHA dropdown--item']")
    private WebElement dropdownoption;

    @FindBy(xpath= "//span[@class='sc-jXktwP FSikw mq-editable-field mq-math-mode em-text-mode']")
    private WebElement fillintheblanksinput;

    @FindBy(xpath= "//span[@id='fb-blank-0']")
    private WebElement multiplefillintheblanksinput1;

    @FindBy(xpath= "//span[@id='fb-blank-1']")
    private WebElement multiplefillintheblanksinput2;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")})
    private List<WebElement> listofHeader;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText")})
    private List<WebElement> listofHeaderOnChapterPage;

    public void clickOnPracticeFromChapterPractice(String value){
        scrollToText("Tests on this chapter");
        allChapterPracticeList.get(0).click();
    }

    public void VerifyBooksWithVediosDisplayRelatedToSubject()
    {
        String SubjectName=allSubjectList.get(1).getText().toLowerCase();
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(allHeader.get(0));
        String Concept=allHeader.get(0).getText().toLowerCase();
        Assert.assertEquals(Concept.contains(SubjectName),true);

    }

    public void VerifyUserCanLikeTheChapterByClickingOnLikeButton() {
        waitForElementToBeVisible(like);
        like.click();
    }
    public void VerifyUserCanUnLikeTheChapterByClickingOnLikeButton() {
        waitForElementToBeVisible(like);
        like.click();
        like.click();
    }

    public String getQuestionType()
    {
        String questionType=null;

        waitForElementToBeVisible(questionId);
        //  for (int i=0; i<questionId.size();i++) {

        String questionID = questionId.getAttribute("resource-id");
        if (questionID!=null)
        {
            if (!questionID.contains("MathJax-Element")&& !questionID.contains("Practice")&& !questionID.contains("app")
                    && !questionID.contains("solve-wus")&& !questionID.contains("1967858_1")&& !questionID.contains("1967858_10")&& !questionID.contains("1"))
            {
                // questionType=questionID.split("_");
                System.out.println(questionID + "question id ");

            }

        }
        //  System.out.println(questionIds.get(7).getAttribute("resource-id") + "question id ");
        return questionType;
    }


    public void verifyThumbnailOnChapters(){
        verticalSwipeByPercentages(0.8,0.7,0.5);

        softAssert.assertEquals(imageBannerList.get(0).isEnabled(),true,"Practice thumbnail is not Displayed");
        softAssert.assertEquals(imageBannerList.get(1).isEnabled(),true,"Practice thumbnail is not Displayed");
        softAssert.assertAll();


    }
    public void VerifyAddBanner(){
      /*  //scrollToText("Books With Videos & Solution");
        swipeScreen(BasePage.Direction.UP);
        swipeScreen(BasePage.Direction.UP);
        swipeScreen(BasePage.Direction.UP);
        swipeScreen(BasePage.Direction.UP);
        softAssert.assertEquals(addBanner.isEnabled(),true,"Practice thumbnail is not Displayed");
        softAssert.assertEquals(addBannerMuteButton.isEnabled(),true,"Practice thumbnail is not Displayed");
        softAssert.assertAll();
*/



    }

    @Override
    public void switchToWebView() {

    }

    public void VerifyExplanationDisplay()
    {
        waitForElementToBeVisible(Explaination);
        Assert.assertEquals(Explaination.isEnabled(), true, "Explanation is not displayed");
    }
    public void VerifyBeeImageDisplay()
    {try{ waitForElementToBeVisible(BeeImage);
        Assert.assertEquals(BeeImage.isEnabled(), true, "Bee Image is not displayed");
    } catch (Exception e) {
        e.printStackTrace();
    }

    }
    public void VerifyEarnedMsgDisplay()
    {
        waitForElementToBeVisible(Earned);
        Assert.assertEquals(Earned.isEnabled(), true, "Earned is not displayed");
    }
    public void verifyfullsolutiondisplay()
    {
        waitForElementToBeVisible(FullSolution);
        Assert.assertEquals(FullSolution.isEnabled(),true,"fullsolution Button is not Displayed");
    }

    public  void clickoncontinuepractice(){
        waitForElementToBeVisible(continuepractice);
        continuepractice.click();
    }
    public void VerifyUserCanUnBookMarkTheChapterByClickingOnBookMarkButton() {
        waitForElementToBeVisible(bookmark);
        bookmark.click();
        bookmark.click();
    }

    public void VerifySearchIconDisplaye() {
        waitForElementToBeVisible(searchIcon);
        Assert.assertEquals(searchIcon.isEnabled(), true, "Search Icon is not displayed");
    }
    public void verifyHeroBannerTag() {
        waitForElementToBeVisible(listOfTags.get(0));
        Assert.assertEquals(listOfTags.get(0).isEnabled(), true, "Tag is not displayed");
        Assert.assertEquals(listOfTags.get(1).isEnabled(), true, "Tag is not displayed");
    }
    public void VerifyChapterDisplayRelatedToGoalAndExam() {
        String Goal=goalSwitch.getText().toLowerCase();
        waitForElementToBeVisible(allHeader.get(1));
        String Concept=allHeader.get(1).getText().toLowerCase();
        Assert.assertEquals(Concept.contains(Goal),true);
    }
    public void VerifyLearnChapterDisplay() {
        waitForElementToBeVisible(Learn_Chapters);
        Assert.assertEquals(Learn_Chapters.isEnabled(), true, "Learn Chapter is not displayed");
    }
    public void VerifyEndPracticeSessionMsg() {
        waitForElementToBeVisible(EndPracticeSessionMsg);
        Assert.assertEquals(EndPracticeSessionMsg.isEnabled(), true, "Quit Msg is not displayed");
    }

    public void VerifyUserCanUnLikeButton() {
        waitForElementToBeVisible(like);
        like.click();
        like.click();


    }


    public void clickOnPracticeNowButton(){
        waitForElementToBeVisible(PracticeNowButton);
        PracticeNowButton.click();

    }
    public void inputValue(){
        waitForElementToBeVisible(c);
        c.click();
        driver().getKeyboard().sendKeys("k12r");
        driver().navigate().back();

    }

    public void clickOnFullSolutionButton(){try{
        waitForElementToBeVisible(FullSolution);
        FullSolution.click();

    } catch (Exception e) {
        e.printStackTrace();
    }


    }
    public void clickOnHideSolutionButton(){
        //   waitForElementToBeVisible(HideSolution);
        waitForElementToBeClickable(HideSolution);
        HideSolution.click();

    }
    public void clickOnSubject(){
        allSubjectList.get(0).click();

    }
    public void clickOnContinueButton() {try {
        waitForElementToBeVisible(Continue);
        Continue.click();

    } catch (Exception e) {
        e.printStackTrace();
    }

    }
    public void clickOnBackButton(){
        waitForElementToBeVisible(BackButton);
        BackButton.click();

    }
    public void clickOnEndSessionButton(){
        waitForElementToBeVisible(EndSession);
        EndSession.click();

    }
    public void clickOnAnswer(){
        waitForElementToBeVisible(Answer);
        Answer.click();

    }

    public void clickOnSolveWithUsButton(){
        try {waitForElementToBeVisible(SolveWithUs);
            SolveWithUs.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickOnCheckButton(){
        try {
            waitForElementToBeVisible(CheckButton);
            CheckButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void VerifyUserCanNavigateCheckProgress(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        verticalSwipeByPercentages(0.8, 0.6, 0.5);
        waitForElementToBeVisible(CheckProgress);
        CheckProgress.click();
    }
    public void VerifyCheckButtonAfterAnswer(){try {

    } catch (Exception e) {
        waitForElementToBeVisible(CheckButton);
        Assert.assertEquals(CheckButton.isEnabled(), true, "Check Button is not Enabled");
        e.printStackTrace();
    }


    }
    public void verifyCheckButtonIsDisplayed(){
        waitForElementToBeVisible(CheckButton);
        softAssert.assertEquals(CheckButton.isEnabled(),true,"CheckButton is not displayed");
        softAssert.assertAll();
    }

    public void VerifyCheckButtonBeforeAnswer(){
        waitForElementToBeVisible(CheckButton);
        Assert.assertEquals(CheckButton.isEnabled(), false, "Check Button is Enabled");
    }
    public void ClickOnReavealAnswer()
    { try{waitForElementToBeVisible(RevealAnswer);
        RevealAnswer.click();
    } catch (Exception e) {
        e.printStackTrace();
    }

    }
    public void ClickOnPracticeChapter()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        PracticeForChapter.click();
    }
    public void VerifyAllTheElementsOnTopicsForPractice()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        PracticeForChapter.click();
//        softAssert.assertEquals(textPractice.isEnabled(),true,"textpractice is not displayed");
      //  softAssert.assertEquals(question_books_tag.isEnabled(),true,"question_books_tag is not displayed");
       // softAssert.assertEquals(textDescription.isEnabled(),true,"textDescription is not displayed");
        softAssert.assertAll();

    }
    public void VerifyUserisabletoplaythevideosifpresentinPrimaryConcepts()
    {
        scrollToText("desingmate_cateogry");
        waitForElementToBeVisible(desingmate_cateogry);
        desingmate_cateogry.click();
    }
    public void Verifyonclickonvideointhelearninterventionpage()
    {

        waitForElementToBeVisible(desingmate_cateogry);
        desingmate_cateogry.click();
    }
    public void VerifyUserCanNavigateEmbibeBigBook()

    {
        scrollToText("" + "Embibe Big Books For 7th CBSE");
    }

    public void VerifyalltheelementsonAttemptquality()
    {
        scrollToText("Attempt Quality");
        softAssert.assertEquals(attemptqualityrecall.isEnabled(),true,"recall is not displayed");
        softAssert.assertEquals(conceptual_thinking.isEnabled(),true,"recal is not displayed");
        softAssert.assertEquals(analytical_thinking.isEnabled(),true,"anlytical thinking is not displayed");
        softAssert.assertEquals(wasted_attempt_new.isEnabled(),true,"wasted attempt is not displayed");
        softAssert.assertAll();

    }
    public void VerifyAllTheElementsOnPoinysToRememberTile(){
        swipeScreen(Direction.UP);
        verticalSwipeByPercentages(0.8, 0.6, 0.5);
        softAssert.assertEquals(cheatsheetTag.isEnabled(),true,"cheatsheetTag is not displayed");
        softAssert.assertAll();
    }
    public void VerifyAllTheElementsOnPointsToRememberPage(){
        swipeScreen(Direction.UP);
        verticalSwipeByPercentages(0.8, 0.6, 0.5);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String str=null;

        int i=0;
        while (i<listofHeaderOnChapterPage.size()) {


            System.out.println(i+" "+listofHeaderOnChapterPage.get(i).getText());
            if(listofHeaderOnChapterPage.get(i).getText().contains("Point")){
                str=listofHeaderOnChapterPage.get(i).getText();
                for(int k=0;k<i-9;k++) {
                    verticalSwipeByPercentages(0.8, 0.6, 0.5);

                }



                break;
            } i++;
        }
        cheatsheetTag.click();
        softAssert.assertEquals(custom_title2.isEnabled(),true,"customTitle is not displayed");
        // softAssert.assertEquals(Tittle.isEnabled(),true,"Title is not displayed");
        softAssert.assertAll();
    }
    public void VerifyUserCanNavigateToTestOnThisChapter()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        TestOnThisChapter.click();
    }
    public void verifyalltheelementsonattemptqualityjars()
    {
        softAssert.assertEquals(attemptquality_header.isEnabled(),true,"attemptquality_header is not displayed");
        softAssert.assertEquals(attemptquality_description.isEnabled(),true,"attemptquality_description is not displayed");
        softAssert.assertEquals(attemptquality_topicname.isEnabled(),true,"attemptquality_topicname is not displayed");
        softAssert.assertEquals(attemptqualityplay.isEnabled(),true,"attemptqualityplay is not displayed");
        softAssert.assertAll();

    }
    public void VerifyEachTileShowsTheSubjectTaggedToItAndThePracticeSymbol()
    {
        verticalSwipeByPercentages(0.8,0.7,0.5);
        Assert.assertEquals(allChapterPracticeList.get(0).isEnabled(),false,"Subject Tittle is not Displayed");

    }


    public void VerifyUserCanNavigateToRecommendedLearning()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        waitForElementToBeVisible(RecommendedLearningVideoButton);
        RecommendedLearningVideoButton.click();
    }

    public void VerifyUserIsAbleToSeeHereIsWhereYouStandWidget() {
        waitForElementToBeVisible(Hereiswhereyoustand);
        Assert.assertEquals(Hereiswhereyoustand.isEnabled(), true, "Here Where You Stand is displayed");

    }
    public void VerifyHeroBannerEmbiums() {

        Assert.assertEquals(HeroBannerCoins.isEnabled(), true, "Hero Banner Coins are not credited");

    }
    public void clickOnSessionSummery(){
        waitForElementToBeVisible(SessionSummery);
        SessionSummery.click();
        Assert.assertEquals(SessionSummerytext.isEnabled(), true, "Session Summery is displayed");
    }
    public void verifyclickOnTakeTestButton(){
        scrollToText("Practice Mathematics Chapters From 7th CBSE");

    }

    public void VerifyHeroBannerDisplay() {
        waitForElementToBeVisible(heroBanner);
        Assert.assertEquals(heroBanner.isEnabled(), true, "Hero banner not displayed");
    }
    public void verifyHeroBannerDescriptionDisplay() {
        waitForElementToBeVisible(heroBannerDescription);
        Assert.assertEquals(heroBannerDescription.isEnabled(), true, "HeroBanner Subject name not displayed");

    }

    public void verifyStartPracticeButtonDisplay(){
        waitForElementToBeVisible(StartPractice);
        Assert.assertEquals(StartPractice.isEnabled(), true, " not displayed");
    }
    public void clickOnStartPracticeButton(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        StartPractice.click();

    }
    public void verifyHeroBannerConceptsDisplay() {
        waitForElementToBeVisible(heroBannerConcepts);
        Assert.assertEquals(heroBannerConcepts.isEnabled(), true, "HeroBanner Concepts  not displayed");

    }
    public void verifyBookImageDisplay() {
        waitForElementToBeVisible(BookImage);
        Assert.assertEquals(BookImage.isEnabled(), true, "Book Image is not displayed");

    }
    public void verifyAchieveNowDisplay() {
        scrollToText("Achieve Now");
        waitForElementToBeVisible(AchieveNow);
        Assert.assertEquals(AchieveNow.isEnabled(), true, "AchieveNow Button is not displayed");

    }


    public void VerifyAllTheElementsOnPracticeSummaryScreen(){
        swipeScreen(Direction.UP);
        verticalSwipeByPercentages(0.8, 0.6, 0.5);

        
        //softAssert.assertEquals(books_available.isEnabled(),true,"Books Available is not displayed");
        softAssert.assertEquals(careless.isEnabled(), true, "Sincerity Score is not displayed");
        softAssert.assertEquals(AttemptQuality.isEnabled(), true, "Attempt quality is not displayed");
        swipeScreen(Direction.UP);

        softAssert.assertEquals(recommendedlearning.isEnabled(),true,"recommendedlearning is not displayed");
       // softAssert.assertEquals(Testonthischapter.isEnabled(),true,"Testonthischapter is not displayed");
        //softAssert.assertEquals(TopicsforPractice.isEnabled(),true,"TopicsforPractice is not displayed");
        softAssert.assertAll();


    }

    @Override
    public void navigateback() {

    }

    @Override
    public void verifyHerobannerVideo() {

    }

    @Override
    public void continueScroll() {

    }

    public void VerifyAllTheElementsOnProgressDetailsScreen(){
        softAssert.assertEquals(LessonName.isEnabled(), true, "LessonName is not displayed");
        softAssert.assertEquals(Progress.isEnabled(), true, "Progress is not displayed");
        softAssert.assertEquals(Achievement.isEnabled(), true, "Achievement is not displayed");
        softAssert.assertAll();
    }
    public void VerifyAllTheElementsOnSessionSummeryScreen(){
        softAssert.assertEquals(SessionSummerytext.isEnabled(), true, "SessionSummery is not displayed");
        softAssert.assertEquals(Questions.isEnabled(), true, "Quessions text is not displayed");
        softAssert.assertEquals(Totaltimespent.isEnabled(), true, "Totaltimespent text is not displayed");
        softAssert.assertEquals(Accuracy.isEnabled(), true, "Accuracy text is not displayed");
        softAssert.assertAll();
    }
    public void VerifyAllTheElementsOnSolutionWidgetScreen(){
        scrollToText("These videos will help you learn the above concepts");
        softAssert.assertEquals(The_concepts_used_in_this_question_are.isEnabled(), true, "The_concepts_used_in_this_question_are is not displayed");
        softAssert.assertEquals(Primary_Concept.isEnabled(), true, "Primary_Concept is not displayed");
        softAssert.assertEquals(These_Videos_will_help_you_learn_these_Concepts.isEnabled(), true, "These_Videos_will_help_you_learn_these_Concepts is not displayed");
        softAssert.assertEquals(Continue.isEnabled(), true, "Continue Button is not displayed");
        softAssert.assertAll();
    }

    public void VerifyAllTheElementsOnPracticeSessionScreen(){
        waitForElementToBeVisible(EndSession);
        softAssert.assertEquals(EndSession.isEnabled(), true, "EndSession is not displayed");
        //  softAssert.assertEquals(Timer.isEnabled(), true, "Timer is not displayed");
        softAssert.assertAll();
    }

    public void VerifySolveWithUsButtonOnPracticeSessionScreen()
    {
        try
        {
            softAssert.assertEquals(SolveWithUs.isEnabled(), true, "SolveWithUs Button is not displayed");
            softAssert.assertEquals(SolveWithUs.isEnabled(), true, "SolveWithUs Button is not Enabled");
            softAssert.assertAll();
            clickOnSolveWithUsButton();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void VerifyTimerDisplayOnPracticeSessionScreen(){
        Assert.assertEquals(Timer.isEnabled(), true, "Timer is not displayed");

    }
    public void VerifyUserCanClickSincerityScorePlayButton(){
        swipeScreen(Direction.UP);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        softAssert.assertEquals(SincerityScore.isEnabled(), true, "Description is not displayed");
        softAssert.assertAll();
    }

    public void VerifyHintButtonWorkingOnPracticeSessionScreen(){
        Assert.assertEquals(HintButton.isEnabled(), true, "HintButton is not displayed");
        Assert.assertEquals(HintButton.isEnabled(), true, "HintButton is not displayed");
        HintButton.click();

    }

    public void verifyHeroBannerSubjectNameDisplay() {
        waitForElementToBeVisible(HeroBannerSubject);
        Assert.assertEquals(HeroBannerSubject.isEnabled(), true, "HeroBanner Subject name not displayed");

    }
    public void verifyGoalSwitchButtonDisplay() {

        Assert.assertEquals(goalSwitch.isEnabled(), true, "Goal Switch Button is not displayed");

    }

    public void verifyAllTheElementsOnHeroBannerdescriptionpageInPracticeSummery()
    {
        softAssert.assertEquals(HeroBannerSubject.isEnabled(),true,"Subject tag  is not displayed");
        softAssert.assertEquals(heroBannername.isEnabled(),true,"Chapter Title is not displayed");
        softAssert.assertEquals(heroBannerCoursedetails.isEnabled(),true,"Concepts is not displayed");
        softAssert.assertAll();

    }
    public void verifyUserCanTakePractice() {

        chapterNameList.get(0).click();
       // chapterNameList.get(0).click();
        Assert.assertEquals(chapterPracticeList.get(0).isEnabled(),true,"Practice thumbnail is not Displayed");
        chapterPracticeList.get(0).click();

    }
    public void VerifyThumbnailIsAppearingForSubjectTile() {
        softAssert.assertEquals(imageBannerList.get(0).isEnabled(),true,"Practice thumbnail is not Displayed");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(imageBannerList.get(1).isEnabled(),true,"Practice thumbnail is not Displayed");
        softAssert.assertAll();
    }

    public void verifyTakeTestButtonDisplay() {
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        scrollToText("Have you practiced enough?\n" + "It's time for a test.");
        waitForElementToBeVisible(TakeTest);
        Assert.assertEquals(TakeTest.isEnabled(), true, "Take Test Button is not displayed");
        TakeTest.click();

    }
    public void VerifyAllTheElementsOnPracticeSummeryPage(){

    }
    public void VerifyTheThumbnailIsAppearingForAllTheChapterTiles(){
        scrollToText("Books With Videos & Solutions");
        softAssert.assertEquals(imageBannerList.get(0).isEnabled(),"thumnail is not displayed");
        softAssert.assertEquals(imageBannerList.get(1).isEnabled(),"thumnail is not displayed");
        softAssert.assertAll();
    }

    public void clickOnStatrtPracticeButton(){
        waitForElementToBeVisible(StartPractice);
        StartPractice.click();

    }
    public void VerifyYouDoNotHaveAnyBookmarkedQuestions() {
        scrollToText("My Bookmarks");
        waitForElementToBeVisible(BookMarkedQuestions);
        BookMarkedQuestions.click();
        BookMarkedQuestions.click();
        Assert.assertEquals(BookMarkedQuestionsmsg.isEnabled(), true, "BookMarkedQuestions msg is not displayed");

    }
    public void VerifyYouDoNotHaveAnyBookmarkedVideos() {
        scrollToText("My Bookmarks");
        waitForElementToBeVisible(BookMarkedVideos);
        BookMarkedVideos.click();
        BookMarkedVideos.click();
        Assert.assertEquals(BookMarkedvideosmsg.isEnabled(), true, "BookMarkedvideosmsg msg is not displayed");

    }
    public void webview()
    {
        switchToWebView();

    }
    public void mobileview()
    {
        switchToNativeApp();
    }


    public void clickonAttemptqualityrecall()
    {
        scrollToText("Attempt Quality");
        waitForElementToBeVisible(attemptqualityrecall);
        attemptqualityrecall.click();

    }
    public void clickonAttemptqualityConceptualThinking()
    {
        scrollToText("Attempt Quality");
        waitForElementToBeVisible(conceptual_thinking);
        conceptual_thinking.click();

    }
    public void clickonAttemptqualityAnalyticalThinking()
    {
        scrollToText("Attempt Quality");
        waitForElementToBeVisible(analytical_thinking);
        analytical_thinking.click();

    }
    public void clickonAttemptqualitywastedattempt()
    {
        scrollToText("Attempt Quality");
        waitForElementToBeVisible(wasted_attempt_new);
        wasted_attempt_new.click();

    }

    public void verifyNomorequestionsmsg()
    {

        waitForElementToBeVisible(tv_msg2);
        Assert.assertEquals(tv_msg2.isEnabled(),true,"msg is not displayed");


    }
    public void BookMarkedQuestions(){
        waitForElementToBeVisible(BookMarkedQuestions);
        BookMarkedQuestions.click();
    }

    @Override
    public void switchToNativeApp() {

    }

    public void verifyPracticeSubjectDisplayedMatchesWiththePracticeName(){
        waitForElementToBeVisible(heroBannername);
        String Topicname=heroBannername.getText().toLowerCase();
        clickOnStartPracticeButton();
        switchToWebView();
        waitForElementToBeVisible(topicname);
        String Topicname2=topicname.getText().toLowerCase();
        Assert.assertEquals(Topicname,Topicname2);
        switchToNativeApp();

    }
    public void VerifyEmbibeBookDisplayRelatedToGoalAndExam(){
        String Goal=goalSwitch.getText().toLowerCase();
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(allHeader.get(1));
        String Concept=allHeader.get(1).getText().toLowerCase();
        Assert.assertEquals(Concept.contains(Goal),true);

    }

    public void VerifyUserCanBookMarkTheChapterByClickingOnBookMarkButton() {
        waitForElementToBeVisible(bookmark);
        bookmark.click();
    }
    public void verifyChapterDescriptionDisplay() {
        waitForElementToBeVisible(heroBannerDescription);
        Assert.assertEquals(heroBannerDescription.isEnabled(), true, "Chapter Description not displayed");
    }
    public void VerifyUserCanUseHint() {
        waitForElementToBeVisible(HintButton);
        Assert.assertTrue(HintButton.isEnabled(),"Hint button not visible");



    }
    public void VerifyVideoStartsPlayingByClickingOnAttemptQuality(){
        scrollToText("Attempt Quality");
        waitForElementToBeVisible(attemptqualityrecall);
        attemptqualityrecall.click();
        waitForElementToBeVisible(attemptqualityplay);
        attemptqualityplay.click();


    }

    public void verifyAllHeaderPresent() {
        waitForElementToBeVisible(allHeader.get(0));
        System.out.println("Header Size" + allHeader.size());
        Set<String> allSubjectlist = new LinkedHashSet<>();
        for (int i = 0; i < allHeader.size(); i++) {
            allSubjectlist.add(allHeader.get(i).getText());
        }
        System.out.println("Vipin list" + allSubjectlist);
    }

    public void verifyAllThecarosuelsArePresentOnPractice(List<String> list) {
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

    public void clickOnQuit() {
        waitForElementToBeVisible(quitBtn);
        quitBtn.click();

    }
    public void clickOnGoBack(){
        waitForElementToBeVisible(goBack);
        goBack.click();
    }
}
