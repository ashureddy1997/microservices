package pageObjects.otpPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class OTPPageAndroid  extends BasePage implements OTPPage{

    SoftAssert softAssert=null;
    public OTPPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(className = "android.widget.EditText")
    private WebElement otpBox;

    @FindBy(id = "txt_Proceed")
    private WebElement proceed;

    @FindBy(id = "txt_Resend_Otp")
    private WebElement resendOTP;

    @FindBy(id = "materialTextView")
    private WebElement entertheOTPsentonyourregisteredemailormobilenumber;

    @FindBy(id = "title")
    private  WebElement title;

    @FindBy(id = "txt_error_View")
    private WebElement Email_PhoneNo_FieldValidation_error;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter a valid OTP.']")
    private WebElement Please_enter_valid_OTP;

    @FindBy(xpath = "//android.widget.TextView[@text='OTP cannot be blank']")
    private  WebElement OTP_cannot_be_blank;

    @FindBy(id = "txt_Resend_Otp")
    private WebElement resendTimer;

    public void setOTP(String otp){

        waitForElementToBeVisible(otpBox);
        otpBox.sendKeys(otp);
    }
    public void clickOnProceedButton(){
        waitForElementToBeVisible(proceed);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        proceed.click();
    }
    public void verifyAllElements(){
        waitForElementToBeVisible(title);
        softAssert.assertEquals(title.isDisplayed(),true,"title is not available");
        softAssert.assertEquals(otpBox.isDisplayed(),true,"OTP box is not available");
        softAssert.assertEquals(proceed.isDisplayed(),true,"proceed button is not available");
        softAssert.assertEquals(resendOTP.isDisplayed(),true,"resend option is not available");
        softAssert.assertAll();
    }
    public void verifyCountdownTimerIsActive(){
        waitForElementToBeVisible(resendOTP);
        softAssert.assertEquals(resendOTP.isDisplayed(),true,"countdown timer is not visible");
    }
    public void verifyProceedWithoutOTP(){
        waitForElementToBeVisible(proceed);
        softAssert.assertEquals(proceed.isDisplayed(),true,"proceed timer is not visible");
        String errorMsg=Email_PhoneNo_FieldValidation_error.getText();
        softAssert.assertEquals(Email_PhoneNo_FieldValidation_error.isDisplayed(),true,"Error not displayed");

        softAssert.assertEquals(errorMsg,"OTP cannot be blank");
        softAssert.assertAll();

    }
    public String verifyProceedWithInvalidOTP(){
        waitForElementToBeVisible(Email_PhoneNo_FieldValidation_error);
        String errorMsg =Email_PhoneNo_FieldValidation_error.getText();
        softAssert.assertEquals(Email_PhoneNo_FieldValidation_error.isDisplayed(),true,"Error not displayed");
        return errorMsg;
    }
    public void verifyErrorMessageOnInvalidOTP(){
        waitForElementToBeVisible(Please_enter_valid_OTP);
        softAssert.assertEquals(Please_enter_valid_OTP.isDisplayed(),true,"error not displayed");
    }
    public void verifyErrorMessageOnBlankOTP(){
        waitForElementToBeVisible(OTP_cannot_be_blank);
        softAssert.assertEquals(OTP_cannot_be_blank.isDisplayed(),true,"error not displayed");
    }
    public  void verifyResendButton(){
        waitForElementToBeVisible(resendOTP);
        softAssert.assertEquals(resendTimer.isDisplayed(),true,"Timer for resend action displayed");
    }
    public void clickOnResendButton(){

        waitForElementToBeVisible(resendOTP);
        resendOTP.click();
    }

}

