package pageObjects.loginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;
import utils.Properties;

import java.util.List;

public class LoginPageAndroid extends BasePage implements LogingPage {

    SoftAssert softAssert=null;

    public LoginPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "et_mobile_no_email")
    private WebElement emailText;

    @FindBy(id= "etEmailID")
    private WebElement emailText_Signup;

    @FindBy(id = "et_mobile_no_email")
    private WebElement mobile_no_email;

    @FindBy(id="app_bar_title")
    private WebElement title_WhoLearning;

    @FindBy(id="tvLogin")
    private WebElement signInBtn;

    @FindBy(id = "etPassword")
    private WebElement passwordText;

    @FindBy(id="tvSignInwithPassword")
    private WebElement signInWithPassword;

    @FindBy(id = "tvSignIn")
    private WebElement loginButton;

    @FindBy(id="tvWelcome")
    private  WebElement WelcomeToEmbibeTitle;

    @FindBy(id="btn_continue_location_access")
    private  WebElement location_access;


    @FindBy(xpath= "//android.widget.Button[@text='ALLOW ALL THE TIME']")
    private WebElement allow_always_button;


    @FindBy(xpath= "//android.widget.TextView[@text='invalid credential' or @text='Please enter a valid mobile number or email address.' ]")
    private  WebElement incorrectPasswordError;

    @FindBys({@FindBy(id = "user_logo")})
    private List<WebElement> profile;

    @FindBy(id = "img_HeroBannerAvatar")
    private WebElement img_HeroBannerAvatar;


    @FindBys({@FindBy(id = "username")})
    private List<WebElement> profile_Username;

    @FindBy(id="tvTermsAndConditions")
    private WebElement termsAndConditions;

    @FindBy(id="tvSignup")
    private WebElement startLearningBtn;

    @FindBy(id="tv_sign_in_using_password")
    private WebElement sign_in_using_password;

    @FindBy(id="tvForgotPassword")
    private WebElement forgotPassword;

    @FindBy(id = "iv_eye")
    private WebElement unmask_password;

    @FindBy(id = "iv_eye")
    private WebElement mask_password;

    public void clickOnStartLearningButton(){
        navigationToSignInScreen();
        // waitForElementToBeVisible(startLearningBtn);
        // startLearningBtn.click();

    }
    public void clickOnSign_in_using_password(){
        waitForElementToBeVisible(sign_in_using_password);
        sign_in_using_password.click();
    }

    public void loginAs(String email, String password)  {
        // waitForElementToBeVisible(emailText);
        // enterEmail(email);
        waitForElementToBeVisible(emailText_Signup);
        //  enterEmail(email);
        emailText_Signup.sendKeys(email);
        enterPassword(password);
        clickOnLoginButton();

      //  clickOnHeroBannerSubject();

    }
    public void enterEmailAndPassword(String email, String password)  {
        // waitForElementToBeVisible(emailText);
        // enterEmail(email);
        waitForElementToBeVisible(emailText_Signup);
        //  enterEmail(email);
        emailText_Signup.sendKeys(email);
        enterPassword(password);

    }
    public void enterEmailPassword(String email)  {
        waitForElementToBeVisible(mobile_no_email);
        enterEmail(email);

    }
    @FindBy(id = "txt_HeroBannerSubject")
    private WebElement HeroBannerSubject;

    public void clickOnHeroBannerSubject(){
        waitForElementToBeVisible(HeroBannerSubject);
        HeroBannerSubject.click();
    }
    public String clickOnProfile(int i){
    /*   waitForElementToBeVisible(profile.get(0));
        String name=profile_Username.get(0).getText();
        profile.get(0).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       // clickOnHeroBannerSubject();

        return null;

    }
    public void SwitchProfile(int i){
       waitForElementToBeVisible(profile.get(0));
        String name=profile_Username.get(0).getText();
        profile.get(0).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public void clickOnAddChild(){
        waitForElementToBeVisible(profile.get(0));
        for(int i=0;i<profile.size();i++){
            if(profile.get(i).getText().isEmpty()){
                profile.get(i).click();
                break;
            }
        }
    }
    public void clickOnAddProfile(int i){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(profile.get(i));

        profile.get(i).click();
    }
    public void verifyProfile(){
        waitForElementToBeVisible(profile.get(0));
        Assert.assertEquals(profile.get(0).isDisplayed(),true,"Login with invalid username is failed");
    }
    public void selectAProfile(int i){
        waitForElementToBeVisible(profile.get(1));
        profile.get(1).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnHeroBannerAvatar(){
        waitForElementToBeVisible(img_HeroBannerAvatar);
        img_HeroBannerAvatar.click();
    }




    public void verifyErrorMessageForIncorrectEmailid() {
        waitForElementToBeVisible(incorrectPasswordError);
        Assert.assertEquals(incorrectPasswordError.isDisplayed(),true,"Error msg is not displayed");


    }

    public void verifyOnWelcomeScreen(){
        waitForElementToBeVisible(WelcomeToEmbibeTitle);
        Assert.assertEquals(WelcomeToEmbibeTitle.isDisplayed(),true,"Login with invalid username is failed");
    }
    public void clickOnSignInWithPassword(){

        clickOnSign_in_using_password();
    }
    public void navigationToSignInScreen(){
        //  ClickOnLocationAcess();
        // ClickOnPermissionButton();
        waitForElementToBeVisible(startLearningBtn);
        startLearningBtn.click();
        enterEmailPassword(Properties.username);
        waitForElementToBeVisible(startLearningBtn);
        startLearningBtn.click();
      //  enterEmailPassword(Properties.username);
        // emailText_Signup.sendKeys(Properties.username);
    }

    public void clickOnLoginButton(){
        waitForElementToBeVisible(loginButton);
        loginButton.click();
    }
    public void enterEmail(String email) {

        waitForElementToBeVisible((emailText));
        emailText.sendKeys(email);
    }

    public void enterPassword(String password) {
        waitForElementToBeVisible(passwordText);
        passwordText.sendKeys(password);
    }
    public void ClickOnLocationAcess()
    {
        waitForElementToBeVisible(location_access);
        location_access.click();
    }

    public void ClickOnPermissionButton()
    {
        waitForElementToBeVisible(allow_always_button);
        allow_always_button.click();
    }

    public void clickOnUnmaskPassword(){
        waitForElementToBeClickable(unmask_password);
        unmask_password.click();
    }
    public void clickOnMaskPassword(){
        waitForElementToBeClickable(mask_password);
        mask_password.click();
    }
    public void verifyErrorMessageForIncorrectPassword(){
        waitForElementToBeVisible(incorrectPasswordError);
        softAssert.assertEquals(incorrectPasswordError.isDisplayed(),true,"incorrectPasswordError is not displayed");
    }
    public void waitForTitle_WhoLearning(){
      //  waitForElementToBeVisible(title_WhoLearning);
        //Assert.assertEquals(title_WhoLearning.isDisplayed(),true,"Login failed");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyTermsAndConditionButtonPresentAndClickable1(){
        waitForElementToBeVisible(termsAndConditions);
        Assert.assertEquals(termsAndConditions.isDisplayed(),true,"termsAndConditions button not displayed");
        termsAndConditions.click();
    }
    public void verifyAllTheUIElement() {
        softAssert.assertEquals(emailText_Signup.isDisplayed(),true,"Email field not displayed");
        softAssert.assertEquals(passwordText.isDisplayed(),true,"Password field not displayed");
        softAssert.assertEquals(loginButton.isDisplayed(),true,"Sign In button not displayed");
        //  softAssert.assertEquals(forgotPassword.isDisplayed(),true,"forgot password button not displayed");
        softAssert.assertEquals(termsAndConditions.isDisplayed(),true,"Terms and conditions not displayed");
        softAssert.assertEquals(WelcomeToEmbibeTitle.isDisplayed(),true,"Welcome To Embibe Title not displayed");
        softAssert.assertAll();
    }
}
