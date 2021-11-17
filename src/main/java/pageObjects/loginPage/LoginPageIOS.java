package pageObjects.loginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;
import utils.Properties;

import java.time.Duration;
import java.util.List;

public class LoginPageIOS extends BasePage implements LogingPage {

    SoftAssert softAssert = null;

    public LoginPageIOS(AppiumDriver driver) {
        softAssert = new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement emailMobileFld;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile/ Email\"]")
    private WebElement emailText_Signup;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private WebElement mobile_no_email;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Who’s learning?\"]")
    private WebElement title_WhoLearning;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sign In\"]")
    private WebElement signInBtn;

    @FindBy(xpath = "//XCUIElementTypeSecureTextField")
    private WebElement passwordFld;

    @FindBy(id = "tvSignInwithPassword")
    private WebElement signInWithPassword;

    @FindBy(id = "tvSignIn")
    private WebElement loginButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Welcome to Embibe!\"]")
    private WebElement WelcomeToEmbibeTitle;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Allow Once\"]")
    private WebElement location_access;


    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\" \"]/XCUIElementTypeWindow[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement allow_always_button;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Invalid credentials\"]")
    private WebElement incorrectPasswordError;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter a valid email address\"]")
    private WebElement incorrectEmailId;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")})
    private List<WebElement> profile;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeStaticText")})
    private List<WebElement> profile_Username;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]")
    private WebElement termsAndConditions;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start Now\"]")
    private WebElement startLearningBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sign in using password\"]")
    private WebElement sign_in_using_password;

    @FindBy(id = "tvForgotPassword")
    private WebElement forgotPassword;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Button\"]")
    private WebElement unmask_password;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Button\"]")
    private WebElement mask_password;

    @FindBy(xpath = "/XCUIElementTypeStaticText[@name=\"Learn\"]")
    private WebElement learnBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Continue\"]")
    private WebElement continueBtn;

    @FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeButton")
    private WebElement img_HeroBannerAvatar;

    public void clickOnStartLearningButton() {
        navigationToSignInScreen();
        // waitForElementToBeVisible(startLearningBtn);
        // startLearningBtn.click();

    }


    public void clickOnSign_in_using_password() {
        waitForElementToBeVisible(sign_in_using_password);
        sign_in_using_password.click();
    }

    public void loginAs(String email, String password) {

      /*  waitForElementToBeVisible(emailText_Signup);
        enterEmail(email);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        enterPassword(password);
        clickOnLoginButton();

    }

    public void enterEmailAndPassword(String email, String password) {
        waitForElementToBeVisible(emailText_Signup);
        enterEmail(email);
        enterPassword(password);

    }

    public void enterEmailPassword(String email) {
        waitForElementToBeVisible(mobile_no_email);
        enterEmail(email);

    }

    public void clickonRandomPlace() {


        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("inside");
        Dimension windowSize = driver().manage().window().getSize();
        int x = windowSize.height;
        int y = windowSize.width;
        int z = x / 2;

        TouchAction action = new TouchAction(driver());
        action.tap(PointOption.point(z, y / 2)).perform();
        System.out.println("outside");
        // learnBtn.click();


    }


    public String clickOnProfile(int i) {
      /*  waitForElementToBeVisible(title_WhoLearning);
        String name = profile_Username.get(0).getText();
        profile.get(0).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
     //   clickonRandomPlace();

String name="";
        return name;

    }

    public void clickOnAddChild() {
        waitForElementToBeVisible(profile.get(0));
        for (int i = 0; i < profile.size(); i++) {
            if (profile.get(i).getText().isEmpty()) {
                profile.get(i).click();
                break;
            }
        }
    }

    public void clickOnAddProfile(int i) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(profile.get(i));

        profile.get(i).click();
    }

    public void verifyProfile() {
        waitForElementToBeVisible(profile.get(0));
        Assert.assertEquals(profile.get(0).isDisplayed(), true, "Login with invalid username is failed");
    }


    public void verifyErrorMessageForIncorrectEmailid() {

    }

    @Override
    public void SwitchProfile(int i) {
        waitForElementToBeVisible(profile_Username.get(0));
        profile_Username.get(i).click();
    }

    @Override
    public void clickOnHeroBannerAvatar() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(img_HeroBannerAvatar);
        img_HeroBannerAvatar.click();
    }

    @Override
    public void selectAProfile(int i) {
        waitForElementToBeVisible(profile_Username.get(0));
        profile_Username.get(i).click();
    }

    public void verifyOnWelcomeScreen() {
        waitForElementToBeVisible(WelcomeToEmbibeTitle);
        Assert.assertEquals(WelcomeToEmbibeTitle.isDisplayed(), true, "Login with invalid username is failed");
    }

    public void clickOnSignInWithPassword() {

        clickOnSign_in_using_password();
    }

    public void navigationToSignInScreen() {
        clickOnContinue();
        ClickOnLocationAcess();
        ClickOnPermissionButton();
        waitForElementToBeVisible(startLearningBtn);
        startLearningBtn.click();
        enterEmail(Properties.username);
        clickOnContinue();

    }

    public void clickOnLoginButton() {
        waitForElementToBeVisible(signInBtn);
        signInBtn.click();
    }

    public void clickOnContinue(){
        //waitForElementToBeVisible(continueBtn);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        continueBtn.click();

    }
    public void enterEmail(String email) {

        waitForElementToBeVisible((emailMobileFld));
        emailMobileFld.sendKeys(email);
    }

    public void enterPassword(String password) {
        waitForElementToBeVisible(passwordFld);
        passwordFld.sendKeys(password);
    }

    public void ClickOnLocationAcess() {
        driver().findElement(By.xpath("//XCUIElementTypeAlert//XCUIElementTypeButton[@name='Allow Once']")).click();
    }

    public void ClickOnPermissionButton() {
       // driver().findElement(By.xpath("//XCUIElementTypeAlert//XCUIElementTypeButton[@name='Allow Once']")).click();
    }

    public void clickOnUnmaskPassword() {
        waitForElementToBeClickable(unmask_password);
        unmask_password.click();
    }

    public void clickOnMaskPassword() {
        waitForElementToBeClickable(mask_password);
        mask_password.click();
    }

    public void verifyErrorMessageForIncorrectPassword() {
        waitForElementToBeVisible(incorrectPasswordError);
        softAssert.assertEquals(incorrectPasswordError.isDisplayed(), true, "incorrectPasswordError is not displayed");
    }

    public void waitForTitle_WhoLearning() {
      //  waitForElementToBeVisible(title_WhoLearning);
      //  Assert.assertEquals(title_WhoLearning.isDisplayed(), true, "Login failed");
    }

    public void verifyTermsAndConditionButtonPresentAndClickable1() {

        waitForElementToBeVisible(termsAndConditions);
        Assert.assertEquals(termsAndConditions.isEnabled(), true, "termsAndConditions button not displayed");
        termsAndConditions.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyAllTheUIElement() {
        softAssert.assertEquals(emailText_Signup.isDisplayed(), true, "Email field not displayed");
        softAssert.assertEquals(passwordFld.isDisplayed(), true, "Password field not displayed");
        softAssert.assertEquals(signInBtn.isDisplayed(), true, "Sign In button not displayed");
        //  softAssert.assertEquals(forgotPassword.isDisplayed(),true,"forgot password button not displayed");
//        softAssert.assertEquals(termsAndConditions.isEnabled(), true, "Terms and conditions not displayed");
        softAssert.assertEquals(WelcomeToEmbibeTitle.isDisplayed(), true, "Welcome To Embibe Title not displayed");
        softAssert.assertAll();
    }
}
