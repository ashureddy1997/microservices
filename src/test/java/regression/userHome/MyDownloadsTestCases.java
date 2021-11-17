package regression.userHome;

import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class MyDownloadsTestCases extends TestBase {

    @Test(priority = 1,groups = {Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "verifyAllTheElementsOfMyDownloadsPage")
    public void verifyAllTheElementsOfMyDownloadsPage() {
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
        learnPage.DownloadVideo();
        driver().navigate().back();
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.verifyMyDownloadsCarouselIsDisplayedInHomeScreen();
        logger.info("verifyMyDownloadsCarouselIsDisplayedInHomeScreen");
        //clickOnMyDownloadsToViewAllDownloadedVideos
        userHomePage.clickOnMyDownloadsToViewAllDownloadedVideos();
        logger.info("clickOnMyDownloadsToViewAllDownloadedVideos");
    }

    @Test(groups = {Categories.BETA_SANITY,Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify that Questions tile is present under My Bookmarks carousel")
    public void verifyAllTheElementsOfMyDownloadsInUserHomePage(){
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        logger.info("loginAs");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.verifyMyDownloadsCarouselIsDisplayedInHomeScreen();
        logger.info("verifyMyDownloadsCarouselIsDisplayedInHomeScreen");

        //clickOnMyDownloadsToViewAllDownloadedVideos
        userHomePage.clickOnMyDownloadsToViewAllDownloadedVideos();
        logger.info("clickOnMyDownloadsToViewAllDownloadedVideos");

       // verifyMessageShownIfThereAreNoVideosDownloaded
        userHomePage.verifyMessageShownIfThereAreNoVideosDownloaded();
        logger.info("verifyMessageShownIfThereAreNoVideosDownloaded");
    }
}
