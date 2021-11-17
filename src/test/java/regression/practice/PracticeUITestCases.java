package regression.practice;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class PracticeUITestCases extends TestBase {
    @Test(priority = 1,groups = {Categories.BETA_SANITY,Categories.PracticeREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "verify AllHeader Present")
    public void verifyAllHeaderPresent() {
        logger.info("verify AllHeader Present");
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
        practicePage.verifyAllHeaderPresent();
    }


    @Test(priority = 2,groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "verify Start Practice Button Present")
    public void verifyStartPracticeButtonDisplaying()  {
        logger.info("verify Start Practice Button displayed");
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
        homePage.verifyClickOnPracticeTab();
        logger.info("Click on PracticeChapter");
        homePage.clickOnChapters();
        practicePage.verifyStartPracticeButtonDisplay();

    }

    @Test(priority = 3,groups = {Categories.BETA_SANITY,Categories.PracticeREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify User can click Practice Now Button")
    public void VerifyUserCanClickPracticeNowButton()  {
        logger.info("verify Start Practice Button displayed");
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
        practicePage.clickOnPracticeNowButton();

    }

    @Test(priority = 4,groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify User can Navigate to Test After Clicking on Test Now Button")
    public void VerifyUserCanNavigateToTest()  {
        logger.info("verify Start Practice Button displayed");
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
        homePage.verifyClickOnPracticeTab();
        practicePage.verifyclickOnTakeTestButton();

    }


    @Test(priority = 5,groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "verify Search Functionality Working Practice Tab")
    public void verifySearchFunctionalityWorkingInPracticeTab()  {
        logger.info("verify Search Functionality Working");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        logger.info("Click on PracticeTab");
        homePage.clickOnPracticeTab();
        logger.info("Click on Search");
        homePage.clickOnSearch();
        logger.info("Verify Search Screen UI");
        homePage.verifySearchScreenUI();
        homePage.queryOnSearch("practice");
        homePage.clickOnEnter();
        homePage.verifySearchResult();

    }

    @Test(priority = 6,groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "verify Search Icon Is Displayed In Practice Tab")
    public void VerifyAllTheUiElementsOnPracticeLandingPage()  {
        logger.info("Verify all the Ui elements On PracticeLandingPage");
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
        logger.info("Verify Practice Page Is The Default Page");
        practicePage.VerifySearchIconDisplaye();
        logger.info("Verify GoalSwitchButton Display");
        practicePage.verifyGoalSwitchButtonDisplay();
        logger.info("Verify All Header Present");
        practicePage.verifyAllHeaderPresent();

    }


    @Test(priority = 7,groups = {Categories.PracticeREGRESSION,Categories.BETA_SANITY}, description = "Verify User Can Click SincerityScorePlay Button")
    public void VerifyUserCanClickSincerityScorePlayButton() {
        logger.info("Verify User Can Click SincerityScorePlay Button");
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
        logger.info("Click on PracticeChapter");
        practicePage.VerifyUserCanClickSincerityScorePlayButton();
        logger.info("Verify user video is playing after clicking on Text in Sincerity Score Tile");
        logger.info("Verify user can pause  Sincerity Score video ");

    }

    @Test(priority = 8,groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify that clicking on either of the tabs takes the user to the correct module")
    public void VerifyThatClickingOnEitherOfTheTabsTakesTheUserToTheCorrectModule() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyHomePageIsTheDefaultPage();
        logger.info("verify HomePage Is The Default Page");
        homePage.LearnPageIsTheDefaultPage();
        logger.info("Learn Page Is The Default Page");
        homePage.clickOnPracticeTab();
        logger.info("Click on  PracticeTab");
        homePage.clickOnTestTab();
        logger.info("Click on TestTab");
        homePage.TestPageIsTheDefaultPage();
        logger.info("Verify Test Page Is The Default Page");
    }
    @Test(priority = 9,groups = {Categories.PracticeREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify the All the Ad banners are visible  ")
    public void VerifyAddBannerwithMuteButton() {
        logger.info("launch the app");
        logger.info("Verify the All the Ad banners are visible");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        practicePage.VerifyAddBanner();

    }
}
