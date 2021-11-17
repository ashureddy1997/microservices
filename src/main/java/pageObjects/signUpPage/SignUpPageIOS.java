package pageObjects.signUpPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class SignUpPageIOS extends BasePage implements SignUpPage  {

    SoftAssert softAssert = null;

    public SignUpPageIOS(AppiumDriver driver) {
        softAssert = new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Continue\"]")
    private WebElement Continue;

    @FindBy(id="sign_with_fb")
    private WebElement sign_with_fb;

    @FindBy(id="sign_google")
    private WebElement sign_google;

    @FindBy(id="tvSignIn")
    private WebElement signIn;

    @FindBy(xpath="\t\n" +
            "//XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]")
    private WebElement sign_in_using_password;

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Terms & Conditions\"]")
    private WebElement termsAndConditions;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"By signing up, you agree to our\"]")
    private WebElement By_signing_up_you_agree_to_our;

    @FindBy(xpath = "//android.widget.TextView[@text='Already have an account?']")
    private WebElement Already_have_an_account;

    @FindBy(id="imageView2")
    private WebElement embibeLogo;

    @FindBy(xpath = "//android.widget.TextView[@text='TRUSTED BY 200+ MILLION STUDENTS']")
    private WebElement TRUSTED_BY_200_MILLION;

    @FindBy(id="username")
    private WebElement username;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private WebElement mobile_no_email;

    @FindBy(id="et_password")
    private WebElement password;

    @FindBy(id="et_confirm_password")
    private  WebElement confirm_password;

    @FindBy(id="tv_error_msg")
    private  WebElement pleaseEnterValidEmailOrMobileNo;

    public void verifyValidationsForEnteringEmailIdAndMobileNo (){
        waitForElementToBeVisible(pleaseEnterValidEmailOrMobileNo);
        softAssert.assertEquals(pleaseEnterValidEmailOrMobileNo.isDisplayed(),true,"pleaseEnterValidEmailOrMobileNo not displayed");

    }

    @Override
    public int generateNumber() {
        return 0;
    }


    public  void clickOnContinueButton(){
        waitForElementToBeClickable(Continue);
        Continue.click();
    }

    public void clickOnSignInUsingPassword(){
        waitForElementToBeVisible(sign_in_using_password);
        sign_in_using_password.click();
    }
    public void verifyAllTheElementPresentOnSignUpPage(){
        //waitForElementToBeVisible(Continue);
        softAssert.assertEquals(Continue.isEnabled(),true,"Continue button not displayed");
        softAssert.assertEquals(sign_in_using_password.isDisplayed(),true,"already_signInBtn button not displayed");
        softAssert.assertEquals(mobile_no_email.isDisplayed(),true,"mobile_and_email field not displayed");
        softAssert.assertEquals(termsAndConditions.isEnabled(),true,"termsAndConditions button not displayed");
        softAssert.assertEquals(By_signing_up_you_agree_to_our.isEnabled(),true,"By_signing_up_you_agree_to_our not displayed");
        softAssert.assertAll();


    }
    public void verifyTermsAndConditionButtonPresentAndClickable(){
        //waitForElementToBeVisible(sign_in_using_password);
        Assert.assertEquals(termsAndConditions.isEnabled(),true,"termsAndConditions button not displayed");
        termsAndConditions.click();


    }
    public String generateRandomEmailID(){
        return randomFirstName().toLowerCase()+generateRandomNumberCharSeq()+"@guerrillamail.com";

    }
    public void enterEmailOrMobileNumber(String mobile_email) {
        waitForElementToBeVisible(mobile_no_email);
        mobile_no_email.sendKeys(mobile_email);
    }
}
