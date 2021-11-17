package regression;


import constant.Exam;
import constant.Goal;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

import java.util.NoSuchElementException;

public class HomeTestCases extends TestBase {
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify Profile Selection")
    public void verifyProfileSelection()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
    }

    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify all the Tab Display Learn, Practice, Test, Achieve and More")
    public void verifyAllTheTabDisplay()  {
        logger.info("verify all the Tab Display Learn, Practice, Test, Achieve and More");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifyAllTheTabDisplay();

    }


    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify Search button display")
    public void verifySearchButtonDisplay()  {
        logger.info("verify Search button display");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifySearchButtonDisplay();

    }

    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify Click On Practice tab is working")
    public void verifyClickOnPracticeTab()  {
        logger.info("verify Click On Practice tab is working");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifyClickOnPracticeTab();

    }
    @Test(groups = {Categories.BETA_SANITY,Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify Click On Test tab is working")
    public void verifyClickOnTestTab()  {
        logger.info("verify Click On Test tab is working");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
      //  homePage.clickOnHomeTab();
        homePage.verifyClickOnTestTab();

    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify Click On Achieve tab is working")
    public void verifyClickOnAchieveTab()  {
        logger.info("verify Click On Achieve tab is working");
        logger.info("launch the app");

        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        // homePage.verifyClickOnAchieveTab();

    }
    @Test(groups = {Categories.Descoped}, description = "verify Click On More tab is working")
    public void verifyClickOnMoreTab()  {
        logger.info("verify Click On More tab is working");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.verifyClickOnMoreTab();


    }

    @Test( description = "Verify Goal Selection Screen UI")
    public void VerifyGoalSelectionScreenUI()  {
        logger.info("Verify Goal Selection Screen UI");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.clickOnSwitchGoal();
        goalPage.verifyAllTheElementPresent();

    }

    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify Exam Selection Screen UI")
    public void VerifyExamSelectionScreenUI()  {
        logger.info("Verify Exam Selection Screen UI");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username,Properties.password);
        logger.info("login");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.SSC);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllTheElementPresent();
        logger.info("verifyAllTheElementPresent");

    }

    @Test( description = "Verify Goal And Exam Switch reflecting on Home screen")
    public void VerifyGoalAndExamSwitch()  {
        logger.info("Verify Goal And Exam Switch reflecting on Home screen");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+Properties.username+" , "+Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0)+" ");
        homePage.clickOnSwitchGoal();
        goalPage.selectGoal(Goal.CBSE);
        goalPage.clickOnNextButton();
        examPage.selectExam(Exam.SIXTH_CBSE);
        examPage.clickOnDoneButton();
        try {
            Thread.sleep(5000);
        }
        catch (NoSuchElementException | InterruptedException e){

        }
        homePage.verifyGoalSwitch(Exam.SIXTH_CBSE);

    }




}
