package pageObjects.morePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class MorePageAndroid extends BasePage implements MorePage {
    SoftAssert softAssert=null;
    public MorePageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
