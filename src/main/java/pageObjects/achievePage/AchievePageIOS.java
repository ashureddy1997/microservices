package pageObjects.achievePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class AchievePageIOS extends BasePage implements AchievePage {
    SoftAssert softAssert=null;

    public AchievePageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void verifyAllTheElementOnAchieveHomePage() {

    }
}
