package regression.Test;

import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class LearnNowTestCases extends TestBase {

    @Test(groups = {Categories.BETAREGRESSION,Categories.TestREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify on click og Learn now tab,user navigate to Learn tab ")
    public void verifyOnClickOnLearnNowTabUserNavigateToLearnTab() {
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

        //verify Learn button is present with its ad banner in test landing page.
        testPage.verifyAllTheElementsOnMarketingBannersForLearn();
        logger.info("verifyAllTheElementsOnMarketingBannersForLearn");

        //verify On Click On Learn button User Navigate To Learn Tab from test landing page.
        testPage.clickOnLearnNowInTestScreen();
        logger.info("clickOnLearnNowInTestScreen");

        //LearnPageIsTheDefaultPage
      //  homePage.LearnPageIsTheDefaultPage();
        logger.info("LearnPageIsTheDefaultPage");

    }
}
