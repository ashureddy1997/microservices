package regression.userHome;

import api.ConnectedProfile;
import api.LoginAPI;
import api.ResetTest;
import api.SignUpAPI;
import constant.Exam;
import constant.Goal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class MyHome_TestCases extends TestBase {

    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    SignUpAPI signUpAPI = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test( dataProvider= "selectChild",  groups = {Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories.Timeline}, description = "verify If User Can Click On ViewFeedBack And Navigate To View Feedback Of Test verify All The Elements On Feedback Screen ")
    public void verifyTestDetailsTakenByChildIsAppearing(String Child) {
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
        loginPage.clickOnProfile(1);
        logger.info("clickOnProfile");
        homePage.clickOnHomeTab();

        loginPage.clickOnHeroBannerAvatar();
        loginPage.selectAProfile(1);

        homePage.clickOnTestTab();

            //code
            loginAPI=new LoginAPI();
            resetTest=new ResetTest();
            String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
            ConnectedProfile connectedProfile=new ConnectedProfile();
            String childEmbibeToken= connectedProfile.getEmbibeToken(Child ,embibeToken);
            resetTest.resetTest("mb130708",childEmbibeToken);

            testPage.clickOnTakeTestButton();
            takeTestPage.clickOnCheckBox();
            logger.info("clickOnCheckBox");
            takeTestPage.clickOnStartNowButton();
            logger.info("clickOnStartNowButton");

            takeTestPage.clickOnSaveAndNext();
            logger.info("clickOnSaveAndNext");
            takeTestPage.clickOnSubmitButton();
            logger.info("clickOnSubmitButton");
            takeTestPage.clickOnSubmitTestButton();
            logger.info("clickOnSubmitTestButton");
            takeTestPage.clickOnContinueToTestFeedback();
            logger.info("clickOnContinueToTestFeedback");

            driver().navigate().back();
            homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.clickOnMyHomeTile();
        logger.info("clickOnMyHomeTile");

        timelinePage.verifyTestDetailsTakenByChild();
        logger.info("verifyTestDetailsTakenByChild");

        resetTest.resetTest("mb130708",childEmbibeToken);

    }

    @Test(groups = {Categories.Descoped}, description = "verifyVideoWatchedDetailsByChildIsAppearing.")
    public void verifyVideoWatchedDetailsByChildIsAppearing() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("verifyElementsOnHeroBanner");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");

        studentActivitiesPage.clickOnVideo();
        logger.info("clickOnVideo");
        studentActivitiesPage.verifyNavigationToVideoScreen();
        logger.info("verifyNavigationToVideoScreen");
        studentActivitiesPage.clickOnVideoPlayButton();
        logger.info("clickOnVideoPlayButton");
        driver().navigate().back();
        studentActivitiesPage.clickOnQuit();
        logger.info("clickOnQuit");
        driver().navigate().back();
        //driver().navigate().back();

        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.clickOnMyHomeTile();
        logger.info("clickOnMyHomeTile");
        // timelinePage.clickOnExpandButton();
        //logger.info("clickOnExpandButton");
        timelinePage.verifyVideoWatchedDetailsByChild();
        logger.info("verifyVideoWatchedDetailsByChild");

    }

    @Test(groups = {Categories.Descoped}, description = "verifyTodayIsDisplayedInParentTimelineReport")
    public void verifyTodayIsDisplayedInParentTimelineReport() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("verifyElementsOnHeroBanner");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");

        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.clickOnMyHomeTile();
        logger.info("clickOnMyHomeTile");
        timelinePage.verifyTodayIsDisplayed();
        logger.info("verifyTodayIsDisplayed");
    }
    @DataProvider(name = "selectChild")
    public Object[][] changeGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("ChildName", userDir + "/ChangeGoal.xlsx");
        return data;
    }

}