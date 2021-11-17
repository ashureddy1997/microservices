package signUp;

import api.OTPAPI;
import api.SignUpAPI;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class SignUpTestCases extends TestBase {
    SignUpAPI signUpAPI = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test(priority = 1, groups = {Categories.SMOKE, Categories.REGRESSION, Categories.BETAREGRESSION,Categories.Login}, description = "Verify user should get options Sign in, Sign up, Sign in and Sign Up through Facebook and Google")
    public void verifySignInScreenUI() {
        logger.info("launch the app");
        logger.info("Verify user should get options Sign in, Sign up, Sign in and Sign Up through Facebook and Google");
        loginPage.clickOnStartLearningButton();
        logger.info("Verify that Start Learning Button present and functional");
        loginPage.clickOnSign_in_using_password();
        loginPage.verifyAllTheUIElement();

    }

    @Test(priority = 2, groups = {Categories.SMOKE, Categories.REGRESSION, Categories.Descoped,Categories.Login}, description = "Verify the UI of the Sign-up page is as per the approved Marvel design")
    public void verifySignUPScreenUI() {
        logger.info("launch the app");
        logger.info("Verify the UI of the Sign-up page is as per the approved Marvel design");
        loginPage.clickOnStartLearningButton();
        signUpPage.verifyAllTheElementPresentOnSignUpPage();

    }

    @Test(priority = 3, groups = {Categories.UserHomeREGRESSION,Categories.SMOKE, Categories.REGRESSION, Categories.BETAREGRESSION,Categories.Login}, description = "Verify that 'Terms and Conditions' are present on landing page and functional")
    public void verifyTermsAndConditionsLink() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        signUpPage.verifyTermsAndConditionButtonPresentAndClickable();

    }

    @Test(groups = {Categories.UserHomeREGRESSION,Categories.SMOKE, Categories.REGRESSION, Categories.BETAREGRESSION,Categories.Login}, description = "Verify that all the elements are visible in the OTP screen")
    public void verifyAllTheElementsOnOTPScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        otpPage.verifyAllElements();
    }
    @Test(groups = {Categories.SMOKE, Categories.Descoped}, description = "Verify that there are proper validations for entering email id\n")
    public void VerifyThatThereAreProperValidationsForEnteringEmailId() {
        logger.info("launch the app");
        logger.info("Verify user should get options Sign in, Sign up, Sign in and Sign Up through Facebook and Google");
        loginPage.clickOnStartLearningButton();
        signUpPage.enterEmailOrMobileNumber("auto678uto.com");
        logger.info("Verify that Username field is present and functional");
        signUpPage.clickOnContinueButton();
        signUpPage.verifyValidationsForEnteringEmailIdAndMobileNo();
    }
    @Test(groups = {Categories.SMOKE, Categories.Descoped}, description = "Verify that there are proper validations for entering MobileNumber")
    public void VerifyThatThereAreProperValidationsForEnteringMobileNumber() {
        logger.info("launch the app");
        logger.info("Verify user should get options Sign in, Sign up, Sign in and Sign Up through Facebook and Google");
        loginPage.clickOnStartLearningButton();
        signUpPage.enterEmailOrMobileNumber("788t7y898g4u6");
        signUpPage.clickOnContinueButton();
        signUpPage.verifyValidationsForEnteringEmailIdAndMobileNo();
        logger.info("Verify that Mobile number field takes a maximum of 10 digits only and no alphanumeric values");
    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.SMOKE, Categories.REGRESSION, Categories.BETAREGRESSION,Categories.Login}, description = "Verify if there is a countdown timer shown to the user for which the OTP is active")
    public void verifyCountdownTimerInOTPScreen() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        otpPage.verifyCountdownTimerIsActive();
        otpPage.clickOnResendButton();
        logger.info("Verify that \"Resend OTP\" button is present and functional");

    }

    @Test(groups = {Categories.UserHomeREGRESSION,Categories.SMOKE, Categories.REGRESSION, Categories.BETAREGRESSION,Categories.Login}, description = "Verify if user can proceed without entering the OTP")
    public void verifyIfUserCanProceedWithoutEnteringOTP() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        otpPage.clickOnProceedButton();
        otpPage.verifyProceedWithoutOTP();

    }



    @Test(groups = {Categories.UserHomeREGRESSION,Categories.SMOKE, Categories.REGRESSION, Categories.BETAREGRESSION,Categories.Login}, description = "Verify if user see proper error message if try to proceed with invalid otp")
    public void VerifyErrorMessageForInvalidOTP() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        otpPage.setOTP("146555");
        otpPage.clickOnProceedButton();
        otpPage.verifyErrorMessageOnInvalidOTP();
}

    @Test(groups = {Categories.SMOKE, Categories.Descoped}, description = "PO-Verify Sign-Up With Valid OTP")
    public void verifySignUpWithValidOTP() {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        String emailID=signUpPage.generateRandomEmailID();
        signUpPage.enterEmailOrMobileNumber(emailID);
        signUpPage.clickOnContinueButton();
        OTPAPI otpapi=new OTPAPI();
        String otp=otpapi.getOTP(emailID);
        otpPage.setOTP(otp);
        otpPage.clickOnProceedButton();
        logger.info("Verify the User able to Sign In Using Mobile  No. with OTP");
        onboardingPage.verifyTitle();

    }

    @Test(groups = {Categories.SMOKE, Categories.REGRESSION}, description = "Verify if user see proper error message if try to proceed with invalid otp")
    public void VerifyResendAction() {
        logger.info("launch the app");
        loginPage.clickOnStartLearningButton();
        signUpPage.enterEmailOrMobileNumber("auto678@auto.com");
        signUpPage.clickOnContinueButton();
        otpPage.clickOnResendButton();
        otpPage.verifyResendButton();
    }
    @Test(dataProvider= "GoalAndExam", groups = {Categories.REGRESSION, Categories.TEST_REGRESSION, Categories.SMOKE}, description = "Verify user can take chapter tests by clicking on any tile under Take chapter test")
    public void VerifyNewUserIsAbleToSignUp(String PrepareFor, String GoalName, String ExamName) {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        //  loginPage.navigationToSignInScreen();
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
        logger.info("I want to prepare for page is displayed");
      //  onboradingPage.clickOnNextButton();
        logger.info("Verify the Next button is enabled in the I want to prepare for page");
        goalPage.selectGoal(GoalName);
        logger.info("Verify the goals displayed in the I want to prepare for page");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(ExamName);
        logger.info("Verify the exams displayed in \"My exam is \"page");
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");

    }
    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }

}