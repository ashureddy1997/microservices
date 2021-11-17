package pageObjects.timelinePage;

public interface TimelinePage {

    String verifyTodayIsDisplayed();

    int verifyVideoCount();

    int verifyPracticeCount();

    int verifyTestCount();

    void clickOnExpandButton();

    void verifyTestDetailsTakenByChild();

    void verifyVideoWatchedDetailsByChild();

    void verifyPracticeDetailsTakenByChild();
}
