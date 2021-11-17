package pageObjects.signUpPage;

public interface SignUpPage {
    void clickOnSignInUsingPassword();

    String generateRandomEmailID();

    void enterEmailOrMobileNumber(String emailID);

    void clickOnContinueButton();

    void verifyTermsAndConditionButtonPresentAndClickable();

    void verifyAllTheElementPresentOnSignUpPage();

    void verifyValidationsForEnteringEmailIdAndMobileNo();

    int generateNumber();
}
