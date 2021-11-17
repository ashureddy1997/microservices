package regression.Test;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class HeroBannerTestCases extends TestBase {

    @Test(groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.REGRESSION,Categories.TestREGRESSION,Categories.SMOKE}, description = "verify all the elements of hero banner of test ")
    public void verifyAllTheElementsOfHeroBanner() {
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
        String goal=  userHomePage.verifyGoal();
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");

        logger.info("VerifyHeroBannerNameDisplay");
        testPage.VerifyHeroBannerDisplay();
        logger.info("VerifyHeroBannerDisplay");
        testPage.verifyHeroBannerAvatar();
        logger.info("verifyHeroBannerAvatar");
        testPage.verifyHeroBannerDescription();
        logger.info("verifyHeroBannerDescription");
        String goalName=testPage.verifyHeroBannerActionGoalSwitch();
        logger.info("verifyHeroBannerActionGoalSwitch");
        testPage.verifyHeroBannerCoins();
        logger.info("verifyHeroBannerCoins");


    }

}
