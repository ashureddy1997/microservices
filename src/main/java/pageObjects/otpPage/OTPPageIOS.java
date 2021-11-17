package pageObjects.otpPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class OTPPageIOS extends BasePage implements OTPPage{
    SoftAssert softAssert=null;
    public OTPPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBys({@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")})
   private List<WebElement> otpBox;


    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Proceed\"]")
    private WebElement proceed;

    @FindBy(id = "//XCUIElementTypeStaticText[@name=\"Resend OTP\"]")
    private WebElement resendOTP;

    @FindBy(id="//XCUIElementTypeStaticText[@name=\"00:50\"]]")
    private WebElement timer;

    @FindBy(id = "materialTextView")
    private WebElement entertheOTPsentonyourregisteredemailormobilenumber;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter security code\"]")
    private  WebElement titleEnterSecurityCode;

    @FindBy(id = "txt_error_View")
    private WebElement Email_PhoneNo_FieldValidation_error;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"OTP invalid\"]")
    private WebElement Please_enter_valid_OTP;

    @FindBy(xpath = "//android.widget.TextView[@text='OTP cannot be blank']")
    private  WebElement OTP_cannot_be_blank;

    @FindBy(id = "txt_Resend_Otp")
    private WebElement resendTimer;

    public void setOTP(String otp){

        waitForElementToBeVisible(otpBox.get(0));
        for(int i=0;i<otp.length();i++){
          String local= String.valueOf(otp.charAt(i));
        otpBox.get(i).sendKeys(local);
        }
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
        waitForElementToBeVisible(titleEnterSecurityCode);
        softAssert.assertEquals(titleEnterSecurityCode.isEnabled(),true,"title is not available");
        softAssert.assertEquals(otpBox.get(0).isEnabled(),true,"OTP box is not available");
        softAssert.assertEquals(proceed.isEnabled(),false,"proceed button is not available");
       // softAssert.assertEquals(resendOTP.isEnabled(),true,"resend option is not available");
        softAssert.assertAll();
    }
    public void verifyCountdownTimerIsActive(){



        // softAssert.assertEquals(timer.isEnabled(),true,"countdown timer is not visible");
       // softAssert.assertAll();
    }
    public void verifyProceedWithoutOTP(){

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
        softAssert.assertAll();
    }
    public void verifyErrorMessageOnBlankOTP(){
        waitForElementToBeVisible(OTP_cannot_be_blank);
        softAssert.assertEquals(OTP_cannot_be_blank.isDisplayed(),true,"error not displayed");
        softAssert.assertAll();
    }
    public  void verifyResendButton(){
        waitForElementToBeVisible(resendOTP);
        softAssert.assertEquals(resendTimer.isDisplayed(),true,"Timer for resend action displayed");
        softAssert.assertAll();
    }
    public void clickOnResendButton(){

       /* waitForElementToBeVisible(resendOTP);
        resendOTP.click();*/
    }
}
