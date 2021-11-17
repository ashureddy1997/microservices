package pageObjects.homePage;

public interface HomePage {
    void clickOnPracticeTab();

    void clickOnBook(int i);

    void verticalSwipeByPercentages(double v, double v1, double v2);

    void verifyTitleOnHomeScreen(String s);

    void clickOnLearnTab();

    void LearnPageIsTheDefaultPage();

    void verifyClickOnPracticeTab();

    void verifyHomePageIsTheDefaultPage();

    void PracticePageIsTheDefaultPage();

    void TestPageIsTheDefaultPage();

    void clickOnTestTab();

    void clickOnSearch();

    void clickOnEnter();

    void queryOnSearch(String numerical);

    void verifyQuickLinksAndResultCount();

    void verifyNavigateToVedios();

    void ClickOnQuickLinks();

    void UserCanNavigateToChaptersInSearch();

    void UserCanNavigateToBoksInSearch();

    void verifyNavigateToPracticeChapters();

    void UserCanNavigateToTopicsInSearch();

    void VerifyReleventTopicsResultsDisplaysBasedOnSearchResult();

    void verifyNavigateToTestsInSearch();

    void verifySearchForInvalidInput();

    void verifyUserAbleToGetSameTextInSearchBar();

    void clickOnChapters();

    void verifySearchScreenUI();

    void verifySearchResult();

    void clickOnSearchResult();

    void verifyAllTheTabDisplay();

    void verifySearchButtonDisplay();

    void verifyClickOnTestTab();

    void verifyClickOnMoreTab();

    void clickOnSwitchGoal();

    void verifyGoalSwitch(String sixthCbse);

    void clickOnHomeTab();

    void clickOnPracticeChapter();

    void clickOnTest();

    void clickOnBooks();

    void clickOnPractice();

    void clickOnVideos();

    void clickOnAchieveTab();

    void AchievePageIsTheDefaultPage();

    void verifyNavigationToUserHomePage();

    void verifyembiumcoinDisplay();

    void clickOnMyTimeline();

    void verifyHeroBannerCoins();

    void verifyHeroBannerDuration();

    String clickOnAGoalDisplayedInSearchResult();

    void clickOnASearchData();

    void clickOnUpdateMYGoalFromSearch();

    String verifyGoalIsUpdatedCorrectly();

    void clickOnBringMeBack();
}
