package pageObjects.examPage;

public interface ExamPage {
    void selectExam(String examName);

    void clickOnDoneButton();

    void verifyAllTheElementPresent();

    void verifyAllExamsAreDisplayed();

    void verifyAllExamsAreDisplayedForMedical();

    void verifyAllExamsAreDisplayedForEngineering();

    void verifyAllExamsAreDisplayedForBanking();

    void verifyAllExamsAreDisplayedForSSC();

    void verifyAllExamsAreDisplayedForRailways();

    void verifyAllExamsAreDisplayedForDefence();
}
