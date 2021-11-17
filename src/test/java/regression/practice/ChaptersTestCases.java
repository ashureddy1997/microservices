package regression.practice;

import api.SignUpAPI;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class ChaptersTestCases extends TestBase {
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");
    SignUpAPI signUpAPI = null;

    @Test(priority = 1, groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify if the user is able to click Practice Chapters and navigate to next page ")
    public void verifyUserAbleToClickAnyPracticeChapters() {
        logger.info("verifyUserAbleToClickAnyPracticeChapters");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(1) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");


    }

    @Test(priority = 2, groups = {Categories.REGRESSION, Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify All the elements On HeroBanner Of ChapterScreen \n")
    public void VerifyAllTheElementsOnHeroBannerInPracticeSummeryPage() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(1) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyHeroBannerDisplay();
        logger.info("VerifyHeroBannerDisplay");
        practicePage.verifyHeroBannerDescriptionDisplay();
        logger.info("verifyHeroBannerDescriptionDisplay");
        practicePage.verifyHeroBannerSubjectNameDisplay();
        logger.info("verifyHeroBannerSubjectNameDisplay");
    }

   /* @Test(priority = 3, groups = {Categories.Descoped}, description = "Verify user can Bookmark the chapter by clicking on bookmark button \n")
    public void VerifyUserCanBookmarkTheChapter() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(1) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyUserCanBookMarkTheChapterByClickingOnBookMarkButton();
    }*/

    /*@Test(priority = 4, groups = {Categories.Descoped}, description = "Verify user can UnBookmark the chapter by clicking on bookmark button \n")
    public void VerifyUserCanUnBookmarkTheChapter() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(1) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyUserCanUnBookMarkTheChapterByClickingOnBookMarkButton();
    }*/

   /* @Test(priority = 5, groups = {Categories.Descoped}, description = "Verify user can like the chapter by clicking on Like button\n \n")
    public void VerifyUserUanLikeTheChapter() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(1) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyUserCanLikeTheChapterByClickingOnLikeButton();
        logger.info("VerifyUserCanLikeTheChapterByClickingOnLikeButton");
        practicePage.VerifyUserCanUnLikeTheChapterByClickingOnLikeButton();
        logger.info("VerifyUserCanUnLikeTheChapterByClickingOnLikeButton");

    }

    @Test(priority = 6, groups = {Categories.Descoped}, description = "Verify user can Unlike the chapter by clicking on Like button\n \n")
    public void VerifyUserUnLikeTheChapter
            () {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(1) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyUserCanUnLikeTheChapterByClickingOnLikeButton();
    }
*/
  @Test(priority = 7, groups = { Categories.PracticeREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify all the element on practice summary screen\n")
    public void VerifyAllTheElementOnPracticeSummaryScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyAllTheElementsOnPracticeSummaryScreen();
    }

  /*  @Test(priority = 8, groups = {Categories.Descoped}, description = "Verify user can end Practice session\n")
    public void VerifyUserCanEndPracticeSession() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnEndSessionButton();
    }

    @Test(priority = 9, groups = {Categories.Descoped}, description = "Verify user can Select Any Answers In Practice session\n")
    public void VerifyUserCanSelectAnyAnswers() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
         practicePage.clickOnAnswer();
    }*/

    @Test(priority = 10, groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify user can Use Hint In Practice session\n")
    public void VerifyUserCanUseHint() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.VerifyUserCanUseHint();
    }


    @Test(priority = 11, groups = {Categories.PracticeREGRESSION,Categories.BETA_SANITY,Categories.BETAREGRESSION}, description = "Verify user can view Practice session summery\n")
    public void VerifyUserCanTakePracticeFromChapter() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(1) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnSessionSummery();
    }


   /* @Test(priority = 12, groups = {Categories.Descoped}, description = "Verify user can Check Answers In Practice session\n")
    public void VerifyUserCanCheckAnswers() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnAnswer();
        practicePage.clickOnCheckButton();
    }*/

    @Test(priority = 13, groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify user can Navigate to Check Progress Screen\n")
    public void VerifyUserCanNavigateToCheckProgress() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyUserCanNavigateCheckProgress();

    }

    @Test(priority = 14, groups = {Categories.BETA_SANITY,Categories.PracticeREGRESSION}, description = "Verify all the elements on Progress Details Screen\n")
    public void VerifyAllTheElementsOnProgressDetailsScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
       // homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyUserCanNavigateCheckProgress();
        logger.info("Navigate to Check Progress");
        practicePage.VerifyAllTheElementsOnProgressDetailsScreen();
    }
/*
    @Test(priority = 16, groups = {Categories.Descoped}, description = "Verify All the elements on Session Summery Screen\n")
    public void VerifyAllElementsOnSessionSummeryScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnSessionSummery();
        logger.info("Click on clickOnSessionSummery");
        practicePage.VerifyAllTheElementsOnSessionSummeryScreen();
    }

    @Test(priority = 17, groups = {Categories.Descoped}, description = "Verify that user is able to see \"Here is where you stand on  widget in Practice Summary Page")
    public void VerifyUserIsAbleToSeeHereIsWhereYouStandWidget() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyUserIsAbleToSeeHereIsWhereYouStandWidget();
    }

    @Test(priority = 18, groups = {Categories.Descoped}, description = "Verify All the elements on Practice Session  Screen\n")
    public void VerifyAllElementsOnPracticeSessionScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.VerifyAllTheElementsOnPracticeSessionScreen();
    }

    @Test(priority = 19, groups = { Categories.Descoped}, description = "Verify Hint Button is Working or Not Practice Session Screen\n")
    public void VerifyHintButtonOnPracticeSessionScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.VerifyHintButtonWorkingOnPracticeSessionScreen();
    }*/
/*
    @Test(priority = 20, groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify Solve With Us Button Displayed On Practice Session Screen\n")
    public void VerifySolveWithButtonDisplayedUsOnPracticeSessionScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.VerifySolveWithUsButtonOnPracticeSessionScreen();
    }

    @Test(priority = 21, groups = {Categories.Descoped}, description = "Verify Timer Is Displayed in Practice Session Screen\n")
    public void VerifyTimerDisplayInPracticeSessionScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.VerifyTimerDisplayOnPracticeSessionScreen();
    }


    @Test(priority = 22, groups = {Categories.Descoped}, description = "Verify User Can Navigate Back next to Session summery screen\n")
    public void VerifyUserNavigateBackToSessionSummeryScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnSessionSummery();
        logger.info("Click on clickOnSessionSummery");
        practicePage.clickOnBackButton();
    }

    @Test(priority = 23, groups = {Categories.Descoped}, description = "Verify User Can Navigate to Test Tab after clicking on Take Test Button\n")
    public void VerifyUserNavigateToTestTabClickingOnTakeTestButton() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        practicePage.verifyTakeTestButtonDisplay();
    }

    @Test(priority = 24,dataProvider= "GoalAndExam", groups = {Categories.Descoped}, description = "Verify user can see check button after answer the Question\n")
    public void VerifyUserCanSeeCheckButtonAfterAnswer(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        //  onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.inputValue();
        practicePage.VerifyCheckButtonAfterAnswer();

    }

    @Test(priority = 25,dataProvider= "GoalAndExam", groups = {Categories.Descoped}, description = "Verify User Can't Use Check Button Without Answer\n")
    public void VerifyUserCantUseCheckButtonWuthoutAnswer(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.navigationToSignInScreen();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.VerifyCheckButtonBeforeAnswer();
    }

    @Test(dataProvider= "GoalAndExam",priority = 26, groups = {Categories.Descoped}, description = "Verify User Can Continue Practice\n")
    public void VerifyUserCanContinuePractice(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        loginPage.navigationToSignInScreen();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnSolveWithUsButton();
        logger.info("Click on clickOnSolveWithUsButton");
        practicePage.clickOnFullSolutionButton();
        logger.info("Click on clickOnFullSolutionButton");
        practicePage.clickOnContinueButton();

    }

    @Test(dataProvider= "GoalAndExam",priority = 27, groups = {Categories.Descoped}, description = "Verify User Can End Practice For Any Questions\n")
    public void VerifyUserCanEndAnyPracticeforAnyQuestions(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.navigationToSignInScreen();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.switchToWebView();
        logger.info("switchToWebView");
        practicePage.clickOnEndSessionButton();
        logger.info("clickOnEndSessionButton");
        practicePage.switchToNativeApp();
    }

    @Test(dataProvider= "GoalAndExam",priority = 28, groups = {Categories.Descoped}, description = "Verify Solve With Us Button Displayed On Practice Session Screen\n")
    public void VerifySolveWithButtonClickableOrNot(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.VerifySolveWithUsButtonOnPracticeSessionScreen();
    }

    @Test(dataProvider= "GoalAndExam",priority = 29, groups = {Categories.Descoped}, description = "Verify Book Image On Practice Session Screen\n")
    public void VerifyBookImageOnPracticeSessionScreen(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        //  loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.verifyBookImageDisplay();
    }*/

    @Test(priority = 30, groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify User Can See Video after clicking on Recommended learning\n")
    public void VerifyUserCanSeeVideoAfterClickingOnRecommendedLearning() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyUserCanNavigateToRecommendedLearning();
    }

    @Test(priority = 31, groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify User can click on Topics for Practice")
    public void VerifyUserCanclickonTopicsForPractice() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.ClickOnPracticeChapter();

    }

    @Test(priority = 32, groups = {Categories.REGRESSION, Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify User Can Navigate To Tests On This chapter")
    public void VerifyUserCanNavigateTestsOnThisChapter() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyUserCanNavigateToTestOnThisChapter();

    }


  /*  @Test(dataProvider= "GoalAndExam",priority = 33, groups = {Categories.Descoped}, description = "Verify if user is able to click on solve with us after viewing the solution\n")
    public void VerifyIfuserIsAbleToClickOnSolveWithusAfterViewingTheSolution(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        //   onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();;
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnSolveWithUsButton();

    }

    @Test(dataProvider= "GoalAndExam",priority = 34, groups = {Categories.Descoped}, description = "Verify if user is able to reveal the step")
    public void VerifyIfUserIsAbleToRevealTheStep(String PrepareFor, String GoalName, String ExamName) throws InterruptedException {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnSolveWithUsButton();
        logger.info("clickOnSolveWithUsButton");
        practicePage.ClickOnReavealAnswer();

    }*/
/*

    @Test(dataProvider= "GoalAndExam",priority = 35, groups = {Categories.Descoped}, description = "Verify Clicking on Back Button , \"Are you sure you want to end your Practice Session!\" message is displayed to the User\n")
    public void WantToEndYourPracticeSessionMsgDisplay(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        //  loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        //  onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnEndSessionButton();
        logger.info("Click on Chapters");
        practicePage.VerifyEndPracticeSessionMsg();
    }
*/

 /*   @Test(dataProvider= "GoalAndExam",priority = 36, groups = {Categories.Descoped}, description = "Verify on click on Full solution button the explanation is displayed")
    public void VerifyOnClickOnFullsolutionButtonTheExplanationIsDisplaye(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        //  onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnSolveWithUsButton();
        logger.info("clickOnSolveWithUsButton");
        practicePage.clickOnFullSolutionButton();
        logger.info("clickOnFullSolutionButton");
        practicePage.VerifyExplanationDisplay();
    }

    @Test(dataProvider= "GoalAndExam",priority = 37, groups = {Categories.Descoped}, description = "Verify User Is Able To Continue The After The FullSolution")
    public void VerifyUserIsAbleToContinueTheTestAfterTheFullSolution(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnFullSolutionButton();
        logger.info("clickOnFullSolutionButton");
        practicePage.clickOnContinueButton();
    }


    @Test(dataProvider= "GoalAndExam",priority = 39,groups = {Categories.Descoped}, description = "Verify Bee image is displaying after clicking on Check button in practice session")
    public void VerifyBeeImageDisplayInPracticeSession(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.inputValue();
        practicePage.clickOnCheckButton();
        logger.info("clickOnCheckButton");
        practicePage.VerifyBeeImageDisplay();
    }


    @Test(dataProvider= "GoalAndExam",priority = 40,groups = {Categories.Descoped}, description = "Verify User can view only  related Practice Chapter based on selected Goals and Exams")
    public void VerifyChapterDisplayRelatedToGoalAndExam(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        //loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        practicePage.VerifyChapterDisplayRelatedToGoalAndExam();

    }

    @Test(dataProvider= "GoalAndExam",priority =41,groups = {Categories.Descoped}, description = "Verify User can view only  related Embibe Big Book based on selected Goals and Exams")
    public void VerifyEmbibeBookDisplayRelatedToGoalAndExam(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        //loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(GoalName);logger.info("selectGoal " + GoalName);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(ExamName);
        logger.info("selectExam " + ExamName);
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        loginPage.clickOnAddProfile(0);
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        // practicePage.VerifyEmbibeBookDisplayRelatedToGoalAndExam();
    }

    @Test(dataProvider= "GoalAndExam",priority = 42,groups = {Categories.Descoped}, description = "Verify User can view only  related Embibe Big Book based on selected Goals and Exams")
    public void VerifyBooksWithVediosDisplayRelatedToSubject(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        //loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(GoalName);logger.info("selectGoal " + GoalName);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(ExamName);
        logger.info("selectExam " + ExamName);
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        loginPage.clickOnAddProfile(0);
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
         practicePage.VerifyBooksWithVediosDisplayRelatedToSubject();
    }

    @Test(dataProvider= "GoalAndExam",priority = 43, groups = {Categories.Descoped}, description = "Verify All the Elements on Solution widget screen")
    public void VerifyAllTheElementsOnSolutionWidgetScreen(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        //  onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnSolveWithUsButton();
        logger.info("clickOnSolveWithUsButton");
        practicePage.clickOnFullSolutionButton();
        logger.info("clickOnFullSolutionButton");
        practicePage.VerifyAllTheElementsOnSolutionWidgetScreen();


    }

    @Test(dataProvider= "GoalAndExam",priority = 44, groups = {Categories.Descoped}, description = "Verify User is able to play the videos if present in Primary Concepts/Seconday Concepts in Solution Widget/Screen\n")
    public void VerifyIfUserIsAbleToPlayVedioInOnSolutionWidgetScreen(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        //  onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.clickOnStartPracticeButton();
        logger.info("Click on StartPracticeButton");
        practicePage.clickOnSolveWithUsButton();
        logger.info("clickOnSolveWithUsButton");
        practicePage.clickOnFullSolutionButton();
        logger.info("clickOnFullSolutionButton");
        practicePage.VerifyUserisabletoplaythevideosifpresentinPrimaryConcepts();
    }

    @Test(dataProvider= "GoalAndExam",priority = 45, groups = { Categories.Descoped}, description = "Verify on click on coobo/video in the learn intervention page the coobo/videos starts playing")
    public void VerifyUserCanPlayLearnIntervationPageVideo(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        logger.info("clickOnStartLearningButton");
        String emailID = signUpPage.generateRandomEmailID();
      //  testEmailId = emailID;
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
        onboardingPage.clickONPrepare(PrepareFor);logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
        // onboardingPage.clickOnNextButton();
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
        practicePage.VerifyYouDoNotHaveAnyBookmarkedQuestions();

    }
    @Test(priority = 46, groups = { Categories.Descoped}, description = "Verify User is able to play the videos if present in Primary Concepts/Seconday Concepts in Solution Widget/Screen\n")
    public void VerifyIfUserIsAbleToPlayVedioInOnSolutionWidgetSscreen() {
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
        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Excel_In_School);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
        //  onboardingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(Goal.CBSE);
        logger.info("selectGoal " + Goal.CBSE);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.SIXTH_CBSE);
        logger.info("selectExam " + Exam.SIXTH_CBSE);
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        loginPage.clickOnAddProfile(0);
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");

    }

    @Test(dataProvider= "GoalAndExam",priority = 47, groups = {Categories.Descoped}, description = "Verify \"You do not have any bookmarked questions \" message is displayed if no practice question is bookmarked.")
    public void YouDoNotHaveAnyBookmarkedVedio(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
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
        logger.info("clickOnAddProfile");
        homePage.clickOnHomeTab();
        practicePage.VerifyYouDoNotHaveAnyBookmarkedVideos();

    }
    @Test(priority = 48,groups = {Categories.Descoped}, description = "Verify Video Starts playing by clicking on Attempt Quality")
    public void VerifyVideoStartsPlayingByClickingOnAttemptQuality() {
        logger.info("verify Search Functionality Working");
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
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyVideoStartsPlayingByClickingOnAttemptQuality();

    }
*/
    /*  @Test(priority = 49,groups = {,Categories.PracticeREGRESSION}, description = "Verify Virtual Keypad is displayed on the screen on clicking on Answer field.")
      public void VerifyVirtualKeypadIsDisplayedOnTheScreenOnClickingOnAnswerField() {
          logger.info("verify Search Functionality Working");
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
          practicePage.clickOnPracticeNowButton();

      }
      @Test(priority = 50,groups = {Categories.PracticeREGRESSION}, description = "Verify Virtual Keypad is displayed on the screen on clicking on Answer field.")
      public void VerifyUserIsAbleToSeeFullSolutionButtonAfterAnswerFeedbackIsDisplayedToTheUser() {
          logger.info("launch the app");
          logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
          logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
          loginPage.navigationToSignInScreen();
          logger.info("Click on SignInButton");
          loginPage.clickOnSignInWithPassword();
          loginPage.loginAs(Properties.username, Properties.password);
          loginPage.waitForTitle_WhoLearning();
          homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
          homePage.verifyClickOnPracticeTab();
          homePage.clickOnChapters();
          practicePage.clickOnStartPracticeButton();
          practicePage.clickOnSolveWithUsButton();
          practicePage.verifyfullsolutiondisplay();
      }
  /*    @Test(priority = 51,groups = {,Categories.PracticeREGRESSION,Categories.SMOKE}, description = "Verify Video Starts playing by clicking on Attempt Quality")
      public void VerifyAllTheElementsOnAttemptQuality() {
          logger.info("verify Search Functionality Working");
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
          homePage.clickOnChapters();
          logger.info("Click on Chapters");
          practicePage.VerifyalltheelementsonAttemptquality();
      }
      @Test(priority = 52,groups = {,Categories.PracticeREGRESSION}, description = "Verify Video Starts playing by clicking on Attempt Quality")
      public void VerifyUserCanClickAllAttemptQualityJarsAndVerifyAllElementsOnJars() {
          logger.info("verify Search Functionality Working");
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
          homePage.clickOnChapters();
          practicePage.clickonAttemptqualityrecall();
          practicePage.verifyalltheelementsonattemptqualityjars();
          driver.navigate().back();
          practicePage.clickonAttemptqualityConceptualThinking();
          practicePage.verifyalltheelementsonattemptqualityjars();
          driver.navigate().back();
          practicePage.clickonAttemptqualityAnalyticalThinking();
          practicePage.verifyalltheelementsonattemptqualityjars();
          driver.navigate().back();
          practicePage.clickonAttemptqualitywastedattempt();
          practicePage.verifyalltheelementsonattemptqualityjars();

      }
  */
  /*  @Test(priority =53 ,groups = {Categories.Descoped}, description = "Verify \"Oops! There are no more questions to practice.Lets try some other Practice\" message is displayed once user has completed all the questions."+"Verify User is navigated back to Book TOC Page on Clicking on \"Go Back\" Button\n")
    public void VerifyUserIsAbleToSeeNoMoreQuestionsMsgAndNavigateBackToBookTOCPage(){
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
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.ClickOnPracticeChapter();
        practicePage.verifyNomorequestionsmsg();
        practicePage.clickOnGoBack();
    }
    @Test(priority =54 ,groups = {Categories.Descoped}, description = "Verify \"Oops! There are no more questions to practice.Lets try some other Practice\" message is displayed once user has completed all the questions."+"Verify User is navigated back to Book TOC Page on Clicking on \"Go Back\" Button\n")
    public void VerifyPracticeSubjectDisplayedMatchesWiththePracticeName
            () throws InterruptedException {
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
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.verifyPracticeSubjectDisplayedMatchesWiththePracticeName();


    }

    @Test(priority = 55, groups = {Categories.Descoped}, description = "Verify Practice Topic Thumbnail displays Question Count from 'n' Books\n")
    public void VerifyPracticeTopicThumbnailDisplaysQuestionCountFromBooks() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.ClickOnPracticeChapter();

    }*/
    @Test(priority = 56, groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify User is credited  \"200\" Embium once per user for the first Time only when lands in Practice landing page.\n")
    public void VerifyUserIsCredited100EmbiumonceperuserforthefirstTime() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        practicePage.VerifyHeroBannerEmbiums();

    }
    @Test(priority = 57, groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify each tile shows the subject tagged to it and the practice symbol")
    public void VerifyEachTileShowsTheSubjectTaggedToItAndThePracticeSymbol() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        practicePage.VerifyEachTileShowsTheSubjectTaggedToItAndThePracticeSymbol();


    }
    @Test(priority = 58, groups = {Categories.REGRESSION, Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify on click on any tile user is directed to the description page of that practice")
    public void VerifyOnClickOnAnyTileuserisDirectedToTheDescriptionPageOfThatPractice() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        practicePage.verifyHeroBannerDescriptionDisplay();

    }
    @Test(priority = 59, groups = {Categories.REGRESSION, Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "\n" + "Verify Embium Coins are displayed based on Individual Practice")
    public void VerifyEmbiumCoinsareDisplayedBasedOnIndividualPractice() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        practicePage.VerifyHeroBannerEmbiums();

    }
    @Test(priority = 60, groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify practice description page contains the Practice Topics link")
    public void VerifyPracticeDescriptionPageContainsThePracticeTopicslink() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyAllTheElementsOnTopicsForPractice();


    }
    @Test(priority = 61, groups = {Categories.PracticeREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify Chapter Title, Subject tag and Total number concepts in Practice SUmmary Page ")
    public void VerifyPracticeSummerySubjectTilteCoceptsDisplayed() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on Practice Tab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.verifyAllTheElementsOnHeroBannerdescriptionpageInPracticeSummery();
    }

  /*  @Test(priority = 62, groups = {Categories.Descoped}, description = "Verify thumbnail is appearing for all the tiles displayed")
    public void VerifyThumbnailIsAppearingForSubjectTile() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        practicePage.VerifyThumbnailIsAppearingForSubjectTile();

    }
    @Test(priority = 63,groups = {Categories.Descoped}, description = "Verify Video Starts playing by clicking on Attempt Quality")
    public void VerifyVideoStartsPlayingByClickingOnAttemptQualiy() {
        logger.info("verify Search Functionality Working");
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
        homePage.clickOnChapters();

    }*/
    @Test(priority = 64, groups = {Categories.PracticeREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "Thumbnail present for all chapters ")
    public void VerifyThumbnailAppearsOnAllChapters() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        practicePage.verifyThumbnailOnChapters();
    }
   /* @Test(priority = 65, groups = {Categories.PracticeREGRESSION,Categories.SMOKE}, description = "Verify Add banner with mute button ")
    public void VerifyAddBannerwithMuteButton() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        practicePage.VerifyAddBanner();

    }*/
    @Test(priority = 61, groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify User can Navigate to Points To Remember ")
    public void VerifyUserCanNavigateToPointsToRemember() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyAllTheElementsOnPoinysToRememberTile();
        logger.info("Verify All The Elements on Points to remember Tile in Practice summery page ");

    }
    @Test(priority = 61, groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify All The Elements on Points to Remember Page")
    public void VerifyAllTheElementsOnPointsToRememberPage() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeTab");
        homePage.clickOnChapters();
        logger.info("Click on Chapters");
        practicePage.VerifyAllTheElementsOnPointsToRememberPage();

    }
    @Test(dataProvider= "GoalAndExam",priority = 38,groups = { Categories.BETAREGRESSION,Categories.BETA_SANITY,Categories.PracticeREGRESSION}, description = "Verify User can change the subjects in Practice summery screen")
    public void VerifyUserCanChangeTheSubjectInPracticeSummery(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyClickOnPracticeTab();
        practicePage.clickOnSubject();

    }

    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }




}



