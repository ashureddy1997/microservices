package pageObjects.userHomePage;

import constant.Exam;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UserHomePageAndroid extends BasePage implements UserHomePage{
    SoftAssert softAssert=null;
    public UserHomePageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "imgBanner")
    private WebElement HeroBannerImg;

    @FindBy(id = "img_HeroBannerPlayButton")
    private WebElement HeroBanner_PlayButton;

    @FindBy(id = "img_HeroBannerAvatar")
    private WebElement profileIcon;

    @FindBy(id = "search")
    private WebElement search;

    @FindBy(id = "txt_HeroBannerName")
    private WebElement HeroBannerName;

    @FindBy(id = "ic_embium_coin")
    private WebElement embium_coin;

    @FindBy(id = "tv_embium_points")
    private WebElement embium_points;

    @FindBy(id = "txt_subtitle")
    private WebElement subtitle;

    @FindBy(id = "cl_coin_subject")
    private WebElement coin_subject;

    @FindBy(id = "txt_heroBannerDescription")
    private WebElement heroBannerDescription;

    @FindBy(id = "txt_heroBanner_action")
    private WebElement watchButton;

    @FindBy(id = "txt_heroBanner_action_goal_switch")
    private WebElement heroBanner_Goal;

    @FindBy(id = "query")
    private WebElement searchField;

    @FindBys({@FindBy(id="tv_goal_exam")})
    private List<WebElement> List_goal_exam;

    @FindBys({@FindBy(id="layout")})
    private List<WebElement> MyHome_RevisionList;

    @FindBys({@FindBy(id = "tvSubjectName")})
    private List<WebElement> MyHome_RevisionList_text;

    @FindBy(id = "textFilter")
    private WebElement FilterSubjectsUnitsAndChapters;

    @FindBy(id = "imgClose")
    private WebElement closeFilterButton;

    @FindBy(id = "tvFilterTitle")
    private WebElement FilterTitle;

    @FindBy(id = "tvSubject")
    private WebElement AllSubject;

    @FindBy(id = "tvUnits")
    private WebElement ALlUnit;

    @FindBy(id = "tvChapters")
    private WebElement AllChapter;

    @FindBy(id = "tv_done")
    private WebElement Done;

    @FindBy(id = "iv_close")
    private WebElement SubjectList_close;

    @FindBy(id = "tv_title")
    private WebElement SelectSubjects;

    @FindBys({@FindBy(id="cl_filter")})
    private List<WebElement> ListOfSubjects;

    @FindBy(id = "iv_close")
    private WebElement UnitList_close;

    @FindBy(id = "tv_title")
    private WebElement SelectUnit;

    @FindBys({@FindBy(id="cl_filter")})
    private List<WebElement> ListOfUnits;

    @FindBy(id = "iv_close")
    private WebElement chapterList_close;

    @FindBy(id = "tv_title")
    private WebElement SelectChapter;

    @FindBys({@FindBy(id="cl_filter")})
    private List<WebElement> ListOfChapter;

    @FindBy(xpath = "//android.widget.TextView[@text='Questions to revise']")
    private  WebElement QuestionsToRevise;

    @FindBy(xpath = "//android.widget.TextView[@text='Topics to revise']")
    private  WebElement TopicsToRevise;

    @FindBy(xpath = "//android.widget.TextView[@text='MY HOME']")
    private  WebElement My_Home;

    @FindBy(id = "title")
    private WebElement title_ShowingAllChapters;

    @FindBys({@FindBy(id="imgLayout")})
    private List<WebElement> imgLayout_Chapters;

    @FindBys({@FindBy(id="title")})
    private List<WebElement> name_Chapters;

    @FindBys({@FindBy(id="imgAdd")})
    private List<WebElement> expand_Chapters;

    @FindBys({@FindBy(id = "title")})
    private List<WebElement> collapse_Chapters;

    @FindBy(id = "recyclerSubItem")
    private WebElement practiceAttempted_tile;

    @FindBy(id = "tv_attempt_type_title")
    private WebElement title_questionsType;

    @FindBy(id = "iv_back")
    private WebElement back_attemptedQuestions;

    @FindBys({@FindBy(className="android.view.View")})
    private List<WebElement> attemptedQuestions_tiles;

    @FindBys({@FindBy(className="android.widget.Image")})
    private List<WebElement> subjectTag;

    @FindBys({@FindBy(xpath="//android.view.View[@text='Marks']")})
    private List<WebElement> marks;

    @FindBys({@FindBy(className="android.view.View")})
    private List<WebElement> question_text;

    @FindBys({@FindBy(xpath="//android.view.View[@text='IMPORTANT']")})
    private List<WebElement> tag_IMPORTANT;

    @FindBys({@FindBy(xpath="//android.view.View[@text='LENGTHY']")})
    private List<WebElement> tag_LENGTHY;

    @FindBy(id = "subject_name_holder")
    private WebElement subject_name_holder;

    @FindBy(xpath = "//*[@text='Completed']")
    private WebElement Completed_status;

    @FindBy(id = "textSubject")
    private WebElement textSubject;

    @FindBy(id = "title")
    private WebElement title_practice;

    @FindBy(id = "btnPractice")
    private WebElement practiceButton;

    @FindBy(id = "title")
    private WebElement title_ShowingAllTopics;

    @FindBys({@FindBy(id="imgLayout")})
    private List<WebElement> imgLayout_Topics;

    @FindBys({@FindBy(id="title")})
    private List<WebElement> name_Topics;

    @FindBys({@FindBy(id="imgAdd")})
    private List<WebElement> expand_Topics;

    @FindBys({@FindBy(id="title")})
    private List<WebElement> collapse_Topics;

    @FindBy(xpath = "//android.widget.TextView[@text='Assignment from My Parents']")
    private  WebElement AssignmentFromMyParents;

    @FindBys({@FindBy(id="cl_zero_state")})
    private List<WebElement> GetRewarded_InviteParent;

    @FindBy(id = "tv_parent_img")
    private WebElement parent_img;

    @FindBy(xpath = "//android.widget.TextView[@text='Invite your parent']")
    private WebElement InviteParentText;

    @FindBy(id = "title")
    private WebElement titleOfInviteScreen;

    @FindBy(id = "textView2")
    private WebElement Enter_Parent_email_or_mobile_number_to_invite;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "btn_invite")
    private WebElement inviteButton;

    @FindBy(xpath = "//android.widget.TextView[@text='My Favourite Books']")
    private WebElement MyFavouriteBooks;

    @FindBys({@FindBy(id="imgBanner")})
    private List<WebElement> ListOfFavouriteBooks;

    @FindBy(id = "back_arrow")
    private WebElement navBack_favBook;

    @FindBy(id = "btn_bookAdded")
    private WebElement btn_bookAdded;

    @FindBy(id = "title")
    private WebElement title_favBook;

    @FindBy(id = "txt_BookHeader_Subject")
    private WebElement header_favBook;

    @FindBy(id = "txt_BookHeader_Duration")
    private WebElement duration_favBook;

    @FindBy(id = "txt_BookHeader_practice_Duration")
    private WebElement practiceDuration_favBook;

    @FindBy(id = "txt_bookHeader_description")
    private WebElement description_favBook;

    @FindBy(id = "book_chapter_title")
    private WebElement chapterTitle_favBook;

    @FindBys({@FindBy(id="book_chapter_name")})
    private List<WebElement> listOfChapter;

    @FindBys({@FindBy(id="book_chapter_name1")})
    private List<WebElement> listOfTopics;

    @FindBy(id = "custom_title1")
    private WebElement custom_title1;

    @FindBy(xpath = "//android.widget.TextView[@text='The Embibe Big Books']")
    private WebElement TheEmbibeBigBooks;

    @FindBys({@FindBy(id="fl_preview_container")})
    private List<WebElement> EmbibeBigBookList;

    @FindBy(className = "androidx.recyclerview.widget.RecyclerView")
    private WebElement myFavBooksContainer;

    @FindBy(id = "manageBooks_title")
    private WebElement manageBooks_title;

    @FindBy(id = "text_success")
    private WebElement successMessage;

    @FindBy(xpath = "//android.widget.TextView[@text='My Watchlist']")
    private WebElement MyWatchlist;

    @FindBys({@FindBy(id="adBannerCardView")})
    private List<WebElement> MyWatchlistItem;

    @FindBy(id = "imgHover")
    private WebElement moreItemCardView_watchList;

    @FindBy(xpath = "//android.widget.TextView[@text='Tests I have taken']")
    private WebElement TestsIHaveTaken;

    @FindBy(id = "bookMarkCardView")
    private WebElement Questions;

    @FindBys({@FindBy(id="bookMarkCardView")})
    private List<WebElement> bookMarkCardViewList;

    @FindBys({@FindBy(id="testBannerCardView")})
    private List<WebElement> testTakenItem;

    @FindBy(id = "imgHover")
    private WebElement moreItemCardView_test;

    @FindBy(id = "txt_title")
    private WebElement title_watchlistDetails;

    @FindBy(id = "txt_description")
    private WebElement description_watchlist;

    @FindBy(id = "btn_play_all")
    private WebElement playALl;

    @FindBy(id = "header")
    private WebElement header;

    @FindBy(id = "imgBanner")
    private WebElement items;

    @FindBys({@FindBy(id = "imgBanner")})
    private List<WebElement> MyWatchListVideos;

    @FindBy(id = "ivSummaryHeroBannerPlay1")
    private WebElement playButton;

    @FindBy(id = "txt_HeroBannerName")
    private WebElement heroBannerName;

    @FindBy(id = "tvHeroBannerImportant")
    private WebElement heroBannerImportant;

    @FindBy(id = "txt_HeroBannerSubject")
    private WebElement txt_HeroBannerSubject;

    @FindBy(id = "txt_HeroBannerCourseDetails")
    private WebElement txt_HeroBannerCourseDetails;

    @FindBy(id = "txt_HeroBannerCoins")
    private WebElement txt_HeroBannerCoins;

    @FindBy(id = "txt_heroBannerDescription")
    private WebElement txt_heroBannerDescription;

    @FindBy(id = "bookmark")
    private WebElement bookmark;

    @FindBy(id = "like")
    private WebElement like;

    @FindBy(id = "fl_download_container")
    private WebElement download;

    @FindBy(id = "subject_name")
    private WebElement subject_name;

    @FindBy(id = "txt_title")
    private WebElement txt_title_takenTest;

    @FindBy(id = "txt_description")
    private WebElement txt_description_takenTest;

    @FindBy(id = "header")
    private WebElement header_Test;

    @FindBy(id = "recyclerSubItem")
    private WebElement topicsTile;

    @FindBy(id = "title")
    private WebElement topics_text;

    @FindBy(id = "btnPractice")
    private WebElement learnButton;

    @FindBy(id = "txt_title")
    private WebElement title_topic;

    @FindBy(id = "back_arrow")
    private WebElement backNav;

    @FindBy(id = "txt_description")
    private WebElement description;

    @FindBy(id = "btn_learn")
    private WebElement Learn;

    @FindBys({@FindBy(id = "header")})
    private List<WebElement> headers;

    @FindBys({@FindBy(id = "imgBanner")})
    private List<WebElement> tiles;

    @FindBys({@FindBy(id = "video_lib_image_view")})
    private List<WebElement> tile_tag;

    @FindBy(id = "title")
    private WebElement embibeBigBook_title;

    @FindBy(id = "back_arrow")
    private WebElement embibeBigBook_navBack;

    @FindBy(id = "txt_BookHeader_Subject")
    private WebElement embibeBigBook_header;

    @FindBy(id = "txt_bookHeader_description")
    private WebElement embibeBigBook_description;

    @FindBy(id = "book_chapter_title")
    private WebElement embibeBigBook_book_chapter_title;

    @FindBys({@FindBy(id = "book_chapter_name")})
    private List<WebElement> chapterList;

    @FindBy(id = "tv_msg2")
    private WebElement Do_you_really_want_to_quit_learning;

    @FindBy(id = "btn_continue_learning")
    private WebElement continueLearningBtn;

    @FindBy(id = "btn_quit")
    private WebElement  quit;

    @FindBy(id = "iv_back")
    private WebElement navBack;

    @FindBy(id = "btn_resume")
    private WebElement resume;

    @FindBy(id = "btn_start")
    private WebElement start;

    @FindBy(id = "header")
    private WebElement myDownloads_header;

    @FindBys({@FindBy(id = "title")})
    private List<WebElement> videos_title_myDownloads;

    @FindBy(id = "tv_msg2")
    private WebElement messageForNoDownloads;

    @FindBys({@FindBy(id = "llMain")})
    private List<WebElement> UserHomeTiles;


    public void verifyEmbium_coinInHerobaner(){
        waitForElementToBeVisible(embium_coin);
        softAssert.assertEquals(embium_coin.isDisplayed(),true,"embium_coin is not displayed");
        softAssert.assertAll();
    }

    public String verifyTotalEmbium_PointsInHerobanner(){
        waitForElementToBeVisible(embium_points);
        String e_Points= embium_points.getText();
        System.out.println("embium_points count is :"+embium_points.getText());
        softAssert.assertEquals(embium_points.isDisplayed(),true,"embium_points is not displayed");
        softAssert.assertAll();
        return e_Points;
    }

    public void verifyElementsOfQuitLearn(){
        waitForElementToBeVisible(Do_you_really_want_to_quit_learning);
        softAssert.assertEquals(Do_you_really_want_to_quit_learning.isDisplayed(),true,"Do_you_really_want_to_quit_learning is not displayed");
        softAssert.assertEquals(continueLearningBtn.isDisplayed(),true,"continueLearningBtn is not displayed");
        softAssert.assertEquals(quit.isDisplayed(),true,"quit option is not displayed");
        softAssert.assertAll();
    }
    public void clickOnContinueLearning(){
        waitForElementToBeVisible(continueLearningBtn);
        continueLearningBtn.click();
    }
    public void clickOnQuit(){
        waitForElementToBeVisible(quit);
        quit.click();
    }
    public void clickOnBackIcon(){
        waitForElementToBeVisible(navBack);
        navBack.click();
    }
    public void clickOnResumeButton(){
        waitForElementToBeVisible(resume);
        resume.click();
    }
    public void clickOnStartButton(){
        waitForElementToBeVisible(start);
        start.click();
    }
    public void verifyAllElementsOnSelectChapterScreen(){
        waitForElementToBeVisible(SelectChapter);
        softAssert.assertEquals(chapterList_close.isDisplayed(),true,"close button is not displayed");
        softAssert.assertEquals(SelectChapter.isDisplayed(),true,"SelectChapter is not displayed");
        softAssert.assertEquals(ListOfChapter.get(0).isDisplayed(),true,"chapter is not displayed");
        softAssert.assertEquals(ListOfChapter.get(1).isDisplayed(),true,"chapter button is not displayed");
        scrollToText("Done");
        softAssert.assertEquals(Done.isDisplayed(),true,"Done button is not displayed");
        softAssert.assertAll();
    }
    public void selectChapter(){
        waitForElementToBeVisible(ListOfChapter.get(0));
        ListOfChapter.get(1).click();
    }

    public void verifyAllElementsOnSelectUnitScreen(){
        waitForElementToBeVisible(SelectUnit);
        softAssert.assertEquals(UnitList_close.isDisplayed(),true,"close button is not displayed");
        softAssert.assertEquals(SelectUnit.isDisplayed(),true,"SelectUnit is not displayed");
        softAssert.assertEquals(ListOfUnits.get(0).isDisplayed(),true,"Unit is not displayed");
        softAssert.assertEquals(ListOfUnits.get(1).isDisplayed(),true,"Unit button is not displayed");
        softAssert.assertEquals(Done.isDisplayed(),true,"Done button is not displayed");
        softAssert.assertAll();
    }
    public void selectAUnit(){
        waitForElementToBeVisible(ListOfUnits.get(1));
        ListOfUnits.get(1).click();
    }
    public void clickOnAllChapter(){
        waitForElementToBeVisible(AllChapter);
        AllChapter.click();
    }
    public void VerifythatQuestionstileispresentunderMyBookmarkscarousel(){
        swipeScreen(Direction.DOWN);
        scrollToText("My Bookmarks");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);

        waitForElementToBeVisible(bookMarkCardViewList.get(1));
        Assert.assertEquals(bookMarkCardViewList.get(1).isDisplayed(),true,"Questions not Displayed");
        System.out.println("name "+bookMarkCardViewList.get(1).getText());
    }

    public void verifyAllElementsOnSelectSubjectList(){
        waitForElementToBeVisible(SelectSubjects);
        softAssert.assertEquals(SelectSubjects.isDisplayed(),true,"close button is not displayed");
        softAssert.assertEquals(SubjectList_close.isDisplayed(),true,"close button is not displayed");
        softAssert.assertEquals(ListOfSubjects.get(0).isDisplayed(),true,"subject is not displayed is not displayed");
        softAssert.assertEquals(ListOfSubjects.get(1).isDisplayed(),true,"subject is not displayed is not displayed");
        softAssert.assertEquals(Done.isDisplayed(),true,"Done button is not displayed");
        softAssert.assertAll();
    }
    public void selectASubject(){
        waitForElementToBeVisible(ListOfSubjects.get(1));
        ListOfSubjects.get(1).click();
    }
    public void clickOnDone(){
        scrollToText("Done");
        waitForElementToBeVisible(Done);
        Done.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnAllUnits(){
        waitForElementToBeVisible(ALlUnit);
        ALlUnit.click();
    }

    public void clickOnCrossButton(){
        waitForElementToBeVisible(closeFilterButton);
        closeFilterButton.click();
    }

    public void verifyAllElementsOnFilterScreen(){
        waitForElementToBeVisible(FilterTitle);
        softAssert.assertEquals(closeFilterButton.isDisplayed(),true,"Close button is not displayed");
        softAssert.assertEquals(FilterTitle.isDisplayed(),true,"FilterTitle  is not displayed");
        softAssert.assertEquals(AllSubject.isDisplayed(),true,"AllSubject   is not displayed");
        softAssert.assertEquals(ALlUnit.isDisplayed(),true,"ALlUnit   is not displayed");
        softAssert.assertEquals(AllChapter.isDisplayed(),true,"AllChapter   is not displayed");
        softAssert.assertEquals(Done.isDisplayed(),true,"Done button   is not displayed");
        softAssert.assertAll();
    }
    public void clickOnAllSubject(){
        waitForElementToBeVisible(AllSubject);
        AllSubject.click();
    }


    public void clickOnRevisionList(){
        swipeScreen(Direction.DOWN);
        scrollToText("My Home");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);

        waitForElementToBeVisible(MyHome_RevisionList_text.get(1));
        MyHome_RevisionList_text.get(1).click();
    }
    public void clickOnMyHomeTile(){
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.3, 0.1, 0.1);
        waitForElementToBeVisible(MyHome_RevisionList_text.get(1));
        MyHome_RevisionList_text.get(1).click();
    }
    public void VerifyHeroBannerPlayButton(){
        // waitForElementToBeVisible(HeroBanner_PlayButton);
        Assert.assertEquals(HeroBanner_PlayButton.isDisplayed(),false,"Hero Banner PlayButton Is Enabled");
    }
    public void VerifyMyHome(){
        waitForElementToBeVisible(My_Home);
        Assert.assertEquals(My_Home.isDisplayed(),true,"My Home is not Displayed");
    }
    public void verifyAllTheElementsOfRevisionLists(){
        waitForElementToBeVisible(QuestionsToRevise);
        softAssert.assertEquals(FilterSubjectsUnitsAndChapters.isDisplayed(),true,"FilterSubjectsUnitsAndChapters is not displayed");
        softAssert.assertEquals(QuestionsToRevise.isDisplayed(),true,"Questions To Revise is not displayed");
        softAssert.assertEquals(TopicsToRevise.isDisplayed(),true,"Topics To Revise is not displayed");
        softAssert.assertAll();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnFilterSubjectsUnitsAndChapters(){
        waitForElementToBeVisible(FilterSubjectsUnitsAndChapters);
        FilterSubjectsUnitsAndChapters.click();
    }
    public void clickOnTopicsToRevise(){
        waitForElementToBeVisible(TopicsToRevise);
        TopicsToRevise.click();
    }
    public void clickOnQuestionsToRevise(){
        waitForElementToBeVisible(QuestionsToRevise);
        QuestionsToRevise.click();
    }
    public void verifyShowingAllChapters() {
        waitForElementToBeVisible(name_Chapters.get(0));
        System.out.println("Chapter Size" + name_Chapters.size());
        Set<String> chapterList = new LinkedHashSet<>();
        for (int i = 0; i < name_Chapters.size(); i++) {
            chapterList.add(name_Chapters.get(i).getText());
        }
        System.out.println("Chapter list" + chapterList);
    }

    public void verifyAllTheElementsOfTopicsToRevise(){
        waitForElementToBeVisible(title_ShowingAllTopics);
        softAssert.assertEquals(title_ShowingAllTopics.isDisplayed(),true,"title_Showing All Topics is not displayed");
//        softAssert.assertEquals(imgLayout_Topics.get(0).isDisplayed(),true,"imgLayout_Topics is not displayed");
        softAssert.assertEquals(name_Topics.get(0).isDisplayed(),true,"name_Topics is not displayed");
        softAssert.assertEquals(expand_Topics.get(0).isDisplayed(),true,"plusButton_Topics is not displayed");
        softAssert.assertAll();
    }
    public void verifyAllTheElementsOfQuestionsToRevise(){
        waitForElementToBeVisible(title_ShowingAllChapters);
        softAssert.assertEquals(title_ShowingAllChapters.isDisplayed(),true,"title_Showing All chapters is not displayed");
        softAssert.assertEquals(imgLayout_Chapters.get(0).isDisplayed(),true,"imgLayout_Chapters is not displayed");
        softAssert.assertEquals(name_Chapters.get(0).isDisplayed(),true,"name_Chapters is not displayed");
        softAssert.assertEquals(expand_Chapters.get(0).isDisplayed(),true,"plusButton_Chapters is not displayed");
        softAssert.assertAll();
    }
    public void expandChapters(){
        waitForElementToBeVisible(expand_Chapters.get(0));
        expand_Chapters.get(0).click();
    }

    public void collapseChapters(){
        waitForElementToBeVisible(collapse_Chapters.get(0));
        expand_Chapters.get(0).click();
    }

    public void verifyAllElementsOfPracticeAttempted(){
        waitForElementToBeVisible(practiceAttempted_tile);
        softAssert.assertEquals(practiceAttempted_tile.isDisplayed(),true,"practiceAttempted_tile is not displayed");
        softAssert.assertEquals(subject_name_holder.isDisplayed(),true,"subject_name_holder is not displayed");
        softAssert.assertEquals(textSubject.isDisplayed(),true,"textSubject is not displayed");
        softAssert.assertEquals(title_practice.isDisplayed(),true,"title_practice is not displayed");
        softAssert.assertEquals(practiceButton.isDisplayed(),true,"practiceButton is not displayed");
        softAssert.assertAll();
    }
    public void clickOnPracticeButton(){
        waitForElementToBeVisible(practiceButton);
        practiceButton.click();
    }
    public void clickOnPracticeAttempted_tile(){
        waitForElementToBeVisible(practiceAttempted_tile);
        practiceAttempted_tile.click();

    }
    public void verifyAllTheElementsInQuestionsListAttempted(){
        waitForElementToBeVisible(question_text.get(0));
        softAssert.assertEquals(title_questionsType.isDisplayed(),true,"title_questionsType is not displayed");
        softAssert.assertEquals(back_attemptedQuestions.isDisplayed(),true,"back_attemptedQuestions is not displayed");
        softAssert.assertEquals(attemptedQuestions_tiles.get(0).isDisplayed(),true,"attemptedQuestions_tiles is not displayed");
        softAssert.assertEquals(subjectTag.get(0).isDisplayed(),true,"subjectTag is not displayed");
        softAssert.assertEquals(marks.get(0).isDisplayed(),true,"marks is not displayed");
        softAssert.assertEquals(question_text.get(0).isDisplayed(),true,"question_text is not displayed");
        softAssert.assertEquals(tag_IMPORTANT.get(0).isDisplayed(),true,"tag_IMPORTANT is not displayed");
        softAssert.assertEquals(tag_LENGTHY.get(0).isDisplayed(),true,"tag_LENGTHY is not displayed");
        softAssert.assertAll();
    }
    public void verifyShowingAllQuestions() {
        waitForElementToBeVisible(question_text.get(0));
        System.out.println("Question Size" + question_text.size());
        Set<String> questionList = new LinkedHashSet<>();
        for (int i = 0; i < question_text.size(); i++) {
            questionList.add(question_text.get(i).getText());
        }
        System.out.println("Question list" + questionList);
    }
    public void verifyShowingAllTopics() {
        waitForElementToBeVisible(name_Topics.get(0));
        System.out.println("Topic Size" + name_Topics.size());
        Set<String> topicList = new LinkedHashSet<>();
        for (int i = 0; i < name_Topics.size(); i++) {
            topicList.add(name_Topics.get(i).getText());
        }
        System.out.println("Topic list" + topicList);
    }
    public void expandTopics(){
        waitForElementToBeVisible(expand_Topics.get(0));
        expand_Topics.get(0).click();
    }
    public void collapseTopics(){
        waitForElementToBeVisible(collapse_Topics.get(0));
        collapse_Topics.get(0).click();
    }
    public void verifyAllElementsOfTopicsAttempted(){
        waitForElementToBeVisible(topicsTile);
        softAssert.assertEquals(topicsTile.isDisplayed(),true,"topicsTile is not displayed");
        softAssert.assertEquals(topics_text.isDisplayed(),true,"topics_text is not displayed");
        softAssert.assertEquals(learnButton.isDisplayed(),true,"learnButton is not displayed");
        softAssert.assertAll();
    }
    public void clickOnLearnButton(){
        waitForElementToBeVisible(learnButton);
        learnButton.click();
    }
    public void clickOnTopicTile(){
        waitForElementToBeVisible(topicsTile);
        topicsTile.click();
    }

    public void verifyAllTheElementsInTopicDetails(){
        waitForElementToBeVisible(headers.get(0));
        softAssert.assertEquals(title_topic.isDisplayed(),true,"title is not displayed");
        //  softAssert.assertEquals(backNav.isDisplayed(),true,"backNav is not displayed");
        softAssert.assertEquals(description.isDisplayed(),true,"description is not displayed");
        softAssert.assertEquals(Learn.isDisplayed(),true,"Learn button is not displayed");
        softAssert.assertEquals(headers.get(0).isDisplayed(),true,"headers is not displayed");
        softAssert.assertEquals(tiles.get(0).isDisplayed(),true,"tile is not displayed");
        softAssert.assertEquals(tile_tag.get(0).isDisplayed(),true,"tile_tag is not displayed");
        softAssert.assertAll();
    }

    public void clickOnProfileIcon(){
        waitForElementToBeVisible(profileIcon);
        profileIcon.click();
    }

    public void inviteYourParentsByPhoneNumber(String PhoneNumber){
        waitForElementToBeVisible(usernameField);
        usernameField.sendKeys(PhoneNumber);
        inviteButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        softAssert.assertEquals(successMessage.isDisplayed(),true,"Success message displayed");
    }


    public void clickOnGoal(){
        scrollDown();
        waitForElementToBeVisible(heroBanner_Goal);
        heroBanner_Goal.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public String verifySelectedGoal(){
        waitForElementToBeVisible(heroBanner_Goal);
        String goalName=heroBanner_Goal.getText();
        System.out.println("goal name is :" + heroBanner_Goal.getText());
        return goalName;
    }
    public void scrollDown(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        swipeScreen(Direction.DOWN);
       // scrollUsingResourceID("txt_heroBanner_action_goal_switch");
       // scrollToText("Assignment from My Parents");
        verticalSwipeByPercentages(0.2, 0.1, 0.1);


    }
    public void verifyUpdatedGoal(){
        waitForElementToBeVisible(heroBanner_Goal);
        softAssert.assertEquals(heroBanner_Goal.getText(), Exam.SIXTH_GRADE,"Title not matched ");
    }

    public void verifyElementsOfTestTakenDetails(){
        waitForElementToBeVisible(txt_title_takenTest);
        softAssert.assertEquals(txt_title_takenTest.isDisplayed(),true,"screen title not displayed");
        softAssert.assertEquals(txt_description_takenTest.isDisplayed(),true,"screen description not displayed");
        softAssert.assertEquals(header_Test.isDisplayed(),true,"header not displayed");
        softAssert.assertEquals(testTakenItem.get(0).isDisplayed(),true,"added item is not displayed");
        softAssert.assertAll();

    }
    public void verifyElementsOfWatchlistDetails(){
        waitForElementToBeVisible(title_watchlistDetails);
        softAssert.assertEquals(title_watchlistDetails.isDisplayed(),true,"screen title not displayed");
        softAssert.assertEquals(description_watchlist.isDisplayed(),true,"screen description not displayed");
        softAssert.assertEquals(playALl.isDisplayed(),true,"playAll button not displayed");
        softAssert.assertEquals(header.isDisplayed(),true,"screen header not displayed");
        softAssert.assertEquals(items.isDisplayed(),true,"items not displayed");
        softAssert.assertAll();

    }
    public void clickOnWatchlistedVideoTile(){
        waitForElementToBeVisible(items);
        items.click();
    }
    public void clickOnPlayALlButton(){
        waitForElementToBeVisible(playALl);
        playALl.click();
    }
    public void clickOnWatchListVideo(){
        waitForElementToBeVisible(MyWatchListVideos.get(0));
        MyWatchListVideos.get(0).click();
    }
    public void verifyShowingAllMyWatchListVideos() {
        waitForElementToBeVisible(MyWatchListVideos.get(0));
        System.out.println("My Watch List Videos Size is " + MyWatchListVideos.size());
        Set<String> watchList = new LinkedHashSet<>();
        for (int i = 0; i < MyWatchListVideos.size(); i++) {
            watchList.add(MyWatchListVideos.get(i).getText());
        }
        System.out.println("WatchList videos" + watchList);
    }

    public void verifyAllElementsOnWatchlistVideoDetailsScreen(){
        waitForElementToBeVisible(playButton);
        softAssert.assertEquals(playButton.isDisplayed(),true,"playButton is not displayed");
        softAssert.assertEquals(playButton.isDisplayed(),true,"playButton is not displayed");
        //  softAssert.assertEquals(heroBannerImportant.isDisplayed(),true,"heroBannerImportant is not displayed");
        softAssert.assertEquals(txt_HeroBannerSubject.isDisplayed(),true,"txt_HeroBannerSubject is not displayed");
        softAssert.assertEquals(txt_HeroBannerCourseDetails.isDisplayed(),true,"txt_HeroBannerCourseDetails is not displayed");
        softAssert.assertEquals(txt_HeroBannerCoins.isDisplayed(),true,"txt_HeroBannerCoins is not displayed");
        softAssert.assertEquals(txt_heroBannerDescription.isDisplayed(),true,"txt_heroBannerDescription is not displayed");
        softAssert.assertEquals(bookmark.isDisplayed(),true,"bookmark is not displayed");
        softAssert.assertEquals(like.isDisplayed(),true,"like is not displayed");
        softAssert.assertEquals(download.isDisplayed(),true,"download is not displayed");
        softAssert.assertAll();
    }
    public void clickOnPlayButtonOfWatchListVideo(){
        waitForElementToBeVisible(playButton);
        playButton.click();
    }
    public String verifyOpenedVideoFromWatchlistedIsMarkedWatchlist(){
        waitForElementToBeVisible(like);
        like.getText();
        String watchlist =like.getText();
        System.out.println("name is :"+like.getText());
        return watchlist;


    }


    public void verifyElementsOfHeroBanner(){
        waitForElementToBeVisible(HeroBannerName);
        //  softAssert.assertEquals(HeroBannerImg.isDisplayed(),true,"Hero banner image is not displayed");
//        softAssert.assertEquals(HeroBanner_PlayButton.isDisplayed(),true,"Hero banner image is not displayed");
        softAssert.assertEquals(profileIcon.isDisplayed(),true,"Hero banner image is not displayed");
        softAssert.assertEquals(search.isDisplayed(),true,"Hero banner image is not displayed");
        softAssert.assertEquals(HeroBannerName.isDisplayed(),true,"Hero banner image is not displayed");
        softAssert.assertEquals(subtitle.isDisplayed(),true,"Hero banner image is not displayed");
        softAssert.assertEquals(coin_subject.isDisplayed(),true,"Hero banner image is not displayed");
        softAssert.assertEquals(heroBannerDescription.isDisplayed(),true,"Hero banner image is not displayed");
        softAssert.assertEquals(watchButton.isDisplayed(),true,"Hero banner image is not displayed");
        softAssert.assertEquals(heroBanner_Goal.isDisplayed(),true,"Hero banner image is not displayed");
        softAssert.assertAll();

    }

    public void verifyMyDownloadsCarouselIsDisplayedInHomeScreen(){
        swipeScreen(Direction.DOWN);
        scrollToText("My Downloads");
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(myDownloads_header);
        softAssert.assertEquals(myDownloads_header.isDisplayed(),true,"myDownloads_header is not displayed");
        softAssert.assertEquals(videos_title_myDownloads.get(2).isDisplayed(),true,"videos_title_myDownloads is not displayed");
        softAssert.assertAll();
    }

    public void clickOnMyDownloadsToViewAllDownloadedVideos(){
        waitForElementToBeVisible(videos_title_myDownloads.get(2));
        videos_title_myDownloads.get(2).click();
    }

    public void verifyMessageShownIfThereAreNoVideosDownloaded(){
        waitForElementToBeVisible(messageForNoDownloads);
        softAssert.assertEquals(messageForNoDownloads.isDisplayed(),true,"message is not displayed");
        softAssert.assertAll();
    }

    public String verifyGoal(){
        waitForElementToBeVisible(heroBanner_Goal);
        String goal=heroBanner_Goal.getText();
        System.out.println("goal name: "+heroBanner_Goal.getText());
        return goal;
    }
    public void clickOnPlayButtonOFHeroBanner(){
        waitForElementToBeVisible(HeroBanner_PlayButton);
        HeroBanner_PlayButton.click();
    }
    public void clickOnWatchButton(){
        waitForElementToBeVisible(watchButton);
        watchButton.click();
    }
    public void clickOnSearch(){
        waitForElementToBeVisible(search);
        search.click();
    }
    public void SearchOnUserHome(String queryValue){
        waitForElementToBeVisible(searchField);
        searchField.sendKeys(queryValue);
        driver().getKeyboard().sendKeys(Keys.ENTER);
    }
    public void clickOnGoalAndExam(){
        waitForElementToBeVisible(heroBanner_Goal);
        heroBanner_Goal.click();
    }
    public void verifyElementsOfAssignmentFromMyParents(){
        scrollToText("invite your parent");
        waitForElementToBeVisible(GetRewarded_InviteParent.get(0));
        softAssert.assertEquals(AssignmentFromMyParents.isDisplayed(),true,"Assignment From My Parents is not displayed");
        softAssert.assertEquals(GetRewarded_InviteParent.get(0).isDisplayed(),true,"Get Rewarded for your studies");
        softAssert.assertEquals(GetRewarded_InviteParent.get(1).isDisplayed(),true,"Invite your parent is not displayed");
        softAssert.assertEquals(InviteParentText.isDisplayed(),true,"InviteParentText is not displayed");
        System.out.println("name :"+ InviteParentText.getText());
        softAssert.assertAll();

    }
    public void clickOnInviteYourParents(){
        scrollToText("My Favourite Books");
        waitForElementToBeVisible(GetRewarded_InviteParent.get(0));
        GetRewarded_InviteParent.get(0).click();
    }

    public void verifyElementsOfInviteYourParentsScreen(){
        waitForElementToBeVisible(Enter_Parent_email_or_mobile_number_to_invite);
        softAssert.assertEquals(Enter_Parent_email_or_mobile_number_to_invite.isDisplayed(),true,"Enter Parent email or mobile number to invite , is not displayed");
        softAssert.assertEquals(titleOfInviteScreen.isDisplayed(),true," Title is not displayed");
        softAssert.assertEquals(usernameField.isDisplayed(),true," username field is not displayed");
        softAssert.assertEquals(inviteButton.isDisplayed(),true,"Invite button is not displayed");
        softAssert.assertAll();

    }
    public void inviteYourParentsByEmailID(String EmailId){
        waitForElementToBeVisible(usernameField);
        usernameField.sendKeys(EmailId);
        inviteButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        softAssert.assertEquals(successMessage.isDisplayed(),true,"Success message displayed");
    }
    public void inviteYourParentsByUsingInvalidEmailID(String EmailId){
        waitForElementToBeVisible(usernameField);
        usernameField.sendKeys(EmailId);
        inviteButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        softAssert.assertEquals(titleOfInviteScreen.isDisplayed(),true,"User is able to navigate even without providing any email or phone");
    }
    public void inviteYourParentsByPhoneNumber(long phone) {
        waitForElementToBeVisible(usernameField);
        usernameField.click();
        inviteButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        softAssert.assertEquals(successMessage.isDisplayed(),true,"Success message displayed");

    }

    public void inviteYourParentsByUsingInvalidPhoneNumber(String PhoneNumber) {
        waitForElementToBeVisible(usernameField);
        usernameField.sendKeys(PhoneNumber);
        inviteButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        softAssert.assertEquals(titleOfInviteScreen.isDisplayed(),true,"User is able to navigate even without providing any email or phone");
    }
    public void inviteYourParentsWithoutEnteringAnyEmailOrPhone(){
        waitForElementToBeVisible(usernameField);
        inviteButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        softAssert.assertEquals(titleOfInviteScreen.isDisplayed(),true,"User is able to navigate even without providing any email or phone");
    }

    public void verifyElementsOfFavouriteBooks(){
        scrollToText("My Favourite Books");
        waitForElementToBeVisible(ListOfFavouriteBooks.get(0));
        softAssert.assertEquals(MyFavouriteBooks.isDisplayed(),true,"My Favourite Books is not displayed");
        softAssert.assertEquals(ListOfFavouriteBooks.get(0).isDisplayed(),true,"Book Not displayed");
        softAssert.assertEquals(ListOfFavouriteBooks.get(1).isDisplayed(),true,"Book Not displayed");
         softAssert.assertAll();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void clickOnManageBooks(){
        swipeScreen(Direction.DOWN);
        scrollToText("parent");
        verticalSwipeByPercentages(0.9, 0.2, 0.5);
        waitForElementToBeVisible(myFavBooksContainer);
        ListOfFavouriteBooks.get(0).click();
        try {
            softAssert.assertEquals(manageBooks_title.isDisplayed(),true,"not displayed");
        }catch (Exception e){
            driver().navigate().back();
            swipeScreen(Direction.DOWN);
            scrollToText("parent");
            verticalSwipeByPercentages(0.9, 0.2, 0.5);
            waitForElementToBeVisible(myFavBooksContainer);
            ListOfFavouriteBooks.get(1).click();

        }
    }
    public void clickOnManageBooksToRemoveBook(){
        // scrollToText("Invite your parent");
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(myFavBooksContainer);
        ListOfFavouriteBooks.get(1).click();
    }
    public void viewAFavouriteBook(){
        scrollToText("My Favourite Books");
        waitForElementToBeVisible(ListOfFavouriteBooks.get(0));
        ListOfFavouriteBooks.get(0).click();
    }
    public void verifyBookAddedTag(){
        waitForElementToBeVisible(btn_bookAdded);
        softAssert.assertEquals(btn_bookAdded.isDisplayed(),true,"btn_bookAdded is not displayed");
        softAssert.assertAll();
    }
    public void verifyAllElementsPresentInFavouriteBookDetailsScreen(){
        waitForElementToBeVisible(chapterTitle_favBook);
        // softAssert.assertEquals(navBack_favBook.isDisplayed(),true,"Back navigation is not available");
        softAssert.assertEquals(title_favBook.isDisplayed(),true,"Title is not available");
        softAssert.assertEquals(header_favBook.isDisplayed(),true,"Header is not available");
        softAssert.assertEquals(duration_favBook.isDisplayed(),true,"Duration is not available");
//        softAssert.assertEquals(practiceDuration_favBook.isDisplayed(),true,"Practice duration is not available");
        softAssert.assertEquals(chapterTitle_favBook.isDisplayed(),true,"chapterTitle is not available");
        softAssert.assertEquals(listOfChapter.get(0).isDisplayed(),true,"chapter is not available");
        softAssert.assertEquals(description_favBook.isDisplayed(),true,"Description is not available");
        softAssert.assertAll();
    }

    public void verifyAllChaptersDisplayed() {
        waitForElementToBeVisible(listOfChapter.get(0));
        System.out.println("Chapter Size" + listOfChapter.size());
        Set<String> chapterList = new LinkedHashSet<>();
        for (int i = 0; i < listOfChapter.size(); i++) {
            chapterList.add(listOfChapter.get(i).getText());
        }
        System.out.println("Chapter list" + chapterList);
    }
    public void clickOnChapter(){
        waitForElementToBeVisible(listOfChapter.get(0));
        listOfChapter.get(0).click();
    }
    public void verifyAllTopicsDisplayed() {
        waitForElementToBeVisible(listOfTopics.get(0));
        System.out.println("Topic Size" + listOfTopics.size());
        Set<String> topicList = new LinkedHashSet<>();
        for (int i = 0; i < listOfTopics.size(); i++) {
            topicList.add(listOfTopics.get(i).getText());
        }
        System.out.println("Chapter list" + topicList);
    }
    public void verifyUnitIsDisplayed(){
        waitForElementToBeVisible(custom_title1);
        softAssert.assertEquals(custom_title1.isDisplayed(),true,"custom_title1 is not displayed");
        softAssert.assertAll();
    }


    public void verifyAllTheElementsOfTheEmbibeBigBooks(){
        swipeScreen(Direction.DOWN);
        scrollToText("My Favourite Books");
        verticalSwipeByPercentages(0.4, 0.1, 0.1);
        verticalSwipeByPercentages(0.4, 0.1, 0.1);
        waitForElementToBeVisible(EmbibeBigBookList.get(0));
        softAssert.assertEquals(EmbibeBigBookList.get(0).isDisplayed(),true,"Book is not displayed");
        softAssert.assertEquals(EmbibeBigBookList.get(1).isDisplayed(),true,"Book is not displayed");
        softAssert.assertEquals(TheEmbibeBigBooks.isDisplayed(),true,"TheEmbibeBigBooks is not displayed");
        softAssert.assertAll();

    }
    public void clickOnTheEmbibeBigBooksTile(){
        swipeScreen(Direction.DOWN);
        scrollToText("The Embibe Big Books");
        verticalSwipeByPercentages(0.3, 0.1, 0.1);
        verticalSwipeByPercentages(0.3, 0.1, 0.1);
        //  verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(EmbibeBigBookList.get(1));
        EmbibeBigBookList.get(1).click();
    }

    public void verifyBookIsAddedToMyFavouriteBooksList(){
        scrollToText("My Favourite Books");
        waitForElementToBeVisible(myFavBooksContainer);
        softAssert.assertEquals(ListOfFavouriteBooks.get(1).isDisplayed(),true,"Book is not added");

    }


    public void VerifyIfWatchListISReflectingInUserHomeAfterAddingAnyVideo(){
        swipeScreen(Direction.DOWN);
        scrollToText("My Watchlist");
        waitForElementToBeVisible(MyWatchlist);
        softAssert.assertEquals(MyWatchlist.isDisplayed(),true,"My watchlist section is not displayed");
        softAssert.assertEquals(moreItemCardView_watchList.isDisplayed(),true,"WatchList item is not added");
        softAssert.assertEquals(subject_name.isDisplayed(),true,"subject name is not displayed in card");
        System.out.println("Subject Name is : "+subject_name.getText());
        softAssert.assertAll();
    }
    public void clickOnMoreItemCardView_watchList(){
        swipeScreen(Direction.DOWN);
        scrollToText("My Watchlist");
        waitForElementToBeVisible(moreItemCardView_watchList);
        moreItemCardView_watchList.click();
    }
    public void VerifyIfTestTakenIsReflectingInUserHomeAfterTakingAnyTest(){
        swipeScreen(Direction.DOWN);
        scrollToText("Tests I have taken");
        waitForElementToBeVisible(testTakenItem.get(0));
        softAssert.assertEquals(TestsIHaveTaken.isDisplayed(),true,"TestsIHaveTaken section is not displayed");
     //   softAssert.assertEquals(moreItemCardView_test.isDisplayed(),true,"moreItemCardView_test item is not added");
        softAssert.assertAll();
    }
    public void verifySubjectHolderAndTagInTestTile(){
        waitForElementToBeVisible(subject_name_holder);
        softAssert.assertEquals(subject_name_holder.isDisplayed(),true,"subject_name_holder is not displayed");
        softAssert.assertEquals(subject_name.isDisplayed(),true,"subject_name is not displayed");
        softAssert.assertAll();
    }
    public void verifyCompletedStatus(){
        waitForElementToBeVisible(Completed_status);
        softAssert.assertEquals(Completed_status.isDisplayed(),true,"Status is not displayed");
        softAssert.assertAll();
    }
    public void verifyTestNameForTakenTest(){
        waitForElementToBeVisible(HeroBannerName);
        softAssert.assertEquals(HeroBannerName.isDisplayed(),true,"HeroBannerName is not displayed");
        softAssert.assertAll();
    }
    public void viewTestTakenFromUserHome(){
        scrollToText("Tests I have taken");
        waitForElementToBeVisible(testTakenItem.get(0));
        softAssert.assertEquals(testTakenItem.get(0).isDisplayed(),true,"testTakenItem is not displayed");
    }
    public void ClickOnTestTakenTileFromUserHome(){
        scrollToText("Tests I have taken");
        waitForElementToBeVisible(testTakenItem.get(0));
        testTakenItem.get(0).click();
    }
    public void clickOnMoreItemCardView_test(){
        scrollToText("Tests I have taken");
        waitForElementToBeVisible(moreItemCardView_test);
        moreItemCardView_test.click();
    }

    public void verifyElementsOnEmbibeBigBookDetailsScreen(){
        waitForElementToBeVisible(embibeBigBook_description);
        softAssert.assertEquals(embibeBigBook_title.isDisplayed(),true,"embibeBigBook_title is not displayed");
        // softAssert.assertEquals(embibeBigBook_navBack.isDisplayed(),true,"embibeBigBook_navBack is not displayed");
        softAssert.assertEquals(embibeBigBook_header.isDisplayed(),true,"embibeBigBook_header is not displayed");
        softAssert.assertEquals(embibeBigBook_description.isDisplayed(),true,"embibeBigBook_description is not displayed");
        softAssert.assertEquals(embibeBigBook_book_chapter_title.isDisplayed(),true,"embibeBigBook_book_chapter_title is not displayed");
        softAssert.assertEquals(chapterList.get(0).isDisplayed(),true,"chapter is not displayed");
        softAssert.assertAll();
    }
    public void clickOnBackButtonInEmbibeBigBook(){
        waitForElementToBeVisible(embibeBigBook_navBack);
        embibeBigBook_navBack.click();
    }

    public void scrollAndClickOnTestTile(int index){
        waitForElementToBeVisible(UserHomeTiles.get(1));

        Dimension windowSize = driver().manage().window().getSize();
        int x= windowSize.height;
        int y=windowSize.width;
        int z=x/2;
        UserHomeTiles.get(2).getLocation().move(z,y/2);
        System.out.println("vipin"+UserHomeTiles.get(0).getLocation().getX());
        TouchAction action =new TouchAction(driver());
        action.moveTo(PointOption.point(650, 680))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(PointOption.point(100, 680))
                .release();
        UserHomeTiles.get(index).click();


    }
    public void clickRevisionList(){
        waitForElementToBeVisible(UserHomeTiles.get(2));
        UserHomeTiles.get(2).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @FindBy(xpath = "//*[@text='MY TIMELINE']")
    private WebElement myTimeline;

    public void clickOnMyTimeLine(){
        swipeScreen(Direction.DOWN);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(myTimeline);
        myTimeline.click();
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);

    }



}



