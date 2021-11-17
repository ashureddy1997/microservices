package regression.Test;

import api.ConnectedProfile;
import api.LoginAPI;
import api.ResetTest;
import api.SignUpAPI;
import constant.Exam;
import constant.Goal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class TakeTest_TestCases extends TestBase {
    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test( priority =1,dataProvider= "selectChild",  groups = {Categories.BETA_SANITY,Categories.UserHomeAndTestBeta, Categories.TestREGRESSION,Categories.BETAREGRESSION}, description = "verify If User Can start the test")
    public void verifyIfUserCanStartTest(String Child ) {
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
        //homePage.clickOnHomeTab();

        loginPage.clickOnHeroBannerAvatar();
        loginPage.selectAProfile(1);
        homePage.clickOnTestTab();

        //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken(Child ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        testPage.clickOnTakeTestButton();
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");

        resetTest.resetTest("mb130708",childEmbibeToken);


    }

    @Test(dataProvider= "selectChild",     groups = {Categories.TestREGRESSION, Categories.UserHomeAndTestBeta, Categories.BETAREGRESSION,}, description = "Verify All The Elements On Test Paper Screen ")
    public void VerifyAllTheElementsOnTestPaperScreen( String Child) {
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
        //homePage.clickOnHomeTab();

        loginPage.clickOnHeroBannerAvatar();
        loginPage.selectAProfile(1);
        homePage.clickOnTestTab();


        //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken(Child ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        testPage.clickOnTakeTestButton();
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");

        takeTestPage.verifyAllTheElementsOnTestScreen();
        logger.info("verifyAllTheElementsOnTestScreen");

        //Verify user can mark the question for review by clicking on Mark for Review button
        takeTestPage.clickOnMarkForReviewCheckbox();
        logger.info("clickOnMarkForReviewCheckbox and verify");
        String markedforReview = takeTestPage.verifyQuestionHasMarkedForReview();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(markedforReview, "Marked For Review", "Question is not marked");
        softAssert.assertAll();

        //Verify on click on Previous button user is directed to previous question
        takeTestPage.clickOnPreviousButton();
        logger.info("clickOnPreviousButton");

        resetTest.resetTest("mb130708",childEmbibeToken);

    }


    @Test(  priority = 3,groups = { Categories.Descoped}, description = "Verify If User Can Attempt Few Questions From Test and submit")
    public void VerifyIfUserCanAttemptFewQuestionsFromTestAndSubmit()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("verifyElementsOnHeroBanner");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
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

        //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        testPage.clickOnTakeTestButton();
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");

       /* takeTestPage.switchToWebView();
        logger.info("switchToWebView");
        takeTestPage.fillInTheBlank("test");
        logger.info("fillInTheBlank");
        takeTestPage.switchToNativeApp();
        logger.info("switchToNativeApp");
        takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");
        takeTestPage.clickOnQuestionNumber(2);
        logger.info("clickOnQuestionNumber");
        takeTestPage.switchToWebView();
        logger.info("switchToWebView");
        takeTestPage.multipleOptions();
        logger.info("multipleOptions");
        takeTestPage.switchToNativeApp();
        logger.info("switchToNativeApp");*/
        takeTestPage.clickOnSaveAndNext();

        takeTestPage.clickOnSaveAndNext();
        logger.info("clickOnSaveAndNext");
        takeTestPage.clickOnSubmitButton();
        logger.info("clickOnSubmitButton");
        takeTestPage.clickOnSubmitTestButton();
        logger.info("clickOnSubmitTestButton");

        resetTest.resetTest("mb130708",childEmbibeToken);


    }
    @Test( dataProvider= "selectChild", groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta, Categories.TestREGRESSION}, description = "Verify that the user is able to submit test without attempting any question")
    public void verifyThatTheUserIsAbleToSubmitTestWithoutAttemptingAnyQuestionAndContinueToViewFeedback(String Child) {
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
        //homePage.clickOnHomeTab();

        loginPage.clickOnHeroBannerAvatar();
        loginPage.selectAProfile(1);
        homePage.clickOnTestTab();


        //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken(Child ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        testPage.clickOnTakeTestButton();
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");

        takeTestPage.clickOnSaveAndNext();
        logger.info("clickOnSaveAndNext");
        takeTestPage.clickOnSubmitButton();
        logger.info("clickOnSubmitButton");
        takeTestPage.clickOnSubmitTestButton();
        logger.info("clickOnSubmitTestButton");
        takeTestPage.clickOnContinueToTestFeedback();
        logger.info("clickOnContinueToTestFeedback");

        resetTest.resetTest("mb130708",childEmbibeToken);

    }

    @Test(dataProvider= "selectChild" , groups = {Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION,}, description = "Verify If User Can Click On Continue Test And Resume The Test ")
    public void VerifyIfUserCanClickOnContinueTestAndResumeTheTest(
            String Child) {
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
        //homePage.clickOnHomeTab();

        loginPage.clickOnHeroBannerAvatar();
        loginPage.selectAProfile(1);
        homePage.clickOnTestTab();


        //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken(Child ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        testPage.clickOnTakeTestButton();
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");

       /* takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");
        takeTestPage.clickOnQuestionNumber(2);
        logger.info("clickOnQuestionNumber");
        takeTestPage.switchToWebView();
        logger.info("switchToWebView");
        takeTestPage.multipleOptions();
        logger.info("multipleOptions");
        takeTestPage.switchToNativeApp();
        logger.info("switchToNativeApp");*/
        takeTestPage.clickOnSaveAndNext();

        takeTestPage.clickOnSaveAndNext();
        logger.info("clickOnSaveAndNext");
        takeTestPage.clickOnSubmitButton();
        logger.info("clickOnSubmitButton");

        //VerifyAllTheElementsOnTestSubmitConfirmationScreen
        takeTestPage.verifyElementsOfTestSubmitConfirmation();
        logger.info("verifyElementsOfTestSubmitConfirmationScreen");

        //VerifyIfUserCanClickOnContinueTestAndResumeTheTest
        takeTestPage.clickOnContinueTest();
        logger.info("clickOnContinueTest");

         resetTest.resetTest("mb130708",childEmbibeToken);


    }
    @Test(priority =2,groups = {Categories.BETAREGRESSION,Categories.TestREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify continue learning carousel list all the tests which are not completed or submitted")
    public void verifyContinueTestCarouselListAllTheTestsWhichAreNotCompletedOrSubmitted() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("selectChapters");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testSummaryPage.clickOnCreateYourOwnTestButton();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(1);
        logger.info("selectASubject 2");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.selectChapters(2);
        testPage.clickOnQuickTestButton();
        logger.info("clickOnQuickTestButton");
        testPage.verifyTestCreatingProgress();
        logger.info("verifyTestCreatingProgress");
        testSummaryPage.verifyCustomTestName();
        logger.info("verifyCustomTestName");
        //Verify If User Can take test create by them
        testSummaryPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");

        //verify if user can start quick test
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");
        driver().launchApp();
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("selectChapters");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");

        logger.info("clickOnTestTab");
        testPage.getContinueLearningCarousel();
        logger.info("getContinueLearningCarousel");
        testPage.getContinueLearningCarouselTile();
        logger.info("getContinueLearningCarouselTile");
    }


    @Test(dataProvider= "selectChild",  groups = {Categories.UserHomeAndTestBeta, Categories.TestREGRESSION,Categories.BETAREGRESSION}, description = "Verify If Count Of Question Answered Is Correct In Submit Confirmation Screen ")
    public void VerifyIfCountOfQuestionAnsweredIsCorrectInSubmitConfirmationScreen(
            String Child) {

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
        //homePage.clickOnHomeTab();

        loginPage.clickOnHeroBannerAvatar();
        loginPage.selectAProfile(1);
        homePage.clickOnTestTab();


        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken(Child ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        testPage.clickOnTakeTestButton();
        logger.info("clickOnTakeTestButton");
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");
        takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");

        int totalQuestions = testPaperSummaryPage.getTotalQuestionCount();
        logger.info("verifying TotalQuestionCount");
        takeTestPage.clickOnQuestionNumber(2);
        //  testPaperSummaryPage.clickOnBack();
      /*  takeTestPage.switchToWebView();
        logger.info("switchToWebView");

        takeTestPage.multipleOptions();
        logger.info("multipleOptions");
        takeTestPage.switchToNativeApp();
        logger.info("switchToNativeApp");*/

        takeTestPage.clickOnSaveAndNext();
        logger.info("clickOnSaveAndNext");
        takeTestPage.clickOnSubmitButton();
        logger.info("clickOnSubmitButton");

        int totalAnswered = takeTestPage.verifyCountOfQuestionsAnswered();
        logger.info("verifyCountOfQuestionsAnswered");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(totalAnswered, 0, "Total answer count not matched expected :0, actual " + totalAnswered);
        int notAnswered = takeTestPage.verifyCountOfQuestionsNotAnswered();
        logger.info("verifyCountOfQuestionsNotAnswered");

        softAssert.assertEquals(notAnswered, 3, "Total Not Answered questions count not matched, expected : , actual " + notAnswered);
        int notVisited = takeTestPage.verifyCountOfQuestionsNotVisited();
        logger.info("verifyCountOfQuestionsNotVisited");

        softAssert.assertEquals(notVisited, totalQuestions-2, "Total not visited count not matched, expected: , actual" + notVisited);
        int markedForReview = takeTestPage.verifyCountOfMarkedForReview();
        logger.info("verifyCountOfMarkedForReview");

        softAssert.assertEquals(markedForReview, 0, "Total marked for review count not matched, expected :0, actual" + markedForReview);
        int answeredAndMarkedForReview = takeTestPage.verifyCountOfAnsweredAndMarkedForReview();
        logger.info("verifyCountOfAnsweredAndMarkedForReview");

        softAssert.assertEquals(answeredAndMarkedForReview, 0, "Total answered and marked for review count not matched, expected :0, actual" + answeredAndMarkedForReview);
        softAssert.assertEquals(totalAnswered + notAnswered + notVisited + markedForReview + answeredAndMarkedForReview, 90, "total question not matched, expected : 66 actual" + totalQuestions);
        softAssert.assertAll();
        logger.info("verifying all counts are matching with total question count or not");

          resetTest.resetTest("mb130708",childEmbibeToken);


    }

    @Test(priority = 8,  groups = { Categories.Descoped}, description = "Verify user can take tests of Mathematics chapters by clicking on any test tile under take tests of mathematics chapters from CBSE class 12 test ")
    public void verifyUserCanTakeTestsOfMathematicsChaptersByClickingOnAnyTestTile( ) {

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
        logger.info("clickOnTestTab");
        testPage.clickOnTestTileOfMathematicsChapters();
        logger.info("clickOnTestTileOfMathematicsChapters");

       /* testPage.VerifyHeroBannerNameDisplay();
        logger.info("VerifyHeroBannerNameDisplay");

        //VerifyTheQuestionAnd4OptionsAreAppearingInTheQuestionPage
        testSummaryPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");
        takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");

        takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");
        takeTestPage.clickOnQuestionNumber(6);
        logger.info("clickOnQuestionNumber");
        takeTestPage.switchToWebView();
        logger.info("switchToWebView");


        testPage.VerifyQuestionAndFourOptionsAreAppearing();
        logger.info("VerifyQuestionAndFourOptionsAreAppearing");
*/

    }

    @Test(priority = 9, groups = {Categories.Descoped}, description = "Verify user can take chapter tests by clicking on any tile under Take chapter test")
    public void verifyUserCanTakeChapterTestsByClickingOnAnyTileUnderTakeChapterTest() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnTakeChapterTestTile();
        logger.info("clickOnTakeChapterTestTile");
        testPage.VerifyHeroBannerNameDisplay();
        logger.info("VerifyHeroBannerNameDisplay");
        testSummaryPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");    }

    @Test( priority = 10, groups = {Categories.Descoped}, description = "Verify user can take tests of Physics chapters by clicking on any test tile under take tests of Physics chapters from CBSE class 12 test ")
    public void verifyUserCanTakeTestsOfPhysicsChaptersByClickingOnAnyTestTile( ) {
            logger.info("launch the app");
            logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
            logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
            loginPage.navigationToSignInScreen();
            logger.info("Click on SignInButton");
            loginPage.clickOnSignInWithPassword();
            loginPage.loginAs(Properties.username, Properties.password);
            loginPage.waitForTitle_WhoLearning();
            logger.info("waitForTitle_WhoLearning");
            loginPage.clickOnProfile(0);
            logger.info("clickOnProfile");
            homePage.clickOnTestTab();
            logger.info("clickOnTestTab");
            testPage.clickOnTestTilePhysicsChapters();
        logger.info("clickOnTestTilePhysicsChapters");

        testPage.VerifyHeroBannerNameDisplay();
        logger.info("VerifyHeroBannerNameDisplay");

        //VerifyTheTestTimingStartSasSoonAsTheTestIsStarted
        testPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");
        /*takeTestPage.clickOnCheckBox();
        logger.info("clickOnCheckBox");
        takeTestPage.clickOnStartNowButton();
        logger.info("clickOnStartNowButton");
        takeTestPage.getTimer();
        logger.info("verifyTimerDisplayed");*/
    }
    @Test(priority = 11,  groups = { Categories.Descoped}, description = "Verify user can take tests of Chemistry chapters by clicking on any test tile under take tests of Chemistry chapters from CBSE class 12 test ")
    public void VerifyUserCanTakeTestsOfChemistryChaptersByClickingOnAnyTestTile() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnTestTileChemistryChapters();
        logger.info("clickOnTestTileChemistryChapters");
        testPage.VerifyHeroBannerNameDisplay();
        logger.info("VerifyHeroBannerNameDisplay");
        testPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");


    }
    @Test( priority = 12,  groups = {Categories.Descoped, }, description = "Verify user can take tests of Biology chapters by clicking on any test tile under take tests of Biology chapters from CBSE class 12 test ")
    public void verifyUserCanTakeTestsOfBiologyChaptersByClickingOnAnyTestTile() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        //goalPage.selectGoal(Goal.Delhi_Board);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.Eleventh_GRADE);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");

        testPage.clickOnTestTileOfBiologyChapters();
        logger.info("clickOnTestTileOfBiologyChapters");
        testPage.VerifyHeroBannerNameDisplay();
        logger.info("VerifyHeroBannerNameDisplay");
        testPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");
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