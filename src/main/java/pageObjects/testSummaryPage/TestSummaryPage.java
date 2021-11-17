package pageObjects.testSummaryPage;

public interface TestSummaryPage {
    String clickOnTakeFullTestsTile();

    String clickOnTakeTest();

    void verifyClickingOnATestTileTakesUserToTheTestSummaryPage();

    void clickOnTest(String testName);

    void verifyElementsOfSubjectsCarousel();

    String ClickOnSubjectTitleToFilterTheTestsOnTestScreen(int i);

    void verifyClickOnGivenSubjectTileDisplayTestsRelatedOnlyToThat(String subject);

    void verifyElementsTakeFullTestCart();

    void clickOnBookMark();

    void verifyIfTestIsBookMarked();

    void ClickOnAllSubjectTitleToFilterTheTestsOnTestScreen();

    void verifyElementsOnHeroBanner();

    void verifyAllTheElementsOnAboutTheTestSection();

    void verifyElementsOnHereIsWhereYouStandSection();

    void verifyElementsRecommendedPracticeCarousel();

    void verifyElementsMoreTestsCarousel();

    void verifyElementsRecommendedLearningCarousel();

    String verifyCustomTestName();

    String clickOnTestTile();

    int verifyEmbibePoints();

    String verifySubjectNameInTestSummary();

    void verifyTestNameMatchesWithSubjectName(String subjectName);

    void clickOnUnBookMark();

    void clickOnLike();

    void clickOnUnLike();

    void clickOnSincerityScorePlayButton();

    void clickOnRecommendedLearningTile();

    void clickOnMoreTestTile();

    void clickOnRecommendedPracticeTile();

    String verifyTestNameInTestSummary();

    void clickOnCreateYourOwnTestButton();

    void verifyDifferentJarInAttemptQuality();

    void clickOnRecallJar();

    void verifyRecallJarElements();

    void clickOnPlay();

    void clickOnConceptualJar();

    void verifyConceptualThinkingJarElements();

    void clickOnAnalyticalThinkingJar();

    void verifyAnalyticalThinkingJarElements();

    void verifySincerityScoreWidget();

    void clickOnSincerityScorewidgetTile();

    void clickOnQuit();

    void verifyAllTheElementsOfSincerityScoreWidget();
}
