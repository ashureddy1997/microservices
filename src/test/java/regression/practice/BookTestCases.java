package regression.practice;

import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class BookTestCases extends TestBase {

    @Test(priority = 1, groups = {Categories.PracticeREGRESSION, Categories.BETAREGRESSION}, description = "Verify the book description page contains the details of a book title, description, subject, learning map, Time duration, Embiums, achievement, behaviour and learns button.")
    public void verifyAllTheElementOnBook() {
        logger.info("Verify all the elements on Book Description Page");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on Practice Tab");
        homePage.clickOnPracticeTab();
        logger.info("Click on Book");
        homePage.clickOnBook(0);
        logger.info("Verify All The Element Present On Book TOC");
        bookPage.verifyAllTheElementPresentOnBookTOC();


    }

    @Test(priority = 2, groups = {Categories.PracticeREGRESSION, Categories.BETAREGRESSION}, description = "Verify all the element present on the chapter details screen")
    public void verifyAllTheElementOnChapterPage() {
        logger.info("Click on Verify All The ElementS On ChapterDetailScreen");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on PracticeTab");
        homePage.clickOnPracticeTab();
        logger.info("Click on Book");
        homePage.clickOnBook(0);
        logger.info("Click on Chapter");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(0);
        logger.info("verify Navigation to Chapter");
        practicePage.VerifyAllTheElementsOnPoinysToRememberTile();
        logger.info("VerifyAllTheElementsOnPoinysToRememberTileInBook");
        practicePage.VerifyAllTheElementsOnPointsToRememberPage();
        logger.info("VerifyAllTheElementsOnPointsToRememberPageInBook");
        practicePage.navigateback();
        chapterPage.verifyChapterAllTheElementOnChapterDetailScreen();
        logger.info("verify Navigation to Chapter");

    }

    @Test(priority = 3, groups = {Categories.PracticeREGRESSION, Categories.SMOKE, Categories.BETAREGRESSION}, description = "Verify All elements on Embibe Big Book description page")
    public void verifyAllTheElementOnEmbibeBigBook() {
        logger.info("Verify All elements on Embibe Big Book description page");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on PracticeTab");
        homePage.clickOnPracticeTab();
        logger.info("Navigate to Embibe Book");
        practicePage.VerifyUserCanNavigateEmbibeBigBook();
        logger.info("Click on Embibe Book");
        homePage.clickOnBook(1);
        bookPage.verifyAllTheElementPresentOnBigBook();
    }

    @Test(priority = 4, groups = {Categories.PracticeREGRESSION, Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify all the element present on the chapter details screen")
    public void verifyAllTheElementOnChapterPageInBigBook() {
        logger.info("Verify All The ElementS On BigBook ChapterDetailScreen");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on PracticeTab");
        homePage.clickOnPracticeTab();
        logger.info("Navigate to Embibe Book");
        practicePage.VerifyUserCanNavigateEmbibeBigBook();
        logger.info("Click on Embibe Book");
        homePage.clickOnBook(1);
        logger.info("Click on Embibe Chapter");
        bookPage.clickOnChapterName(0);
        chapterPage.verifyChapterAllTheElementOnBigBookChapterDetailScreen();

    }

    @Test(priority = 5, groups = {Categories.PracticeREGRESSION, Categories.BETAREGRESSION}, description = "Verify Clicking on any of the book in Books with Videos and Solutions, " +
            "the user is directed to the Book description page.")
    public void verifyUserCanTakePracticeByClickingOnBook() {
        logger.info("Verify if user is able to take practice from a book");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on PracticeTab");
        homePage.clickOnPracticeTab();
        logger.info("Click on Book");
        homePage.clickOnBook(0);
        logger.info("Click on Chapter");
        bookPage.clickOnChapterName(0);
        logger.info("Click On Practice");
        bookPage.clickOnChapterName(0);
        logger.info("Click On Practice");
        practicePage.verifyUserCanTakePractice();


    }

    @Test(priority = 6, groups = {Categories.PracticeREGRESSION, Categories.BETAREGRESSION}, description = "Verify User can play Embibe Explainers videos in Books Topic in practice")
    public void VerifyUserCanPlayEmbibeExplainersVideosInBooksTopic() {
        logger.info("Verify User can play Embibe Explainers videos in Books Topic in practice");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on PracticeTab");
        homePage.clickOnPracticeTab();
        logger.info("Click on Book");
        homePage.clickOnBook(0);
        logger.info("Click on Chapter");
        bookPage.clickOnChapterName(0);
        logger.info("Click on Topic");
        bookPage.clickOnChapterName(0);
        bookPage.ClickOnTopic(0);
        logger.info("ClickOnTopic");
        logger.info("Verify User Can Play EmbibeExplainersVideos In Books Topic");
        bookPage.VerifyUserCanPlayEmbibeExplainersVideosInBooksTopic();


    }

    @Test(priority = 7, groups = {Categories.PracticeREGRESSION, Categories.BETAREGRESSION}, description = "Verify User can play Embibe Explainers videos in Books Topic in practice")
    public void VerifyUserCanPlayEnrichYourLearningVideosInBooksTopic() {
        logger.info("VerifyUserCanPlayEnrichYourLearningVideosInBooksTopic");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(3);
        logger.info("click On ChapterName");
        bookPage.ClickOnTopic(0);
        logger.info("ClickOnTopic");
        bookPage.VerifyUserCanPlayEnrichYourLearningVideosInBooksTopic();


    }

   /* @Test(priority = 8, groups = {Categories.Descoped}, description = "Verify User is able to see Chapters of the Book displayed in the Page, " +
            "Verify relevant Topic Name appears in Practice Page.")
    public void VerifyUserAbleToSeeTheChaptersAndRelevantTopicNameAppears() {
        logger.info("Verify User Able To See The Chapters And Relevant Topic Name Appears");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnLearnTab();
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.verifyuserabletoseethechapter();
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.verifyuserabletoseethechaptersandrelevanttopicnameappear();
        logger.info("Verify relevant Topic Name appears in Practice Page");
    }*/

    @Test(priority = 9, groups = {Categories.PracticeREGRESSION, Categories.BETAREGRESSION}, description = "Verify User is able to see Practice Thumbnail in Topics Section.")
    public void VerifyUserIsAbleToSeePracticeThumbnailInTopicsSection() {
        logger.info("Verify User is able to see Practice Thumbnail in Topics Section");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.ClickOnTopic(0);
        logger.info("click On Topic");
        homePage.verifyNavigateToPracticeChapters();


    }

    @Test(priority = 10, groups = {Categories.Descoped}, description = "Verify practice questions contains relevant to the chapter and Topics selected")
    public void VerifyPracticeQuestionsContainsRelevantToTheChapterAndTopicsSelected() {
        logger.info("Verify User Able To See The Chapters And Relevant Topic Name Appears");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.verifypracticequestionscontainsrelevanttothechapterandtopicsselected();
    }

    /*@Test(priority = 11, groups = {Categories.Descoped}, description = "Verify User Can Navigate To Chapters And Topics By Clicking On Navigation Buttons")
    public void VerifyUserCanNavigateToChaptersAndTopicsByClickingOnNavigationButtons() {
        logger.info("Verify User Able To See The Chapters And Relevant Topic Name Appears");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnPracticeTab();
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.Verifyonclickondownbuttonthenextchaptergetshighlighted();
        bookPage.verifyAlltheelementsonTopic();
        //   bookPage.Verifyonclickonleftbuttonwhenontopicthefirstchaptergetshighlighted();
        driver().navigate().back();
        driver().navigate().back();
        bookPage.VerifyClickinonanychapterthetopicsrelatedtoitaredisplayed();
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        driver().navigate().back();
        bookPage.clickOnChapterName(1);
        logger.info("click On ChapterName");

    }*/

    @Test(priority = 12, groups = {Categories.PracticeREGRESSION, Categories.SMOKE, Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify thumbnail is appearing for all the book tiles ")
    public void VerifyThumbnailIsAppearingForAllTheBookTiles
            () {
        logger.info("Verify User is able to see Practice Thumbnail in Topics Section");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnPracticeTab();
        logger.info("Click on PracticeTab");
        bookPage.VerifyThumbnailIsAppearingForAllTheBookTiles();

    }

    @Test(priority = 13, groups = {Categories.REGRESSION, Categories.PracticeREGRESSION, Categories.BETAREGRESSION}, description = "Verify practice questions contains relevant to the chapter and Topics selected")
    public void VerifyClickingOnAnyTopicTheConceptsRelatedToItAreDisplayed() {
        logger.info("VerifyClickingOnAnyTopicTheConceptsRelatedToItAreDisplayed");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.VerifyClickingOnAnyTopicTheConceptsRelatedToItAreDisplayed();

    }

    @Test(priority = 14, groups = {Categories.PracticeREGRESSION, Categories.BETAREGRESSION}, description = "Verify Clicking on ok on any concept video the video gets played")
    public void VerifyClickingOnOkOnAnyConceptVideoTheVideoGetsPlayed() {
        logger.info("VerifyUserCanPlayEnrichYourLearningVideosInBooksTopic");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(0);
        bookPage.ClickOnTopic(0);
        logger.info("ClickOnTopic");
        bookPage.VerifyClickingOnOkOnAnyConceptVideoTheVideoGetsPlayed();
        logger.info("Verify Subject Tag is displayed on Embibe Explainers videos in Book");
        logger.info("Verify Embibe logo is displayed on Embibe Explainers videos in Book");
        logger.info("Verify video library image displayed on Embibe Explainers videos in Book");



    }

    @Test(priority = 15, groups = {Categories.PracticeREGRESSION, Categories.BETAREGRESSION}, description = "Verify user can play, pause, rewind and forward the video or coobo")
    public void VerifyUserCanPlayPausevideoOrcoobo() {
        logger.info("VerifyUserCanPlayPausevideoOrcoobo");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(0);
        bookPage.ClickOnTopic(0);
        logger.info("ClickOnTopic");
        bookPage.VerifyClickingOnOkOnAnyConceptVideoTheVideoGetsPlayed();
        bookPage.clickonpausebutton();

    }

   /* @Test(dataProvider = "GoalAndExam", priority = 16, groups = {Categories.Descoped}, description = "Verify the coobos or videos as the title, description, importance level, time and embium points details")
    public void VerifyTheCoobosOrVideosAsTheTitleDescriptionImportanceLevelTimeAndEmbium(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        // loginPage.clickOnStartLearningButton();
        logger.info("clickOnStartLearningButton");
        String emailID = signUpPage.generateRandomEmailID();
        //testEmailId = emailID;
        logger.info("email id for signup " + emailID);
        signUpPage.enterEmailOrMobileNumber(emailID);
        logger.info("enterEmailOrMobileNumber");
        signUpPage.clickOnContinueButton();
        OTPAPI otpapi = new OTPAPI();
        String otp = otpapi.getOTP(emailID);
        logger.info("OTP " + otp);
        otpPage.setOTP(otp);
        logger.info("enter OTP");
        otpPage.clickOnProceedButton();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboradingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(GoalName);
        logger.info("selectGoal " + GoalName);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(ExamName);
        logger.info("selectExam " + ExamName);
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        loginPage.clickOnAddProfile(0);
        homePage.verifyClickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnBook(1);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.verifyAlltheelementsonTopic();
        logger.info("Verify the Topics Widget is displayed in 1-2 Sections on clicking on any of Chapter");




    }*/



}