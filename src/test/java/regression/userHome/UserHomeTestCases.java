package regression.userHome;


import constant.Exam;
import constant.Goal;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class UserHomeTestCases extends TestBase {

    @Test(groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify All The Elements Of Hero Banner In User Home Page")
    public void verifyAllTheElementsOfHeroBannerInUserHomePage(){
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.verifyElementsOfHeroBanner();
        logger.info("verifyElementsOfHeroBanner");
    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify If User Can Click On Watch Button And Play Video Of HeroBanner In User Home Page")
    public void verifyIfUserCanClickOnWatchButtonAndPlayVideoOfHeroBannerInUserHomePage() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnWatchButton();
        logger.info("clickOnWatchButton");
    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "verify Search Is Working User Home Page")
    public void verifySearchIsWorkingUserHomePage() {
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
        userHomePage.clickOnSearch();
        logger.info("clickOnSearch");
        userHomePage.SearchOnUserHome("ge");
        logger.info("SearchOnUserHome");
    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify If User Can Switch to Goal And Exam List From User Home Page")
    public void verifyIfUserCanSwitchToGoalAndExamListFromUserHomePage() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        userHomePage.clickOnGoalAndExam();
        logger.info("clickOnGoalAndExam");
    }

    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION}, description = "Verify If User Can switch Profile from user home")
    public void verifyIfUserCanSwitchProfileFromUserHome() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        userHomePage.clickOnProfileIcon();
        logger.info("clickOnProfileIcon");
        loginPage.SwitchProfile(1);
        logger.info("clickOnProfile");
    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify that user can select the exam and goal from hero banner by clicking on Exam button")
    public void verifyThatUserCanSelectTheExamAndGoalFromHeroBannerByClickingOnExamButton() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnProfile(0);
        homePage.clickOnHomeTab();
        userHomePage.scrollDown();
        userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Delhi_Board);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.SIXTH_Delhi);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");

        userHomePage.verifyUpdatedGoal();
        logger.info("verifyUpdatedGoal");
    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify that Questions tile is present under My Bookmarks carousel")
    public void VerifyThatQuestionsTileIsPresentUnderMyBookmarksCarousel() {
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
        userHomePage.VerifythatQuestionstileispresentunderMyBookmarkscarousel();
        logger.info("VerifythatQuestionstileispresentunderMyBookmarkscarousel");

    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify that Mytimeline is present and funtioning")
    public void VerifyThatTimelineIsPresentAndFunction() {
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
        logger.info("clickOnHomeTab");
        homePage.clickOnMyTimeline();
        logger.info("clickOnMyTimeline");

        //Verify that User can navigate to MyHome from My timeline
        userHomePage.clickOnMyHomeTile();
        logger.info("clickOnMyHomeTile");

    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify that \"Earn XX Embiums\" is seen on the Hero Banner")
    public void VerifyThatEarnXXEmbiumsIsSeenOnTheHeroBanner() {
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
        logger.info("clickOnHomeTab");
        homePage.verifyHeroBannerCoins();
        logger.info("verifyHeroBannerCoins");

        //Verify that time duration is seen on the Hero Banner
        homePage.verifyHeroBannerDuration();
        logger.info("verifyHeroBannerDuration");

    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify that total embium point and coin shown in herobanner should be same across the modules")
    public void verifyThatTotalEmbiumPointAndCoinShownInHerobannerShouldBeSameAcrossTheModules() {
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
        logger.info("clickOnHomeTab");
        userHomePage.verifyEmbium_coinInHerobaner();
        String UH_points= userHomePage.verifyTotalEmbium_PointsInHerobanner();
       homePage.clickOnTestTab();
        userHomePage.verifyEmbium_coinInHerobaner();
        String T_points= userHomePage.verifyTotalEmbium_PointsInHerobanner();
        homePage.clickOnPracticeTab();
        userHomePage.verifyEmbium_coinInHerobaner();
        String P_points= userHomePage.verifyTotalEmbium_PointsInHerobanner();
        homePage.clickOnLearnTab();
        userHomePage.verifyEmbium_coinInHerobaner();
        String L_points= userHomePage.verifyTotalEmbium_PointsInHerobanner();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(UH_points, T_points, "coin count not matched  , actual " + UH_points);
        softAssert.assertEquals(UH_points, P_points, "coin count not matched, actual " + UH_points);
        softAssert.assertEquals(UH_points, L_points, "coin count not matched, actual " + UH_points);
        softAssert.assertAll();
    }
}