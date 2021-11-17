package pageObjects.testPage;

import java.util.List;

public interface TestPage {
    void verifyAllTheElementsOnMarketingBannersForAchieve();

    void clickOnArchiveNowInTestScreen();

    void verifyTakeTestButtonIsFunctioning();

    void verifyHeroBannerCoins();

    void verifyHeroBannerDuration();

    String verifyHeroBannerActionGoalSwitch();

    void verifyTakeTestButton();

    void verifyHeroBannerDescription();

    void verifyHeroBannerAvatar();

    void VerifyHeroBannerDisplay();

    String VerifyHeroBannerNameDisplay();

    void VerifyAddBanner();

    void verifyAllThecarosuelsArePresentOnTest(List<String> list);

    String getTakeFullTestTile();

    void verifyHeaderPresent(String take_full_tests);

    void clickOnTestTile(int i);

    String verifyIfOpenedTestNameIsSameAsSelectedTestFromTestTiles();

    void verifyBookMarkedTestAppearing();

    void clickOnTakeTest();

    void verifyPracticeNow();

    void verifyAllTheElementsOnMarketingBannersForPractice();

    void clickOnPracticeNowInTestScreen();

    void verifyElementsMyCustomTestsSection();

    void clickOnCreateYourOwnTest();

    void selectASubject(int i);

    void clickOnContinueButtonFromStepOne();

    void verifyAllElementsOnCreateYourOwnTestScreen();

    void verifyElementsOnSelectChapterScreen();

    void setMarkForIncorrectAnswer();

    void clickOnCreateTestButton();

    void verifyTestCreatingProgress();

    void clickOnExpandSubject(int i);

    void verifyAllTheChapters(int i);

    void selectChapters(int i);

    void setMarkForCorrectAnswer();

    void clickOnContinueInSelectChaptersScreen();

    void verifyAllTheElementsInCreateYourSettingsScreen();

    void clickOnBackButton();

    void enterYourTestName(String my_first_test);

    void setDifficultyLevel();

    void setDuration();

    void verifyCreatedTest();

    void clickOnMyFirstTest();

    void clickOnQuickTestButton();

    String verifyGradeNameInTestSummary();

    void getContinueLearningCarousel();

    void getContinueLearningCarouselTile();

    void clickOnTestTileOfMathematicsChapters();

    void clickOnTestTilePhysicsChapters();

    void VerifyQuestionAndFourOptionsAreAppearing();

    void clickOnTakeChapterTestTile();

    void clickOnTestTileChemistryChapters();

    void clickOnTestTileOfBiologyChapters();

    void clickOnTakeTestButton();

    void clickOnCreatedTest();

    String verifyCreatedTestTypeIsCorrect();

    String verifyCountDownTimerForPendingTest();

    void clickOnPendingTest();

    void clickOnResumeTest();

    void verifyAllTheElementsOnMarketingBannersForLearn();

    void clickOnLearnNowInTestScreen();

    void verifyTakeTestButtonInHeroBanner();

    void clickOnGoal();

    void verifyChapterTests();

    void clickOnMuteButtonOfAdBannerOfLearnNow();

    void clickOnUnMuteButtonOfAdBannerOfLearnNow();

    void clickOnMuteButtonOfAdBannerOfPracticeNow();

    void clickOnUnMuteButtonOfAdBannerOfPracticeNow();

    void clickOnMuteButtonOfAdBannerOfAchieveNow();

    void clickOnUnMuteButtonOfAdBannerOfAchieveNow();

    void clickOnMuteButtonOfAdBannerOfHerobanner();

    void clickOnUnMuteButtonOfAdBannerOfHerobanner();
}
