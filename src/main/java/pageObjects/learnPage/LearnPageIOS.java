package pageObjects.learnPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class LearnPageIOS extends BasePage implements LearnPage{
    SoftAssert softAssert=null;
    public LearnPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//XCUIElementTypeCell[1]")
    private WebElement heroBanner;

    @FindBy(id = "img_HeroBannerPlayButton")
    private WebElement img_HeroBannerPlayButton;

    @FindBy(xpath= "//XCUIElementTypeButton[@name=\"un bookmark\"]")
    private WebElement bookmark;


    @FindBys({@FindBy(id="ivTag")})
    private List<WebElement> listOfTags;

    @FindBys({@FindBy(xpath="//XCUIElementTypeCell/XCUIElementTypeButton[2]")})
    private List<WebElement> chapterlist;


    @FindBy(id = "tvSummaryBookmark")
    private WebElement Summerybookmark;

    @FindBy(id="like")
    private WebElement like;

    @FindBy(id="tvSummaryLike")
    private WebElement Summerylike;

    @FindBy(xpath = "//android.widget.TextView[@text='Watchlist']")
    private WebElement Watchlist;

    @FindBy(xpath = "//android.widget.TextView[@text='Continue Learning']")
    private WebElement Continue_Learning;

    @FindBy(id = "headerTitle")
    private WebElement MoreOnTheTopic;

    @FindBy(id = "imgOwnerIcon")
    private WebElement EmbibeLogo;

    @FindBy(id = "headerTitle")
    private WebElement MoreOnThisChapter;

    @FindBy(id = "headerTitle2")
    private WebElement RelatedTopics;


    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell[1]//XCUIElementTypeStaticText")})
    private List<WebElement> heroBannerName;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell[1]//XCUIElementTypeStaticText")})
    private List<WebElement> HeroBannerSubject;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell[1]//XCUIElementTypeStaticText")})
    private List<WebElement> heroBannerDescription;

    @FindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[5]")
    private WebElement heroBannerDuration;

    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"slider\"]")
    private WebElement exo_ad_overlay;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sincerity Score\"]")
    private WebElement tv_description;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Learn\"])[1]")
    private WebElement learnBtn;

    @FindBy(id = "player_view")
    private WebElement player_view;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"play\"]")
    private WebElement SummaryLearnButton;

    @FindBys({@FindBy(id = "llMain")})
    private List<WebElement> subjects;

    @FindBy(xpath = "\t\n" +
            "//XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    private WebElement avatarIcon;

    @FindBy(id = "txt_HeroBannerDuration")
    private WebElement heroBannerConcepts;

    @FindBy(id = "txt_HeroBannerCoins")
    private WebElement heroBannerCoins;

    @FindBy(id = "thumbPracticeForChapterIV")
    private WebElement thumbPracticeForChapter;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")})
    private List<WebElement> allHeader;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell[3]//XCUIElementTypeStaticText")})
    private List<WebElement> subject_nameHolder;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell[2]//XCUIElementTypeStaticText")})
    private List<WebElement> subjectNameList;

    @FindBy(xpath ="//XCUIElementTypeButton[@name=\"play\"]\n")
    private WebElement videoPlayButton;

    @FindBys({@FindBy(id = "imgBanner")})
    private List<WebElement> tiles;

    @FindBy(xpath ="(//XCUIElementTypeStaticText[@name=\"Attempt Quality\"])[2]")
    private WebElement AttemptQuality;


    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeButton[2]")})
    private List<WebElement> videoTileSubject;

    @FindBy(id="txt_AdName")
    private WebElement adsName;

    @FindBy(id = "btn_continue_learning")
    private WebElement continueLearningBtn;

    @FindBy(xpath ="//XCUIElementTypeButton[@name=\"Exit\"]")
    private WebElement  quit;

    @FindBy(xpath ="//XCUIElementTypeButton[@name=\"Check Progress + Achievement\"]")
    private WebElement CheckProgress;

    @FindBy(id="tvHeroBannerImportant")
    private WebElement tvHeroBannerImportant;

    @FindBy(id="txt_action")
    private WebElement testBtn;

    @FindBy(id="textDescription")
    private WebElement textDescription;

    @FindBy(id="question_books_tag")
    private WebElement question_books_tag;

    @FindBy(id="exo_content_frame")
    private WebElement videoDisplay;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Exit\"]")
    private WebElement quitBtn;

    @FindBy(id ="ivSincerityScorePlay")
    private WebElement SincerityScorePlay;

    @FindBy(id="btnResume")
    private WebElement resumeBtn;

    @FindBy(xpath ="//android.view.View[@resource-id='lessonName']")
    private WebElement LessonName;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"vp play\"]")
    private WebElement pausebutton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"backButtonShadow\"]")
    private WebElement backarrowbutton;

    @FindBy(xpath ="/XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement custom_title2;

    @FindBy(id ="tvTitle")
    private WebElement Tittle;

    @FindBy(xpath= "textChapter")
    private WebElement textChapter;

    @FindBy(xpath= "textTitleCheatSheet")
    private WebElement textTitleCheatSheet;

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Progress\"]")
    private WebElement Progress;

    @FindBy(xpath ="//android.widget.TextView[@text='Real Life Examples from this Chapter']")
    private WebElement Real_Life_Examples_from_this_Chapter;

    @FindBy(xpath ="//android.widget.TextView[@text='Experiments from this Chapter']")
    private WebElement Experiments_from_this_Chapter;

    @FindBy(xpath ="//android.widget.TextView[@text='DIY on this Chapter']")
    private WebElement DIY_on_this_Chapter;

    @FindBy(xpath ="//android.widget.TextView[@text='Explore Out of Syllabus of this Chapter']")
    private WebElement Explore_Out_of_Syllabus_of_this_Chapter;

    @FindBy(xpath ="//android.widget.TextView[@text='Spoofs on this Chapter']")
    private WebElement Spoofs_on_this_Chapter;

    @FindBy(xpath ="//android.widget.TextView[@text='Topics in this chapter']")
    private WebElement Topics_in_this_chapter;

    @FindBy(xpath ="//android.widget.TextView[@text='Tests on this chapter']")
    private WebElement Tests_on_this_chapter;

    @FindBy(xpath ="//android.widget.TextView[@text='Practice on this chapter']")
    private WebElement Practice_on_this_chapter;

    @FindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Chapter\"]")
    private WebElement cheatsheetTag;

    @FindBy(xpath ="//android.widget.TextView[@text='Here is where you stand on these concepts used in this practice right now']")
    private WebElement Hereiswhereyoustand;

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Achievement\"]")
    private WebElement Achievement;

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Related Videos\"]")
    private WebElement RelatedVideos;


    @FindBys({@FindBy(xpath="//XCUIElementTypeCell//XCUIElementTypeButton")})
    private List<WebElement> listOfVideo;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")})
    private List<WebElement> listofHeader;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText")})
    private List<WebElement> listofHeaderOnChapterPage;

    public void clickOnQuitButton(){

      /*  waitForElementToBeVisible(quitBtn);
        quitBtn.click();*/
    }

    public void isVideoDisplay(){
        waitForElementToBeVisible(videoDisplay);
        softAssert.assertEquals(videoDisplay.isEnabled(),true);
        softAssert.assertAll();
    }


    public void verifyAdsDisplay(){
        scrollUsingResourceID("txt_action");
        waitForElementToBeVisible(adsName);
        Assert.assertEquals(adsName.getText(),"Have you practiced enough?\n" +
                "It's time for a test.","AdName not display");
    }

    public void ClickOnTestButton(){
        scrollUsingResourceID("txt_action");
        waitForElementToBeVisible(testBtn);
        testBtn.click();

    }
    public void clickOnSubject(String subjectName) {
        waitForElementToBeVisible(subjectNameList.get(0));
        for (int i = 0; i < subjectNameList.size(); i++) {
            if (subjectName.equalsIgnoreCase(subjectNameList.get(i).getText())) {
                subjectNameList.get(i).click();
                break;
            }
        }
    }

    public void verifyAvatarIcon() {
        waitForElementToBeVisible(avatarIcon);
        Assert.assertEquals(avatarIcon.isEnabled(), true, "Avatar not displayed");
    }

    public void verifyAllHeaderPresent() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(allHeader.get(0));
        System.out.println("Header Size" + allHeader.size());
        Set<String> allSubjectlist = new LinkedHashSet<>();
        for (int i = 0; i < allHeader.size(); i++) {
            allSubjectlist.add(allHeader.get(i).getText());

        }
        System.out.println("Vipin list" + allSubjectlist);
    }
    public void VerifyAllCarouselDisplayUnderAllVideosForThisChapter(){
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(Real_Life_Examples_from_this_Chapter.isEnabled(),true,"Real_Life_Examples_from_this_Chapter is not Displayed");
//      softAssert.assertEquals(Experiments_from_this_Chapter.isEnabled(),true,"Experiments_from_this_Chapter is not Displayed");
        softAssert.assertEquals(DIY_on_this_Chapter.isEnabled(),true,"DIY_on_this_Chapter is not Displayed");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(Explore_Out_of_Syllabus_of_this_Chapter.isEnabled(),true,"Explore_Out_of_Syllabus_of_this_Chapter is not Displayed");
        softAssert.assertEquals( Spoofs_on_this_Chapter.isEnabled(),true,"Spoofs_on_this_Chapter is not Displayed");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(Topics_in_this_chapter.isEnabled(),true,"Topics_in_this_chapter is not Displayed");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(Tests_on_this_chapter.isEnabled(),true,"Tests_on_this_chapteris not Displayed");
        softAssert.assertEquals(Practice_on_this_chapter.isEnabled(),true,"Practice_on_this_chapter is not Displayed");
        softAssert.assertAll();
    }


    public void verifySubjectsAreDisplayed() {
        waitForElementToBeVisible(subjects.get(0));
        Assert.assertEquals(subjects.get(0).isEnabled(), true, "subjects not displayed");

    }
    public void verifyContinueLaerningDisplay() {
        scrollToText("Continue Learning");
        waitForElementToBeVisible(Continue_Learning);
        Assert.assertEquals(Continue_Learning.isEnabled(), true, "Continuelearning not displayed");

    }
    public void verifyEmbibeLogoDisplay() {
      /*  scrollToText("Embibe Explainers");
        waitForElementToBeVisible(EmbibeLogo);
        Assert.assertEquals(EmbibeLogo.isEnabled(), true, "EmbibeLogo is not displayed");
*/
    }

    public void verifyLearnButtonWorking() {
        waitForElementToBeVisible(learnBtn);
        Assert.assertEquals(learnBtn.isEnabled(), true, "Learn button not displayed");
        learnBtn.click();

    }
    public void verifyLearnButtonWorkingInSummeyPage() {
        waitForElementToBeVisible(SummaryLearnButton);
        Assert.assertEquals(SummaryLearnButton.isEnabled(), true, "Learn button not displayed");
        SummaryLearnButton.click();

    }
    public void verifyVideoStartsPlaying(){
        waitForElementToBeVisible(player_view);
        softAssert.assertEquals(player_view.isEnabled(),true,"player_view is not displayed");
    }
    public void ClickOnPreRequisite()
    {
        waitForElementToBeVisible(listOfVideo.get(0));
        listOfVideo.get(0).click();
    }
    public void ClickOnContinueLearningButton(){
        waitForElementToBeVisible(continueLearningBtn);
        Assert.assertEquals(continueLearningBtn.isEnabled(), true, "Continue Learning button not displayed");
        continueLearningBtn.click();
    }
    public void verifyHeroBannerSubjectNameDisplay() {
        waitForElementToBeVisible(HeroBannerSubject.get(0));
        Assert.assertEquals(HeroBannerSubject.get(0).isEnabled(), true, "HeroBanner Subject name not displayed");

    }
    public void verifyThumbnailPresent() {
        waitForElementToBeVisible(heroBanner);
        Assert.assertEquals(heroBanner.isEnabled(), true, "Thumbnail is not displayed");
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
    public void verifyHeroBannerDescriptionDisplay() {
        waitForElementToBeVisible(heroBannerDescription.get(1));
        Assert.assertEquals(heroBannerDescription.get(1).isEnabled(), true, "HeroBanner Subject name not displayed");

    }
    public void verifySencirityScoreDescription() {

        backarrowbutton.click();
        swipeScreen(Direction.UP);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        softAssert.assertEquals(tv_description.isEnabled(), true, "Description is not displayed");
        softAssert.assertAll();

    }
    public void VerifyAllTheElementsOnPoinysToRememberTile(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        swipeScreen(Direction.UP);
        verticalSwipeByPercentages(0.8, 0.6, 0.5);
        verticalSwipeByPercentages(0.8, 0.6, 0.5);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        softAssert.assertEquals(cheatsheetTag.isEnabled(),true,"cheatsheetTag is not displayed");
        //softAssert.assertEquals(textChapter.isEnabled(),true,"textChapter is not displayed");
       // softAssert.assertEquals(textTitleCheatSheet.isEnabled(),true,"textTitleCheatSheet is not displayed");
        softAssert.assertAll();
    }
    public void verifyHeroBannerConceptsDisplay() {
        waitForElementToBeVisible(heroBannerConcepts);
        Assert.assertEquals(heroBannerConcepts.isEnabled(), true, "HeroBanner Concepts  not displayed");

    }
    public void verifyHeroBannerImportantTagDisplay() {
        waitForElementToBeVisible(tvHeroBannerImportant);
        Assert.assertEquals(tvHeroBannerImportant.isEnabled(), true, "HeroBanner Important Tag not displayed");

    }
    public void VerifyCheckProgressButtonDisplay(){
        waitForElementToBeVisible(CheckProgress);
        CheckProgress.click();
    }
    public void verifyHeroBannerVideoDurationDisplay() {
        // verticalSwipeByPercentages(0.8, 0.2, 0.5);
        //   verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(heroBannerDuration);
        Assert.assertEquals(heroBannerDuration.isEnabled(), true, "HeroBanner Subject name not displayed");

    }
    public void VerifyClickOnTheEmbibeExplainersTileuserIsdirectedToDescriptionPage(){

        int i=7;
        while (i<listofHeader.size()) {
            i++;
            System.out.println(i+" "+listofHeader.get(i).getText());
            if(listofHeader.get(i).getText().equalsIgnoreCase("Embibe Explainers")){
                for(int k=0;k<i-9;k++) {
                    verticalSwipeByPercentages(0.8, 0.6, 0.5);

                }
                break;
            }
        }
        waitForElementToBeVisible(listOfVideo.get(0));
        listOfVideo.get(0).click();

    }
    public void VerifyIfUserCanPlayTheEmbibeExplainersVideo(){
        swipeScreen(Direction.UP);
        scrollToText("Important");
        waitForElementToBeVisible(videoPlayButton);
        videoPlayButton.click();

    }

    public void VerifyuserIsdirectedToDescriptionPage(){
        verticalSwipeByPercentages(0.4, 0.1, 0.3);
        //waitForElementToBeVisible(listOfVideo.get(0));
        listOfVideo.get(2).click();

    }
    public void backFromBook(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        backarrowbutton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        backarrowbutton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        backarrowbutton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void VerifyOnClickOnStartButtonTheContinueLearningVideoStartsFromTheBeginning(){
        waitForElementToBeVisible(listOfVideo.get(0));
        listOfVideo.get(0).click();
        waitForElementToBeVisible(videoPlayButton);
        videoPlayButton.click();

    }
    public  void ClickOnPauseButton(){
        waitForElementToBeVisible(pausebutton);
        pausebutton.click();
    }
    public void VerifyUserIsAbleToSeeHereIsWhereYouStandWidget() {
        waitForElementToBeVisible(Hereiswhereyoustand);
        Assert.assertEquals(Hereiswhereyoustand.isEnabled(), true, "Here Where You Stand is displayed");

    }
    public  void ClickOnPracticeOnThisChapter(){
        waitForElementToBeVisible(thumbPracticeForChapter);
        Assert.assertEquals(thumbPracticeForChapter.isEnabled(),true,"thumbnail is not Present");
        thumbPracticeForChapter.click();
    }


    public  void VerifyTopicNameOnPracticeOnThisChapter(){
        waitForElementToBeVisible(textDescription);
        Assert.assertEquals(textDescription.isEnabled(),true,"Topic Name is not Present");
    }
    public  void VerifyQuestionTagOnPracticeOnThisChapter(){
        waitForElementToBeVisible(question_books_tag);
        Assert.assertEquals(question_books_tag.isEnabled(),true,"question_books_tag  is not Present");
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
    public void Verifyusercanplayanyofthevideolistedinrelatedconcept
            (){
        waitForElementToBeVisible(listOfVideo.get(0));
        listOfVideo.get(0).click();

    }public void VerifyUserCanPlayAnyOfTheVideoListedInRelatedConcept
            (){
        waitForElementToBeVisible(listOfVideo.get(0));
        listOfVideo.get(0).click();
    }
    public void VerifyHeroBannerDisplay() {
        waitForElementToBeVisible(heroBanner);
        Assert.assertEquals(heroBanner.isEnabled(), true, "Hero banner not displayed");
    }
    public void VerifyAttemptQualityDisplay() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        swipeScreen(Direction.UP);
        waitForElementToBeVisible(AttemptQuality);
        Assert.assertEquals(AttemptQuality.isEnabled(), true, "AttemptQuality not displayed");

    }
    public void VerifyUserCanPlayEnrichYourLearningVideos() {
        verticalSwipeByPercentages(0.4, 0.1, 0.3);
        //waitForElementToBeVisible(listOfVideo.get(0));
        listOfVideo.get(0).click();
      //  waitForElementToBeVisible(videoPlayButton);
     //   videoPlayButton.click();

    }
    public void VerifyAllTheElementsOnProgressDetailsScreen(){
     //   softAssert.assertEquals(LessonName.isEnabled(), true, "LessonName is not displayed");
        softAssert.assertEquals(Progress.isEnabled(), true, "Progress is not displayed");
        softAssert.assertEquals(Achievement.isEnabled(), true, "Achievement is not displayed");
        softAssert.assertAll();

    }
    public void ClickOnChapters() {
        waitForElementToBeVisible(videoTileSubject.get(0));
        videoTileSubject.get(0).click();
    }
    public void ClickOnHeroBannerVideo(){
        waitForElementToBeVisible(videoPlayButton);
        videoPlayButton.click();
    }

    public String VerifyHeroBannerNameDisplay() {
        waitForElementToBeVisible(heroBannerName.get(0));
        String bannerName= heroBannerName.get(0).getText();
        System.out.println("name "+ heroBannerName.get(0).getText());
        Assert.assertEquals(heroBannerName.get(0).isEnabled(), true, "Hero banner name not displayed");
        return bannerName;
    }

    public void VerifyHeroBannerPlayButton() {
        waitForElementToBeVisible(img_HeroBannerPlayButton);
        img_HeroBannerPlayButton.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(exo_ad_overlay);
        Assert.assertEquals(exo_ad_overlay.isEnabled(), true, "Video player not display");

    }

    public void verifyClickOnGivenSubjectDisplayContentRelatedOnlyToThat(String Subject) {
      //  verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(subject_nameHolder.get(0));
        System.out.println(subject_nameHolder.get(0).getText() + "   " + Subject);
        Assert.assertEquals(subject_nameHolder.get(0).getText().toUpperCase().contains(Subject), true, "Not");

    }

    public void clickOnVideo(String subjectName) {

        waitForElementToBeVisible(videoTileSubject.get(0));
        for (int i = 0; i < videoTileSubject.size(); i++) {
            if (videoTileSubject.get(i).getText().equalsIgnoreCase(subjectName)) {
                videoTileSubject.get(i).click();
            }
        }

    }

    public void clickOnVideo() {
        swipeScreen(Direction.UP);
        waitForElementToBeVisible(videoTileSubject.get(1));
        videoTileSubject.get(1).click();
    }
    public void clickOnAVideo() {
        swipeScreen(Direction.DOWN);
        scrollToText("Have you practiced enough?\n" +
                "It's time for a test.");
        waitForElementToBeVisible(videoTileSubject.get(0));
        videoTileSubject.get(0).click();

    }
    public void clickOnHeroBannerSubject(){
        waitForElementToBeVisible(HeroBannerSubject.get(0));
        HeroBannerSubject.get(0).click();
    }

    public void verifyVideoDescriptionScreen() {
        waitForElementToBeVisible(heroBannerName.get(0));
        softAssert.assertEquals(heroBanner.isEnabled(), true, "Hero Banner name not displayed");
        softAssert.assertEquals(HeroBannerSubject.get(0).isEnabled(), true, "HeroBannerSubject name not displayed");
        softAssert.assertEquals(heroBannerDescription.get(1).isEnabled(), true, "heroBannerDescription not displayed");
        softAssert.assertEquals(videoPlayButton.isEnabled(), true, "videoPlayButton not displayed");
        softAssert.assertEquals(bookmark.isEnabled(), true, "bookmark not displayed");
        softAssert.assertEquals(RelatedVideos.isEnabled(), true, "RelatedVideos not displayed");
        softAssert.assertAll();
        waitForElementToBeVisible(listOfVideo.get(0));
        listOfVideo.get(0).click();
    }
    public  void VefifyAllTheElementsOnDescriptionPage(){
        softAssert.assertEquals(heroBanner.isEnabled(), true, "Hero Banner name not displayed");
        softAssert.assertEquals(videoPlayButton.isEnabled(), true, "videoPlayButton not displayed");
        softAssert.assertEquals(bookmark.isEnabled(), true, "bookmark not displayed");
        softAssert.assertEquals(HeroBannerSubject.get(0).isEnabled(), true, "HeroBannerSubject name not displayed");
        softAssert.assertEquals(heroBannerCoins.isEnabled(), true, "HeroBannecoin name not displayed");
        scrollToText("Related topics");
        softAssert.assertEquals(RelatedTopics.isEnabled(), true, "RelatedTopics not displayed");
//     softAssert.assertEquals(MoreOnThisChapter.isEnabled(), true, "MoreOnThisTopic not displayed");
        softAssert.assertAll();



    }


    @Override
    public void NavigateBack() {
        backarrowbutton.click();
    }

    @Override
    public void DownloadVideo() {

    }

    @Override
    public void navigatBack() {

    }

    public void VerifyOnClickOnStartButtonTheVideoStartsPlaying() {
        waitForElementToBeVisible(videoPlayButton);
        videoPlayButton.click();
        try {
            Assert.assertEquals(exo_ad_overlay.isEnabled(),true,"Video play not working");
        }catch (NoSuchElementException e){
            System.out.println(""+e);
            resumeBtn.click();
        }

    }


    public void verifyNavigationToVideoScreen() {
        waitForElementToBeVisible(videoPlayButton);
        Assert.assertEquals(videoPlayButton.isEnabled(),true,"Not able to navigate to the Video screen");
    }

    public void VerifyUserCanBookMarkTheVideoByClickingOnBookMarkButton() {
        waitForElementToBeVisible(bookmark);
        bookmark.click();
    }
    public void VerifyUserCanBookMarkTheSummeryPageVideoByClickingOnBookMarkButton() {
        waitForElementToBeVisible(Summerybookmark);
        Summerybookmark.click();
    }
    public void VerifyUserCanLikeTheSummeryPageVideoByClickingOnBookMarkButton() {
        waitForElementToBeVisible(Summerylike);
        Summerylike.click();
    }

    public void VerifyUserCanUnBookMarkTheVideoByClickingOnBookMarkButton() {
        waitForElementToBeVisible(bookmark);
        bookmark.click();
        bookmark.click();
    }
    public void ClickOnChaptersInLearnHomepage(){

        int i=7;
        String str=null;
        while (i<listofHeader.size()) {
            i++;
            System.out.println(i+" "+listofHeader.get(i).getText());
            if(listofHeader.get(i).getText().contains("Chapters")){
                str=listofHeader.get(i).getText();
                System.out.println(str+"str");
                for(int k=0;k<i-10;k++) {
                    verticalSwipeByPercentages(0.8, 0.6, 0.5);

                }
                break;


            }

        }


        chapterlist.get(0).click();

    }
    public void ClickOnPracticeOnThisChapters(){
        scrollToText("Embibe Explainers");
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        waitForElementToBeVisible(listOfVideo.get(1));
        listOfVideo.get(1).click();
    }
    public void VerifyUserCanLikeTheVideoByClickingOnLikeButton() {
        waitForElementToBeVisible(like);
        like.click();
    }

    public void VerifyUserCanUnLikeTheVideoByClickingOnLikeButton() {
        waitForElementToBeVisible(like);
        like.click();

    }
    public void clickOnWatchlist(){
        waitForElementToBeVisible(like);
        like.click();
        System.out.println("name :"+like.getText());
    }

    public void verifyAllThecarosuelsArePresentOnLearn(List<String> list) {
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
}
