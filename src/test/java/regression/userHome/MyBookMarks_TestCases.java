package regression.userHome;

import api.SignUpAPI;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class MyBookMarks_TestCases extends TestBase {

    SignUpAPI signUpAPI=null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test( groups = {Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify ALL The Elements Of My Book Mark Section")
    public void verifyALLTheElementsOfMyBookMarkSection() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username, Properties.password);
        logger.info("loginAs username and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnHomeTab();
        myBookMarksPage.verifyElementsOfMyBookMarkSection();
        logger.info("verifyElementsOfMyBookMarkSection");
    }

    @Test( groups = {Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify All The Elements Of Book Marks Details Screen")
    public void verifyAllTheElementsOfBookMarksDetailsScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username, Properties.password);
        logger.info("loginAs username and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnHomeTab();
        myBookMarksPage.clickOnBookMarkVideoCard();
        logger.info("clickOnBookMarkVideoCard");
        myBookMarksPage.verifyElementsOfMyBookMarksDetailsScreen();
        logger.info("verifyElementsOfMyBookMarksDetailsScreen");
    }
    @Test(groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify If Book Mark list get updated when user book mark any videos")
    public void VerifyIfBookMarkListGetUpdatedWhenUserBookMarkAnyVideos()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username, Properties.password);
        logger.info("loginAs username and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnLearnTab();
        logger.info("clickOnLearnTab");
        learnPage.clickOnVideo();
        logger.info("clickOnVideo");
        learnPage.VerifyUserCanBookMarkTheVideoByClickingOnBookMarkButton();
        logger.info("VerifyUserCanBookMarkTheVideoByClickingOnBookMarkButton");
        driver().navigate().back();

//        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        myBookMarksPage.clickOnBookMarkVideoCard();
        logger.info("clickOnBookMarkVideoCard");
        myBookMarksPage.verifyBookMarkLstIsGetUpdated();
        logger.info("verifyBookMarkLstIsGetUpdated");

        //Verify that clicking on Videos tile takes user to My Bookmarks Page showing a list of videos
        myBookMarksPage.verifyAllBookmarkedVideosDisplaying();
        logger.info("verifyAllBookmarkedVideosDisplaying");

        //openBookMarkedVideoFromList
        myBookMarksPage.openBookMarkedVideo();
        logger.info("openBookMarkedVideo");

        //Verify if user can remove bookmarked videos from my bookmarks list
        myBookMarksPage.UnBookMarkVideo();
        logger.info("UnBookMarkVideo");


    }
    @Test(groups = {Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify Hero Banner Contents Changes When User Switch From Videos Tab To Questions Tab")
    public void VerifyHeroBannerContentsChangesWhenUserSwitchFromVideosTabToQuestionsTab() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username, Properties.password);
        logger.info("loginAs username and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnHomeTab();
        myBookMarksPage.clickOnBookMarkVideoCard();
        logger.info("clickOnBookMarkVideoCard");
        myBookMarksPage.clickOnQuestionsTab();
        logger.info("clickOnQuestionsTab");
        myBookMarksPage.verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfQuestionsTab();
        logger.info("verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfQuestionsTab");

        try {
            //Verify that user see the message in my bookmarks videos screen when there are no bookmarked videos available
            myBookMarksPage.verifyMessageInMyBookmarksVideosScreenWhenThereAreNoBookmarkedVideosAvailable();
            logger.info("verifyMessageInMyBookmarksVideosScreenWhenThereAreNoBookmarkedVideosAvailable");
        }catch (Exception e){
            myBookMarksPage.verifyScreenHeader();
            logger.info("verifyScreenHeader");
            myBookMarksPage.verifyBookmarkedQuestionsDisplayed();
            logger.info("verify questions displayed");
        }

    }
    @Test(groups = {Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,}, description = "Verify Hero Banner Contents Changes When User Switch From Questions Tab Videos Tab")
    public void VerifyHeroBannerContentsChangesWhenUserSwitchFromQuestionsTabToVideosTab() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username, Properties.password);
        logger.info("loginAs username and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnHomeTab();
        myBookMarksPage.clickOnBookMarkVideoCard();
        logger.info("clickOnBookMarkVideoCard");
        myBookMarksPage.clickOnQuestionsTab();
        logger.info("clickOnQuestionsTab");
        myBookMarksPage.clickOnVideosTab();
        logger.info("clickOnVideosTab");
        myBookMarksPage.verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfVideoTab();
        logger.info("verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfVideoTab");
        try {
            //Verify that user see the message in my bookmarks Question screen when there are no bookmarked Questions available
            myBookMarksPage.verifyMessageInMyBookmarksQuestionsScreenWhenThereAreNoBookmarkedQuestionsAvailable();
            logger.info("verifyMessageInMyBookmarksQuestionsScreenWhenThereAreNoBookmarkedQuestionsAvailable");
        }catch (Exception e){
            myBookMarksPage.verifyScreenHeader();
            logger.info("verifyScreenHeader");
            myBookMarksPage.verifyBookmarkedVideosDisplayed();
            logger.info("verifyBookmarkedVideosDisplayed");

        }
    }

    @Test( groups = {Categories.Descoped}, description = "Verify that clicking on Questions tile takes user to My Bookmarks Page showing a list of Questions")
    public void VerifyThatClickingOnQuestionsTileTakesUserToMyBookmarksPageShowingAListOfQuestions() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username, Properties.password);
        logger.info("loginAs username and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnPracticeTab();
        logger.info("clickOnPracticeTab");
        homePage.clickOnPracticeChapter();
        logger.info("clickOnPracticeChapter");
        practicePage.clickOnStatrtPracticeButton();
        logger.info("clickOnStatrtPracticeButton");
        practicePage.switchToWebView();
        logger.info("switchToWebView");
        practicePage.BookMarkedQuestions();
        logger.info("BookMarkedQuestions");
        practicePage.switchToNativeApp();
        logger.info("switchToNativeApp");
        practicePage.clickOnCheckButton();
        logger.info("clickOnCheckButton");
        practicePage.clickOnEndSessionButton();
        logger.info("clickOnEndSessionButton");
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");

        myBookMarksPage.clickOnBookMarkQuestionsCard();
        logger.info("clickOnBookMarkQuestionsCard");

        //Verify If User Can practice bookmarked questions by clicking on practiceAll Button
        myBookMarksPage.clickOnPracticeAll();
        logger.info("clickOnPracticeAll");
        driver().navigate().back();
        logger.info("nave back");
        //Verify All The Elements Of Quit Practice screen
        myBookMarksPage.VerifyAllTheElementsOfQuitPracticeScreen();
        logger.info("VerifyAllTheElementsOfQuitPracticeScreen");

        //Verify If User Can resume practicing
        myBookMarksPage.clickOnContinueLearningButton();
        logger.info("clickOnContinueLearningButton");
        driver().navigate().back();
        logger.info("nav back");

        //Verify If User Can Quit from continue practicing
        myBookMarksPage.clickOnQuitButton();
        logger.info("clickOnQuitButton");
    }
    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}
