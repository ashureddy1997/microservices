package regression.learn;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class LearnUITestCases extends TestBase {


    @Test(priority = 1,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "verify AllHeader Present")
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
        learnPage.verifyAllHeaderPresent();
    }

    @Test(priority = 2,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "verify Subjects are displayed")
    public void verifySubjectsAreDisplaying()  {
        logger.info("verify Subjects are displayed");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.verifyLearnButtonWorking();

    }
    @Test(priority = 3,groups = {Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify the All the Ad banners are visible  ")
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
    @Test(priority = 4,groups = {Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify the All the Ad banners are visible  ")
    public void VerifyHeroBannerVideoAutoplay() {
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
        practicePage.verifyHerobannerVideo();
    }
    @Test(priority = 5,groups = {Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify App Working Fine With continuous Scrolling ")
    public void VerifyAppWorkingFineWithcontinuousScrolling() {
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
        practicePage.continueScroll();
    }



}
