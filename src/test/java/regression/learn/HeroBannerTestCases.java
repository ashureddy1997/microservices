package regression.learn;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class HeroBannerTestCases extends TestBase {
    @Test(priority = 1,groups = {Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "verify heroBanner Name Display")
    public void verifyHeroBannerNameDisplay()  {
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
        logger.info("Verify the Learn Module page is loaded completely");
        learnPage.VerifyHeroBannerNameDisplay();

    }

    @Test(priority = 2,groups = {Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify HeroBanner Description Display")
    public void verifyHeroBannerDescriptionDisplay()  {
        logger.info("Verify HeroBanner Description Display");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on Learn Tab");
        learnPage.verifyHeroBannerDescriptionDisplay();
    }
    @Test(priority =3,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify HeroBanner Video Duration display")
    public void verifyHeroBannerVideoDurationDisplay()  {
        logger.info("Verify HeroBanner Video Duration display");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.verifyHeroBannerVideoDurationDisplay();


    }

    @Test(priority = 4,groups = {Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "verify HeroBanner Subject Name Display")
    public void verifyHeroBannerSubjectNameDisplay() {
        logger.info("verify HeroBanner Subject Name Display");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.verifyHeroBannerSubjectNameDisplay();
        logger.info("Verify that the name of the subject is present below topic name");

    }

    @Test(priority = 5,groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "verify HeroBanner Concepts Display")
    public void verifyHeroBannerConceptsDisplay()  {
        logger.info("verify HeroBanner Concept Display");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        practicePage.verifyHeroBannerConceptsDisplay();

    }

    @Test(priority = 6,groups = {Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify All The Elements On Practice SummeryPage HeroBanner")
    public void VerifyAllTheElementsOnPracticeSummeryPageHeroBanner()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on LearnTab");
        homePage.LearnPageIsTheDefaultPage();
        logger.info("Verify the Learn Module page is loaded completely");
        learnPage.ClickOnChaptersInLearnHomepage();
      //  learnPage.VerifyUserCanLikeTheSummeryPageVideoByClickingOnBookMarkButton();
        logger.info("Verify that Bookmark button is present and functional");
      //  learnPage.VerifyUserCanBookMarkTheSummeryPageVideoByClickingOnBookMarkButton();
        logger.info("Verify if the user is able to bookmark/in-bookmark the topic");
        learnPage.verifyHeroBannerSubjectNameDisplay();
        logger.info("Verify that the name of the subject is present below topic name");
        learnPage.verifyHeroBannerDescriptionDisplay();
        logger.info("Verify that Like button is present and functional");
        learnPage.verifyLearnButtonWorkingInSummeyPage();
        logger.info("Verify if the user is able to like/un-like the topic");

    }



}
