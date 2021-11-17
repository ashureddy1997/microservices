package pageObjects.testSummaryPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class TestSummaryPageIOS extends BasePage implements TestSummaryPage{
    SoftAssert softAssert=null;
    public TestSummaryPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public String clickOnTakeFullTestsTile() {
        return null;
    }

    @Override
    public String clickOnTakeTest() {
        return null;
    }

    @Override
    public void verifyClickingOnATestTileTakesUserToTheTestSummaryPage() {

    }

    @Override
    public void clickOnTest(String testName) {

    }

    @Override
    public void verifyElementsOfSubjectsCarousel() {

    }

    @Override
    public String ClickOnSubjectTitleToFilterTheTestsOnTestScreen(int i) {
        return null;
    }

    @Override
    public void verifyClickOnGivenSubjectTileDisplayTestsRelatedOnlyToThat(String subject) {

    }

    @Override
    public void verifyElementsTakeFullTestCart() {

    }

    @Override
    public void clickOnBookMark() {

    }

    @Override
    public void verifyIfTestIsBookMarked() {

    }

    @Override
    public void ClickOnAllSubjectTitleToFilterTheTestsOnTestScreen() {

    }

    @Override
    public void verifyElementsOnHeroBanner() {

    }

    @Override
    public void verifyAllTheElementsOnAboutTheTestSection() {

    }

    @Override
    public void verifyElementsOnHereIsWhereYouStandSection() {

    }

    @Override
    public void verifyElementsRecommendedPracticeCarousel() {

    }

    @Override
    public void verifyElementsMoreTestsCarousel() {

    }

    @Override
    public void verifyElementsRecommendedLearningCarousel() {

    }

    @Override
    public String verifyCustomTestName() {

        return null;
    }

    @Override
    public String clickOnTestTile() {
        return null;
    }

    @Override
    public int verifyEmbibePoints() {
        return 0;
    }

    @Override
    public String verifySubjectNameInTestSummary() {
        return null;
    }

    @Override
    public void verifyTestNameMatchesWithSubjectName(String subjectName) {

    }

    @Override
    public void clickOnUnBookMark() {

    }

    @Override
    public void clickOnLike() {

    }

    @Override
    public void clickOnUnLike() {

    }

    @Override
    public void clickOnSincerityScorePlayButton() {

    }

    @Override
    public void clickOnRecommendedLearningTile() {

    }

    @Override
    public void clickOnMoreTestTile() {

    }

    @Override
    public void clickOnRecommendedPracticeTile() {

    }

    @Override
    public String verifyTestNameInTestSummary() {
        return null;
    }

    @Override
    public void clickOnCreateYourOwnTestButton() {

    }

    @Override
    public void verifyDifferentJarInAttemptQuality() {

    }

    @Override
    public void clickOnRecallJar() {

    }

    @Override
    public void verifyRecallJarElements() {

    }

    @Override
    public void clickOnPlay() {

    }

    @Override
    public void clickOnConceptualJar() {

    }

    @Override
    public void verifyConceptualThinkingJarElements() {

    }

    @Override
    public void clickOnAnalyticalThinkingJar() {

    }

    @Override
    public void verifyAnalyticalThinkingJarElements() {

    }

    @Override
    public void verifySincerityScoreWidget() {

    }

    @Override
    public void clickOnSincerityScorewidgetTile() {

    }

    @Override
    public void clickOnQuit() {

    }

    @Override
    public void verifyAllTheElementsOfSincerityScoreWidget() {

    }
}
