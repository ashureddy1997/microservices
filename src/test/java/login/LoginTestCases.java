package login;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class LoginTestCases extends TestBase {

    @Test(priority = 1,groups = {Categories.SMOKE, Categories.REGRESSION,Categories.BETAREGRESSION,Categories.Login}, description = "verify login with valid credentials")
    public void verifyLoginWithValidCredentials()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password "+ Properties.username+" , "+ Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();

    }
    @Test(priority = 2,groups = {Categories.SMOKE, Categories.BETAREGRESSION,Categories.Login}, description = "verify login with invalid credentials")
    public void verifyLoginWithInvalidCredentials()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username+"Invalid" + " , password:-" + Properties.password);
        loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        logger.info("Verify that email id and mobile number field are both optional and user can proceed with entering either of them");
        loginPage.loginAs("Properties.username"+"Invalid", Properties.password);
      //  loginPage.verifyOnWelcomeScreen();
        loginPage.verifyErrorMessageForIncorrectEmailid();
        logger.info("Verify UI shows unverified message if email is not verified.");
    }

    @Test(priority = 3,groups = {Categories.SMOKE, Categories.REGRESSION,Categories.BETAREGRESSION,Categories.Login}, description = "Verify that 'Welcome To Embibe' is seen on the title of the page")
    public void verifyWelcomeToEmbibeTitle()  {
        logger.info("launch the app");
        logger.info("Verify that 'Welcome To Embibe' is seen on the title of the page");
        loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.verifyOnWelcomeScreen();
    }

    @Test(priority = 4,groups = {Categories.SMOKE, Categories.REGRESSION}, description = "Verify that 'Terms and Conditions' are present on landing page and functional")
    public void verifyTermsAndConditionsLinkOnSignInPage()  {
        logger.info("launch the app");
        logger.info("Verify that 'Terms and Conditions' are present on landing page and functional");
        loginPage.navigationToSignInScreen();
        signUpPage.clickOnSignInUsingPassword();
        loginPage.verifyTermsAndConditionButtonPresentAndClickable1();

    }

    @Test(groups = {Categories.SMOKE, Categories.REGRESSION,Categories.BETAREGRESSION,Categories.Login}, description = "Verify if the user is able to mask/unmask the password by clicking on the mask/unmask button")
    public void verifyMaskUnMaskPassword() {
        logger.info("launch the app");
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.enterEmailAndPassword(Properties.username, Properties.password);
        loginPage.clickOnUnmaskPassword();

        //Verify if the user is able to mask the password by clicking on the mask button
        loginPage.clickOnMaskPassword();

    }
    @Test(groups = {Categories.SMOKE, Categories.BETAREGRESSION,Categories.Login}, description = "verify Error Message For Incorrect Password")
    public void verifyErrorMessageForIncorrectPassword()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username+" , password:-" + Properties.password);
        loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password+"123");
        loginPage.verifyErrorMessageForIncorrectPassword();
    }


}