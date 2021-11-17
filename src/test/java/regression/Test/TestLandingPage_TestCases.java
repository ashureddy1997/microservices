package regression.Test;

import api.*;
import constant.Exam;
import constant.Goal;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

import java.util.List;

public class TestLandingPage_TestCases extends TestBase {
    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    TestAPI testAPI = new TestAPI();
    SignUpAPI signUpAPI = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");


    @Test( groups = {  Categories. Descoped }, description = "verify All The Carousels Are Present On Test ")
    public void verifyAllTheHeadersArePresentOnTest() {
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

        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
        resetTest.resetTest("mb130708",childEmbibeToken);

        logger.info("clickOnTestTab");
        Response response = testAPI.getTestHomeAPIResponse(embibeToken, signUpAPI.user_id, Exam.SIXTH_CBSE, Goal.CBSE);
        logger.info("getTestHomeAPIResponse");
        List<String> list = testAPI.getSectionNameList(response);
        logger.info("getSectionNameList");
        System.out.println("" + list + " Header lst");
        System.out.println("header name : " + list.get(0));
        testPage.verifyAllThecarosuelsArePresentOnTest(list);
        logger.info("verifyAllThecarosuelsArePresentOnTest");


    }
    @Test(groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "verify All The Elements Of Subjects Carousel")
    public void verifyAllTheElementsOnSubjectsCarousel() {
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

        testSummaryPage.verifyElementsOfSubjectsCarousel();
        logger.info("verifyElementsOfSubjectsCarousel");

        //verify If User Can Filter the Tests, Subject Wise By Clicking On Different Subjects
        String subject=testSummaryPage.ClickOnSubjectTitleToFilterTheTestsOnTestScreen(1);
        logger.info("ClickOnSubjectTitleToFilterTheTestsOnTestScreen");

        //verify Filtered Tests For PHYSICS Subject
        testSummaryPage.verifyClickOnGivenSubjectTileDisplayTestsRelatedOnlyToThat(subject);
        logger.info("verifyClickOnGivenSubjectTileDisplayTestsRelatedOnlyToThat");

        //verify Filtered Tests For MATHEMATICS Subject
       /* userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Delhi_Board);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.SIXTH_Delhi);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");

        String subject1=testSummaryPage.ClickOnSubjectTitleToFilterTheTestsOnTestScreen(1);
        logger.info("ClickOnSubjectTitleToFilterTheTestsOnTestScreen");


        testSummaryPage.verifyClickOnGivenSubjectTileDisplayTestsRelatedOnlyToThat(subject1);
        logger.info("verifyClickOnGivenSubjectTileDisplayTestsRelatedOnlyToThat");

        //verify Filtered Tests For All Subject
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testSummaryPage.ClickOnAllSubjectTitleToFilterTheTestsOnTestScreen();
        logger.info("ClickOnAllSubjectTitleToFilterTheTestsOnTestScreen");
        testPage.verifyPracticeNow();*/
    }


    @Test( groups = {Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.BETAREGRESSION, Categories.TEST_REGRESSION,Categories.SMOKE}, description = "verify Header 'Take Full Test ' is Present And User Can Open Any Of The Test By Clicking On Its Any Tiles ")
    public void VerifyHeaderTakeFullTestIsPresentAndUserCanOpenAnyOfTheTestByClickingOnItsAnyTiles() {
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
        String tilename = testPage.getTakeFullTestTile();
        logger.info("getTakeFullTestTile");
        testPage.verifyHeaderPresent("Take Full Tests");
        logger.info("verifyHeaderPresent");
        testSummaryPage.clickOnTakeFullTestsTile();
        logger.info("clickOnTestTile");
        String testname = testPage.verifyIfOpenedTestNameIsSameAsSelectedTestFromTestTiles();
        logger.info("verifyIfOpenedTestNameIsSameAsSelectedTestFromTestTiles");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(testname, tilename, "Test Name is not matched" + testname);
        logger.info("Verifying Test Name");

    }

    @Test( groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "verify All the element on TakeFullTests section")
    public void VerifyAllTheElementsOnTakeFullTestsSection() {
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
        testSummaryPage.verifyElementsTakeFullTestCart();
        logger.info("verifyElementsTakeFullTestCart");
    }

    @Test( groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION,Categories.TEST_REGRESSION}, description = "Verify Chapter Tests are visible")
    public void VerifyChapterTestsAreVisible() {
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
        testPage.verifyChapterTests();
        logger.info("verifyChapterTests");
    }
    @Test( groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "Verify if user can mute video in ad banner in learn now ")
    public void verifyIfUserCanMuteVideoInAdBannerInLearnNow () {
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
        testPage.clickOnMuteButtonOfAdBannerOfLearnNow();
        logger.info("clickOnAdBannerMuteButton");

        //Verify if user can unmute video in ad banner in learn now
        testPage.clickOnUnMuteButtonOfAdBannerOfLearnNow();
        logger.info("clickOnUnMuteButtonOfAdBannerOfLearnNow");
    }

    @Test( groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "Verify if user can mute video in ad banner in practice now ")
    public void verifyIfUserCanMuteVideoInAdBannerInPracticeNow () {
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
        testPage.clickOnMuteButtonOfAdBannerOfPracticeNow();
        logger.info("clickOnMuteButtonOfAdBannerOfPracticeNow");

        //Verify if user can unmute video in ad banner in practice now
        testPage.clickOnUnMuteButtonOfAdBannerOfPracticeNow();
        logger.info("clickOnUnMuteButtonOfAdBannerOfPracticeNow");
    }
    @Test( groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "Verify if user can mute video in ad banner in Achieve now ")
    public void verifyIfUserCanMuteVideoInAdBannerInAchieveNow() {
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
        testPage.clickOnMuteButtonOfAdBannerOfAchieveNow();
        logger.info("clickOnMuteButtonOfAdBannerOfAchieveNow");

        //Verify if user can unmute video in ad banner in Achieve now
        testPage.clickOnUnMuteButtonOfAdBannerOfAchieveNow();
        logger.info("clickOnUnMuteButtonOfAdBannerOfAchieveNow");
    }

    @Test( groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "Verify if user can mute video in ad banner in herobanner ")
    public void verifyIfUserCanMuteVideoInAdBannerInHerobanerInTestLanding() {
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
        testPage.clickOnMuteButtonOfAdBannerOfHerobanner();
        logger.info("clickOnMuteButtonOfAdBannerOfHerobanner");

        //Verify if user can unmute video in ad banner in Achieve now
        testPage.clickOnUnMuteButtonOfAdBannerOfHerobanner();
        logger.info("clickOnUnMuteButtonOfAdBannerOfHerobanner");
    }

    @Test( groups = {Categories.Descoped}, description = "Verify all the bookmarked tests are appearing under My Bookmarked Tests carousel")
    public void verifyAllTheBookmarkedTestsAreAppearingUnderMyBookmarkedTestsCarousels() {
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
        testSummaryPage.clickOnBookMark();
        logger.info("clickOnBookMark");
        driver().navigate().back();
        logger.info("clickOnBackButtonFromTestSummaryDetails");
        testPage.verifyBookMarkedTestAppearing();
        logger.info("verifyBookMarkedTestAppearing");

        //Verify user can take any test in the bookmarked tests by clicking on the tile
        testSummaryPage.verifyIfTestIsBookMarked();
        logger.info("verifyIfTestIsBookMarked");

        testPage.VerifyHeroBannerNameDisplay();
        logger.info("VerifyHeroBannerNameDisplay");

        testPage.clickOnTakeTest();
        logger.info("clickOnTakeTest");

    }

    @Test(groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "verify take test button is displayed at hero banner of test landing page for JEE Main.")
    public void verifyTakeTestButtonIsDisplayedAtHeroBannerOfTestLandingPageForJEEMain() {
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
        testPage.verifyTakeTestButtonInHeroBanner();
        logger.info("verifyTakeTestButtonInHeroBanner");

    }
    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }

}