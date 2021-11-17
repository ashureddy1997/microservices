package regression.Test;

import api.LoginAPI;
import api.ResetTest;
import api.SignUpAPI;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class TestSummary_TestCases extends TestBase {
    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    SignUpAPI signUpAPI = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test( groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION, Categories.SMOKE}, description = "verify All the elements on HeroBanner Of Subject Test Screen ")
    public void VerifyAllTheElementsOnHeroBannerOfTestSummary() {
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
        testSummaryPage.clickOnTestTile();
        logger.info("clickOnTakeFullTestsTile");
        testSummaryPage.verifyElementsOnHeroBanner();
        logger.info("verifyElementsOnHeroBanner");

        try {

            //Verify 200 Embium points is credited to the User for the first time only on navigating to Test Summary Page
            int embibeCoins = testSummaryPage.verifyEmbibePoints();
            logger.info("verifyEmbibePoints");
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(embibeCoins, 200, "Credited embibe points not matched, expected : 200" + embibeCoins);
            logger.info("verify embibe points");

            //Verify Test Subject matches with the Test Name
            String subjectName = testSummaryPage.verifySubjectNameInTestSummary();
            testSummaryPage.verifyTestNameMatchesWithSubjectName(subjectName);
            logger.info("verifyTestNameMatchesWithSubjectName");
        } catch (Exception e) {
            System.out.println("subject name will not display in this goal");
        }


    }

    @Test(groups = {Categories.TestREGRESSION, Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta}, description = "Verify if user can bookmark the test ")
    public void verifyIfUserCanBookMarkTheTest() {
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
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");

        testSummaryPage.clickOnTakeFullTestsTile();
        logger.info("clickOnTakeFullTestsTile");

        testSummaryPage.clickOnBookMark();
        logger.info("clickOnBookMark");

        //verifyIfTestIsBookMarkedSuccessfully
        // testSummaryPage.verifyIfTestIsBookMarked();
        logger.info("verifyIfTestIsBookMarked");

        //verifyIfUserCanUnBookMarkTheTest
        testSummaryPage.clickOnUnBookMark();
        logger.info("clickOnUnBookMark");
/*
        //verifyIfUserCanLikeTheTest
        testSummaryPage.clickOnLike();
        logger.info("clickOnLike");

        //verifyIfUserCanUnLikeTheTest
        testSummaryPage.clickOnUnLike();
        logger.info("clickOnUnLike");*/
    }

    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }

    @Test(groups = {Categories.BETA_SANITY, Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION, Categories.TEST_REGRESSION}, description = "verify If User Can Click On View More About Subject And View Full Details ")
    public void verifyIfUserClickOnViewMoreAboutSubjectAndViewFullDetails() {
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
        testSummaryPage.clickOnTestTile();
        logger.info("clickOnTestTile");

        testSummaryPage.verifyAllTheElementsOnAboutTheTestSection();
        logger.info("verifyAllTheElementsOnAboutTheTestSection");
    }

    @Test(groups = {Categories.BETA_SANITY, Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION, Categories.TEST_REGRESSION}, description = "verify All The Elements On Here Is Where You Stand Section ")
    public void verifyAllTheElementsOnHereIsWhereYouStandSection() {
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

        testSummaryPage.clickOnTakeFullTestsTile();

        logger.info("clickOnTakeFullTestsTile");
        testSummaryPage.verifyElementsOnHereIsWhereYouStandSection();
        logger.info("verifyElementsOnHereIsWhereYouStandSection");

       /* testSummaryPage.clickOnSincerityScorePlayButton();
        logger.info("clickOnSincerityScorePlayButton");*/
    }

    @Test(groups = {Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION, Categories.TEST_REGRESSION}, description = "Verify that different attempt Qality jars are displayed in test summary")
    public void verifyThatDifferentAttemptQualityJarsAreDisplayedInTestSummary() {
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
        testPage.selectChapters(2);
        testPage.clickOnQuickTestButton();
        logger.info("clickOnQuickTestButton");
        testPage.verifyTestCreatingProgress();
        logger.info("verifyTestCreatingProgress");

        testSummaryPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");

        //verify if user can start quick test
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
        driver().navigate().back();

        testSummaryPage.verifyDifferentJarInAttemptQuality();
        logger.info("verifyDifferentJarInAttemptQuality");

        //Verify if user can open recall jar and view details
        testSummaryPage.clickOnRecallJar();
        logger.info("clickOnRecallJar");

        //Verify all the elements of recall jar details
        testSummaryPage.verifyRecallJarElements();
        logger.info("verifyRecallJarElements");

        //Verify if that play button in recall jar is function
        testSummaryPage.clickOnPlay();
        logger.info("clickOnPlay");
    }

    @Test(groups = {Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION, Categories.TEST_REGRESSION}, description = "Verify if user can open conceptual thinking jar and view details")
    public void VerifyIfUserCanOpenConceptualThinkingJarAndViewDetails() {
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
        testPage.selectChapters(2);
        testPage.clickOnQuickTestButton();
        logger.info("clickOnQuickTestButton");
        testPage.verifyTestCreatingProgress();
        logger.info("verifyTestCreatingProgress");

        testSummaryPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");

        //verify if user can start quick test
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
        driver().navigate().back();

        testSummaryPage.verifyDifferentJarInAttemptQuality();
        logger.info("verifyDifferentJarInAttemptQuality");

        //Verify if user can open recall jar and view details
        testSummaryPage.clickOnConceptualJar();
        logger.info("clickOnConceptualJar");

        //Verify all the elements of recall jar details
        testSummaryPage.verifyConceptualThinkingJarElements();
        logger.info("verifyConceptualThinkingJarElements");
    }

    @Test(groups = {Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION, Categories.TEST_REGRESSION}, description = "Verify if user can open analytical thinking jar and view details")
    public void VerifyIfUserCanOpenAnalyticalThinkingJarAndViewDetails() {
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
        testPage.selectChapters(2);
        testPage.clickOnQuickTestButton();
        logger.info("clickOnQuickTestButton");
        testPage.verifyTestCreatingProgress();
        logger.info("verifyTestCreatingProgress");

        testSummaryPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");

        //verify if user can start quick test
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
        driver().navigate().back();

        testSummaryPage.clickOnAnalyticalThinkingJar();
        logger.info("clickOnAnalyticalThinkingJar");

        //Verify all the elements of analytical thinking jar details
        testSummaryPage.verifyAnalyticalThinkingJarElements();
        logger.info("verifyAnalyticalThinkingJarElements");

        //Verify if that play button in analytical thinking jar is function
        testSummaryPage.clickOnPlay();
        logger.info("clickOnPlay");

    }

    @Test(groups = {Categories.BETA_SANITY, Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION, Categories.TEST_REGRESSION}, description = "Verify all the elements in  Recommended Learn carousel ")
    public void verifyAllTheElementsInRecommendedLearnCarousel() {
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
        testSummaryPage.clickOnTakeFullTestsTile();
        logger.info("clickOnTakeFullTestsTile");

        testSummaryPage.verifyElementsRecommendedLearningCarousel();
        logger.info("verifyElementsRecommendedLearningCarousel");

        //Verify that Recommended Learning carousel is present under test summary and user can learn by opening any of the Learn tile from this section
        testSummaryPage.clickOnRecommendedLearningTile();
        logger.info("clickOnRecommendedLearningTile");
    }

    @Test(groups = {Categories.BETA_SANITY, Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION, Categories.TEST_REGRESSION}, description = "Verify all the elements in  Recommended Practice carousel ")
    public void verifyAllTheElementsInRecommendedPracticeCarousel() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("clickOnRecommendedLearningTile");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testSummaryPage.clickOnTakeFullTestsTile();
        logger.info("clickOnTakeFullTestsTile");

        testSummaryPage.verifyElementsRecommendedPracticeCarousel();
        logger.info("verifyElementsRecommendedPracticeCarousel");

        //Verify that Recommended Practice carousel is present under test summary and user can practice by opening any of the practice from this section
        testSummaryPage.clickOnRecommendedPracticeTile();
        logger.info("clickOnRecommendedPracticeTile");
    }

    @Test(groups = {Categories.BETA_SANITY, Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION, Categories.TEST_REGRESSION}, description = "Verify all the elements in  More Test carousel ")
    public void verifyAllTheElementsInMoreTestCarousel() {
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
        logger.info("clickOnRecommendedPracticeTile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testSummaryPage.clickOnTakeFullTestsTile();
        logger.info("clickOnTakeFullTestsTile");

        testSummaryPage.verifyElementsMoreTestsCarousel();
        logger.info("verifyElementsMoreTestsCarousel");

        //Verify that Tests more carousel is present under test summary and user can take test by opening any of the  tile from this section
        testSummaryPage.clickOnMoreTestTile();
        logger.info("clickOnMoreTestTile");
    }

    @Test(groups = {Categories.BETAREGRESSION, Categories.UserHomeAndTestBeta, Categories.TestREGRESSION}, description = "Verify sincerity score widget is displayed for unattempted test in test summary page")
    public void verifySincerityScoreWidgetIsDisplayedForUnattemptedTestInTestSummaryPage() {
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
        testPage.selectChapters(2);
        testPage.clickOnQuickTestButton();
        logger.info("clickOnQuickTestButton");
        testPage.verifyTestCreatingProgress();
        logger.info("verifyTestCreatingProgress");

        driver().navigate().back();
        testSummaryPage.verifySincerityScoreWidget();
        logger.info("verifySincerityScoreWidget");

        //Verify on clicking on sincerity score tile, video start playing
        testSummaryPage.clickOnSincerityScorewidgetTile();
        logger.info("clickOnSincerityScorewidgetTile");

        //Verify if user can come back from video Play screen
        driver().navigate().back();
        testSummaryPage.clickOnQuit();
        logger.info("clickOnQuit");

        //Verify all the elements of sincerity score widget
        testSummaryPage.verifyAllTheElementsOfSincerityScoreWidget();
        logger.info("verifyAllTheElementsOfSincerityScoreWidget");


    }
}