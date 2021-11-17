package pageObjects.myBookMarksPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class MyBookMarksPageIOS extends BasePage implements MyBookMarksPage{
    SoftAssert softAssert=null;
    public MyBookMarksPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void verifyElementsOfMyBookMarkSection() {

    }

    @Override
    public void clickOnBookMarkVideoCard() {

    }

    @Override
    public void verifyElementsOfMyBookMarksDetailsScreen() {

    }

    @Override
    public void verifyBookMarkLstIsGetUpdated() {

    }

    @Override
    public void verifyAllBookmarkedVideosDisplaying() {

    }

    @Override
    public void openBookMarkedVideo() {

    }

    @Override
    public void UnBookMarkVideo() {

    }

    @Override
    public void verifyMessageInMyBookmarksVideosScreenWhenThereAreNoBookmarkedVideosAvailable() {

    }

    @Override
    public void clickOnQuestionsTab() {

    }

    @Override
    public void verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfQuestionsTab() {

    }

    @Override
    public void verifyScreenHeader() {

    }

    @Override
    public void verifyBookmarkedQuestionsDisplayed() {

    }

    @Override
    public void clickOnVideosTab() {

    }

    @Override
    public void verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfVideoTab() {

    }

    @Override
    public void verifyMessageInMyBookmarksQuestionsScreenWhenThereAreNoBookmarkedQuestionsAvailable() {

    }

    @Override
    public void verifyBookmarkedVideosDisplayed() {

    }

    @Override
    public void clickOnBookMarkQuestionsCard() {

    }

    @Override
    public void clickOnPracticeAll() {

    }

    @Override
    public void VerifyAllTheElementsOfQuitPracticeScreen() {

    }

    @Override
    public void clickOnContinueLearningButton() {

    }

    @Override
    public void clickOnQuitButton() {

    }
}
