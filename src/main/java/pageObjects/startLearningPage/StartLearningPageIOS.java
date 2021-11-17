package pageObjects.startLearningPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class StartLearningPageIOS extends BasePage implements StartLearningPage{
    SoftAssert softAssert=null;
    public StartLearningPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void navigationStartLearning() {

    }

    @Override
    public void verifyAllElementsInOnStartLearningScreen() {

    }

    @Override
    public void verifyAllElementsOnSignInPage() {

    }
}
