package pageObjects.addProfilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class AddProfilePageIOS extends BasePage implements AddProfilePage{
    SoftAssert softAssert=null;

    public AddProfilePageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public String enterUsername() {
        return null;
    }

    @Override
    public void clickOnAddProfile() {

    }

    @Override
    public void EditProfileName() {

    }

    @Override
    public void clickOnCancelButton() {

    }
}
