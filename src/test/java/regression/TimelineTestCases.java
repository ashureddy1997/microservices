package regression;

import api.ConnectedProfile;
import api.LoginAPI;
import api.ResetTest;
import constant.Exam;
import constant.Goal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class TimelineTestCases extends TestBase {

    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");
    @Test(dataProvider= "GoalAndExam",priority = 1,groups = {Categories.Timeline}, description = "verify Video Count Is Correct")
    public void verifyVideoCountIsCorrect(String User_name , String User_Password, String ChildName) {
        logger.info("launch the app");
        logger.info("login with username:- " + User_name + " , password:-" + User_Password);
        logger.info("Login with username and password "+User_name+" , "+User_Password);
        loginPage.navigationToSignInScreen();
        logger.info("navigationToSignInScreen");
        loginPage.clickOnSignInWithPassword();
        logger.info("navigationToSignInScreen");
        loginPage.loginAs(User_name,User_Password);
        logger.info("loginAs");
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.clickOnMyHomeTile();
        logger.info("clickOnMyHomeTile");
        timelinePage.verifyVideoCount();
        logger.info("verify Video Count is correct ");
    }

    @Test(dataProvider= "GoalAndExam",priority = 2,groups = {Categories.Timeline}, description = "verify Practice Count Is Correct")
    public void verifyPracticeCountIsCorrect(String User_name , String User_Password, String ChildName ) {
        logger.info("launch the app");
        logger.info("login with username:- " + User_name + " , password:-" + User_Password);
        logger.info("Login with username and password "+User_name+" , "+User_Password);
        loginPage.navigationToSignInScreen();
        logger.info("navigationToSignInScreen");
        loginPage.clickOnSignInWithPassword();
        logger.info("navigationToSignInScreen");
        loginPage.loginAs(User_name,User_Password);
        logger.info("loginAs");
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.clickOnMyHomeTile();
        logger.info("clickOnMyHomeTile");
        timelinePage.verifyPracticeCount();
        logger.info("verify Practice Count is correct ");

    }

    @Test(dataProvider= "GoalAndExam",priority = 3,groups = {Categories.Timeline}, description = "verify Test Count Is Correct")
    public void verifyTestCountIsCorrect(String User_name , String User_Password, String ChildName) {
        logger.info("launch the app");
        logger.info("login with username:- " + User_name + " , password:-" + User_Password);
        logger.info("Login with username and password "+User_name+" , "+User_Password);
        loginPage.navigationToSignInScreen();
        logger.info("navigationToSignInScreen");
        loginPage.clickOnSignInWithPassword();
        logger.info("navigationToSignInScreen");
        loginPage.loginAs(User_name,User_Password);
        logger.info("loginAs");
        homePage.clickOnHomeTab();
        logger.info("clickOnHomeTab");
        userHomePage.clickOnMyHomeTile();
        logger.info("clickOnMyHomeTile");
        timelinePage.verifyTestCount();
        logger.info("verify Test Count is correct ");



    }

    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Users", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}