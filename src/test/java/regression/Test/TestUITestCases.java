package regression.Test;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class TestUITestCases extends TestBase {

    @Test(priority = 1, groups = {Categories.BETAREGRESSION, Categories.TEST_REGRESSION,Categories.SMOKE}, description = "Verify all the ad banners appearing")
    public void VerifyAllTheADDBannersAppearing() {
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
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        testPage.VerifyAddBanner();
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        testPage.VerifyAddBanner();


    }
}