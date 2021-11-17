package regression.practice;

import api.SignUpAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.onboardingPage.OnboardingPage;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class PracticeTakingTestCases extends TestBase {
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");
    SignUpAPI signUpAPI = null;


    @Test(dataProvider= "GoalAndExam",priority =1 ,groups = {Categories.Descoped}, description = "Verify User Is Able To Take Practice")
    public void VerifyUserIsAbleToTakePractice( String PrepareFor, String GoalName, String ExamName) throws InterruptedException {
        logger.info("launch the app");
        loginPage.navigationToSignInScreen();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
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
        logger.info("clickOnProfile");
        homePage.verifyClickOnPracticeTab();
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        homePage.clickOnBook(0);
        logger.info("clickOnBook");
        Thread.sleep(5000);
        bookPage.clickOnChapterName(0);
        logger.info("clickOnChapter");
        Thread.sleep(5000);
        bookPage.clickOnChapterName(1);
        logger.info("clickOnChapter");
        practicePage.verifyUserCanTakePractice();
        logger.info("clickOnPractice");

        logger.info("switch TO Webview");
        for(int i=0;i<400;i++) {
            practicePage.switchToWebView();
            practiceTakingPage.Attempt();


            if (practiceTakingPage.isPracticeOver()) {
                System.out.println("Practice over");
                break;
            }
        }
        logger.info("Attempt Practice");
    }

    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}
