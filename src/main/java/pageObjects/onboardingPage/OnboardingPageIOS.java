package pageObjects.onboardingPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class
OnboardingPageIOS  extends BasePage implements OnboardingPage {
    SoftAssert softAssert = null;

    public OnboardingPageIOS(AppiumDriver driver) {
        softAssert = new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void clickONPrepare(String prepareFor) {

    }

    @Override
    public void VerifyStartLearningButtonDisplay() {

    }

    @Override
    public void verifyTitle() {

    }

    @Override
    public void VerifyPlusMarkDoesNotAppearAfterAddingFourChild() {

    }

    @Override
    public void clickOnNextButton() {

    }

    @Override
    public String verifyTitlesForOnBoardingScreens() {
        return null;
    }

    @Override
    public String verifyTitlesForWhoIsLearningScreens() {
        return null;
    }

    @Override
    public void verifyAllProfilesDisplayed() {

    }

    @Override
    public void VerifyFourProfilesAdded() {

    }
}