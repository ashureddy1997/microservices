package regression.practice;
import api.SignUpAPI;

import constant.I_Want_To_Prepare_For;
import org.testng.annotations.Test;
import pageObjects.signOutPage.SignOutPage;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class LogoutTestCases extends TestBase {


    @Test(priority = 1,groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "1.Verify user can Lagout"+"2.Verify all the elements on Logout Screen")
    public void VerifyUserCanLagout() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on Profile");
        signOutPage.clickOnProfile();
        logger.info("verify all the elements on Logout Screen");
        signOutPage.verifyalltheelementsonLogoutScreen();
        signOutPage.verifyUserAbleLogout();
        logger.info("Click on Sign Out");
        signOutPage.clickOnLogout();
        onboardingPage.VerifyStartLearningButtonDisplay();
        logger.info("Verify that user is navigated to home page when he/clicks on \"Sign out\" button");


    }
    @Test(groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = " Verify that user can cancel logout ")
    public void VerifyUserCanCancelLagout() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        signOutPage.clickOnProfile();
        logger.info("clickOnProfile");
        signOutPage.verifyUserAbleLogout();
        logger.info("verifyUserAbleLogout");
        signOutPage.clickOnCancelButton();
        logger.info("clickOnCancelButton");
    }

    @Test(groups = {Categories.REGRESSION,Categories.BETAREGRESSION}, description = " Verify that user can submit feedback\n ")
    public void verifyThatUserCanSubmitFeedback() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        signOutPage.clickOnProfile();
        logger.info("clickOnProfile");
        signOutPage.clickOnFeedback();
        logger.info("clickOnFeedback");

        //verifyAlltheElementsOnFeedbackScreen
        signOutPage.verifyAlltheElementsOnFeedbackScreen();
        logger.info("verifyAlltheElementsOnFeedbackScreen");

        //Verify that user can submit feedback
        signOutPage.writeFeedbackComments("My Feedback To Embibe");
        logger.info("writeFeedbackComments");
        signOutPage.clickOnSubmitFeedbackButton();
        logger.info("clickOnSubmitFeedbackButton");

        //verifyFeedbackSuccessMessage
        signOutPage.verifyFeedbackSuccessMessage();
        logger.info("verifyFeedbackSuccessMessage");

    }
    @Test(groups = {Categories.REGRESSION,Categories.BETAREGRESSION}, description = " Verify that user can submit feedback Without Writing Any Feedback Comments")
    public void verifyThatUserCanSubmitFeedbackWithoutWritingAnyFeedbackComments() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on Profile");
        signOutPage.clickOnProfile();
        signOutPage.clickOnFeedback();
        signOutPage.tryToSubmitFeedbackWithoutWritingAnyFeedbackComments();
        //verifySubmitFeedbackButtonIsDisabledTillUserEntersAnyComment
        signOutPage.verifySubmitFeedbackButtonIsDisabledTillUserEntersAnyComment();
    }

    @Test(priority = 2,groups = {Categories.BETA_SANITY,Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "verify All the Elements On Manage Profile Screen")
    public void VerifyAllTheElementsOnManageProfileScreen( ) throws InterruptedException {
        logger.info("Verify all the elements on Manage profile");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        signOutPage.clickOnProfile();
        logger.info("Click on Profile");
        signOutPage.clickOnManageProfile();
        logger.info("Click on ManageProfile");
        signOutPage.VerifyProfileNamesAreVisible();
        logger.info("Verify that profile names are visible");
        signOutPage.clickOnProfilename();
        logger.info("Verify that user is navigated to Profile information page on pressing \"Profile\"");
        signOutPage.verifyalltheelementsonManageprofile();
        logger.info("verify all the elements on Manage profile");
        signOutPage.VerifyUserAbleToSelectAvatar();
        logger.info("Verify that user is able to select all the avatars available for selection ");
        logger.info("Verify that user is able to choose/change avatar from top left  ");
        logger.info("Verify that user can select an avatar of his/her choice");
        logger.info(" Verify that user is able to edit/ reselect an avatar" );
        logger.info("   Verify that user is shown an option of different avatars to choose from , on clicking the Edit icon" );
        addProfilePage.EditProfileName();
        logger.info("Verify that profile name field is present and editable");
        signOutPage.ClickOnEditGoalButton();
        logger.info("Verify that \"Edit Goals\" button is present and functional");
        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Get_Into_My_Dream_College);
        logger.info("Verify that user is navigated to \"I want to Prepare for\" screen on press of \"Edit Goals\" button");
        logger.info("clickONPrepare "+I_Want_To_Prepare_For.Get_Into_My_Dream_College);
        logger.info("verify all the elements on Manage profile");
        logger.info(" Verify on selecting any of the option the next button gets enabled");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        logger.info("Verify on selecting the option and click on next button the user is directed to I am aiming for screen\n");




    }
  /*  @Test( priority = 3,groups = {Categories.Descoped}, description = "verify All the Elements On Create Profile Screen")
    public void VerifyAllTheElementsCreateProfileScreen() {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken=  signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        logger.info("Verify user can add new child by clicking on + button");
        signOutPage.verifyalltheelementsoncreateprofile();
        logger.info(" Verify that \"Cancel\" button is present and functional\n");


    }*/

    @Test(priority = 3,groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "verify All the Elements On Manage Profile Screen")
    public void VerifyuserCanNavigateTermsAndConditionsPage( )  {
        logger.info("Verify all the elements on Manage profile");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        signOutPage.clickOnProfile();
        logger.info("clickOnProfile");
        signOutPage.verifyUsercanNavigateTermsAndCondition();
        logger.info("verify Embibe web link present in Terms and Condition");


    }
    @Test(priority = 2,groups = {Categories.REGRESSION,Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "verify All the Elements On Manage Profile Screen")
    public void VerifyAfterChangingTheProfileUserShouldNavigateToDefaultHomePage( )  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        signOutPage.clickOnProfile();
        logger.info("Click on Profile");
        signOutPage.clickOnProfilename();
        homePage.LearnPageIsTheDefaultPage();


    }}