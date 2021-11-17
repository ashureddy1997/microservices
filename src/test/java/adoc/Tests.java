package adoc;

import api.SignUpAPI;
import api.TestAPI;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.ExcelUtility;
import utils.Properties;

import java.io.IOException;
import java.util.List;

public class Tests extends TestBase {
    TestAPI testAPI = new TestAPI();
    ExcelUtilities excelUtilities = new ExcelUtilities();
    ExcelUtility excelUtility = new ExcelUtility();
    String userDir = System.getProperty("user.dir");
    SignUpAPI signUpAPI = new SignUpAPI();
    int m = 1;


    @Test(priority = -1, dataProvider = "GoalAndExam", groups = {Categories.SANITY}, description = "VerifyTestModuleSanityTestCases")
    public void VerifyTestModuleSanityTestCases(String PrepareFor, String GoalName, String ExamName, String IsHeroBannerDisplay, String IsHeroBannerNameDisplay
            , String IsAllTheCarouselDisplay, String IsTakeTestButtonWorking, String IsInstructionScreenDisplay, String IsTakingTestWorking
    ) throws IOException {
        m++;
        logger.info(GoalName + " " + ExamName);
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username: " + emailID + " , password:" + Properties.password);
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();

        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(PrepareFor);
        logger.info("clickONPrepare " + PrepareFor);
        onboardingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(GoalName);
        logger.info("selectGoal " + GoalName);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(ExamName);
        logger.info("selectExam " + ExamName);
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        loginPage.clickOnAddProfile(0);
        homePage.clickOnTestTab();

        //VerifyHeroBannerDisplay


        try {

            testPage.VerifyHeroBannerDisplay();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("Yes"), m, 3);
            homePage.clickOnTestTab();
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("No"), m, 3);
            homePage.clickOnTestTab();
        }


        //VerifyHeroBannerNameDisplay


        try {

            testPage.VerifyHeroBannerNameDisplay();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("Yes"), m, 4);
            homePage.clickOnTestTab();
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("No"), m, 4);
            homePage.clickOnTestTab();
        }


        //VerifyAllTheCarosuelsArePresentOnPractice
        Response response = testAPI.getTestHomeAPIResponse(embibeToken, signUpAPI.user_id, ExamName, GoalName);
        List<String> list = testAPI.getSectionNameList(response);
        System.out.println("" + list);
        try {
            testPage.verifyAllThecarosuelsArePresentOnTest(list);
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("Yes"), m, 5);
            homePage.clickOnTestTab();
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("No"), m, 5);
            homePage.clickOnTestTab();
        }

        //ISclickONTake Test working
        try {
            homePage.clickOnTestTab();
            homePage.clickOnPracticeTab();
            homePage.clickOnTestTab();
            testPage.clickOnTakeTest();
            testSummaryPage.clickOnTakeTest();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("Yes"), m, 6);
        } catch (AssertionError e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("No"), m, 6);

        }
        //VerifyInstructionScreen
        try {
            takeTestPage.verifyElementsOnInstructionsScreen();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("Yes"), m, 7);
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("No"), m, 7);

        }

        try {
            takeTestPage.clickOnCheckBox();
            takeTestPage.clickOnStartNowButton();
            takeTestPage.verifyAllTheElementsOnTestScreen();
            takeTestPage.clickOnSaveAndNext();
            takeTestPage.clickOnSubmitButton();
            takeTestPage.clickOnSubmitTestButton();
            takeTestPage.clickOnContinueTest();
            driver().navigate().back();
            driver().navigate().back();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("Yes"), m, 8);
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Test", String.valueOf("No"), m, 8);
        }

    }


    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Test", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}
