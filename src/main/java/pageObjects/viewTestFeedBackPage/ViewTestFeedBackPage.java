package pageObjects.viewTestFeedBackPage;

public interface ViewTestFeedBackPage {
    void clickOnQuestionWiseAnalysisWithSolutionsCard();

    void verifyElementsOnFeedbackScreen();

    void clickOnScoreCard();

    void verifyElementsOnScoreDetailsPage();

    void clickOnYourTopSkillCard();

    void verifyElementsOnYourTopSkill();

    void verifyAllTheElementsOnQuestionWiseAnalysisWithSolutions();

    void clickOnRevisionListPlusButton();

    void clickOnChaptersYouDidNotAttemptTab();

    void verifyElementsOnChaptersYouDidNotAttemptDetails();

    void verifyElementsOnChapterDetailsOfYouDidNotAttempt();

    String clickOnAChapterFromChaptersYouDidNotAttempt();

    String clickOnTopicOfYouDidNotAttempt();



    String clickOnUnderstandMyNegativeBehaviourTab();

    void verifyElementOfUnderstandMyNegativeBehaviour();

    String verifyUnderstandMyNegativeBehavioursTitle();

    void clickOnPlayButtonOfSincerityScoreCard();

    void verifyElementsOfQuitLearn();

    void clickOnImproveYourTestTakingStrategyTab();

    void clickOnQuit();

    String clickOnPerfectAttemptsAndNavigateToViewDetails();

    void verifyAllElementsOnPerfectAttemptDetailsScreen();

    String clickOnOvertimeCorrectAttempts();



    void verifyAllElementsOnAttemptTypeDetailsScreen();

    String verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen();

    String clickOnTooFastCorrectAttempts();

    String clickOnIncorrectAttempts();

    String clickOnUnattempted();



    String clickOnOvertimeIncorrectAttempts();

    void clickOnDifficultyLevel();

    void VerifyElementsOfDifficultyList();

    void SelectDifficultyLevel();

    String clickOnWastedAttempts();

    void clickOnChapterWiseAnalysisWithConceptualWeaknesses();
}
