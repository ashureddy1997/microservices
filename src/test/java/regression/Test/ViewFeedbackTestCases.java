package regression.Test;

import api.ConnectedProfile;
import api.LoginAPI;
import api.ResetTest;
import constant.Exam;
import constant.Goal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class ViewFeedbackTestCases extends TestBase {

    LoginAPI loginAPI =null;
    ResetTest resetTest = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test( dataProvider= "selectChild",  groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "verify If User Can Click On ViewFeedBack And Navigate To View Feedback Of Test verify All The Elements On Feedback Screen ")
    public void VerifyIfUserCanClickOnViewFeedBackAndNavigateToViewFeedbackOfTestVerifyAllTheElementsOnFeedbackScreen (String Child) {
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
      //  homePage.clickOnHomeTab();

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
        viewTestFeedBackPage.verifyElementsOnFeedbackScreen();
        logger.info("verifyElementsOnFeedbackScreen");
        resetTest.resetTest("mb130708",childEmbibeToken);


    }

    @Test(dataProvider= "selectChild",   groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "verify If user can click on score card and navigate to see details of score ")
    public void verifyIfUserCanClickOnScoreCardNndNavigateToSeeDetailsOfScore (String Child) {
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
      //  homePage.clickOnHomeTab();

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
        viewTestFeedBackPage.clickOnScoreCard();

        //VerifyAllTheElementsOnScoreDetailsScreen
        viewTestFeedBackPage.verifyElementsOnScoreDetailsPage();

        resetTest.resetTest("mb130708",childEmbibeToken);

    }
    @Test(dataProvider= "selectChild",  groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "verify If User Can Click On Your Top Skill And Navigate To See Details Of Top Skill ")
    public void verifyIfUserCanClickOnYourTopSkillAndNavigateToSeeDetailsOfTopSkill (String Child) {
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

        takeTestPage.clickOnSaveAndNext();
        logger.info("clickOnSaveAndNext");
        takeTestPage.clickOnSubmitButton();
        logger.info("clickOnSubmitButton");
        takeTestPage.clickOnSubmitTestButton();
        logger.info("clickOnSubmitTestButton");
        takeTestPage.clickOnContinueToTestFeedback();
        logger.info("clickOnContinueToTestFeedback");
        viewTestFeedBackPage.clickOnYourTopSkillCard();
        logger.info("clickOnYourTopSkillCard");
       // resetTest.resetTest("mb130708",childEmbibeToken);


    }
    @Test(dataProvider= "selectChild",  groups = {Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.TestREGRESSION}, description = "verify If User Can Click On Your Top Skill And Navigate To See Details Of Top Skill ")
    public void verifyIfUserCanClickOnQuestionWiseAnalysisWithSolutionsCardAndNavigateToViewDetailsOfIt (String Child) {
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");

        //VerifyAllTheElementsOnQuestionWiseAnalysisWithSolutionDetailsScreen
        viewTestFeedBackPage.verifyAllTheElementsOnQuestionWiseAnalysisWithSolutions();
        logger.info("verifyAllTheElementsOnQuestionWiseAnalysisWithSolutions");

         resetTest.resetTest("mb130708",childEmbibeToken);

            /*   SoftAssert softAssert=new SoftAssert();
        //Verify "View Test Feedback" button is displayed if User has already taken the Test.
        softAssert.assertNotEquals(takeTest,viewFeedBack,"view feedback is not displayed");*/
    }

  /*  @Test(  priority = 5, groups = {Categories.Descoped}, description = "Verify If user can expand Revision list by clicking on plus button ")
    public void VerifyIfUserCanExpandRevisionlistByClickingOnPlusButton() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
      *//*  userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
*//*
        //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnRevisionListPlusButton();
        logger.info("clickOnRevisionListPlusButton");

        resetTest.resetTest("mb130708",childEmbibeToken);

    }
    @Test(  priority = 6, groups = {Categories.Descoped}, description = "Verify If user can click on chapter you did not attempt Tab and navigate to see details. ")
    public void VerifyIfUserCanClickOnChapterYouDidNotAttemptTabAndNavigateToSeeDetails() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
       *//* userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
     *//*      //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnRevisionListPlusButton();
        logger.info("clickOnRevisionListPlusButton");
        viewTestFeedBackPage.clickOnChaptersYouDidNotAttemptTab();
        logger.info("clickOnChaptersYouDidNotAttemptTab");
        viewTestFeedBackPage.verifyElementsOnChaptersYouDidNotAttemptDetails();
        logger.info("verifyElementsOnChaptersYouDidNotAttemptDetails");
        viewTestFeedBackPage.clickOnAChapterFromChaptersYouDidNotAttempt();
        logger.info("clickOnAChapterFromChaptersYouDidNotAttempt");
        viewTestFeedBackPage.verifyElementsOnChapterDetailsOfYouDidNotAttempt();
        logger.info("verifyElementsOnChapterDetailsOfYouDidNotAttempt");

        //VerifyIfUserCanOpenTopicFromQuestionsYouDidNotAttempt
        String topicName=viewTestFeedBackPage.clickOnTopicOfYouDidNotAttempt();
        logger.info("clickOnTopicOfYouDidNotAttempt");
        String heroBannerName= learnPage.VerifyHeroBannerNameDisplay();
        logger.info("VerifyHeroBannerNameDisplay");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(topicName,heroBannerName,"topic name is not matching");
        logger.info("verifying topic name is matching or not");

         resetTest.resetTest("mb130708",childEmbibeToken);

    }

    @Test(  priority = 7, groups = {Categories.Descoped}, description = "Verify If user can expand Improve Your Test Taking Strategy List by clicking on plus button ")
    public void VerifyIfUserCanExpandImproveYourTestTakingStrategyTabByClickingOnPlusButton() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
       *//* userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
       *//*    //code

        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnImproveYourTestTakingStrategyTab();
        logger.info("clickOnImproveYourTestTakingStrategyTab");

        //verifyIfUserCanClickOnUnderstandMyNegativeBehaviourTabAndNavigateToViewDetails
        String titleTab= viewTestFeedBackPage.clickOnUnderstandMyNegativeBehaviourTab();
        logger.info("clickOnUnderstandMyNegativeBehaviourTab");

        //VerifyAllTheElementsOfUnderstandMyNegativeBehaviourDetailsScreen
        viewTestFeedBackPage.verifyElementOfUnderstandMyNegativeBehaviour();
        logger.info("verifyElementOfUnderstandMyNegativeBehaviour");

        //verifyIfUnderstandMyNegativeBehavioursTitleIsShownCorrect
        String title= viewTestFeedBackPage.verifyUnderstandMyNegativeBehavioursTitle();
        logger.info("verifyUnderstandMyNegativeBehavioursTitle");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(titleTab,title,"titles are not matching");
        logger.info("verifying title is matching or not");

        //verifyIfUerCanClickOnPlayButtonFromSincerityScoreCardAndContinueToLearningVideo
        viewTestFeedBackPage.clickOnPlayButtonOfSincerityScoreCard();
        logger.info("clickOnPlayButtonOfSincerityScoreCard");

        driver().navigate().back();
        //VerifyAllTheElementsOfQuitLearn
        viewTestFeedBackPage.verifyElementsOfQuitLearn();
        logger.info("verifyElementsOfQuitLearn");

        //verifyIfUserCanQuitFromContinueLearningScreenAndNavigateToPreviousScreen
        viewTestFeedBackPage.clickOnQuit();
        logger.info("clickOnQuit");
        viewTestFeedBackPage.verifyUnderstandMyNegativeBehavioursTitle();
        logger.info("verifyUnderstandMyNegativeBehavioursTitle");

         resetTest.resetTest("mb130708",childEmbibeToken);


    }

    @Test( priority = 8, groups = {Categories.Descoped}, description = "Verify If User Can Click On Perfect Attempts Tab And Navigate To View Details Of It")
    public void VerifyIfUserCanClickOnPerfectAttemptsTabAndNavigateToViewDetailsOfIt() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
       *//* userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
       *//*     //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");
        viewTestFeedBackPage.clickOnPerfectAttemptsAndNavigateToViewDetails();
        logger.info("clickOnPerfectAttemptsAndNavigateToViewDetails");

        //VerifyAllTheElementsOnThePerfectAttemptsDetailsScreen
        viewTestFeedBackPage.verifyAllElementsOnPerfectAttemptDetailsScreen();
        logger.info("verifyAllElementsOnPerfectAttemptDetailsScreen");

        resetTest.resetTest("mb130708",childEmbibeToken);


    }
    @Test(  priority = 9, groups = {Categories.Descoped}, description = "Verify that Overtime Correct Attempts Filter is present and functional,VerifyA ll Elements On Overtime Correct Attempts Details Screen ")
    public void verifyThatOvertimeCorrectAttemptsFilterIsPresentAndFunctionalVerifyAllElementsOnOvertimeCorrectAttemptsDetailsScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
      *//*  userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
       *//*     //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");
        String type_attempt1 = viewTestFeedBackPage.clickOnOvertimeCorrectAttempts();
        logger.info("clickOnOvertimeCorrectAttempts");
        viewTestFeedBackPage.verifyAllElementsOnAttemptTypeDetailsScreen();
        logger.info("verifyAllElementsOnAttemptTypeDetailsScreen");
        String typeAttempt = viewTestFeedBackPage.verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen();
        logger.info("verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(type_attempt1, typeAttempt, "Attempt Type is not matching , expected :Incorrect Attempts Filter,  actual" + type_attempt1);
        softAssert.assertAll();
        logger.info("verifying whether the attempt type is matching or not");

          resetTest.resetTest("mb130708",childEmbibeToken);

    }
    @Test(  priority = 9,groups = {Categories.Descoped}, description = "Verify that Too Fast Correct Attempts Filter is present and functional,VerifyA ll Elements On Too Fast Correct Attempts Details Screen ")
    public void verifyThatTooFastCorrectAttemptsFilterIsPresentAndFunctionalVerifyAllElementsOnTooFastCorrectAttemptsDetailsScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
       *//* userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
      *//*     //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");
        String type_attempt2 = viewTestFeedBackPage.clickOnTooFastCorrectAttempts();
        logger.info("clickOnTooFastCorrectAttempts");
        viewTestFeedBackPage.verifyAllElementsOnAttemptTypeDetailsScreen();
        logger.info("verifyAllElementsOnAttemptTypeDetailsScreen");
        String typeAttempt = viewTestFeedBackPage.verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen();
        logger.info("verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(type_attempt2, typeAttempt, "Attempt Type is not matching , expected :Incorrect Attempts Filter,  actual" + type_attempt2);
        softAssert.assertAll();
        logger.info("verifying that Attempt Type is matching or not");

         resetTest.resetTest("mb130708",childEmbibeToken);

    }

    @Test( priority = 10,groups = {Categories.Descoped}, description = "Verify that Incorrect Attempts filter is present and functional,VerifyA ll Elements On Incorrect Attempts Details Screen ")
    public void verifyThatIncorrectAttemptsFilterIsPresentAndFunctionalVerifyAllElementsOnIncorrectAttemptsDetailsScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
      *//*  userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
    *//*        //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");
        String type_attempt3= viewTestFeedBackPage.clickOnIncorrectAttempts();
        logger.info("clickOnIncorrectAttempts");
        viewTestFeedBackPage.verifyAllElementsOnAttemptTypeDetailsScreen();
        logger.info("verifyAllElementsOnAttemptTypeDetailsScreen");
        String typeAttempt= viewTestFeedBackPage.verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen();
        logger.info("verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(type_attempt3, typeAttempt, "Attempt Type is not matching , expected :Incorrect Attempts Filter,  actual" + type_attempt3);
        softAssert.assertAll();
        logger.info("verifying that Attempt Type is matching or not");

          resetTest.resetTest("mb130708",childEmbibeToken);

    }*/
   /* @Test( priority = 11,groups = {Categories.Descoped}, description = "Verify that Overtime Incorrect Attempts is present and functional,VerifyA ll Elements On Overtime Incorrect Attempts Details Screen ")
    public void verifyThatOvertimeIncorrectAttemptsFilterIsPresentAndFunctionalVerifyAllElementsOnOvertimeIncorrectAttemptsDetailsScreen( ) {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
       *//* userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
 *//*           //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");
        String type_attempt4 = viewTestFeedBackPage.clickOnOvertimeIncorrectAttempts();
        logger.info("clickOnOvertimeIncorrectAttempts");
        viewTestFeedBackPage.verifyAllElementsOnAttemptTypeDetailsScreen();
        logger.info("verifyAllElementsOnAttemptTypeDetailsScreen");
        String typeAttempt = viewTestFeedBackPage.verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen();
        logger.info("verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(type_attempt4, typeAttempt, "Attempt Type is not matching , expected :Incorrect Attempts Filter,  actual" + type_attempt4);
        softAssert.assertAll();
        logger.info("verifying that Attempt Type is matching or not");

           resetTest.resetTest("mb130708",childEmbibeToken);

    }*/
   /* @Test( priority = 12,groups = {Categories.Descoped}, description = "Verify that Wasted Attempts is present and functional,VerifyA ll Elements On Wasted Attempts Details Screen ")
    public void verifyThatWastedAttemptsFilterIsPresentAndFunctionalVerifyAllElementsOntWastedAttemptsDetailsScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
      *//*  userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
  *//*     //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");
        String type_attempt5 = viewTestFeedBackPage.clickOnWastedAttempts();
        logger.info("clickOnWastedAttempts");
        viewTestFeedBackPage.verifyAllElementsOnAttemptTypeDetailsScreen();
        logger.info("verifyAllElementsOnAttemptTypeDetailsScreen");
        String typeAttempt = viewTestFeedBackPage.verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen();
        logger.info("verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(type_attempt5, typeAttempt, "Attempt Type is not matching , expected :Incorrect Attempts Filter,  actual" + type_attempt5);
        softAssert.assertAll();
        logger.info("verifying that Attempt Type is matching or not");

          resetTest.resetTest("mb130708",childEmbibeToken);

    }*/
    @Test( dataProvider= "selectChild", groups = {Categories.TestREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify that Unattempted is present and functional,VerifyA ll Elements On Unattempted Details Screen ")
    public void verifyThatUnattemptedFilterIsPresentAndFunctionalVerifyAllElementsOnUnattemptedDetailsScreen(String Child ) {
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");
        String type_attempt6 = viewTestFeedBackPage.clickOnUnattempted();
        logger.info("clickOnUnattempted");
        viewTestFeedBackPage.verifyAllElementsOnAttemptTypeDetailsScreen();
        logger.info("verifyAllElementsOnAttemptTypeDetailsScreen");
       /* String typeAttempt = viewTestFeedBackPage.verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen();
        logger.info("verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(type_attempt6, typeAttempt, "Attempt Type is not matching , expected :Incorrect Attempts Filter,  actual" + type_attempt6);
        softAssert.assertAll();
        logger.info("verifying that Attempt Type is matching or not");


*/      resetTest.resetTest("mb130708",childEmbibeToken);

    }

  /*  @Test( priority = 14, groups = {Categories.Descoped}, description = "Verify All The Elements On The Perfect Attempts Details Screen")
    public void VerifyIfUserCanViewTheGraphDetailsOfChapterWiseAnalysisWithConceptualWeaknesses() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
       *//* userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
      *//*   //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");
        viewTestFeedBackPage.clickOnPerfectAttemptsAndNavigateToViewDetails();
        logger.info("clickOnPerfectAttemptsAndNavigateToViewDetails");
        viewTestFeedBackPage.clickOnChapterWiseAnalysisWithConceptualWeaknesses();
        logger.info("clickOnChapterWiseAnalysisWithConceptualWeaknesses");

  resetTest.resetTest("mb130708",childEmbibeToken);

    }*/
   /* @Test( priority = 15, groups = {Categories.Descoped}, description = "Verify If User Can View The List Of Difficulty Level")
    public void VerifyIfUserCanViewTheListOfDifficultyLevel( ) {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        homePage.clickOnTestTab();

        //Switch goal to JEE Mians
       *//* userHomePage.clickOnGoal();
        logger.info("clickOnGoal");
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.JEE_Main);
        logger.info("selectExam");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
      *//*   //code
        loginAPI=new LoginAPI();
        resetTest=new ResetTest();
        String embibeToken = loginAPI.getEmbibeToken(Properties.username,Properties.password);
        ConnectedProfile connectedProfile=new ConnectedProfile();
        String childEmbibeToken= connectedProfile.getEmbibeToken("Deepa" ,embibeToken);
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
        viewTestFeedBackPage.clickOnQuestionWiseAnalysisWithSolutionsCard();
        logger.info("clickOnQuestionWiseAnalysisWithSolutionsCard");
        viewTestFeedBackPage.clickOnPerfectAttemptsAndNavigateToViewDetails();
        logger.info("clickOnPerfectAttemptsAndNavigateToViewDetails");
        viewTestFeedBackPage.clickOnDifficultyLevel();
        logger.info("clickOnDifficultyLevel");

        //VerifyAllTheElementsOfDifficultyList
        viewTestFeedBackPage.VerifyElementsOfDifficultyList();
        logger.info("VerifyElementsOfDifficultyList");

        //VerifyIfUserCanUpdateTheDifficultyLevel
        viewTestFeedBackPage.SelectDifficultyLevel();
        logger.info("SelectDifficultyLevel");

           resetTest.resetTest("mb130708",childEmbibeToken);


    }*/
    @DataProvider(name = "selectChild")
    public Object[][] changeGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("ChildName", userDir + "/ChangeGoal.xlsx");
        return data;
    }

}
