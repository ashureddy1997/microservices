package pageObjects.practiceTakingPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class PracticeTakingPageIOS  extends BasePage implements PracticeTakingPage
{
    SoftAssert softAssert=null;
    public PracticeTakingPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @Override
    public boolean Attempt() {

        return false;
    }

    @Override
    public boolean isPracticeOver() {
        return false;
    }
}
