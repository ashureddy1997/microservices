package regression.Test;

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

public class TestPaperSummary_TestCases extends TestBase {
    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test(dataProvider= "selectChild",groups = {Categories.TestREGRESSION,Categories.UserHomeAndTestBeta, Categories.BETAREGRESSION}, description = "Click on side Menu and view question summary")
    public void VerifyIfUserCanViewQuestionSummaryByClickingOnSideMenuBar( String Child) {
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
        //homePage.clickOnHomeTab();

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

        takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");

        //VerifyAllTheElementsOnTestSummaryScreen
        testPaperSummaryPage.verifyAllElementsOnTestSummary();
        logger.info("verifyAllElementsOnTestSummary");

         resetTest.resetTest("mb130708",childEmbibeToken);


    }


    @Test( dataProvider= "selectChild", groups = {Categories.BETA_SANITY,Categories.TestREGRESSION,Categories.UserHomeAndTestBeta, Categories.BETAREGRESSION}, description = "Verify If User Can Click On Instruction Tab In Test Summary Screen And View The Instruction Details")
    public void VerifyIfUserCanClickOnInstructionTabInTestSummaryScreenAndViewTheInstructionDetails( String Child) {
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
        //homePage.clickOnHomeTab();

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

        takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");
        testPaperSummaryPage.clickOnInstructionTab();
        logger.info("clickOnInstructionTab");

        //verifyElementsOfInstructionsScreenOfTestSummary
        testPaperSummaryPage.verifyElementsOfInstructionsScreenOfTestSummary();
        logger.info("verifyElementsOfInstructionsScreenOfTestSummary");

        //VerifyIfUserCanClickOnNavigationTabAndNavigateToViewDetails
        testPaperSummaryPage.clickOnNavigationTab();
        logger.info("clickOnNavigationTab");

        //VerifyAllTheElementsOnNavigationTab
        testPaperSummaryPage.verifyElementsOnNavigationScreenOfTestSummary();
        logger.info("verifyElementsOnNavigationScreenOfTestSummary");

          resetTest.resetTest("mb130708",childEmbibeToken);


    }

    @Test( dataProvider= "selectChild",  groups = {Categories.TestREGRESSION,Categories.UserHomeAndTestBeta, Categories.BETAREGRESSION}, description = "Verify If User Can Click On View Paper Tab In Test Summary Screen And View The Paper Details")
    public void VerifyIfUserCanClickOnViewPaperTabInTestSummaryScreenAndViewThePaperDetails( String Child) {
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
        //homePage.clickOnHomeTab();

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
        takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");
        testPaperSummaryPage.clickOnViewPaper();
        logger.info("clickOnViewPaper");
        testPaperSummaryPage.verifyElementsOnViewPaperScreenOfTestSummary();
        logger.info("verifyElementsOnViewPaperScreenOfTestSummary");

        //VerifyIfUserCanClickOnFilterByAttemptTypesAndViewTheDifferentParametersForFilteringTheQuestionlist
        testPaperSummaryPage.clickOnFilterByAttemptTypes();
        logger.info("clickOnFilterByAttemptTypes");

        //VerifyAllTheElementsOnFilterByAttemptTypesScreen
        testPaperSummaryPage.verifyElementsOnFilterByAttemptTypeScreen();
        logger.info("verifyElementsOnFilterByAttemptTypeScreen");

        //VerifyIfUserCanFilterTheQuestionListByApplyingTheDifferentParameters
        testPaperSummaryPage.clickOnFilterParametersCheckBox();
        logger.info("clickOnFilterParametersCheckBox");

        //VerifyIfUserCanFilterQuestionByCheckingTheFilterParameter
        testPaperSummaryPage.clickOnFilterByAttemptTypes();
        logger.info("clickOnFilterByAttemptTypes");

        //VerifyIfUserCanClearTheFilterOnQuestionByUncheckingTheFilterParameters
        testPaperSummaryPage.UncheckFilterParameters();
        logger.info("UncheckFilterParameters");

         resetTest.resetTest("mb130708",childEmbibeToken);

    }


    @Test( dataProvider= "selectChild", groups = {Categories.TestREGRESSION,Categories.UserHomeAndTestBeta, Categories.BETAREGRESSION}, description = "Verify If User Can Click On Different Question Attempt Type Tabs And Filter The Test Summary Questions")
    public void VerifyIfUserCanClickOnDifferentQuestionAttemptTypeTabsAndFilterTheTestSummaryQuestions(String Child) {
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
        //homePage.clickOnHomeTab();

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
        takeTestPage.clickOnsideMenuBar();
        logger.info("clickOnsideMenuBar");
        testPaperSummaryPage.FilterTestSummaryByAnswered();
        logger.info("FilterTestSummaryByAnswered");
        testPaperSummaryPage.FilterTestSummaryByNotAnswered();
        logger.info("FilterTestSummaryByNotAnswered");
        testPaperSummaryPage.FilterTestSummaryByNotVisited();
        logger.info("FilterTestSummaryByNotVisited");
        testPaperSummaryPage.FilterTestSummaryByMarkedForReview();
        logger.info("FilterTestSummaryByMarkedForReview");
        testPaperSummaryPage.FilterTestSummaryByAnsweredAndMarkedForReview();
        logger.info("FilterTestSummaryByAnsweredAndMarkedForReview");

          resetTest.resetTest("mb130708",childEmbibeToken);


    }
    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }
    @DataProvider(name = "selectChild")
    public Object[][] changeGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("ChildName", userDir + "/ChangeGoal.xlsx");
        return data;
    }

}
