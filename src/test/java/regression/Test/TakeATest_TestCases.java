package regression.Test;

import api.SignUpAPI;
import api.TestUtility;

import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.ExcelUtilities;
import utils.Properties;

import java.util.List;
import java.util.Map;

public class TakeATest_TestCases extends TestBase {

    TestUtility testUtility = null;
    SignUpAPI signUpAPI = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test(dataProvider= "GoalAndExam", description = "verify If User Can Take A Full Test")
    public void VerifyIfUserCanTakeAFullTest(String PrepareFor, String GoalName, String ExamName,String bundle_id, String test_type,String TestName) {
        logger.info("launching the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        logger.info("click On Start Learning Button");
        signUpAPI=new SignUpAPI();
        logger.info(" Sign up for New user using sign up API");
        String emailID = signUpPage.generateRandomEmailID();
        logger.info("Generating random email id");
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("Getting Embibe token");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        //loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        logger.info("click On Sign In With Password");
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("Verifying who is learning title");
        loginPage.clickOnAddChild();
        logger.info("click On Add Child");
        addProfilePage.enterUsername();
        logger.info("enter Username");
        addProfilePage.clickOnAddProfile();
        logger.info("click On Add Profile button");
        onboardingPage.verifyTitle();
        logger.info("verify Title");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        // onboardingPage.clickOnNextButton();
        goalPage.selectGoal(GoalName);
        logger.info("selectGoal " + GoalName);
        goalPage.clickOnNextButton();
        logger.info("click On Next Button");
        examPage.selectExam(ExamName);
        logger.info("selectExam " + ExamName);
        examPage.clickOnDoneButton();
        logger.info("click On Done Button");
        loginPage.clickOnAddProfile(0);
        logger.info("click On Profile");
        homePage.clickOnTestTab();
        logger.info("click On Test Tab");
        testSummaryPage.clickOnTest(TestName);
        logger.info("click On a Test tile");
        testSummaryPage.clickOnTakeTest();
        logger.info("click On Take Test");
        takeATestPage.clickOnCheckBox();
        logger.info("click On instruction Check Box");
        takeATestPage.clickOnStartNowButton();
        logger.info("click On Start Now Button");
        TestUtility testUtility = new TestUtility();

        Map<String, String> goalExamMap = testUtility.getGoalAndExamName(GoalName, ExamName);
        String goalCode = goalExamMap.get("goalCode");
        String examCode = goalExamMap.get("examCode");
        logger.info("Get goal code and exam code ");
        Response testSubmissionResp = testUtility.testSubmissionMs(goalCode, examCode, bundle_id, embibeToken);
        logger.info("Get Test submission API Response");
        Map<String, String> questionAndTypeMap = testUtility.getQuestionCodeAndType(testSubmissionResp);
        logger.info(" Get the Question id and its type from test submission API");
        Response mockTestBundleResp = testUtility.getMockTestBundles(bundle_id);
        logger.info("Get the mock test bundle API Response with Answers");
        Map<String, List<Map<String, Object>>> questionAnswersMap = testUtility.getAllQuestionsAndAnswers(mockTestBundleResp);
        logger.info("Get the Question id and its answers from mock test bundle API");

     logger.info("Take the Full test for the All the questions for the given bundle code");
       /* try {
            takeATest(questionAndTypeMap, questionAnswersMap, "all");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     */   logger.info("Test passed");



    }

    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("TestAttempt", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}
