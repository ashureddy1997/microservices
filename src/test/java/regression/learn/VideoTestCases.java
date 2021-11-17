package regression.learn;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class VideoTestCases extends TestBase {

    @Test(priority = 1,groups = {Categories.REGRESSION,Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify video description page contains the mentioned fields \"The video description page should contain the mentioned fields -\n" +
            "1. Video title and description\n" +
            "2. Learn , bookmark and like button\n" +
            "3. More on this concept link\n" +
            "4. Related concept link\"")
    public void verifyVideoDescriptionPage()  {
        logger.info("Verify video description page contains the mentioned fields \"The video description page should contain the mentioned fields -\n" +
                "1. Video title and description\n" +
                "2. Learn , bookmark and like button\n" +
                "3. More on this concept link\n" +
                "4. Related concept link\"");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.clickOnVideo();
        logger.info("click On Video");
        learnPage.verifyVideoDescriptionScreen();


    }

    @Test(priority = 2,groups = {Categories.REGRESSION,Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify on click on Start button the video starts playing")
    public void VerifyOnClickOnStartButtonTheVideoStartsPlaying()  {
        logger.info("Verify on click on Start button the video starts playing");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.clickOnVideo();
        logger.info("click On Video");
        learnPage.VerifyOnClickOnStartButtonTheVideoStartsPlaying();
    }

    @Test(priority = 3,groups = {Categories.REGRESSION,Categories.LearnREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify on click on any video tile user is directed to video description page")
    public void verifyNavigationToVideoScreen()  {
        logger.info("Verify on click on any video tile user is directed to video description page");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.clickOnVideo();
        logger.info("click On Video");
        learnPage.verifyNavigationToVideoScreen();
    }

    @Test(priority = 4,groups = {Categories.REGRESSION,Categories.LearnREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify user can Bookmark the video by clicking on bookmark button")
    public void VerifyUserCanBookMarkTheVideoByClickingOnBookMarkButton()  {
        logger.info("Verify user can Bookmark the video by clicking on bookmark button");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.clickOnVideo();
        logger.info("click On Video");
        learnPage.VerifyUserCanBookMarkTheVideoByClickingOnBookMarkButton();
    }

    @Test(priority = 5,groups = {Categories.REGRESSION,Categories.BETAREGRESSION}, description = "Verify user can unbookmark the bookmarked video by clicking on bookmark button again")
    public void VerifyUserCanUnBookMarkTheVideoByClickingOnBookMarkButton()  {
        logger.info("Verify user can unbookmark the bookmarked video by clicking on bookmark button again");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.clickOnVideo();
        logger.info("click On Video");
        learnPage.VerifyUserCanUnBookMarkTheVideoByClickingOnBookMarkButton();

    }

/*
    @Test(groups = {Categories.REGRESSION,Categories.Descoped}, description = "Verify user can like the video by clicking on Like button")
    public void VerifyUserCanLikeTheVideoByClickingOnLikeButton()  {
        logger.info("Verify user can like the video by clicking on Like button");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnLearnTab();
        logger.info("Click on LearnTab");
        learnPage.clickOnVideo();
        logger.info("click On Video");
        learnPage.VerifyUserCanLikeTheVideoByClickingOnLikeButton();


    }
    @Test(groups = {Categories.REGRESSION,Categories.Descoped}, description = "Verify user can unlike the video by clicking on Like button")
    public void VerifyUserCanUnLikeTheVideoByClickingOnLikeButton()  {
        logger.info("Verify user can unlike the video by clicking on Like button");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnLearnTab();
        logger.info("Click on LearnTab");
        learnPage.clickOnVideo();
        logger.info("click On Video");
        learnPage.VerifyUserCanUnLikeTheVideoByClickingOnLikeButton();


    }*/
  /*  @Test(groups = {Categories.REGRESSION}, description = "verify Learn Video Player")
    public void verifyLearnVideoPlayer()  {
        logger.info("verify Learn Video Player");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnLearnTab();
        learnPage.VerifyHeroBannerPlayButton();

    }*/

}
