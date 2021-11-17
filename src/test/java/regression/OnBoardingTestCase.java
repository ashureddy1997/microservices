package regression;

import api.AssignmentAPI;
import api.OTPAPI;
import api.SignUpAPI;
import constant.Exam;
import constant.Goal;
import constant.I_Want_To_Prepare_For;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class OnBoardingTestCase extends TestBase {

    String iWantToPrepare=I_Want_To_Prepare_For.Excel_In_School;
    SignUpAPI signUpAPI = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test(groups = {Categories.Descoped}, description = "verify Navigation To OnBoarding Screen")
    public void verifyNavigationToOnBoardingScreen() {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        String emailID = signUpPage.generateRandomEmailID();
        signUpPage.enterEmailOrMobileNumber(emailID);
        signUpPage.clickOnContinueButton();
        OTPAPI otpapi = new OTPAPI();
        String otp = otpapi.getOTP(emailID);
        otpPage.setOTP(otp);
        otpPage.clickOnProceedButton();
        onboardingPage.verifyTitle();

    }

    @Test(groups = {Categories.Descoped}, description = "SignupWithGoalAndExam")
    public void SignupWithGoalAndExam() {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        logger.info("clickOnStartLearningButton");
        String emailID = signUpPage.generateRandomEmailID();
        logger.info("email id for signup " + emailID);
        signUpPage.enterEmailOrMobileNumber(emailID);
        logger.info("enterEmailOrMobileNumber");
        signUpPage.clickOnContinueButton();
        OTPAPI otpapi = new OTPAPI();
        String otp = otpapi.getOTP(emailID);
        logger.info("OTP " + otp);
        otpPage.setOTP(otp);
        logger.info("enter OTP");
        otpPage.clickOnProceedButton();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(iWantToPrepare);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
        onboardingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(Goal.Goa_Board);
        logger.info("selectGoal " + Goal.Goa_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.Eleventh_Goa);
        logger.info("selectExam " + Exam.Eleventh_Goa);
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        loginPage.clickOnAddProfile(0);
    }

    @Test(groups = {Categories.Descoped}, description = "Verify the next button is disabled until the user selects any of the options")
    public void verifyTheNextButtonIsDisabledUntilTheUserSelectsAnyOfTheOptions() {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI=new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken=  signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        //  loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID,Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");

        // Verify on selecting any of the option the next button gets enabled
        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Excel_In_School);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
      //  onboradingPage.clickOnNextButton();
        //logger.info("clickOnNextButton");

        //Verify on click on next button the user is directed to My Board is screen
        String title = onboardingPage.verifyTitlesForOnBoardingScreens();
        logger.info("verifyTitlesForOnBoardingScreens");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title, "My goal is");
        logger.info("Verify on click on next button the user is directed to My Board is screen");

        //Verify on click on Back button the user is directed to "I am preparing to" screen
        driver().navigate().back();
        logger.info("nav back");

        String title1 = onboardingPage.verifyTitlesForOnBoardingScreens();
        logger.info("verifyTitlesForOnBoardingScreens");
        softAssert.assertEquals(title1, "I want to prepare for");
        logger.info("Verify on click on Back button the user is directed to \"I am preparing to\" screen");

       // onboradingPage.clickOnNextButton();
        logger.info("clickOnNextButton");

        //Verify on selecting the option "CBSE" and click on next user is directed to "I am studying in" screen
        examPage.selectExam(Goal.CBSE);
        logger.info("selectExam");
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");

        String title3 = onboardingPage.verifyTitlesForOnBoardingScreens();
        logger.info("verifyTitlesForOnBoardingScreens");
        softAssert.assertEquals(title3, "My class is");
        logger.info("Verify on selecting the option \"CBSE\" and click on next user is directed to \"I am studying in\" screen\n");

        //Verify I am studying page contains the mentioned options for CBSE board
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed");

        //Verify on click on Back button the user is directed to "My Board is" screen
        driver().navigate().back();
        logger.info("nav back");

        String title4 = onboardingPage.verifyTitlesForOnBoardingScreens();
        logger.info("verifyTitlesForOnBoardingScreens");
        softAssert.assertEquals(title4, "My goal is");
        logger.info(" Verify on click on Back button the user is directed to \"My Board is\" screen\n");

        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");

        // Verify the next button is disabled until the user selects any of the option
        driver().navigate().back();
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");

        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");

        String title5 = onboardingPage.verifyTitlesForOnBoardingScreens();
        logger.info("verifyTitlesForOnBoardingScreens");
        softAssert.assertEquals(title5, "My class is");
        logger.info("Verify on selecting the option \"CBSE\" and click on next user is directed to \"I am studying in\" screen\n");
        //Verify on selecting any of the option the next button gets enabled
        examPage.selectExam(Exam.Eleventh_GRADE);
        logger.info("selectExam " + Exam.Eleventh_GRADE);
        examPage.clickOnDoneButton();
    }

    @Test(groups = {Categories.REGRESSION}, description = "Verify that \"Cancel\" button is present and functional in create profile\n")
    public void verifyThatCancelButtonIsPresentAndFunctionalInCreateProfile() {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI = new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnCancelButton();

    }

    @Test(groups = {Categories.REGRESSION}, description = "Verify user is directed to add new child page on click on + button\n ")
    public void verifyUserIsDirectedToAddNewChildPageOnClickOnPlusButton() {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI = new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        //   loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Excel_In_School);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
        //   onboradingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(Goal.Goa_Board);
        logger.info("selectGoal " + Goal.Goa_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.Eleventh_Goa);
        logger.info("selectExam " + Exam.Eleventh_Goa);
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        loginPage.waitForTitle_WhoLearning();
        logger.info("Verify user is directed back to who's Learning page on successful addition of the child");
        loginPage.clickOnAddProfile(1);
        logger.info("Verify user is directed to add new child page on click on + button");

        String title = onboardingPage.verifyTitlesForOnBoardingScreens();
        logger.info("verifyTitlesForOnBoardingScreens");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title, "Create Profile");

        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Excel_In_School);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
      //  onboradingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(Goal.Goa_Board);
        logger.info("selectGoal " + Goal.Goa_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.Eleventh_Goa);
        logger.info("selectExam " + Exam.Eleventh_Goa);
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");

        //Verify user can add up to 4 children
        loginPage.clickOnAddProfile(2);
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(iWantToPrepare);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
       // onboradingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(Goal.Goa_Board);
        logger.info("selectGoal " + Goal.Goa_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.Eleventh_Goa);
        logger.info("selectExam " + Exam.Eleventh_Goa);
        examPage.clickOnDoneButton();

        loginPage.clickOnAddProfile(3);
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Excel_In_School);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
        //onboradingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(Goal.Goa_Board);
        logger.info("selectGoal " + Goal.Goa_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.Eleventh_Goa);
        logger.info("selectExam " + Exam.Eleventh_Goa);
        examPage.clickOnDoneButton();

        //Verify user is directed back to who's Learning page on successful addition of the child
        loginPage.waitForTitle_WhoLearning();
        String title2 = onboardingPage.verifyTitlesForWhoIsLearningScreens();
        logger.info("verifyTitlesForOnBoardingScreens");
        softAssert.assertEquals(title2, "Who's Learning?");

        //Verify who's Learning page contains the list of all child users added
        onboardingPage.verifyAllProfilesDisplayed();
        onboardingPage.VerifyFourProfilesAdded();

        //Verify the + mark does not appear if 4 children are added
        onboardingPage.VerifyPlusMarkDoesNotAppearAfterAddingFourChild();
        loginPage.clickOnAddProfile(4);
        loginPage.waitForTitle_WhoLearning();

    }

    @Test(groups = {Categories.REGRESSION}, description = "Verify Add new Child Profile ")
    public void verifyAddChildProfile() {
        logger.info("launch the app");
        logger.info("Verify Sign UpWith Valid OTP");
        loginPage.clickOnStartLearningButton();
        signUpAPI = new SignUpAPI();
        String emailID = signUpPage.generateRandomEmailID();
        String embibeToken = signUpAPI.getEmbibeToken(emailID);
        logger.info("clickOnStartLearningButton");
        logger.info("launch the app");
        logger.info("login with username:- " + emailID + " , password:-" + Properties.password);
        // loginPage.navigationToSignInScreen();
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(emailID, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.clickOnAddChild();
        addProfilePage.enterUsername();
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnProceedButton");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Excel_In_School);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
        //  onboradingPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        goalPage.selectGoal(Goal.Goa_Board);
        logger.info("selectGoal " + Goal.Goa_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.selectExam(Exam.Eleventh_Goa);
        logger.info("selectExam " + Exam.Eleventh_Goa);
        examPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        loginPage.waitForTitle_WhoLearning();
        logger.info("Verify user is directed back to who's Learning page on successful addition of the child");
        loginPage.clickOnAddProfile(0);
        logger.info("Verify user is directed to add new child page on click on + button");
    }

    @Test(groups = {Categories.Descoped}, description = "verify Profile Selection")
    public void verifyProfile() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.verifyProfile();
        logger.info("Verify the created Profile should  display ,Verify who's learning page contains the list of all child users added");

    }

    @Test(groups = {Categories.Descoped}, description = "verify Profile Selection")
    public void verifyProfile2() {
        logger.info("launch the app");
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        loginPage.verifyProfile();
        logger.info("Verify the created Profile should  display ,Verify who's learning page contains the list of all child users added");

    }

    @Test(groups = {Categories.REGRESSION}, description = "Verify that all the Classes listed under the CBSE board are present when user clicks on \"My Board is\"\n")
    public void verifyThatAllTheClassesListedUnderTheCBSEBoardArePresentWhenUserClicksOnMyBoardIs() {
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
        logger.info("navigationToSignInScreen");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(emailID, Properties.password);
        logger.info("login using email and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnAddChild();
        logger.info("clickOnAddChild");
        addProfilePage.enterUsername();
        logger.info("enterUsername");
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnAddProfile");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");

        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Excel_In_School);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Excel_In_School);
      //  onboradingPage.clickOnNextButton();
        logger.info("clickOnNextButton");

        //Verify that all the Classes listed under the Goa board are present when user clicks on "My Board is"
        goalPage.selectGoal(Goal.Goa_Board);
        logger.info("selectGoal " + Goal.Goa_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Goa board");

        //Verify that all the Classes listed under the Gujarat board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Gujarat_Board);
        logger.info("selectGoal " + Goal.Gujarat_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Gujarat board");

        //Verify that all the Classes listed under the Delhi board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Delhi_Board);
        logger.info("selectGoal " + Goal.Delhi_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed Delhi board");

        //Verify that all the Classes listed under the ICSE board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.ICSE);
        logger.info("selectGoal " + Goal.ICSE);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for ICSE board");

        //Verify that all the Classes listed under the Mizoram board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Mizoram_Board);
        logger.info("selectGoal " + Goal.Mizoram_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Mizoram board");

        //Verify that all the Classes listed under the Jharkhand board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Jharkhand_Board);
        logger.info("selectGoal " + Goal.Jharkhand_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Jharkhand board");

        //Verify that all the Classes listed under the Haryana board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Haryana_Board);
        logger.info("selectGoal " + Goal.Haryana_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for haryana board");

        //Verify that all the Classes listed under the Arunachal Pradesh board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Arunachal_Pradesh_Board);
        logger.info("selectGoal " + Goal.Arunachal_Pradesh_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Arunachal pradesh board");

        //Verify that all the Classes listed under the Assam State board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Assam_Board);
        logger.info("selectGoal " + Goal.Assam_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Assam board");

        //Verify that all the Classes listed under the Rajasthan board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Rajasthan);
        logger.info("selectGoal " + Goal.Rajasthan);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Rajasthan board");

        //Verify that all the Classes listed under the Maharashtra board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Maharashtra);
        logger.info("selectGoal " + Goal.Maharashtra);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed For Maharashtra board ");

        //Verify that all the Classes listed under the Nagaland board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Nagaland_Board);
        logger.info("selectGoal " + Goal.Nagaland_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for nagaland board");

        //Verify that all the Classes listed under the Sikkim board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Sikkim_Board);
        logger.info("selectGoal " + Goal.Sikkim_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for sikkim board");

        //Verify that all the Classes listed under the Karnataka board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Karnataka);
        logger.info("selectGoal " + Goal.Karnataka);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for karnataka board");

        //Verify that all the Classes listed under the CBSC board are present when user clicks on "My Board is"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.CBSE);
        logger.info("selectGoal " + Goal.CBSE);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for CBSC board");

        //Verify that all the Classes listed under the Ladakh Board are present when user clicks on "My Board is"
        driver().navigate().back();
        goalPage.selectGoal(Goal.Ladakh_Board);
        logger.info("selectGoal "+Goal.Ladakh_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Ladakh_Board");

        //Verify that all the Classes listed under the Tamil Nadu board are present when user clicks on "My Board is"
     /*   driver.navigate().back();
        goalPage.selectGoal(Goal.Tamil_Nadu_Board);
        logger.info("selectGoal "+Goal.Tamil_Nadu_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Tamil_Nadu_Board");*/

        //Verify that all the Classes listed under the Punjab board are present when user clicks on "My Board is"
       /* driver.navigate().back();
        goalPage.selectGoal(Goal.Punjab_Board);
        logger.info("selectGoal "+Goal.Punjab_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Punjab_Board");*/

        //Verify that all the Classes listed under the Kerala State Board are present when user clicks on "My Board is"
        /*driver.navigate().back();
        goalPage.selectGoal(Goal.Kerala_Board);
        logger.info("selectGoal "+Goal.Kerala_Board);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayed();
        logger.info("verifyAllExamsAreDisplayed for Kerala_Board");*/

    }
    @Test(groups = {Categories.Descoped}, description = "Verify that all the exams listed under the Engineering are present when user clicks on Engineering in \"I am aiming for\"\n")
    public void verifyThatAllTheExamsListedUnderTheEngineeringArePresentWhenUserClicksOnEngineeringInIAmAimingFor () {
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
        logger.info("navigationToSignInScreen");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(emailID, Properties.password);
        logger.info("login using email and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnAddChild();
        logger.info("clickOnAddChild");
        addProfilePage.enterUsername();
        logger.info("enterUsername");
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnAddProfile");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");

        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Get_Into_My_Dream_College);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Get_Into_My_Dream_College);
        //onboradingPage.clickOnNextButton();
      //  logger.info("clickOnNextButton");

        //Verify that all the exams listed under the Medicine are present when user clicks on Medicine in "I am aiming for"
        goalPage.selectGoal(Goal.Medical);
        logger.info("selectGoal "+Goal.Medical);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayedForMedical();
        logger.info("verifyAllExamsAreDisplayed for Medical");

        //Verify that all the exams listed under the Engineering are present when user clicks on Engineering in "I am aiming for"
        driver().navigate().back();
        goalPage.selectGoal(Goal.Engineering);
        logger.info("selectGoal "+Goal.Engineering);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayedForEngineering();
        logger.info("verifyAllExamsAreDisplayed for Engineering");



    }
    @Test(groups = {Categories.REGRESSION}, description = "Verify that all the exams listed under the Banking are present when user clicks on Banking in \"I am aiming for\"\n")
    public void verifyThatAllTheExamsListedUnderTheBankingArePresentWhenUserClicksOnBankingInIAmAimingFor() {
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
        logger.info("navigationToSignInScreen");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(emailID, Properties.password);
        logger.info("login using email and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnAddChild();
        logger.info("clickOnAddChild");
        addProfilePage.enterUsername();
        logger.info("enterUsername");
        addProfilePage.clickOnAddProfile();
        logger.info("clickOnAddProfile");
        onboardingPage.verifyTitle();
        logger.info("verifyTitle");
        onboardingPage.clickONPrepare(I_Want_To_Prepare_For.Get_Dream_Job);
        logger.info("clickONPrepare " + I_Want_To_Prepare_For.Get_Dream_Job);
       // onboradingPage.clickOnNextButton();
        //logger.info("clickOnNextButton");

        //Verify that all the exams listed under the Banking are present when user clicks on Banking in "I am aiming for"
        goalPage.selectGoal(Goal.Banking);
        logger.info("selectGoal "+Goal.Banking);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayedForBanking();
        logger.info("verifyAllExamsAreDisplayed for Banking");

        //Verify that all the exams listed under the SSC are present when user clicks on SSC in "I am aiming for"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.SSC);
        logger.info("selectGoal "+Goal.SSC);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayedForSSC();
        logger.info("verifyAllExamsAreDisplayed for SSC");

        //Verify that all the exams listed under the Railway are present when user clicks on Railway in "I am aiming for"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Railways);
        logger.info("selectGoal "+Goal.Railways);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayedForRailways();
        logger.info("verifyAllExamsAreDisplayed for Railways");

        //Verify that all the exams listed under the defence are present when user clicks on defence in "I am aiming for"
        driver().navigate().back();
        logger.info("nav back");
        goalPage.selectGoal(Goal.Defence);
        logger.info("selectGoal "+Goal.Defence);
        goalPage.clickOnNextButton();
        logger.info("clickOnNextButton");
        examPage.verifyAllExamsAreDisplayedForDefence();
        logger.info("verifyAllExamsAreDisplayed for Defence");

    }
    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}
