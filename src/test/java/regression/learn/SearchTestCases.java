package regression.learn;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class SearchTestCases extends TestBase {

    @Test(groups = {Categories.Descoped}, description = "Verify if entered only 1 or 2 characters in the search field it displays only categories under quick links")
    public void VerifyReleventQuickLinksResultsDisplaysBasedOnSearchResult()  {
        logger.info("VerifyReleventQuickLinksResultsDisplaysBasedOnSearchResult");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.clickOnSearch();
        logger.info("Click on Search Icon");
        homePage.queryOnSearch("Numerical");
        logger.info("Give Input");
       // homePage.verifyQuickLinksAndResultCount();
        logger.info("Verify the qUIck links are displayed based on the entered text in search field");
        homePage.ClickOnQuickLinks();
        logger.info("Verify the qUIck links are displayed based on the entered text in search field");
        homePage.verifyNavigateToVedios();
        logger.info("Verify user can click on any of the links displayed under qUIck links and navigate to particular video or coobo\n");

    }



    @Test(groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify User Can Enter All Letters")
    public void VerifyUserCanEnterAllLetters()  {
        logger.info("VerifyUserCanEnterAllLetters");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.clickOnSearch();
        logger.info("Click on Search Icon");
        homePage.queryOnSearch("abcdefghijklmnopqrstuvwxyz");
        homePage.clickOnEnter();
        logger.info("Give Input");


    }

    @Test(groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify the videos as the video icon and Coobo as coobo icon on the result tiles displayed")
    public void VerifyNavigateToVediosInSearch() {
        logger.info("Verify the videos as the video icon and Coobo as coobo icon on the result tiles displayed");
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
        homePage.queryOnSearch("Numerical");
        logger.info("queryOnSearch");
        homePage.clickOnEnter();
        logger.info("clickOnEnter");
        searchPage.clickonVideos();
        logger.info("clickOnVideos");
        homePage.verifyNavigateToVedios();
        logger.info("verifyNavigateToVedios");
    }

    @Test(groups = {Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify User Can Navigate to Books in search page")
    public void VerifyNavigateToBooksInSearch() {
        logger.info("Verify User Can Navigate to Books in search page");
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
        homePage.queryOnSearch("Books");
        logger.info("queryOnSearch");
        homePage.clickOnEnter();
        logger.info("clickOnEnter");
        searchPage.clickOnBook(0);

    }
    @Test(groups = {Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify User Can Navigate to Practice Chapters in search page")
    public void VerifyNavigateToPracticeChaptersInsearch() {
        logger.info("VerifyNavigateToPracticeChaptersInsearch");
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
        homePage.queryOnSearch("Numerical");
        logger.info("queryOnSearch");
        homePage.clickOnEnter();
        logger.info("clickOnEnter");
        searchPage.clickOnPractice();
        searchPage.clickOnChapters();
    }
    @Test(groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "verify All The Elements On SearchPage")
    public void verifyAllTheElementsOnSearchPage() {
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
        homePage.queryOnSearch("Books");
        logger.info("queryOnSearch");
        homePage.clickOnEnter();
        logger.info("clickOnEnter");
        searchPage.clickonGoals();
        logger.info("clickonGoals");
        searchPage.clickonArrowUp();
        logger.info("clickonArrow");
        searchPage.verifyDescription();
        logger.info("VerifyDescription");
        searchPage.clickonArrowDown();
        logger.info("clickonArrow");
        searchPage.clickonVideos();
        logger.info("clickonVideos");
        searchPage.clickonQuestions();
        logger.info("clickonQuestions");
        searchPage.clickonPractice();
        logger.info("clickonPractice");
        searchPage.clickonTest();
        logger.info("clickonTest");
        searchPage.clickonBooks();
        logger.info("clickonTest");
        searchPage.verifyAllTheElementsOnSearchPage();

    }
    @Test(groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify User Can Navigate to Test in search page")
    public void VerifyNavigateToTestsInSearch() {
        logger.info("VerifyNavigateToTestsInSearch");
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
        homePage.queryOnSearch("Numerical");
        logger.info("Give input");
        homePage.clickOnEnter();
        logger.info("clickOnEnter");
        searchPage.clickonTest();
    }
    @Test(groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify No Results is displayed when Test is not found")
    public void VerifyNoResultsisDisplayedWhenTestIsNotFound()  {
        logger.info("VerifyNoResultsisDisplayedWhenTestIsNotFound");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.clickOnSearch();
        logger.info("click On Search");
        homePage.queryOnSearch("vhhvhvhvh");
        logger.info("Give input");
        homePage.verifySearchForInvalidInput();

    }

    @Test(groups = {Categories.BETA_SANITY,Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "VerifySearchIconAvailableForAllTab")
    public void VerifySearchIconAvailableForAllTab() {
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
        logger.info("click On Search");
        homePage.queryOnSearch("Embibe");
        logger.info("Give input");
        learnPage.navigatBack();
        learnPage.navigatBack();
        homePage.clickOnHomeTab();
        homePage.clickOnSearch();
        logger.info("click On Search");
        homePage.queryOnSearch("Embibe");
        logger.info("Give input");
        learnPage.navigatBack();
        learnPage.navigatBack();
        homePage.clickOnTestTab();
        homePage.clickOnSearch();
        logger.info("click On Search");
        homePage.queryOnSearch("Embibe");
        logger.info("Give input");
        learnPage.navigatBack();
        learnPage.navigatBack();
        homePage.clickOnPracticeTab();
        homePage.clickOnSearch();
        logger.info("click On Search");
        homePage.queryOnSearch("Embibe");
        logger.info("Give input");




    }
}
