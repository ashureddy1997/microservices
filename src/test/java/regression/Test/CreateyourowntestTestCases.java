package regression.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.ExcelUtility;
import utils.Properties;

import java.io.IOException;

public class CreateyourowntestTestCases extends TestBase {
    ExcelUtilities excelUtilities = new ExcelUtilities();
    ExcelUtility excelUtility = new ExcelUtility();
    String userDir = System.getProperty("user.dir");
    int m =-1;


    @Test(dataProvider= "GoalAndExam",priority = 0,groups = {Categories.REGRESSION}, description = "verify User Able To Create OwnTest")
    public void verifyUserAbleToCreateOwnTest( String GoalName, String ExamName,String IsTestCreated
    ) throws IOException {
        m++;
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
        homePage.clickOnSwitchGoal();
        goalPage.selectGoal(GoalName);
        logger.info("selectGoal " + GoalName);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(ExamName);
        logger.info("selectExam " + ExamName);
        examPage.clickOnDoneButton();
        homePage.clickOnTestTab();
        logger.info("clickOnTestTab");
        testPage.clickOnCreateYourOwnTest();
        logger.info("clickOnCreateYourOwnTest");
        testPage.verifyAllElementsOnCreateYourOwnTestScreen();
        logger.info("verifyAllElementsOnCreateYourOwnTestScreen");
        testPage.selectASubject(1);
        logger.info("selectASubject 2");
        testPage.clickOnContinueButtonFromStepOne();
        logger.info("clickOnContinueButtonFromStepOne");
        testPage.clickOnExpandSubject(0);
        logger.info("clickOnExpandSubject 1");
        testPage.selectChapters(1);
        testPage.selectChapters(2);
        testPage.clickOnQuickTestButton();
        logger.info("clickOnQuickTestButton");
        testPage.verifyTestCreatingProgress();
        logger.info("verifyTestCreatingProgress");
        testSummaryPage.verifyCustomTestName();
        logger.info("verifyCustomTestName");

        try {

            testSummaryPage.verifyCustomTestName();
            excelUtility.writeExcel(userDir, "CYOT.xlsx" ,"Test", String.valueOf("Yes"), m, 2);
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "CYOT.xlsx", "Test", String.valueOf("No"), m, 2);

        }

    }

        @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Test", userDir + "/CYOT.xlsx");
        return data;
    }
}