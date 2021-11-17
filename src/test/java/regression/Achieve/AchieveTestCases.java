package regression.Achieve;

import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class AchieveTestCases extends TestBase {
    @Test(groups = {Categories.BETAREGRESSION}, description = "verify User can Navigate to Achieve Tab")
    public void verifyUserCanNavigeToAchieveTab()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.clickOnAchieveTab();
        homePage.AchievePageIsTheDefaultPage();

    }
    @Test(groups = {Categories.BETAREGRESSION}, description = "verify All the Elements on Achieve Tab")
    public void verifyAllTheElementsOnAchieveTab()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.clickOnAchieveTab();
        homePage.AchievePageIsTheDefaultPage();
        achievePage.verifyAllTheElementOnAchieveHomePage();


    }

}
