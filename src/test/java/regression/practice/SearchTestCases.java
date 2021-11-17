package regression.practice;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class SearchTestCases extends TestBase {

    @Test(groups = {Categories.PracticeREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify user can click on any of the links displayed under qUIck links and navigate to particular video")
    public void VerifyNavigateToVediosInSearch() {
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
    @Test(groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify User Can Navigate to Chapters in search page and user can see vedio related to search")
    public void VerifyNavigateToChaptersInSearchAndCanSeeVedio() {
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
        homePage.clickOnSearch();
        logger.info("Click on Search");
        homePage.queryOnSearch("Numerical");
        logger.info("queryOnSearch");
        homePage.clickOnEnter();
        logger.info("clickOnEnter");
        searchPage.clickOnChapters();


    }


    @Test(groups = {Categories.PracticeREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify User Can Navigate to Books in search page")
    public void VerifyNavigateToBooksInsearch()  {
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
        logger.info("Click on Practice Tab");
        homePage.clickOnSearch();
        logger.info("Click on Search");
        homePage.queryOnSearch("Books");
        logger.info("queryOnSearch");
        homePage.clickOnEnter();
        logger.info("clickOnEnter");
        searchPage.clickOnBook(0);
    }
    @Test(groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "verify All The Elements On SearchPage")
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
        homePage.clickOnPracticeTab();
        logger.info("Click on Practice Tab");
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
    @Test(groups = {Categories.PracticeREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify User Can Navigate to Practice Chapters in search page")
    public void VerifyNavigateToPracticeChaptersInsearch() {
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
        homePage.clickOnSearch();
        logger.info("Click on Search");
        homePage.queryOnSearch("Numerical");
        logger.info("queryOnSearch");
        homePage.clickOnEnter();
        logger.info("clickOnEnter");
        searchPage.clickOnPractice();
        searchPage.clickOnChapters();
    }
    @Test(groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify User Can Navigate to Test in search page")
    public void VerifyNavigateToTestsInSearch() throws InterruptedException {
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
        logger.info("ClickOnPracticeTab");
        homePage.clickOnSearch();
        logger.info("Click on Search");
        homePage.queryOnSearch("Numerical");
        logger.info("Give input");
        homePage.clickOnEnter();
        logger.info("clickOnEnter");
        searchPage.clickonTest();

       }
  /*  @Test(groups = {Categories.Descoped}, description = "verify User Able To Get Same Text In SearchBar")
    public void VerifyUserAbleToGetSameTextInSearchBar() {
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
        homePage.clickOnSearch();
        homePage.queryOnSearch("Numerical");
        homePage.verifyUserAbleToGetSameTextInSearchBar();

    }
    @Test(groups = {Categories.Descoped}, description = "Verify No Results is displayed when recommended videos is not found.")
    public void VerifyNoResultsIsDisplayedWhenRecommendedVideosIsNotFound()  {
        logger.info("Verify Search Result For Invalid Input");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifyClickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnSearch();
        homePage.queryOnSearch("vvhvhghg");
        driver().navigate().back();
        homePage.verifySearchForInvalidInput();


    }
    @Test(groups = {Categories.Descoped}, description = "Verify No Results is displayed when recommended videos is not found.")
    public void VerifyUserAbleToSearchRecommendedVideos()  {
        logger.info("Verify Search Result For Invalid Input");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifyClickOnPracticeTab();
        homePage.clickOnSearch();
        homePage.queryOnSearch("vhvhvhvv");
        driver().navigate().back();
        homePage.verifyNavigateToVedios();


    }
    @Test(groups = {Categories.Descoped}, description = "Verify No Results is displayed when recommended videos is not found.")
    public void VerifyNoResultsIsDisplayedWhenPracticeTopicsIsNotFound()  {
        logger.info("Verify Search Result For Invalid Input");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifyClickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnSearch();
        homePage.queryOnSearch("bhxvhxvxhxhxhx");
        driver().navigate().back();
        homePage.verifySearchForInvalidInput();

    }
    @Test(groups = {Categories.Descoped}, description = "Verify recommended videos displays based on search result")
    public void VerifyRecommendedVideosDisplaysBasedOnSearchResult()  {
        logger.info("Verify Search Result For Invalid Input");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifyClickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnSearch();
        homePage.queryOnSearch("Sound");
        driver().navigate().back();
      //  homePage.Verifyrecommendedvideosdisplaysbasedonsearchresult();

    }
    @Test(groups = {Categories.Descoped}, description = "Verify relevant Topic result is displayed based on Search result")
    public void VerifyReleventTopicsResultsDisplaysBasedOnSearchResult()  {
        logger.info("Verify Search Result For Invalid Input");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifyClickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnSearch();
        homePage.queryOnSearch("Sound");
        homePage.verifyQuickLinksAndResultCount();
        driver().navigate().back();
        homePage.VerifyReleventTopicsResultsDisplaysBasedOnSearchResult();
    }
    @Test(groups = {Categories.Descoped}, description = "Verify No Results is displayed when Test is not found")
    public void VerifyNoResultsisDisplayedWhenTestIsNotFound()  {
        logger.info("Verify Search Result For Invalid Input");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifyClickOnPracticeTab();
        logger.info("ClickOnPracticeTab");
        homePage.clickOnSearch();
        homePage.queryOnSearch("vhhvhvhvh");
        driver().navigate().back();
        homePage.verifySearchForInvalidInput();


    }
    @Test(groups = {Categories.Descoped}, description = "Verify User Can Search Learn chapter")
    public void VerifyUserCanSearchLearnChapters() {
        logger.info("Verify Search Result For Invalid Input");
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
        logger.info("ClickOnPracticeTab");
        homePage.clickOnSearch();
        homePage.queryOnSearch("Learn");
        driver().navigate().back();
        practicePage.VerifyLearnChapterDisplay();

    }*/


}
