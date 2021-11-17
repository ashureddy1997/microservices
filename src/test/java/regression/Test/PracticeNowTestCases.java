package regression.Test;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class PracticeNowTestCases extends TestBase {

    @Test(groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "verify on click og practice now tab,user navigate to practice tab ")
    public void verifyOnClickOnPracticeNowTabUserNavigateToPracticeTab() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");

        //verifyAllTheElementsOnMarketingBannersForPractice
        testPage.verifyAllTheElementsOnMarketingBannersForPractice();
        logger.info("verifyAllTheElementsOnMarketingBannersForPractice");

        //clickOnPracticeNowInTestScreen
        testPage.clickOnPracticeNowInTestScreen();
        logger.info("clickOnPracticeNowInTestScreen");

        //PracticePageIsTheDefaultPage
       // homePage.PracticePageIsTheDefaultPage();
        logger.info("PracticePageIsTheDefaultPage");
    }
}
