package pageObjects.otpPage;

public interface OTPPage {
    void setOTP(String otp);

    void clickOnProceedButton();

    void verifyProceedWithoutOTP();

    String verifyProceedWithInvalidOTP();

    void verifyErrorMessageOnBlankOTP();

    void verifyErrorMessageOnInvalidOTP();

    void clickOnResendButton();

    void verifyResendButton();

    void verifyAllElements();

    void verifyCountdownTimerIsActive();
}
