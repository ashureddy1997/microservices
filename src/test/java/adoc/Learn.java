package adoc;

import api.LearnHomeAPI;
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

public class Learn extends TestBase {
    LearnHomeAPI learnHomeAPI = new LearnHomeAPI();
    ExcelUtilities excelUtilities = new ExcelUtilities();
    ExcelUtility excelUtility = new ExcelUtility();
    String userDir = System.getProperty("user.dir");
    SignUpAPI signUpAPI = new SignUpAPI();
    int m = -1;

    @Test(dataProvider = "GoalAndExam", groups = {Categories.SANITY}, description = "VerifyLearnModuleSanityTestCases")
    public void VerifyLearnModuleSanityTestCases(String PrepareFor, String GoalName, String ExamName, String IsHeroBannerDisplay, String IsHeroBannerNameDisplay
            , String IsAllTheCarouselDisplay, String IsLearnButtonWorking, String IsNavigationToBookWorking, String IsNavigationToBookPracticeWorking
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
        homePage.clickOnLearnTab();

        //VerifyHeroBannerDisplay


        try {

            testPage.VerifyHeroBannerDisplay();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("Yes"), m, 3);
            homePage.clickOnLearnTab();
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("No"), m, 3);
            homePage.clickOnLearnTab();
        }


        //VerifyHeroBannerNameDisplay


        try {

            testPage.VerifyHeroBannerNameDisplay();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("Yes"), m, 4);
            homePage.clickOnLearnTab();
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("No"), m, 4);
            homePage.clickOnLearnTab();
        }


        //VerifyAllTheCarosuelsArePresentOnPractice
        Response response = learnHomeAPI.getHomeAPIData(embibeToken, signUpAPI.user_id, ExamName, GoalName);
        List<String> list = learnHomeAPI.getSectionNameList(response);
        System.out.println("" + list);
        try {
            testPage.verifyAllThecarosuelsArePresentOnTest(list);
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("Yes"), m, 5);
            homePage.clickOnLearnTab();
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("No"), m, 5);
            homePage.clickOnLearnTab();
        }

        //Learn button Working
        try {
            homePage.clickOnPracticeTab();
            homePage.clickOnLearnTab();
            learnPage.verifyLearnButtonWorking();
            learnPage.isVideoDisplay();
            driver().navigate().back();
            learnPage.clickOnQuitButton();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("Yes"), m, 6);
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("No"), m, 6);
        }
        //Learn NavigationToBook

        try {
            homePage.clickOnPracticeTab();
            homePage.clickOnLearnTab();
            homePage.clickOnBook(0);
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("Yes"), m, 7);
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("No"), m, 7);
        }

        //Navigation To book Practice

        try {

            bookPage.clickOnChapterName(0);
            //   bookPage.clickOnChapterName(0);
            bookPracticePage.clickOnPractice();
            bookPracticePage.verifyAllElementsOnThePracticePage();
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("Yes"), m, 8);
        } catch (Exception e) {
            excelUtility.writeExcel(userDir, "GoalAndExam.xlsx", "Learn", String.valueOf("No"), m, 8);
        }

    }

    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Learn", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}

