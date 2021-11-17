package pageObjects.loginPage;

public interface LogingPage {
    void navigationToSignInScreen();

    void clickOnSignInWithPassword();

    void loginAs(String username, String password);

    void waitForTitle_WhoLearning();

    void verifyOnWelcomeScreen();

    void verifyErrorMessageForIncorrectPassword();

    void enterEmailAndPassword(String username, String password);

    void clickOnUnmaskPassword();

    void verifyTermsAndConditionButtonPresentAndClickable1();

    void clickOnMaskPassword();

    void verifyAllTheUIElement();

    void clickOnStartLearningButton();

    void clickOnSign_in_using_password();

    Object clickOnProfile(int i);

    void clickOnAddChild();

    void clickOnAddProfile(int i);

    void verifyProfile();

    void clickOnHeroBannerAvatar();

    void selectAProfile(int i);

    void verifyErrorMessageForIncorrectEmailid();

    void SwitchProfile(int i);
}
