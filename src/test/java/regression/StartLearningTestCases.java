package regression;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class StartLearningTestCases extends TestBase {

    @Test(groups = {Categories.SMOKE, Categories.REGRESSION,Categories.Descoped}, description = "Verify once the start learning screen is loaded the onboarding screens are displayed")
    public void verifyStartLearningScreenLoaded() {
        logger.info("launch the app");
        logger.info("Once the embibe screen is loaded the on-boarding screens should be displayed");
        startLearningPage.navigationStartLearning();
        startLearningPage.verifyAllElementsInOnStartLearningScreen();
    }
    @Test(groups = {Categories.SMOKE, Categories.REGRESSION,Categories.BETAREGRESSION}, description = "Verify on click on Start learning button in onboarding screen the user is directed to sign-in page")
    public void verifyNavigationToSignInPage() {
        logger.info("launch the app");
        logger.info("On click on start learning button in on-boarding screen the user should be directed to sign-in page");
        loginPage.navigationToSignInScreen();
    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.SMOKE, Categories.REGRESSION,Categories.BETAREGRESSION}, description = "Verify all element are present in sign in page as per the requirement")
    public void verifySignInPage(){
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        startLearningPage.verifyAllElementsOnSignInPage();

    }
}