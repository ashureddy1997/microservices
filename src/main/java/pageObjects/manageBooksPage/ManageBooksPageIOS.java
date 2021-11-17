package pageObjects.manageBooksPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class ManageBooksPageIOS extends BasePage implements ManageBooksPage {
    SoftAssert softAssert = null;

    public ManageBooksPageIOS(AppiumDriver driver) {
        softAssert = new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void verifyElementsOnManageBooksScreen() {

    }

    @Override
    public void selectBooks() {

    }

    @Override
    public void clickOnDoneButton() {

    }

    @Override
    public void removeBooks() {

    }

    @Override
    public void verifySelectedBookCounts() {

    }
}
