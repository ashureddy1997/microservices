package pageObjects.takeATest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class TakeATestPageIOS extends BasePage implements TakeATestPage{
    SoftAssert softAssert=null;
    public TakeATestPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void clickOnCheckBox() {

    }

    @Override
    public void clickOnStartNowButton() {

    }
}
