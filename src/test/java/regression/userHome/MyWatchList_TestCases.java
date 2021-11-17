package regression.userHome;

import api.SignUpAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class MyWatchList_TestCases extends TestBase {

    SignUpAPI signUpAPI = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test(groups = {Categories.Descoped}, description = "Verify IF User Can See Watch List Added By Them In UserHome In My Watchlist Section")
    public void VerifyIFUserCanSeeWatchListAddedByThemInUserHomeInMyWatchlistSection() {
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
        homePage.clickOnLearnTab();
        logger.info("clickOnLearnTab");
        learnPage.clickOnAVideo();
        logger.info("clickOnAVideo");
        learnPage.clickOnWatchlist();
        logger.info("clickOnWatchlist");
        // testPage.clickOnBackButtonFromTestSummaryDetails();
        driver().navigate().back();
        logger.info("clickOnBackButtonFromTestSummaryDetails");
        homePage.clickOnHomeTab();
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.VerifyIfWatchListISReflectingInUserHomeAfterAddingAnyVideo();
        logger.info("VerifyIfWatchListISReflectingInUserHomeAfterAddingAnyVideo");
    }

    @Test( groups = {Categories.Descoped}, description = "Verify If User Can Navigate To View Watchlist Detail, Verify All The Elements")
    public void VerifyIfUserCanNavigateToViewWatchlistDetailVerifyAllTheElements() {
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
        homePage.clickOnLearnTab();
        logger.info("clickOnLearnTab");
        learnPage.clickOnAVideo();
        logger.info("clickOnAVideo");
        learnPage.clickOnWatchlist();
        logger.info("clickOnWatchlist");
        homePage.clickOnHomeTab();
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");

        userHomePage.clickOnMoreItemCardView_watchList();
        logger.info("clickOnMoreItemCardView_watchList");
        userHomePage.verifyElementsOfWatchlistDetails();
        logger.info("verifyElementsOfWatchlistDetails");

        //Verify If User Can play watchlist videos by clicking on PlayAll Button
        userHomePage.clickOnPlayALlButton();
        logger.info("clickOnPlayALlButton");
        //Verify if user can navigate back
        userHomePage.clickOnBackIcon();
        logger.info("clickOnBackIcon");

        //VerifyAllTheElementsOfQuitLearn
        userHomePage.verifyElementsOfQuitLearn();
        logger.info("verifyElementsOfQuitLearn");

        userHomePage.clickOnContinueLearning();
        userHomePage.clickOnBackIcon();
        //Verify If User Can Quit from watchlist video
        userHomePage.clickOnQuit();
        logger.info("clickOnQuit");
        userHomePage.clickOnPlayALlButton();
        logger.info("clickOnPlayALlButton");

        //Verify If User Can resume watchlist video and continue learning
        userHomePage.clickOnBackIcon();
        logger.info("clickOnBackIcon");

      /*  userHomePage.clickOnResumeButton();
        logger.info("clickOnResumeButton");
        userHomePage.clickOnBackIcon();
        logger.info("clickOnBackIcon");

        //Verify If User Can re-start the video from the watchlist
        userHomePage.clickOnStartButton();
        logger.info("clickOnStartButton");*/
    }

    @Test(groups = {Categories.Descoped}, description = "VerifyIfUserCanOpenAnyVideoFromWatchlist")
    public void VerifyIfUserCanOpenAnyVideoFromWatchlist() {
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
        homePage.clickOnLearnTab();
        logger.info("clickOnLearnTab");
        learnPage.clickOnAVideo();
        logger.info("clickOnAVideo");
        learnPage.clickOnWatchlist();
        logger.info("clickOnWatchlist");
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");

        userHomePage.clickOnMoreItemCardView_watchList();
        logger.info("clickOnMoreItemCardView_watchList");

        //verifyShowingAllMyWatchListedVideos
        userHomePage.verifyShowingAllMyWatchListVideos();
        logger.info("verifyShowingAllMyWatchListVideos");

        //verifyIfUserCanOpenWatchListVideoFromMoreItemList
        userHomePage.clickOnWatchListVideo();
        logger.info("clickOnWatchListVideo");

        //verifyAllElementsOnWatchlistVideoDetailsScreen
        userHomePage.verifyAllElementsOnWatchlistVideoDetailsScreen();
        logger.info("verifyAllElementsOnWatchlistVideoDetailsScreen");

        //verifyOpenedVideoFromWatchlistedIsMarkedWatchlist
        String watchList =   userHomePage.verifyOpenedVideoFromWatchlistedIsMarkedWatchlist();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(watchList,"Watchlist","video is not Watchlisted");

        //verifyIfUserCanPlayWatchlistVideo
        userHomePage.clickOnPlayButtonOfWatchListVideo();
        logger.info("clickOnPlayButtonOfWatchListVideo");

    }
    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}
