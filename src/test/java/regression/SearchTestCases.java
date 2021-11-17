package regression;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class SearchTestCases extends TestBase {
    @Test(groups = {Categories.BETA_SANITY, Categories.UserHomeREGRESSION, Categories.SMOKE, Categories.BETAREGRESSION}, description = "verify Search Functionality Working")
    public void verifySearchFunctionalityWorking() {
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
        homePage.clickOnSearch();
        logger.info("Click on Search");
        homePage.queryOnSearch("pa");
        logger.info("Give input");
        driver().navigate().back();
        homePage.verifySearchResult();

    }

    @Test(groups = {Categories.UserHomeREGRESSION, Categories.BETAREGRESSION}, description = "verify Video IsClickable On Search Screen")
    public void verifyVideoIsClickableOnSearchScreen() {
        logger.info("verify Video IsClickable On Search Screen");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnSearch();
        homePage.queryOnSearch("Sound");
        driver().navigate().back();
        homePage.verifySearchResult();
        homePage.clickOnSearchResult();

    }

    @Test(groups = {Categories.UserHomeREGRESSION, Categories.BETAREGRESSION}, description = "verify Search ScreenUI all elements")
    public void verifySearchScreenUI() {
        logger.info("verify Search ScreenUI all elements");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnSearch();
        homePage.verifySearchScreenUI();
    }

    @Test(groups = {Categories.UserHomeREGRESSION, Categories.BETAREGRESSION}, description = "Verify Search Result For Invalid Input")
    public void verifySearchResultForInvalidInput() {
        logger.info("Verify Search Result For Invalid Input");
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
        homePage.clickOnSearch();
        homePage.queryOnSearch("vvv00vvvvvvvvvbbbrrrrrrr");
        homePage.verifySearchForInvalidInput();

    }

    @Test(groups = {Categories.UserHomeREGRESSION, Categories.BETAREGRESSION}, description = "verify Search Functionality Working")
    public void verifyUpdateMyGoalFunctionalityWorkingFromSearch() {
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
        homePage.clickOnSearch();
        logger.info("Click on Search");
        homePage.queryOnSearch("Banking");
        logger.info("Give input");
       String goal= homePage.clickOnAGoalDisplayedInSearchResult();
        logger.info("Verify if user can click on a goal displayed is search result");
        homePage.clickOnASearchData();
        logger.info("Verify if user can click on a search data displayed is search result");
        homePage.clickOnUpdateMYGoalFromSearch();
        logger.info("Verify if user can click on Update my goal button");
      String updatedGoal= homePage.verifyGoalIsUpdatedCorrectly();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(goal,updatedGoal,"goal is not updated");

    }

    @Test(groups = {Categories.UserHomeREGRESSION, Categories.BETAREGRESSION}, description = "verify Search Functionality Working")
    public void verifyBringMeBackFunctionalityWorkingFromSearch() {
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
        homePage.clickOnSearch();
        logger.info("Click on Search");
        homePage.queryOnSearch("Banking");
        logger.info("Give input");
        String goal = homePage.clickOnAGoalDisplayedInSearchResult();
        logger.info("Verify if user can click on a goal displayed is search result");
        homePage.clickOnASearchData();
        logger.info("Verify if user can click on a search data displayed is search result");
        homePage.clickOnBringMeBack();
        logger.info("Verify if user can click on Bring me back in search result");

    }
}