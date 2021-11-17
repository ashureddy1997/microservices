package pageObjects.userHomePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class UserHomePageIOS extends BasePage implements UserHomePage{
    SoftAssert softAssert=null;
    public UserHomePageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @Override
    public void verifyAllTheElementsOfTheEmbibeBigBooks() {

    }

    @Override
    public void clickOnTheEmbibeBigBooksTile() {

    }

    @Override
    public void verifyElementsOnEmbibeBigBookDetailsScreen() {

    }

    @Override
    public void verifyElementsOfHeroBanner() {

    }

    @Override
    public void verifyMyDownloadsCarouselIsDisplayedInHomeScreen() {

    }

    @Override
    public void clickOnMyDownloadsToViewAllDownloadedVideos() {

    }

    @Override
    public void clickOnWatchButton() {

    }

    @Override
    public void clickOnSearch() {

    }

    @Override
    public void SearchOnUserHome(String ge) {

    }

    @Override
    public void verifyElementsOfAssignmentFromMyParents() {

    }

    @Override
    public void clickOnInviteYourParents() {

    }

    @Override
    public void verifyElementsOfInviteYourParentsScreen() {

    }

    @Override
    public void inviteYourParentsWithoutEnteringAnyEmailOrPhone() {

    }

    @Override
    public void inviteYourParentsByUsingInvalidEmailID(String s) {

    }

    @Override
    public void inviteYourParentsByEmailID(String s) {

    }

    @Override
    public void inviteYourParentsByUsingInvalidPhoneNumber(String s) {

    }

    @Override
    public void VerifyIfWatchListISReflectingInUserHomeAfterAddingAnyVideo() {

    }

    @Override
    public void clickOnMoreItemCardView_watchList() {

    }

    @Override
    public void verifyElementsOfWatchlistDetails() {

    }

    @Override
    public void clickOnPlayALlButton() {

    }

    @Override
    public void clickOnBackIcon() {

    }

    @Override
    public void verifyElementsOfQuitLearn() {

    }

    @Override
    public void clickOnContinueLearning() {

    }

    @Override
    public void clickOnQuit() {

    }

    @Override
    public void verifyShowingAllMyWatchListVideos() {

    }

    @Override
    public void clickOnWatchListVideo() {

    }

    @Override
    public void verifyAllElementsOnWatchlistVideoDetailsScreen() {

    }

    @Override
    public String verifyOpenedVideoFromWatchlistedIsMarkedWatchlist() {
        return null;
    }

    @Override
    public void clickOnPlayButtonOfWatchListVideo() {

    }

    @Override
    public void verifyElementsOfFavouriteBooks() {

    }

    @Override
    public void clickOnManageBooks() {

    }

    @Override
    public void viewAFavouriteBook() {

    }

    @Override
    public void verifyBookIsAddedToMyFavouriteBooksList() {

    }

    @Override
    public void verifyAllElementsPresentInFavouriteBookDetailsScreen() {

    }

    @Override
    public void verifyAllChaptersDisplayed() {

    }

    @Override
    public void clickOnRevisionList() {

    }

    @Override
    public void verifyAllTheElementsOfRevisionLists() {

    }

    @Override
    public void clickOnTopicsToRevise() {

    }

    @Override
    public void verifyAllTheElementsOfTopicsToRevise() {

    }

    @Override
    public void verifyShowingAllTopics() {

    }

    @Override
    public void clickOnQuestionsToRevise() {

    }

    @Override
    public void verifyAllTheElementsOfQuestionsToRevise() {

    }

    @Override
    public void verifyShowingAllChapters() {

    }

    @Override
    public void clickOnMyHomeTile() {

    }

    @Override
    public void expandChapters() {

    }

    @Override
    public void collapseChapters() {

    }

    @Override
    public void verifyAllElementsOfPracticeAttempted() {

    }

    @Override
    public void clickOnPracticeButton() {

    }

    @Override
    public void clickOnPracticeAttempted_tile() {

    }

    @Override
    public void verifyAllTheElementsInQuestionsListAttempted() {

    }

    @Override
    public void verifyShowingAllQuestions() {

    }

    @Override
    public void clickOnFilterSubjectsUnitsAndChapters() {

    }

    @Override
    public void verifyAllElementsOnFilterScreen() {

    }

    @Override
    public void clickOnAllSubject() {

    }

    @Override
    public void verifyAllElementsOnSelectSubjectList() {

    }

    @Override
    public void selectASubject() {

    }

    @Override
    public void clickOnDone() {

    }

    @Override
    public void clickOnAllUnits() {

    }

    @Override
    public void verifyAllElementsOnSelectUnitScreen() {

    }

    @Override
    public void selectAUnit() {

    }

    @Override
    public void clickOnAllChapter() {

    }

    @Override
    public void verifyAllElementsOnSelectChapterScreen() {

    }

    @Override
    public void selectChapter() {

    }

    @Override
    public void clickOnCrossButton() {

    }

    @Override
    public void expandTopics() {

    }

    @Override
    public void collapseTopics() {

    }

    @Override
    public void verifyAllElementsOfTopicsAttempted() {

    }

    @Override
    public void clickOnLearnButton() {

    }

    @Override
    public void clickOnTopicTile() {

    }

    @Override
    public void verifyAllTheElementsInTopicDetails() {

    }

    @Override
    public void VerifyMyHome() {

    }

    @Override
    public void VerifyIfTestTakenIsReflectingInUserHomeAfterTakingAnyTest() {

    }

    @Override
    public void clickOnMoreItemCardView_test() {

    }

    @Override
    public void verifyElementsOfTestTakenDetails() {

    }

    @Override
    public void viewTestTakenFromUserHome() {

    }

    @Override
    public void ClickOnTestTakenTileFromUserHome() {

    }

    @Override
    public String verifyGoal() {
        return null;
    }

    @Override
    public void clickOnGoal() {

    }

    @Override
    public void clickOnGoalAndExam() {

    }

    @Override
    public void VerifythatQuestionstileispresentunderMyBookmarkscarousel() {

    }

    @Override
    public void verifyUpdatedGoal() {

    }

    @Override
    public void clickOnProfileIcon() {

    }

    @Override
    public void inviteYourParentsByPhoneNumber(String s) {

    }

    @Override
    public void verifyMessageShownIfThereAreNoVideosDownloaded() {

    }

    @Override
    public String verifySelectedGoal() {
        return null;
    }

    @Override
    public void scrollAndClickOnTestTile(int index) {

    }

    @Override
    public void clickRevisionList() {

    }

    @Override
    public void clickOnMyTimeLine() {

    }

    @Override
    public void scrollDown() {

    }

    @Override
    public void verifySubjectHolderAndTagInTestTile() {

    }

    @Override
    public void verifyTestNameForTakenTest() {

    }

    @Override
    public void verifyBookAddedTag() {

    }

    @Override
    public void verifyAllTopicsDisplayed() {

    }

    @Override
    public void clickOnChapter() {

    }

    @Override
    public String verifyTotalEmbium_PointsInHerobanner() {
        return null;
    }

    @Override
    public void verifyEmbium_coinInHerobaner() {

    }

    @Override
    public void verifyCompletedStatus() {

    }


}
