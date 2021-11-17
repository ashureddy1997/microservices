package pageObjects.takeTestPage;

public interface TakeTestPage {
    void clickOnCheckBox();

    void clickOnSubmitTestButton();

    void clickOnStartNowButton();

    void clickOnsideMenuBar();

    void clickOnQuestionNumber(int i);

    void switchToWebView();

    void multipleOptions();

    void clickOnSaveAndNext();

    void clickOnSubmitButton();

    void clickOnContinueToTestFeedback();

    void switchToNativeApp();

    void verifyElementsOnInstructionsScreen();

    void verifyElementsOfTestSubmitConfirmation();

    void clickOnContinueTest();

    String getTimer();

    void verifyAllTheElementsOnTestScreen();

    void clickOnMarkForReviewCheckbox();

    String verifyQuestionHasMarkedForReview();

    void clickOnPreviousButton();

    int verifyCountOfQuestionsAnswered();

    int verifyCountOfQuestionsNotAnswered();

    int verifyCountOfQuestionsNotVisited();

    int verifyCountOfMarkedForReview();

    int verifyCountOfAnsweredAndMarkedForReview();

    void clickOnBackArrow();
}
