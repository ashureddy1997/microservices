package regression.practice;

import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class MbTestCases extends TestBase {
    @Test(groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = " verify Mb is Present In All Tabs")
    public void verifyMbPresentInAllTabs() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        mbPage.verifyEmbibeChatDisplay();
        logger.info("Verify Mb is Displayed or not");
        mbPage.clickonMb();
        logger.info("Click on Mb");
        mbPage.verifySendMsgButtonDisabled();
        logger.info("verifySendMsgButtonDisabled");
        mbPage.verifySendMsgButtonEnabled();
        logger.info("verifySendMsgButtonisEnabled");
        mbPage.naviGateBack();
        logger.info("Navigate Back");
        mbPage.verifyEmbibeChatDisplay();
        logger.info("Verify Mb is Displayed or not");
        mbPage.clickonMb();
        logger.info("Click on Mb");
        mbPage.verifySendMsgButtonDisabled();
        logger.info("verifySendMsgButtonDisabled");
        mbPage.verifySendMsgButtonEnabled();
        logger.info("verifySendMsgButtonisEnabled");
        mbPage.naviGateBack();
        logger.info("Navigate Back");
        homePage.clickOnPracticeTab();
        logger.info("Click on PracticeTab");
        mbPage.verifyEmbibeChatDisplay();
        logger.info("Verify Mb is Displayed or not");
        mbPage.clickonMb();
        logger.info("Click on Mb");
        mbPage.verifySendMsgButtonDisabled();
        logger.info("verifySendMsgButtonDisabled");
        mbPage.verifySendMsgButtonEnabled();
        logger.info("verifySendMsgButtonisEnabled");
        mbPage.naviGateBack();
        logger.info("Navigate Back");
        homePage.clickOnTestTab();
        logger.info("Click on TestTab");
        mbPage.verifyEmbibeChatDisplay();
        logger.info("Verify Mb is Displayed or not");
        mbPage.clickonMb();
        logger.info("Click on Mb");
        mbPage.verifySendMsgButtonDisabled();
        logger.info("verifySendMsgButtonDisabled");
        mbPage.verifySendMsgButtonEnabled();
        logger.info("verifySendMsgButtonisEnabled");


    }

    @Test(groups = {Categories.PracticeREGRESSION ,Categories.BETAREGRESSION}, description = " verify All The Elements On Mb")
    public void verifyAllTheElementsOnMb() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        mbPage.verifyEmbibeChatDisplay();
        logger.info("Verify Mb is Displayed or not");
        mbPage.clickonMb();
        logger.info("Click on Mb");
        mbPage.verifyAllTheElementsOnMb();
        logger.info("verifyAllTheElementsOnMb");
        mbPage.verifyWelcomeMsg();
        logger.info("verifyWelcomeMsg");
        mbPage.clickOnFeedbackUp();
        logger.info("Verify  User can Click Feedback Up or Like In Haptic chat");
        logger.info("Verify Comment symbol display once we select the Feedback up");
        logger.info("Verify Feedback up or Like button is Disabled if it is already selected");
        mbPage.clickOnFeedbackDown();
        logger.info("Verify User can click Feedback down or UnLike in Haptic chat");
        logger.info("Verify Comment symbol display once we select the Feedback down");
        logger.info("Verify Feedback down or UnLike button is Disabled if it is already selected");


    }
    @Test(groups = {Categories.PracticeREGRESSION ,Categories.BETAREGRESSION}, description = " verify All The Elements On Mb")
    public void verifyAllTheElementsOnFeedBackScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        mbPage.verifyEmbibeChatDisplay();
        logger.info("Verify Mb is Displayed or not");
        mbPage.clickonMb();
        logger.info("Click on Mb");
        mbPage.verifyAllTheElementsOnMb();
        logger.info("verifyAllTheElementsOnMb");
        mbPage.clickOnFeedbackUp();
        logger.info("clickOnFeedbackUp");
        mbPage.clickonComment();
        logger.info("clickonComment");
        mbPage.verifyAllTheElementsOnFeedBackScreen();
        logger.info("verifyAllTheElementsOnFeedBackScreen");
        mbPage.verifySubmitButtonDisabled();
        logger.info("verifySubmitButtonDisabled");
        mbPage.clickOnNote();
        logger.info("clickOnNote");
        mbPage.verifySubmitButtonEnabled();
        logger.info("verifySubmitButtonEnabled");
        mbPage.clickOnCancelButton();
        logger.info("clickOnCancelButton");
        mbPage.verifyLikeAndCommentEnabled();
        logger.info(" Verify once user Cancel the Feedback  Like and Comment should be enabled");

      }
    @Test(groups = {Categories.PracticeREGRESSION ,Categories.BETAREGRESSION}, description = "Verify once user Cancel the Feedback  unLike and Comment should be enabled")
    public void VerifyOnceUserCancelTheFeedbackUnLikeAndCommentShouldBeEnabled() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        mbPage.verifyEmbibeChatDisplay();
        logger.info("Verify Mb is Displayed or not");
        mbPage.clickonMb();
        logger.info("Click on Mb");
        mbPage.verifyAllTheElementsOnMb();
        logger.info("verifyAllTheElementsOnMb");
        mbPage.clickOnFeedbackDown();
        logger.info("clickOnFeedbackUp");
        mbPage.clickonComment();
        logger.info("clickonComment");
        mbPage.verifyAllTheElementsOnFeedBackScreen();
        logger.info("verifyAllTheElementsOnFeedBackScreen");
        mbPage.verifySubmitButtonDisabled();
        logger.info("verifySubmitButtonDisabled");
        mbPage.clickOnNote();
        logger.info("clickOnNote");
        mbPage.verifySubmitButtonEnabled();
        logger.info("verifySubmitButtonEnabled");
        mbPage.clickOnCancelButton();
        logger.info("clickOnCancelButton");
        mbPage.verifyUnLikeAndCommentEnabled();
        logger.info("Verify once user Cancel the Feedback  unLike and Comment should be enabled");
    }
    @Test(groups = {Categories.PracticeREGRESSION ,Categories.BETAREGRESSION}, description = "Verify once user submit the Feedback Like and Comment should be disabled")
    public void VerifyOnceUserSubmitTheFeedbackLikeAndCommentShouldBeDisabled() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        mbPage.verifyEmbibeChatDisplay();
        logger.info("Verify Mb is Displayed or not");
        mbPage.clickonMb();
        logger.info("Click on Mb");
        mbPage.verifyAllTheElementsOnMb();
        logger.info("verifyAllTheElementsOnMb");
        mbPage.clickOnFeedbackUp();
        logger.info("clickOnFeedbackUp");
        mbPage.clickonComment();
        logger.info("clickonComment");
        mbPage.verifyAllTheElementsOnFeedBackScreen();
        logger.info("verifyAllTheElementsOnFeedBackScreen");
        mbPage.verifySubmitButtonDisabled();
        logger.info("verifySubmitButtonDisabled");
        mbPage.clickOnNote();
        logger.info("clickOnNote");
        mbPage.verifySubmitButtonEnabled();
        logger.info("verifySubmitButtonEnabled");
        mbPage.clickOnSubmitButton();
        mbPage.clickOnFeedbackUp();
        logger.info("clickOnFeedbackUp");
        mbPage.clickonComment();
        logger.info("clickonComment");
        mbPage.verifyAllTheElementsOnFeedBackScreen();
        logger.info("verifyAllTheElementsOnFeedBackScreen");
        mbPage.verifySubmitButtonDisabled();
        logger.info("verifySubmitButtonDisabled");
        mbPage.clickOnNote();
        logger.info("clickOnNote");
        mbPage.verifySubmitButtonEnabled();
        logger.info("verifySubmitButtonEnabled");
        mbPage.clickOnSubmitButton();
        logger.info("Verify user can Submit the Feedback");
        mbPage.verifyLikeAndCommentDisabled();
        logger.info("Verify once user submit the Feedback Like and Comment should be disabled");

    }
    @Test(groups = {Categories.PracticeREGRESSION ,Categories.BETAREGRESSION}, description = "Verify once user submit the Feedback UnLike and Comment should be disabled")
    public void VerifyonceUserSubmitTheFeedbackUnLikeAndCommentShouldBeDisabled() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        mbPage.verifyEmbibeChatDisplay();
        logger.info("Verify Mb is Displayed or not");
        mbPage.clickonMb();
        logger.info("Click on Mb");
        mbPage.verifyAllTheElementsOnMb();
        logger.info("verifyAllTheElementsOnMb");
        mbPage.clickOnFeedbackDown();
        logger.info("clickOnFeedbackUp");
        mbPage.clickonComment();
        logger.info("clickonComment");
        mbPage.verifyAllTheElementsOnFeedBackScreen();
        logger.info("verifyAllTheElementsOnFeedBackScreen");
        mbPage.verifySubmitButtonDisabled();
        logger.info("verifySubmitButtonDisabled");
        mbPage.clickOnNote();
        logger.info("clickOnNote");
        mbPage.verifySubmitButtonEnabled();
        logger.info("verifySubmitButtonEnabled");
        mbPage.clickOnSubmitButton();
        mbPage.clickOnFeedbackDown();
        logger.info("clickOnFeedbackUp");
        mbPage.clickonComment();
        logger.info("clickonComment");
        mbPage.verifyAllTheElementsOnFeedBackScreen();
        logger.info("verifyAllTheElementsOnFeedBackScreen");
        mbPage.verifySubmitButtonDisabled();
        logger.info("verifySubmitButtonDisabled");
        mbPage.clickOnNote();
        logger.info("clickOnNote");
        mbPage.verifySubmitButtonEnabled();
        logger.info("verifySubmitButtonEnabled");
        mbPage.clickOnSubmitButton();
        mbPage.verifyUnLikeAndCommentDisabled();
        logger.info(" Verify once user submit the Feedback UnLike and Comment should be disabled");




    }
}