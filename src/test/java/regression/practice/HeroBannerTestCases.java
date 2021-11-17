package regression.practice;


import com.github.javafaker.Cat;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class HeroBannerTestCases extends TestBase {
    @Test(priority = 1,groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "verify heroBanner Name Display")
    public void verifyAllTheElementsOnHeroBanner() {
        logger.info("verify heroBanner Name Display");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on PracticeTab");
        homePage.clickOnPracticeTab();
        logger.info("Verify HeroBanner Display");
        practicePage.VerifyHeroBannerDisplay();
        logger.info("verify HeroBanner Description Display");
        practicePage.verifyHeroBannerDescriptionDisplay();
        logger.info("verify HeroBanner SubjectName Display");
        practicePage.verifyHeroBannerSubjectNameDisplay();
        logger.info("verify HeroBanner Concepts Display");
        practicePage.verifyHeroBannerConceptsDisplay();
    }
    @Test(priority = 2,groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "verify heroBanner Name Display")
    public void verifyAlTheElementsOnHeroBanner() {
        logger.info("verify heroBanner Name Display");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyembiumcoinDisplay();
        logger.info("Click on PracticeTab");
        homePage.verifyClickOnPracticeTab();
        homePage.verifyembiumcoinDisplay();
        homePage.clickOnTestTab();
        homePage.verifyembiumcoinDisplay();
        homePage.clickOnHomeTab();
        homePage.verifyembiumcoinDisplay();


    }


}

