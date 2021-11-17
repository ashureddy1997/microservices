package pageObjects.startLearningPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class StartLearningPageAndroid  extends BasePage implements StartLearningPage{
    SoftAssert softAssert=null;
    public StartLearningPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "imageView2")
    private WebElement title;

    @FindBy(xpath = "//android.widget.TextView[@text='TRUSTED BY 200+ MILLION STUDENTS']")
    private WebElement TRUSTED_BY_200_MILLION;

    @FindBy(id ="tvSignup")
    private WebElement startLearning;

    @FindBy(id = "tv_by_signing_up")
    private WebElement By_signing_up_you_agree_to_our;

    @FindBy(id="tv_terms_and_conditions")
    private WebElement termsAndConditions;

    @FindBy(id="et_mobile_no_email")
    private WebElement mobile_no_email;

    @FindBy(id="tvSignup")
    private WebElement Continue;

    @FindBy(id="tvWelcome")
    private WebElement tvWelcome;

    @FindBy(id="tvEmailID")
    private WebElement tvEmailID;

    @FindBy(id="etEmailID")
    private WebElement etEmailID;

    @FindBy(id="tvPassword")
    private WebElement tvPassword;

    @FindBy(id="tvSignIn")
    private WebElement tvSignIn;

    @FindBy(id="etPassword")
    private WebElement etPassword;

    @FindBy(id="iv_eye")
    private WebElement iv_eye;

    @FindBy(id="tv_sign_in_using_password")
    private WebElement sign_in_using_password;

    @FindBy(id="btn_continue_location_access")
    private  WebElement location_access;

    @FindBy(xpath= "//android.widget.Button[@text='ALLOW ALL THE TIME']")
    private WebElement allow_always_button;

    public void clickOnLocationAcess()
    {
        waitForElementToBeVisible(location_access);
        location_access.click();
    }

    public void clickOnPermissionButton()
    {
        waitForElementToBeVisible(allow_always_button);
        allow_always_button.click();
    }
    public void navigationStartLearning(){
        //clickOnLocationAcess();
        //  clickOnPermissionButton();
    }
    public void verifyAllElementsInOnStartLearningScreen(){
        waitForElementToBeVisible(title);
        softAssert.assertEquals(TRUSTED_BY_200_MILLION.isDisplayed(),true,"TRUSTED_BY_200_MILLION is not visible");
        softAssert.assertEquals(startLearning.isDisplayed(),true,"Start learning is not displaying");
        softAssert.assertEquals(By_signing_up_you_agree_to_our.isDisplayed(),true,"By_signing_up_you_agree_to_our is not visible");
        softAssert.assertEquals(termsAndConditions.isDisplayed(),true,"Terms and conditions is not visible");
        softAssert.assertAll();
    }
    public void verifyAllElementsOnSignInPage(){
        waitForElementToBeVisible(tvWelcome);
        softAssert.assertEquals(iv_eye.isDisplayed(),true,"iv_eye is not visible");
        softAssert.assertEquals(tvWelcome.isDisplayed(),true,"tvWelcome  is not visible");
        softAssert.assertEquals(tvEmailID.isDisplayed(),true,"tvEmailID is not visible");
        softAssert.assertEquals(tvPassword.isDisplayed(),true,"tvPassword is not visible");
        softAssert.assertEquals(etEmailID.isDisplayed(),true,"etEmailID is not visible");
        softAssert.assertEquals(etPassword.isDisplayed(),true,"etPassword is not visible");
        softAssert.assertEquals(tvSignIn.isDisplayed(),true,"tvSignIn is not visible");
        softAssert.assertAll();
    }

}

