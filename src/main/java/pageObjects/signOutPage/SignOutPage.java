package pageObjects.signOutPage;

public interface SignOutPage {
    

    void clickOnProfile();

    void verifyalltheelementsonLogoutScreen();

    void verifyUserAbleLogout();

    void clickOnLogout();

    void clickOnFeedback();

    void verifyAlltheElementsOnFeedbackScreen();

    void writeFeedbackComments(String my_feedback_to_embibe);

    void clickOnSubmitFeedbackButton();

    void verifyFeedbackSuccessMessage();

    void tryToSubmitFeedbackWithoutWritingAnyFeedbackComments();

    void verifySubmitFeedbackButtonIsDisabledTillUserEntersAnyComment();

    void VerifyProfileNamesAreVisible();

    void clickOnManageProfile();

    void clickOnProfilename();

    void verifyalltheelementsonManageprofile();

    void VerifyUserAbleToSelectAvatar();

    void ClickOnEditGoalButton();

    void verifyalltheelementsoncreateprofile();

    void clickOnCancelButton();

    void verifyUsercanNavigateTermsAndCondition();
}
