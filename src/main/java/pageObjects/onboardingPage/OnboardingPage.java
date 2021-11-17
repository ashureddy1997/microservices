package pageObjects.onboardingPage;

public interface OnboardingPage {
   
    

     void verifyTitle() ;

    void VerifyPlusMarkDoesNotAppearAfterAddingFourChild();

    void clickOnNextButton();

    String verifyTitlesForOnBoardingScreens();

    String verifyTitlesForWhoIsLearningScreens();

    void verifyAllProfilesDisplayed();

    void VerifyFourProfilesAdded();

    void clickONPrepare(String excel_in_school);

    void VerifyStartLearningButtonDisplay();
}
