package regression.Test;

import constant.Exam;
import constant.Goal;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class CreateTest_TestCases extends TestBase {

    @Test(priority = 1,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verifyElementsMyCustomTestsSection")
    public void verifyElementsMyCustomTestsSection() {
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
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");

        //VerifyAllTheElementsOnCustomTest
        testPage.verifyElementsMyCustomTestsSection();
        logger.info("verifyElementsMyCustomTestsSection");

    }
    @Test(priority = 2,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION,Categories.SMOKE}, description = "verify Navigation To My Custom Tests")
    public void verifyNavigationToMyCustomTests() {
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
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");

    }
   @Test(priority = 3,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify All Elements in create your test screen")
    public void verifyIfAllTheElementOnCreateYourTestScreenAreAvailable() {
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
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.verifyAllElementsOnCreateYourOwnTestScreen();
        logger.info("verifyAllElementsOnCreateYourOwnTestScreen");
    }

    @Test(priority = 4,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify Navigation To subject")
    public void verifyNavigationToSelectSubjectPage() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
    }
    @Test(priority = 5,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify Navigation To step 2 select chapter")
    public void verifyNavigationToStepTwoSelectChapterOnClick() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("selectASubject");
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
    }
    @Test(priority = 6,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify all the element of select chapter screen")
    public void verifyAllTheElementsOnSelectChapter() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("selectASubject");
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.verifyElementsOnSelectChapterScreen();
        logger.info("verifyElementsOnSelectChapterScreen");
    }
    @Test(priority = 7,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify if user can expand subject tab")
    public void verifyWhetherTheUserIsAbleToExpandSubjects() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("selectASubject");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.verifyElementsOnSelectChapterScreen();
        logger.info("verifyElementsOnSelectChapterScreen");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject");
    }
    @Test(priority = 8,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify if user can see list of chapters available")
    public void verifyAllTheChaptersOfSelectedSubject() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.verifyElementsOnSelectChapterScreen();
        logger.info("verifyElementsOnSelectChapterScreen");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject");
        testPage.verifyAllTheChapters(0);
        logger.info("verifyAllTheChapters");
    }
    @Test(priority = 9,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify if user can select one or more chapters")
    public void verifyIfUserIsAbleToSelectChapters() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.verifyElementsOnSelectChapterScreen();
        logger.info("verifyElementsOnSelectChapterScreen");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject");
        testPage.selectChapters(0);
        logger.info("selectChapters");

    }
    @Test(priority = 10,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify if user can click on continue after selecting the chapters")
    public void verifyIfUserCanClickOnContinueAfterSelectingTheChapters() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.verifyElementsOnSelectChapterScreen();
        logger.info("verifyElementsOnSelectChapterScreen");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject");
        testPage.selectChapters(0);
        logger.info("selectChapters");
        testPage.clickOnContinueInSelectChaptersScreen();
        logger.info("clickOnContinueAfterSelectingChapters");

    }
    @Test(priority = 11,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify if user can click on continue and proceed next without selecting any chapters")
    public void verifyIfUserCanClickOnContinueAndProceedFurtherWithoutSelectingAnyChapters() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.verifyElementsOnSelectChapterScreen();
        logger.info("verifyElementsOnSelectChapterScreen");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject");
        testPage.clickOnContinueInSelectChaptersScreen();
        logger.info("clickOnContinueAfterSelectingChapters");
    }
    @Test(priority = 12,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify if user can Navigate Back To Step One By Clicking On Back Button")
    public void verifyIfUserCanNavigateBackToStepOneByClickingOnBackButton() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
      //  testPage.clickOnBackButton();
        driver().navigate();
        logger.info("clickOnBackButton");
    }
    @Test(priority = 13,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify all the elements are visible in step 3 select your settings")
    public void verifyIfAllTheElementsAreVisibleInSelectYourSettingsScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject");
        testPage.selectChapters(0);
        logger.info("selectChapters");
        testPage.clickOnContinueInSelectChaptersScreen();
        logger.info("clickOnContinueAfterSelectingChapters");
        testPage.verifyAllTheElementsInCreateYourSettingsScreen();
        logger.info("verifyAllTheElementsInCreateYourSettingsScreen");
    }
   @Test(priority = 14,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify if user can provide all required details in the given fields and create the test")
    public void verifyIfUserCanCreateTestSuccessFully() {
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
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");

        //Verify If User Can create custom test without selecting any subject
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.verifyAllElementsOnCreateYourOwnTestScreen();
       logger.info("verifying user is not navigated to next screen without selecting any subject");

        testPage.selectASubject(0);
        logger.info("selectASubject");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");

        //Verify If User Can create custom test without selecting any chapter
       testPage.clickOnContinueInSelectChaptersScreen();
       logger.info("clickOnContinueAfterSelectingChapters");
       testPage.verifyElementsOnSelectChapterScreen();
       logger.info("verifying user is not navigated to next screen without selecting any chapter");

        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject");
        testPage.selectChapters(0);
        logger.info("selectChapters");
        testPage.clickOnContinueInSelectChaptersScreen();
        logger.info("clickOnContinueAfterSelectingChapters");

        //Verify If User Can create custom test without selecting any entering the testname
       testPage.clickOnCreateTestButton();
       logger.info("clickOnCreateTestButton");
       testPage.verifyAllTheElementsInCreateYourSettingsScreen();
       logger.info("verifying user can not create test and navigate to next screen without providing the test name ");

       //Verify If User Can Nav back from create custom test screen and selecting any other subject and chapter and proceed again to create test
       testPage.clickOnBackButton();
       testPage.selectChapters(1);
       testPage.clickOnContinueInSelectChaptersScreen();
       logger.info("clickOnContinueAfterSelectingChapters");

        testPage.enterYourTestName("My First Test");
        logger.info("enterYourTestName");
        testPage.setDifficultyLevel();
        logger.info("setDifficultyLevel");

       testPage.setDuration();
        logger.info("setDuration");
        testPage.setMarkForCorrectAnswer();
        logger.info("setMarkForCorrectAnswer");
        testPage.setMarkForIncorrectAnswer();
        logger.info("setMarkForIncorrectAnswer");
        testPage.clickOnCreateTestButton();
        logger.info("clickOnCreateTestButton");
        testPage.verifyTestCreatingProgress();

       //Verify if created test summary have all the details available
       testSummaryPage.verifyElementsOnHeroBanner();
       logger.info("verifyElementsOnHeroBanner");
       testSummaryPage.verifyAllTheElementsOnAboutTheTestSection();
       logger.info("verifyAllTheElementsOnAboutTheTestSection");

     //  testSummaryPage.verifyElementsOnHereIsWhereYouStandSection();
       logger.info("verifyElementsOnHereIsWhereYouStandSection");

       testSummaryPage.verifyElementsRecommendedPracticeCarousel();
       logger.info("verifyElementsRecommendedPracticeCarousel");
       testSummaryPage.verifyElementsRecommendedLearningCarousel();
       logger.info("verifyElementsRecommendedLearningCarousel");

       testSummaryPage.verifyElementsMoreTestsCarousel();
       logger.info("verifyElementsMoreTestsCarousel");

       //Verify If User Can take test create by them
       testSummaryPage.clickOnTakeTest();
       logger.info("clickOnTakeTest");

       //verify if user can start test
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

       viewTestFeedBackPage.verifyElementsOnFeedbackScreen();
       logger.info("verifyElementsOnFeedbackScreen");

   }
    @Test(priority = 15,groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verifyIfUserCanCreateTestBySelectingMultipleSubjects")
    public void verifyIfUserCanCreateTestBySelectingMultipleSubjects() {
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
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");

        testPage.selectASubject(0);
        logger.info("selectASubject 1");
        testPage.selectASubject(1);
        logger.info("selectASubject 2");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");

        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.selectChapters(2);
        logger.info("selectChapters");
        testPage.clickOnExpandSubject(0);
        testPage.clickOnExpandSubject(1);
        testPage.selectChapters(1);
        testPage.selectChapters(2);
        logger.info("selectChapters");
        testPage.clickOnContinueInSelectChaptersScreen();
        logger.info("clickOnContinueAfterSelectingChapters");

        testPage.enterYourTestName("Creating Test for multiple subjects");
        logger.info("enterYourTestName");
        testPage.setDifficultyLevel();
        logger.info("setDifficultyLevel");

        testPage.setDuration();
        logger.info("setDuration");
        testPage.setMarkForCorrectAnswer();
        logger.info("setMarkForCorrectAnswer");
        testPage.setMarkForIncorrectAnswer();
        logger.info("setMarkForIncorrectAnswer");
        testPage.clickOnCreateTestButton();
        logger.info("clickOnCreateTestButton");
        testPage.verifyTestCreatingProgress();
        String testName=  testSummaryPage.verifyCustomTestName();
        driver().navigate().back();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(testName, "Multiple Subjects", "subject is not matched expected :Multiple Subjects , actual " + testName);

    }

    @Test(priority = 16,groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verifyIfUserCanCreateQuickTest")
    public void verifyIfUserCanCreateQuickTest() {
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
        testPage.clickOnCreateYourOwnTest();
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

        //verify if user can start test
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

        viewTestFeedBackPage.verifyElementsOnFeedbackScreen();
        logger.info("verifyElementsOnFeedbackScreen");

    }

    @Test(priority = 17,groups = {Categories.BETA_SANITY, Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "verifyIfUserCanCreateQuickTestByClickingOnCreateYourOwnTestButtonInHeroBannerOfTestLanding")
    public void verifyIfUserCanCreateQuickTestByClickingOnCreateYourOwnTestButtonInHeroBannerOfTestLanding() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");

        userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.CBSE);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.SIXTH_CBSE);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
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

        //Verify if created test summary have all the details available
        testSummaryPage.verifyElementsOnHeroBanner();
        logger.info("verifyElementsOnHeroBanner");
        testSummaryPage.verifyAllTheElementsOnAboutTheTestSection();
        logger.info("verifyAllTheElementsOnAboutTheTestSection");

        //testSummaryPage.verifyElementsOnHereIsWhereYouStandSection();
        logger.info("verifyElementsOnHereIsWhereYouStandSection");

        testSummaryPage.verifyElementsRecommendedPracticeCarousel();
        logger.info("verifyElementsRecommendedPracticeCarousel");
        testSummaryPage.verifyElementsRecommendedLearningCarousel();
        logger.info("verifyElementsRecommendedLearningCarousel");

        testSummaryPage.verifyElementsMoreTestsCarousel();
        logger.info("verifyElementsMoreTestsCarousel");

        //Verify If User Can take test create by them
        testSummaryPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");
    }
    @Test(priority = 18,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verifyIfUserCanCreateTestForMultipleSubjectsByClickingOnCreateYourOwnTestButtonInHeroBannerOfTestLanding")
    public void verifyIfUserCanCreateTestForMultipleSubjectsByClickingOnCreateYourOwnTestButtonInHeroBannerOfTestLanding() {
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

        userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.CBSE);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.SIXTH_CBSE);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");

        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testSummaryPage.clickOnCreateYourOwnTestButton();
        logger.info("clickOnCreateYourOwnTest");

        testPage.selectASubject(0);
        logger.info("selectASubject 1");
        testPage.selectASubject(1);
        logger.info("selectASubject 2");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");

        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.selectChapters(2);
        logger.info("selectChapters");
        testPage.clickOnExpandSubject(0);
        testPage.clickOnExpandSubject(1);
        testPage.selectChapters(1);
        testPage.selectChapters(2);
        logger.info("selectChapters");
        testPage.clickOnContinueInSelectChaptersScreen();
        logger.info("clickOnContinueAfterSelectingChapters");

        testPage.enterYourTestName("Creating Test for multiple subjects");
        logger.info("enterYourTestName");
        testPage.setDifficultyLevel();
        logger.info("setDifficultyLevel");

        testPage.setDuration();
        logger.info("setDuration");
        testPage.setMarkForCorrectAnswer();
        logger.info("setMarkForCorrectAnswer");
        testPage.setMarkForIncorrectAnswer();
        logger.info("setMarkForIncorrectAnswer");
        testPage.clickOnCreateTestButton();
        logger.info("clickOnCreateTestButton");
        testPage.verifyTestCreatingProgress();
        String testName=  testSummaryPage.verifyCustomTestName();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(testName, "Multiple Subjects", "subject is not matched expected :Multiple Subjects , actual " + testName);

        driver().navigate().back();
       String created_test= testPage.verifyCreatedTestTypeIsCorrect();
        logger.info("verifyCreatedTestTypeIsCorrect");
        softAssert.assertEquals(created_test, "Multiple Subjects", "subject is not matched expected :Multiple Subjects , actual " + created_test);

    }
    @Test(priority = 19,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "Verify if the user is able to create a custom test for 3 subjects")
    public void verifyIfTheUserIsAbleToCreateCustomTestFor_3Subjects() {
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
        //  homePage.clickOnHomeTab();

        loginPage.clickOnHeroBannerAvatar();
        loginPage.selectAProfile(2);
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        testPage.selectASubject(1);
        testPage.selectASubject(2);
        logger.info("selectASubject 1,2,3");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.clickOnExpandSubject(0);

        testPage.clickOnExpandSubject(1);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.clickOnExpandSubject(1);

        testPage.clickOnExpandSubject(2);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.clickOnExpandSubject(2);
        testPage.clickOnContinueInSelectChaptersScreen();
        logger.info("clickOnContinueAfterSelectingChapters");

        testPage.enterYourTestName("Creating Test for multiple subjects");
        logger.info("enterYourTestName");
        testPage.setDifficultyLevel();
        logger.info("setDifficultyLevel");

        testPage.setDuration();
        logger.info("setDuration");
        testPage.setMarkForCorrectAnswer();
        logger.info("setMarkForCorrectAnswer");
        testPage.setMarkForIncorrectAnswer();
        logger.info("setMarkForIncorrectAnswer");
        testPage.clickOnCreateTestButton();
        logger.info("clickOnCreateTestButton");
        testPage.verifyTestCreatingProgress();
        testSummaryPage.verifyCustomTestName();
        logger.info("verifyCustomTestName");
    }
    @Test(priority = 19,groups = { Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "Verify if the user is able to create a Quick test for 3 subjects")
    public void verifyIfTheUserIsAbleToCreateQuickTestFor_3Subjects() {
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
        //  homePage.clickOnHomeTab();

        loginPage.clickOnHeroBannerAvatar();
        loginPage.selectAProfile(2);
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.selectASubject(0);
        testPage.selectASubject(1);
        testPage.selectASubject(2);
        logger.info("selectASubject 1,2,3");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.clickOnExpandSubject(0);

        testPage.clickOnExpandSubject(1);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.clickOnExpandSubject(1);

        testPage.clickOnExpandSubject(2);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.clickOnExpandSubject(2);

        testPage.clickOnQuickTestButton();
        logger.info("clickOnQuickTestButton");
        testPage.verifyTestCreatingProgress();
        logger.info("verifyTestCreatingProgress");
        testSummaryPage.verifyCustomTestName();
        logger.info("verifyCustomTestName");
    }
        @Test(priority = 19,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verifyCreatedTestTypeIsCorrectForSingleSubject")
    public void verifyCreatedTestTypeIsCorrectForSingleSubject() {
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
        testPage.clickOnCreateYourOwnTest();
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

        driver().navigate().back();
        String created_test= testPage.verifyCreatedTestTypeIsCorrect();
        logger.info("verifyCreatedTestTypeIsCorrect");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(created_test, "Chemistry", "subject is not matched expected :Chemistry , actual " + created_test);


    }


    @Test(priority = 20,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verifyUserCanViewTheTestsCreatedEarlierAndCanTakeThoseTests")
    public void verifyUserCanViewTheTestsCreatedEarlierAndCanTakeThoseTests() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");

        testPage.verifyCreatedTestTypeIsCorrect();
        logger.info("verifyCreatedTestTypeIsCorrect");
        testPage.clickOnCreatedTest();
        logger.info("clickOnMyFirstTest");

    }
    @Test(priority = 21,groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verifyCountDownTimerShownForPendingTest")
    public void verifyCountDownTimerShownForPendingTest() {
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
        testPage.clickOnCreateYourOwnTest();
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

        testPage.getContinueLearningCarousel();
        logger.info("getContinueLearningCarousel");

       String timer= testPage.verifyCountDownTimerForPendingTest();
       SoftAssert softAssert=new SoftAssert();
       softAssert.assertEquals(timer,"00:01:24","timer is not displayed");

        //verify if user can start pending test
       testPage.clickOnPendingTest();

        testPage.clickOnResumeTest();
        logger.info("clickOnResumeTest");

        //verify if user can start test

        takeTestPage.clickOnSaveAndNext();
        logger.info("clickOnSaveAndNext");
        takeTestPage.clickOnSubmitButton();
        logger.info("clickOnSubmitButton");

        takeTestPage.clickOnSubmitTestButton();
        logger.info("clickOnSubmitTestButton");
        takeTestPage.clickOnContinueToTestFeedback();
        logger.info("clickOnContinueToTestFeedback");



    }
}