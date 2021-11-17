package pageObjects.testPaperSummaryPage;

public interface TestPaperSummaryPage {
    void verifyAllElementsOnTestSummary();

    void clickOnInstructionTab();

    void verifyElementsOfInstructionsScreenOfTestSummary();

    void clickOnNavigationTab();

    void verifyElementsOnNavigationScreenOfTestSummary();

    void clickOnViewPaper();

    void verifyElementsOnViewPaperScreenOfTestSummary();

    void clickOnFilterByAttemptTypes();

    void verifyElementsOnFilterByAttemptTypeScreen();

    void clickOnFilterParametersCheckBox();

    void UncheckFilterParameters();

    void FilterTestSummaryByAnswered();

    void FilterTestSummaryByNotAnswered();

    void FilterTestSummaryByNotVisited();

    void FilterTestSummaryByMarkedForReview();

    void FilterTestSummaryByAnsweredAndMarkedForReview();

    int getTotalQuestionCount();
}
