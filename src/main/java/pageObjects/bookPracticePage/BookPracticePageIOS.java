package pageObjects.bookPracticePage;

import com.amazonaws.waiters.WaiterExecutionBuilder;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class BookPracticePageIOS extends BasePage implements BookPracticePage {
    SoftAssert softAssert=null;
    public BookPracticePageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Practice\"]")
    private WebElement practiceHeader;

    @Override
    public void clickOnPractice() {

    }

    @Override
    public void verifyAllElementsOnThePracticePage() {

        softAssert.assertEquals(practiceHeader.isEnabled(),true,"Practice header not display");
        softAssert.assertAll();
    }
}
