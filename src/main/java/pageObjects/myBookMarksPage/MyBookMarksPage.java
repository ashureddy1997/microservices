package pageObjects.myBookMarksPage;

public interface MyBookMarksPage {
    void verifyElementsOfMyBookMarkSection();

    void clickOnBookMarkVideoCard();

    void verifyElementsOfMyBookMarksDetailsScreen();

    void verifyBookMarkLstIsGetUpdated();

    void verifyAllBookmarkedVideosDisplaying();

    void openBookMarkedVideo();

    void UnBookMarkVideo();

    void verifyMessageInMyBookmarksVideosScreenWhenThereAreNoBookmarkedVideosAvailable();

    void clickOnQuestionsTab();

    void verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfQuestionsTab();

    void verifyScreenHeader();

    void verifyBookmarkedQuestionsDisplayed();

    void clickOnVideosTab();

    void verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfVideoTab();

    void verifyMessageInMyBookmarksQuestionsScreenWhenThereAreNoBookmarkedQuestionsAvailable();

    void verifyBookmarkedVideosDisplayed();

    void clickOnBookMarkQuestionsCard();

    void clickOnPracticeAll();

    void VerifyAllTheElementsOfQuitPracticeScreen();

    void clickOnContinueLearningButton();

    void clickOnQuitButton();
}
