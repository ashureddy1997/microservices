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

public class StudentActivities_TestCase extends TestBase {
    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test(dataProvider= "GoalAndExam",groups = {Categories.Timeline}, description = "verify Student's Activities")
    public void verifyStudentActivities(String User_name , String User_Password, String ChildName)  {
        logger.info("launch the app");
        logger.info("login with username:- " + User_name + " , password:-" + User_Password);
        logger.info("Login with username and password "+User_name+" , "+User_Password);
        loginPage.navigationToSignInScreen();
        logger.info("navigationToSignInScreen");
        loginPage.clickOnSignInWithPassword();
        logger.info("navigationToSignInScreen");
        loginPage.loginAs(User_name,User_Password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(1);
        logger.info("clickOnProfile");

// Test attempt code
        homePage.clickOnTestTab();
        //Switch goal to JEE Mians
        userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");

        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(User_name,User_Password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken(ChildName ,embibeToken);
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


// Attept learn video code
        studentActivitiesPage.clickOnLearnTab();
        logger.info("clickOnLearnTab");
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
        driver().navigate().back();

//Practice taking code

        homePage.verifyClickOnPracticeTab();
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        homePage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        homePage.clickOnBook(0);
        logger.info("clickOnBook");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bookPage.clickOnChapterName(0);
        logger.info("clickOnChapter");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bookPage.clickOnChapterName(1);
        logger.info("clickOnChapter");
        practicePage.verifyUserCanTakePractice();
        logger.info("clickOnPractice");

        logger.info("switch TO Webview");
        for(int i=0;i<400;i++) {
            practicePage.switchToWebView();
            try {
                practiceTakingPage.Attempt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            if (practiceTakingPage.isPracticeOver()) {
                System.out.println("Practice over");
                break;
            }
        }
        logger.info("Attempt Practice");
    }




    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Users", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}
