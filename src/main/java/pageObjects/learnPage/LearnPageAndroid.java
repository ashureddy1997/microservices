package pageObjects.learnPage;

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
import java.util.NoSuchElementException;
import java.util.Set;

public class LearnPageAndroid  extends BasePage implements LearnPage{
    SoftAssert softAssert=null;
    public LearnPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(id = "imgBanner")
    private WebElement heroBanner;

    @FindBy(id = "img_HeroBannerPlayButton")
    private WebElement img_HeroBannerPlayButton;

    @FindBy(id = "bookmark")
    private WebElement bookmark;

    @FindBys({@FindBy(id="ivTag")})
    private List<WebElement> listOfTags;

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

    @FindBy(id = "txt_HeroBannerName")
    private WebElement heroBannerName;

    @FindBy(id = "txt_HeroBannerSubject")
    private WebElement HeroBannerSubject;

    @FindBy(id = "txt_heroBannerDescription")
    private WebElement heroBannerDescription;

    @FindBy(id = "txt_HeroBannerDuration")
    private WebElement heroBannerDuration;

    @FindBy(id = "exo_ad_overlay")
    private WebElement exo_ad_overlay;

    @FindBy(id = "tv_description")
    private WebElement tv_description;

    @FindBy(id = "txt_heroBanner_action_learn")
    private WebElement learnBtn;

    @FindBy(id = "player_view")
    private WebElement player_view;

    @FindBy(id = "tvSummaryLearnButton")
    private WebElement SummaryLearnButton;

    @FindBys({@FindBy(id = "llMain")})
    private List<WebElement> subjects;

    @FindBy(id = "img_HeroBannerAvatar")
    private WebElement avatarIcon;

    @FindBy(id = "txt_HeroBannerDuration")
    private WebElement heroBannerConcepts;

    @FindBy(id = "txt_HeroBannerCoins")
    private WebElement heroBannerCoins;

    @FindBy(id = "thumbPracticeForChapterIV")
    private WebElement thumbPracticeForChapter;

    @FindBys({@FindBy(id = "header")})
    private List<WebElement> allHeader;

    @FindBys({@FindBy(id = "subject_name")})
    private List<WebElement> subject_nameHolder;

    @FindBys({@FindBy(id = "tvSubjectName")})
    private List<WebElement> subjectNameList;

    @FindBy(id ="ivSummaryHeroBannerPlay1")
    private WebElement videoPlayButton;

    @FindBys({@FindBy(id = "imgBanner")})
    private List<WebElement> tiles;

    @FindBy(xpath ="//android.widget.TextView[@text='Attempt Quality']")
    private WebElement AttemptQuality;

    @FindBys({@FindBy(id = "adBannerCardView")})
    private List<WebElement> videoTileSubject;

    @FindBy(id = "tv_download_state")
    private WebElement downloadVideo;

    @FindBy(id="txt_AdName")
    private WebElement adsName;

    @FindBy(id = "btn_continue_learning")
    private WebElement continueLearningBtn;

    @FindBy(id = "btn_quit")
    private WebElement  quit;

    @FindBy(id ="btnCheckProgress")
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

    @FindBy(id="btn_quit")
    private WebElement quitBtn;

    @FindBy(id ="ivSincerityScorePlay")
    private WebElement SincerityScorePlay;

    @FindBy(id="btnResume")
    private WebElement resumeBtn;

    @FindBy(xpath ="//android.view.View[@resource-id='lessonName']")
    private WebElement LessonName;

    @FindBy(id = "iv_pause")
    private WebElement pausebutton;

    @FindBy(id = "custom_back_arrow")
    private WebElement backarrowbutton;

    @FindBy(id ="custom_title2")
    private WebElement custom_title2;

    @FindBy(id ="tvTitle")
    private WebElement Tittle;

    @FindBy(id= "textChapter")
    private WebElement textChapter;

    @FindBy(id= "textTitleCheatSheet")
    private WebElement textTitleCheatSheet;

    @FindBy(xpath ="//android.view.View[@text='Progress']")
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

    @FindBy(id= "textPracticeCheatSheet")
    private WebElement cheatsheetTag;

    @FindBy(xpath ="//android.widget.TextView[@text='Here is where you stand on these concepts used in this practice right now']")
    private WebElement Hereiswhereyoustand;

    @FindBy(xpath ="//android.view.View[@text='Achievement']")
    private WebElement Achievement;

    @FindBy(xpath ="//android.widget.TextView[@text='Related videos']")
    private WebElement RelatedVideos;

    @FindBys({@FindBy(id="adBannerCardView")})
    private List<WebElement> listofvideos;

    @FindBys({@FindBy(id="video_lib_image_view")})
    private List<WebElement> listoflearningvideos;

    public void clickOnQuitButton(){
        waitForElementToBeVisible(quitBtn);
        quitBtn.click();
    }

    public void isVideoDisplay(){
        waitForElementToBeVisible(videoDisplay);
        softAssert.assertEquals(videoDisplay.isDisplayed(),true);
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
            }
        }
    }

    public void verifyAvatarIcon() {
        waitForElementToBeVisible(avatarIcon);
        Assert.assertEquals(avatarIcon.isDisplayed(), true, "Avatar not displayed");
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
    public void VerifyAllCarouselDisplayUnderAllVideosForThisChapter(){
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(Real_Life_Examples_from_this_Chapter.isDisplayed(),true,"Real_Life_Examples_from_this_Chapter is not Displayed");
//      softAssert.assertEquals(Experiments_from_this_Chapter.isDisplayed(),true,"Experiments_from_this_Chapter is not Displayed");
        softAssert.assertEquals(DIY_on_this_Chapter.isDisplayed(),true,"DIY_on_this_Chapter is not Displayed");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(Explore_Out_of_Syllabus_of_this_Chapter.isDisplayed(),true,"Explore_Out_of_Syllabus_of_this_Chapter is not Displayed");
        softAssert.assertEquals( Spoofs_on_this_Chapter.isDisplayed(),true,"Spoofs_on_this_Chapter is not Displayed");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(Topics_in_this_chapter.isDisplayed(),true,"Topics_in_this_chapter is not Displayed");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(Tests_on_this_chapter.isDisplayed(),true,"Tests_on_this_chapteris not Displayed");
        softAssert.assertEquals(Practice_on_this_chapter.isDisplayed(),true,"Practice_on_this_chapter is not Displayed");
        softAssert.assertAll();
    }


    public void verifySubjectsAreDisplayed() {
        waitForElementToBeVisible(subjects.get(0));
        Assert.assertEquals(subjects.get(0).isDisplayed(), true, "subjects not displayed");

    }
    public void verifyContinueLaerningDisplay() {
        scrollToText("Continue Learning");
        waitForElementToBeVisible(Continue_Learning);
        Assert.assertEquals(Continue_Learning.isDisplayed(), true, "Continuelearning not displayed");

    }
    public void verifyEmbibeLogoDisplay() {
        scrollToText("Books With Videos & Solutions");
        verticalSwipeByPercentages(0.3, 0.1, 0.1);
        waitForElementToBeVisible(EmbibeLogo);
        Assert.assertEquals(EmbibeLogo.isDisplayed(), true, "EmbibeLogo is not displayed");

    }
    public void navigateToEnbibeBook() {
        scrollToText("Big Books");
        verticalSwipeByPercentages(0.3, 0.1, 0.1);


    }

    public void verifyLearnButtonWorking() {
        waitForElementToBeVisible(learnBtn);
        Assert.assertEquals(learnBtn.isDisplayed(), true, "Learn button not displayed");
        learnBtn.click();

    }
    public void verifyLearnButtonWorkingInSummeyPage() {
        waitForElementToBeVisible(SummaryLearnButton);
        Assert.assertEquals(SummaryLearnButton.isDisplayed(), true, "Learn button not displayed");
        SummaryLearnButton.click();

    }
    public void verifyVideoStartsPlaying(){
        waitForElementToBeVisible(player_view);
        softAssert.assertEquals(player_view.isDisplayed(),true,"player_view is not displayed");
    }
    public void ClickOnPreRequisite()
    {
        waitForElementToBeVisible(listoflearningvideos.get(0));
        listoflearningvideos.get(0).click();
    }
    public void ClickOnContinueLearningButton(){
        waitForElementToBeVisible(continueLearningBtn);
        Assert.assertEquals(continueLearningBtn.isDisplayed(), true, "Continue Learning button not displayed");
        continueLearningBtn.click();
    }
    public void verifyHeroBannerSubjectNameDisplay() {
        waitForElementToBeVisible(HeroBannerSubject);
        Assert.assertEquals(HeroBannerSubject.isDisplayed(), true, "HeroBanner Subject name not displayed");

    }
    public void verifyThumbnailPresent() {
        waitForElementToBeVisible(heroBanner);
        Assert.assertEquals(heroBanner.isDisplayed(), true, "Thumbnail is not displayed");
    }

    public void VerifyAllTheElementsOnPointsToRememberPage(){
        scrollToText("Points to remember");
        waitForElementToBeVisible(cheatsheetTag);
        cheatsheetTag.click();
        softAssert.assertEquals(custom_title2.isDisplayed(),true,"customTitle is not displayed");
        softAssert.assertEquals(Tittle.isDisplayed(),true,"Title is not displayed");
        softAssert.assertAll();
    }
    public void verifyHeroBannerDescriptionDisplay() {
        waitForElementToBeVisible(heroBannerDescription);
        Assert.assertEquals(heroBannerDescription.isDisplayed(), true, "HeroBanner Subject name not displayed");

    }
    public void verifySencirityScoreDescription() {
        scrollToText("IDK");
        waitForElementToBeVisible(tv_description);
        Assert.assertEquals(tv_description.isDisplayed(), true, "Description is not displayed");

    }
    public void navigatBack(){
        driver().navigate().back();
    }
    public void VerifyAllTheElementsOnPoinysToRememberTile(){
        scrollToText("Points to remember");
        swipeScreen(Direction.UP);
        softAssert.assertEquals(cheatsheetTag.isDisplayed(),true,"cheatsheetTag is not displayed");
//        softAssert.assertEquals(textChapter.isDisplayed(),true,"textChapter is not displayed");
        softAssert.assertEquals(textTitleCheatSheet.isDisplayed(),true,"textTitleCheatSheet is not displayed");
        softAssert.assertAll();
    }
    public void verifyHeroBannerConceptsDisplay() {
        waitForElementToBeVisible(heroBannerConcepts);
        Assert.assertEquals(heroBannerConcepts.isDisplayed(), true, "HeroBanner Concepts  not displayed");

    }
    public void verifyHeroBannerImportantTagDisplay() {
        waitForElementToBeVisible(tvHeroBannerImportant);
        Assert.assertEquals(tvHeroBannerImportant.isDisplayed(), true, "HeroBanner Important Tag not displayed");

    }
    public void VerifyCheckProgressButtonDisplay(){
        waitForElementToBeVisible(CheckProgress);
        CheckProgress.click();
    }
    public void NavigateBack(){
        driver().navigate().back();
    }
    public void verifyHeroBannerVideoDurationDisplay() {
        waitForElementToBeVisible(heroBannerDuration);
        Assert.assertEquals(heroBannerDuration.isDisplayed(), true, "HeroBanner Subject name not displayed");

    }
    public void VerifyClickOnTheEmbibeExplainersTileuserIsdirectedToDescriptionPage(){
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(listofvideos.get(0));
        listofvideos.get(0).click();

    }
    public void VerifyIfUserCanPlayTheEmbibeExplainersVideo(){
        swipeScreen(Direction.UP);
        scrollToText("Important");
        waitForElementToBeVisible(videoPlayButton);
        videoPlayButton.click();

    }

    public void VerifyuserIsdirectedToDescriptionPage(){
        scrollToText("Embibe Explainers");
        verticalSwipeByPercentages(0.4, 0.1, 0.3);
        verifyThumbnailPresent();
        waitForElementToBeVisible(listofvideos.get(0));
        listofvideos.get(0).click();
        softAssert.assertEquals(RelatedVideos.isDisplayed(), true, "User not Navigated to Description page");
        softAssert.assertAll();


    }
    public void VerifyOnClickOnStartButtonTheContinueLearningVideoStartsFromTheBeginning(){
        waitForElementToBeVisible(listofvideos.get(0));
        listofvideos.get(0).click();
        waitForElementToBeVisible(videoPlayButton);
        videoPlayButton.click();
    }
    public  void ClickOnPauseButton(){
        try {
            waitForElementToBeVisible(pausebutton);
            pausebutton.click();
        } catch (Exception e) {
            waitForElementToBeVisible(resumeBtn);
            resumeBtn.click();
            waitForElementToBeVisible(pausebutton);
            pausebutton.click();
        }

    }
    public void VerifyUserIsAbleToSeeHereIsWhereYouStandWidget() {
        waitForElementToBeVisible(Hereiswhereyoustand);
        Assert.assertEquals(Hereiswhereyoustand.isDisplayed(), true, "Here Where You Stand is displayed");

    }
    public  void ClickOnPracticeOnThisChapter(){
        waitForElementToBeVisible(thumbPracticeForChapter);
        Assert.assertEquals(thumbPracticeForChapter.isDisplayed(),true,"thumbnail is not Present");
        thumbPracticeForChapter.click();
    }


    public  void VerifyTopicNameOnPracticeOnThisChapter(){
        waitForElementToBeVisible(textDescription);
        Assert.assertEquals(textDescription.isDisplayed(),true,"Topic Name is not Present");
    }
    public  void VerifyQuestionTagOnPracticeOnThisChapter(){
        waitForElementToBeVisible(question_books_tag);
        Assert.assertEquals(question_books_tag.isDisplayed(),true,"question_books_tag  is not Present");
    }

    public void VerifyUserCanNavigateCheckProgress(){
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(CheckProgress);
        CheckProgress.click();
    }
    public void Verifyusercanplayanyofthevideolistedinrelatedconcept
            (){
        waitForElementToBeVisible(listofvideos.get(0));
        listofvideos.get(0).click();

    }public void VerifyUserCanPlayAnyOfTheVideoListedInRelatedConcept
            (){
        waitForElementToBeVisible(listofvideos.get(0));
        listofvideos.get(0).click();
    }
    public void VerifyHeroBannerDisplay() {
        waitForElementToBeVisible(heroBanner);
        Assert.assertEquals(heroBanner.isDisplayed(), true, "Hero banner not displayed");
    }
    public void VerifyAttemptQualityDisplay() {
        swipeScreen(Direction.DOWN);
        scrollToText("Attempt Quality");
        waitForElementToBeVisible(AttemptQuality);
        Assert.assertEquals(AttemptQuality.isDisplayed(), true, "AttemptQuality not displayed");

    }
    public void VerifyUserCanPlayEnrichYourLearningVideos() {
        scrollToText("Enrich Your Learning");
        waitForElementToBeVisible(listoflearningvideos.get(0));
        listoflearningvideos.get(0).click();
        waitForElementToBeVisible(videoPlayButton);
        videoPlayButton.click();

    }
    public void VerifyAllTheElementsOnProgressDetailsScreen(){
        Assert.assertEquals(LessonName.isDisplayed(), true, "LessonName is not displayed");
        Assert.assertEquals(Progress.isDisplayed(), true, "Progress is not displayed");
        Assert.assertEquals(Achievement.isDisplayed(), true, "Achievement is not displayed");
        driver().navigate().back();
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
        waitForElementToBeVisible(heroBanner);
        String bannerName= heroBannerName.getText();
        System.out.println("name "+ heroBannerName.getText());
        Assert.assertEquals(heroBannerName.isDisplayed(), true, "Hero banner name not displayed");
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
        Assert.assertEquals(exo_ad_overlay.isDisplayed(), true, "Video player not display");

    }

    public void verifyClickOnGivenSubjectDisplayContentRelatedOnlyToThat(String Subject) {
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollToText("Embibe Explainers");
        waitForElementToBeVisible(videoTileSubject.get(0));
        videoTileSubject.get(0).click();
    }
    public void clickOnAVideo() {
        swipeScreen(Direction.DOWN);
        scrollToText("Have you practiced enough?\n" +
                "It's time for a test.");
        waitForElementToBeVisible(videoTileSubject.get(0));
        videoTileSubject.get(0).click();

    }
    public void DownloadVideo() {
        waitForElementToBeVisible(downloadVideo);
        downloadVideo.click();

    }
    public void clickOnHeroBannerSubject(){
        waitForElementToBeVisible(HeroBannerSubject);
        HeroBannerSubject.click();
    }

    public void verifyVideoDescriptionScreen() {
        waitForElementToBeVisible(heroBannerName);
        softAssert.assertEquals(heroBanner.isDisplayed(), true, "Hero Banner name not displayed");
        softAssert.assertEquals(HeroBannerSubject.isDisplayed(), true, "HeroBannerSubject name not displayed");
        softAssert.assertEquals(heroBannerDescription.isDisplayed(), true, "heroBannerDescription not displayed");
        softAssert.assertEquals(videoPlayButton.isDisplayed(), true, "videoPlayButton not displayed");
        softAssert.assertEquals(bookmark.isDisplayed(), true, "bookmark not displayed");
        softAssert.assertEquals(RelatedVideos.isDisplayed(), true, "RelatedVideos not displayed");
        softAssert.assertEquals(heroBannerCoins.isDisplayed(), true, "HeroBannecoin name not displayed");
        softAssert.assertEquals(listoflearningvideos.get(0).isDisplayed(), true, "Book image not displayed");
    //    softAssert.assertEquals(EmbibeLogo.isDisplayed(), true, "EmbibeLogo is not displayed");
        swipeScreen(Direction.UP);
        softAssert.assertAll();
        waitForElementToBeVisible(listoflearningvideos.get(0));
        listoflearningvideos.get(0).click();
    }
    public  void VefifyAllTheElementsOnDescriptionPage(){
        softAssert.assertEquals(heroBanner.isDisplayed(), true, "Hero Banner name not displayed");
        softAssert.assertEquals(videoPlayButton.isDisplayed(), true, "videoPlayButton not displayed");
        softAssert.assertEquals(bookmark.isDisplayed(), true, "bookmark not displayed");
        softAssert.assertEquals(HeroBannerSubject.isDisplayed(), true, "HeroBannerSubject name not displayed");
        softAssert.assertEquals(heroBannerCoins.isDisplayed(), true, "HeroBannecoin name not displayed");
        scrollToText("Related topics");
        softAssert.assertEquals(RelatedTopics.isDisplayed(), true, "RelatedTopics not displayed");
        softAssert.assertAll();
    }


    public void VerifyOnClickOnStartButtonTheVideoStartsPlaying() {
        waitForElementToBeVisible(videoPlayButton);
        videoPlayButton.click();
        try {
            Assert.assertEquals(exo_ad_overlay.isDisplayed(),true,"Video play not working");
        }catch (NoSuchElementException e){
            System.out.println(""+e);
            resumeBtn.click();
        }

    }


    public void verifyNavigationToVideoScreen() {
        waitForElementToBeVisible(videoPlayButton);
        Assert.assertEquals(videoPlayButton.isDisplayed(),true,"Not able to navigate to the Video screen");
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
        scrollToText("Chapters From");
        verticalSwipeByPercentages(0.6, 0.2, 0.2);
        waitForElementToBeVisible(listoflearningvideos.get(0));
        listoflearningvideos.get(0).click();
    }
    public void ClickOnPracticeOnThisChapters(){
        scrollToText("Embibe Explainers");
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        swipeScreen(Direction.UP);
        waitForElementToBeVisible(listoflearningvideos.get(1));
        listoflearningvideos.get(1).click();
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



