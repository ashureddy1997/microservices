package pageObjects.userHomePage;

public interface UserHomePage {
    void verifyAllTheElementsOfTheEmbibeBigBooks();

    void clickOnTheEmbibeBigBooksTile();

    void verifyElementsOnEmbibeBigBookDetailsScreen();

    void verifyElementsOfHeroBanner();

    void verifyMyDownloadsCarouselIsDisplayedInHomeScreen();

    void clickOnMyDownloadsToViewAllDownloadedVideos();

    void clickOnWatchButton();

    void clickOnSearch();


    void SearchOnUserHome(String ge);

    void verifyElementsOfAssignmentFromMyParents();

    void clickOnInviteYourParents();

    void verifyElementsOfInviteYourParentsScreen();

    void inviteYourParentsWithoutEnteringAnyEmailOrPhone();    

    void inviteYourParentsByUsingInvalidEmailID(String s);

    void inviteYourParentsByEmailID(String s);

    void inviteYourParentsByUsingInvalidPhoneNumber(String s);

    void VerifyIfWatchListISReflectingInUserHomeAfterAddingAnyVideo();

    void clickOnMoreItemCardView_watchList();

    void verifyElementsOfWatchlistDetails();

    void clickOnPlayALlButton();

    void clickOnBackIcon();

    void verifyElementsOfQuitLearn();

    void clickOnContinueLearning();

    void clickOnQuit();

    void verifyShowingAllMyWatchListVideos();

    void clickOnWatchListVideo();

    void verifyAllElementsOnWatchlistVideoDetailsScreen();

    String verifyOpenedVideoFromWatchlistedIsMarkedWatchlist();

    void clickOnPlayButtonOfWatchListVideo();

    void verifyElementsOfFavouriteBooks();

    void clickOnManageBooks();

    void viewAFavouriteBook();

    void verifyBookIsAddedToMyFavouriteBooksList();

    void verifyAllElementsPresentInFavouriteBookDetailsScreen();

    void verifyAllChaptersDisplayed();

    void clickOnRevisionList();

    void verifyAllTheElementsOfRevisionLists();

    void clickOnTopicsToRevise();

    void verifyAllTheElementsOfTopicsToRevise();

    void verifyShowingAllTopics();

    void clickOnQuestionsToRevise();

    void verifyAllTheElementsOfQuestionsToRevise();

    void verifyShowingAllChapters();

    void clickOnMyHomeTile();

    void expandChapters();

    void collapseChapters();

    void verifyAllElementsOfPracticeAttempted();

    void clickOnPracticeButton();

    void clickOnPracticeAttempted_tile();

    void verifyAllTheElementsInQuestionsListAttempted();

    void verifyShowingAllQuestions();

    void clickOnFilterSubjectsUnitsAndChapters();

    void verifyAllElementsOnFilterScreen();

    void clickOnAllSubject();

    void verifyAllElementsOnSelectSubjectList();

    void selectASubject();

    void clickOnDone();

    void clickOnAllUnits();

    void verifyAllElementsOnSelectUnitScreen();

    void selectAUnit();

    void clickOnAllChapter();

    void verifyAllElementsOnSelectChapterScreen();

    void selectChapter();

    void clickOnCrossButton();

    void expandTopics();

    void collapseTopics();

    void verifyAllElementsOfTopicsAttempted();

    void clickOnLearnButton();

    void clickOnTopicTile();

    void verifyAllTheElementsInTopicDetails();

    void VerifyMyHome();

    void VerifyIfTestTakenIsReflectingInUserHomeAfterTakingAnyTest();

    void clickOnMoreItemCardView_test();

    void verifyElementsOfTestTakenDetails();

    void viewTestTakenFromUserHome();

    void ClickOnTestTakenTileFromUserHome();

    String verifyGoal();

    void clickOnGoal();

    void clickOnGoalAndExam();

    void VerifythatQuestionstileispresentunderMyBookmarkscarousel();

    void verifyUpdatedGoal();

    void clickOnProfileIcon();


    void inviteYourParentsByPhoneNumber(String s);

    void verifyMessageShownIfThereAreNoVideosDownloaded();

    String verifySelectedGoal();

    void scrollAndClickOnTestTile(int index);

    void clickRevisionList();

    void clickOnMyTimeLine();

    void scrollDown();

    void verifySubjectHolderAndTagInTestTile();

    void verifyTestNameForTakenTest();

    void verifyBookAddedTag();

    void verifyAllTopicsDisplayed();

    void clickOnChapter();

    String verifyTotalEmbium_PointsInHerobanner();

    void verifyEmbium_coinInHerobaner();

    void verifyCompletedStatus();
}
