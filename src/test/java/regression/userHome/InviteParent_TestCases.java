package regression.userHome;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class InviteParent_TestCases extends TestBase {

    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta,Categories.BETAREGRESSION}, description = "Verify All The Elements Of Assignment From My Parents In UserHome Page")
    public void verifyAllTheElementsOfAssignmentFromMyParentsInUserHomePage()  {
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
        homePage.clickOnHomeTab();
        userHomePage.verifyElementsOfAssignmentFromMyParents();
        logger.info("verifyElementsOfAssignmentFromMyParents");
    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify All The Elements Of Invite Your Parents Screen")
    public void verifyAllTheElementsOfInviteYourParentsScreen() {
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
        homePage.clickOnHomeTab();

        userHomePage.clickOnInviteYourParents();
        logger.info("clickOnInviteYourParents");
        userHomePage.verifyElementsOfInviteYourParentsScreen();
        logger.info("verifyElementsOfInviteYourParentsScreen");

    }
    @Test(groups = {Categories.BETA_SANITY,Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify If User Can Invite Parents Using Email Id")
    public void verifyIfUserCanInviteParentsUsingEmail() {
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
        homePage.clickOnHomeTab();
        userHomePage.clickOnInviteYourParents();
        logger.info("clickOnInviteYourParents");
        String emailID = signUpPage.generateRandomEmailID();

        userHomePage.inviteYourParentsByEmailID(emailID);
        logger.info("inviteYourParentsByEmailID");

    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify If User Can Invite Parents Using Invalid Email Id")
    public void verifyIfUserCanInviteParentsUsingInvalidEmail() {
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
        homePage.clickOnHomeTab();
        userHomePage.clickOnInviteYourParents();
        logger.info("clickOnInviteYourParents");
        userHomePage.inviteYourParentsByUsingInvalidEmailID("auto88@auto.");
        logger.info("inviteYourParentsByUsingInvalidEmailID");

    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify If User Can Invite Parents Using Mobile Number")
    public void verifyIfUserCanInviteParentsUsingMobileNumber() {
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
        homePage.clickOnHomeTab();
        userHomePage.clickOnInviteYourParents();
        logger.info("clickOnInviteYourParents");
        try {
            userHomePage.inviteYourParentsByPhoneNumber("7868765432");
            logger.info("inviteYourParentsByPhoneNumber");
        }catch (Exception e){
            System.out.println("Already invited !!");
        }
    }

    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify If User Can Invite Parents Using Invalid Mobile Number")
    public void verifyIfUserCanInviteParentsUsingInvalidMobileNumber() {
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
        homePage.clickOnHomeTab();
        userHomePage.clickOnInviteYourParents();
        logger.info("clickOnInviteYourParents");
        userHomePage.inviteYourParentsByUsingInvalidPhoneNumber("9393831");
        logger.info("inviteYourParentsByUsingInvalidPhoneNumber");

    }
    @Test(groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify If User Can Invite Parents  without providing any mail or phone")
    public void verifyIfUserCanInviteParentsWithoutProvidingAnyMailOrPhone() {
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
        homePage.clickOnHomeTab();

        userHomePage.clickOnInviteYourParents();
        logger.info("clickOnInviteYourParents");
        userHomePage.inviteYourParentsWithoutEnteringAnyEmailOrPhone();
        logger.info("inviteYourParentsWithoutEnteringAnyEmailOrPhone");

    }

}
