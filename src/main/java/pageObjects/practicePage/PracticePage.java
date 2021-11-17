package pageObjects.practicePage;

import java.util.List;

public interface PracticePage {

    void verifyUserCanTakePractice();

    void verifyHeroBannerConceptsDisplay();

    void VerifyAddBanner();

    void switchToWebView();

    void VerifyUserCanNavigateEmbibeBigBook();

    void VerifyHeroBannerDisplay();

    void verifyHeroBannerDescriptionDisplay();

    void verifyHeroBannerSubjectNameDisplay();

    void verifyAllHeaderPresent();

    void verifyStartPracticeButtonDisplay();

    void clickOnPracticeNowButton();

    void verifyclickOnTakeTestButton();

    void VerifySearchIconDisplaye();

    void verifyGoalSwitchButtonDisplay();

    void verifyTakeTestButtonDisplay();

    void VerifyUserCanClickSincerityScorePlayButton();

    void VerifyLearnChapterDisplay();


    void clickOnStatrtPracticeButton();

    void BookMarkedQuestions();

    void switchToNativeApp();

    void clickOnCheckButton();

    void clickOnEndSessionButton();

    void verifyAllThecarosuelsArePresentOnPractice(List<String> list);

    void clickOnQuit();

    void clickOnGoBack();

    void clickOnPracticeFromChapterPractice(String s);

    void clickOnStartPracticeButton();

    void VerifyUserCanBookMarkTheChapterByClickingOnBookMarkButton();

    void VerifyUserCanUnBookMarkTheChapterByClickingOnBookMarkButton();

    void VerifyUserCanLikeTheChapterByClickingOnLikeButton();

    void VerifyUserCanUnLikeTheChapterByClickingOnLikeButton();

    void VerifyUserCanUseHint();

    void inputValue();
    
    void clickOnContinueButton();

    void VerifySolveWithUsButtonOnPracticeSessionScreen();

  

    void clickOnSessionSummery();

    void VerifyUserCanNavigateCheckProgress();

    void VerifyAllTheElementsOnPracticeSessionScreen();

    void VerifyAllTheElementsOnProgressDetailsScreen();

    void VerifyAllTheElementsOnSessionSummeryScreen();

    void VerifyUserIsAbleToSeeHereIsWhereYouStandWidget();

    void ClickOnPracticeChapter();

    void VerifyHintButtonWorkingOnPracticeSessionScreen();

    void clickOnBackButton();

    void VerifyTimerDisplayOnPracticeSessionScreen();

    void verifyBookImageDisplay();

    void VerifyCheckButtonAfterAnswer();

    void VerifyCheckButtonBeforeAnswer();

    void VerifyUserCanNavigateToRecommendedLearning();

    void clickOnSolveWithUsButton();

    void clickOnFullSolutionButton();

    void VerifyUserCanNavigateToTestOnThisChapter();

    void ClickOnReavealAnswer();

    void VerifyEndPracticeSessionMsg();

    void VerifyExplanationDisplay();

    void VerifyChapterDisplayRelatedToGoalAndExam();

    void clickOnSubject();

    void VerifyBeeImageDisplay();

    void VerifyAllTheElementsOnSolutionWidgetScreen();

    void VerifyYouDoNotHaveAnyBookmarkedQuestions();

    void VerifyUserisabletoplaythevideosifpresentinPrimaryConcepts();

    void VerifyBooksWithVediosDisplayRelatedToSubject();

    void VerifyHeroBannerEmbiums();

    void VerifyYouDoNotHaveAnyBookmarkedVideos();

    void verifyNomorequestionsmsg();

    void VerifyAllTheElementsOnTopicsForPractice();

    void VerifyEachTileShowsTheSubjectTaggedToItAndThePracticeSymbol();

    void VerifyThumbnailIsAppearingForSubjectTile();

    void verifyAllTheElementsOnHeroBannerdescriptionpageInPracticeSummery();

    void VerifyAllTheElementsOnPoinysToRememberTile();

    void VerifyAllTheElementsOnPointsToRememberPage();

    void verifyThumbnailOnChapters();

    void clickOnAnswer();

    void VerifyVideoStartsPlayingByClickingOnAttemptQuality();

    void verifyPracticeSubjectDisplayedMatchesWiththePracticeName();

    void VerifyAllTheElementsOnPracticeSummaryScreen();

    void navigateback();

    void verifyHerobannerVideo();

    void continueScroll();
}
