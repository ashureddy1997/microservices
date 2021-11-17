package pageObjects.addProfilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class AddProfilePageAndroid extends BasePage implements AddProfilePage {
    SoftAssert softAssert=null;

    public AddProfilePageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id="title")
    private WebElement title;

    @FindBy(id="username")
    private WebElement username;

    @FindBy(id="tvSignup")
    private WebElement addProfile;

    @FindBy(id="btn_quit")
    private WebElement cancel;

    public void verifyTitle(){
        waitForElementToBeVisible(title);
        Assert.assertEquals(title.getText(), "Add Profile","Title not found");
    }
    public String enterUsername(){
        String name =randomFullName();
        waitForElementToBeVisible(username);
        username.sendKeys(name);
        return name;
    }
    public void EditProfileName()
    {
        waitForElementToBeVisible(username);
        username.clear();
        username.sendKeys("Kumar");
    }

    public void clickOnAddProfile(){
        waitForElementToBeVisible(addProfile);
        addProfile.click();

    }
    public void clickOnCancelButton(){
        waitForElementToBeVisible(cancel);
        cancel.click();
    }
}

