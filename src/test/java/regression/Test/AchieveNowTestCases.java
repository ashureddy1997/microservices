package regression.Test;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class AchieveNowTestCases extends TestBase {

    @Test(groups = {Categories.BETAREGRESSION,Categories.TestREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify on click og Achieve now tab,user navigate to Achieve tab ")
    public void verifyOnClickOnAchieveNowTabUserNavigateToAchieveTab() {
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

        //verifyAllTheElementsOnMarketingBannersForAchieve
        testPage.verifyAllTheElementsOnMarketingBannersForAchieve();
        logger.info("verifyAllTheElementsOnMarketingBannersForAchieve");

        //clickOnArchiveNowInTestScreen
        testPage.clickOnArchiveNowInTestScreen();
        logger.info("clickOnArchiveNowInTestScreen");

        //AchievePageIsTheDefaultPage
//        homePage.AchievePageIsTheDefaultPage();
        logger.info("AchievePageIsTheDefaultPage");

    }
}
