package pageObjects.StudentActivities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class StudentActivitiesiOS extends BasePage implements StudentActivitiesPage {
    SoftAssert softAssert = null;

    public StudentActivitiesiOS(AppiumDriver driver) {
        softAssert = new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void clickOnLearnTab() {

    }

    @Override
    public void clickOnVideo() {

    }

    @Override
    public void verifyNavigationToVideoScreen() {

    }

    @Override
    public void clickOnVideoPlayButton() {

    }


    @Override
    public void verifyClickOnPracticeTab() {

    }

    @Override
    public void clickOnStartPracticeButton() {

    }

    @Override
    public void clickOnTestTile() {

    }

    @Override
    public void clickOnSubmitTestButton() {

    }

    @Override
    public void clickOnSaveAndNext() {

    }

    @Override
    public void clickOnSubmitButton() {

    }

    @Override
    public void clickOnTakeTest() {

    }

    @Override
    public void clickOnCheckBox() {

    }

    @Override
    public void clickOnStartNowButton() {

    }

    @Override
    public void clickOnContinueToTestFeedback() {

    }

    @Override
    public void clickOnQuit() {

    }

    @Override
    public void clickOnLearnButton() {

    }
}