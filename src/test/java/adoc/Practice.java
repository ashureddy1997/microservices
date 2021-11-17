package adoc;


import api.PracticeAPI;
import api.SignUpAPI;
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


public class Practice extends TestBase {

    PracticeAPI practiceAPI = new PracticeAPI();
    ExcelUtilities excelUtilities = new ExcelUtilities();
    ExcelUtility excelUtility = new ExcelUtility();
    String userDir = System.getProperty("user.dir");
    SignUpAPI signUpAPI = new SignUpAPI();
    int m = -1;

    @Test(priority = 1, dataProvider = "GoalAndExam", groups = {Categories.SANITY}, description = "VerifyPracticeModuleSanityTestCases")
    public void VerifyPracticeModuleSanityTestCases(String PrepareFor, String GoalName, String ExamName, String IsHeroBannerDisplay, String IsHeroBannerNameDisplay
            , String IsAllTheCarouselDisplay, String IsPracticeNowButtonWorking, String IsPracticeOnChapterWorking
    ) throws IOException {
        m++;
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
        homePage.clickOnPracticeTab();

        //VerifyHeroBannerDisplay


        try {

            testPage.VerifyHeroBannerDisplay();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("Yes"), m, 3);
            homePage.clickOnPracticeTab();
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("No"), m, 3);

            homePage.clickOnPracticeTab();
        }


        //VerifyHeroBannerNameDisplay


        try {

            testPage.VerifyHeroBannerNameDisplay();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("Yes"), m, 4);
            homePage.clickOnPracticeTab();
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("No"), m, 4);
            homePage.clickOnPracticeTab();
        }


        //VerifyAllTheCarosuelsArePresentOnPractice
        Response response = practiceAPI.getPracticeHomeAPIResponse(embibeToken, signUpAPI.user_id, ExamName, GoalName);
        List<String> list = practiceAPI.getSectionNameList(response);
        System.out.println("" + list);
        try {
            practicePage.verifyAllThecarosuelsArePresentOnPractice(list);
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("Yes"), m, 5);
            homePage.clickOnPracticeTab();
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("No"), m, 5);
            homePage.clickOnPracticeTab();
        }

        //verifyPracticeNowButton
        try {
            homePage.clickOnTestTab();
            homePage.clickOnPracticeTab();
            practicePage.clickOnPracticeNowButton();
            practicePage.clickOnEndSessionButton();
            practicePage.clickOnQuit();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("Yes"), m, 6);
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("No"), m, 6);
            practicePage.clickOnGoBack();


        }

        //verifyPracticeFromChapter
        try {

            homePage.clickOnPracticeTab();
            practicePage.clickOnPracticeFromChapterPractice(list.get(2));
            practicePage.clickOnStartPracticeButton();
            practicePage.clickOnEndSessionButton();
            practicePage.clickOnQuit();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("Yes"), m, 7);
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Practice", String.valueOf("No"), m, 7);
            practicePage.clickOnGoBack();


        }


    }

    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Practice", userDir + "/GoalAndExam.xlsx");
        return data;
    }

}