package regression.userHome;

import api.ConnectedProfile;
import api.LoginAPI;
import api.ResetTest;
import api.SignUpAPI;

import constant.Exam;
import constant.Goal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;


public class TestTakenByMe_TestCases extends TestBase {
    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    SignUpAPI signUpAPI = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test(dataProvider= "selectChild",priority = 1,groups = {Categories.BETA_SANITY,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION,Categories.UserHomeREGRESSION}, description = "Verify IF User Can See The List Of Test Taken By Them In UserHome In Test I have Taken Section")
    public void VerifyIFUserCanSeeTheListOfTestTakenByThemInUserHomeInTestIHaveTakenSection(String Child) {
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
        loginPage.clickOnProfile(1);
        logger.info("clickOnProfile");
        homePage.clickOnHomeTab();

        loginPage.clickOnHeroBannerAvatar();
        loginPage.selectAProfile(1);
        homePage.clickOnTestTab();

        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken(Child ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        //code
        testPage.clickOnTakeTestButton();
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");

       /* takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");
        takeTestPage.clickOnQuestionNumber(20);
        logger.info("clickOnQuestionNumber");
        takeTestPage.switchToWebView();
        logger.info("switchToWebView");
        takeTestPage.multipleOptions();
        logger.info("multipleOptions");
        takeTestPage.switchToNativeApp();
        logger.info("switchToNativeApp");*/

        takeTestPage.clickOnSaveAndNext();
        logger.info("clickOnSaveAndNext");
        takeTestPage.clickOnSubmitButton();
        logger.info("clickOnSubmitButton");

        takeTestPage.clickOnSubmitTestButton();
        logger.info("clickOnSubmitTestButton");
        takeTestPage.clickOnContinueToTestFeedback();
        logger.info("clickOnContinueToTestFeedback");
       // viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        takeTestPage.clickOnBackArrow();
        logger.info("clickOnBackArrow");
      /*  driver().navigate().back();
        driver().navigate().back();*/
        homePage.clickOnHomeTab();
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.VerifyIfTestTakenIsReflectingInUserHomeAfterTakingAnyTest();
        logger.info("VerifyIfTestTakenIsReflectingInUserHomeAfterTakingAnyTest");
        resetTest.resetTest("mb130708",childEmbibeToken);

    }
    @Test(dataProvider= "selectChild",priority = 2,groups = {Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION,Categories.UserHomeREGRESSION}, description = "verify that subject holder and tag is displayed for test which is displaying in Test I have taken carosaul")
    public void verifyThatSubjectHolderAndTagIsDisplayedForTestWhichIsDisplayingInTestIHaveTakenSection(String Child) {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
         homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.VerifyIfTestTakenIsReflectingInUserHomeAfterTakingAnyTest();
        logger.info("VerifyIfTestTakenIsReflectingInUserHomeAfterTakingAnyTest");

        //Verify  completed status is shown for already attempted test tile
        userHomePage.verifyCompletedStatus();
        logger.info("verifyHomePageIsTheDefaultPage");

        //verifySubjectHolderAndTagInTestTile
        userHomePage.verifySubjectHolderAndTagInTestTile();
        logger.info("ClickOnTestTakenTileFromUserHome");

        //verify if user can view test detail by clicking on test tile which is displaying in Test I have taken
        userHomePage.ClickOnTestTakenTileFromUserHome();
        logger.info("ClickOnTestTakenTileFromUserHome");

        //verify the test name is displayed in tile which is displaying in Test I have taken
        userHomePage.verifyTestNameForTakenTest();
        logger.info("verifyTestNameForTakenTest");

        //verify on navigating back from test detail, user land to the user home screen back.
        driver().navigate().back();
        homePage.verifyNavigationToUserHomePage();
        logger.info("verifyHomePageIsTheDefaultPage");


    }
        @Test(priority = 0,groups = { Categories.Descoped}, description = "Verify If User Can Navigate To View test taken Detail, Verify All The Elements")
    public void VerifyIfUserCanNavigateToViewTestTakenDetailsVerifyAllTheElements() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
       /* userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
    */    loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        //code
        testPage.clickOnTakeTestButton();
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");

       /* takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");
        takeTestPage.clickOnQuestionNumber(20);
        logger.info("clickOnQuestionNumber");
        takeTestPage.switchToWebView();
        logger.info("switchToWebView");
        takeTestPage.multipleOptions();
        logger.info("multipleOptions");
        takeTestPage.switchToNativeApp();
        logger.info("switchToNativeApp");*/

        takeTestPage.clickOnSaveAndNext();
        logger.info("clickOnSaveAndNext");
        takeTestPage.clickOnSubmitButton();
        logger.info("clickOnSubmitButton");

        takeTestPage.clickOnSubmitTestButton();
        logger.info("clickOnSubmitTestButton");
        takeTestPage.clickOnContinueToTestFeedback();
        logger.info("clickOnContinueToTestFeedback");
        // driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
       /* takeTestPage.clickOnBackArrow();
        logger.info("clickOnBackArrow");*/
        driver().navigate().back();
        driver().navigate().back();
        logger.info("nav back");
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.clickOnMoreItemCardView_test();
        logger.info("clickOnMoreItemCardView_test");
        userHomePage.verifyElementsOfTestTakenDetails();
        logger.info("verifyElementsOfTestTakenDetails");
        resetTest.resetTest("mb130708",childEmbibeToken);

    }

    @Test(priority = 2,groups = {Categories.Descoped}, description = "Verify If User Can View a Specific test taken From User Home")
    public void VerifyIfUserCanViewASpecificTestTakenFromUserHome() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
        userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        //code
        testPage.clickOnTakeTestButton();
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");

       /* takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");
        takeTestPage.clickOnQuestionNumber(20);
        logger.info("clickOnQuestionNumber");
        takeTestPage.switchToWebView();
        logger.info("switchToWebView");
        takeTestPage.multipleOptions();
        logger.info("multipleOptions");
        takeTestPage.switchToNativeApp();
        logger.info("switchToNativeApp");*/

        takeTestPage.clickOnSaveAndNext();
        logger.info("clickOnSaveAndNext");
        takeTestPage.clickOnSubmitButton();
        logger.info("clickOnSubmitButton");

        takeTestPage.clickOnSubmitTestButton();
        logger.info("clickOnSubmitTestButton");
        takeTestPage.clickOnContinueToTestFeedback();
        logger.info("clickOnContinueToTestFeedback");
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
       /* takeTestPage.clickOnBackArrow();
        logger.info("clickOnBackArrow");*/
        driver().navigate().back();
        driver().navigate().back();
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.viewTestTakenFromUserHome();
        logger.info("viewTestTakenFromUserHome");

        //Verify that user is able to view test feedback of test from Test Taken In userhome
        userHomePage.ClickOnTestTakenTileFromUserHome();
        logger.info("ClickOnTestTakenTileFromUserHome");

        //Verify that clicking on a Test tile takes the user to the Test Summary Page
        testSummaryPage.verifyClickingOnATestTileTakesUserToTheTestSummaryPage();
        logger.info("verifyClickingOnATestTileTakesUserToTheTestSummaryPage");
        resetTest.resetTest("mb130708",childEmbibeToken);

    }
    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }
    @DataProvider(name = "selectChild")
    public Object[][] changeGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("ChildName", userDir + "/ChangeGoal.xlsx");
        return data;
    }

}
