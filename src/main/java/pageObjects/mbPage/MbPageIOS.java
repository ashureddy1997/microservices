package pageObjects.mbPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class MbPageIOS extends BasePage implements MbPage {
    SoftAssert softAssert=null;
    public MbPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeButton")
    private WebElement mb;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Send Message Button Identifier\"]")
    private WebElement sendMessageButton;

    @FindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Mb\"]")
    private WebElement mbText;

    @FindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Take me to learn\"]")
    private WebElement takemetolearn;

    @FindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Take me to Practice\"]")
    private WebElement takemetoPractice;

    @FindBy(id= "title")
    private WebElement  givefeedback;

    @FindBy(xpath ="(//XCUIElementTypeCell[@name=\"Carousel Cell Identifier\"])/XCUIElementTypeOther/XCUIElementTypeImage")
    private List<WebElement> mbimageview;

    @FindBy(xpath ="//XCUIElementTypeButton[@name=\"Back\"]")
    private WebElement arrowButton;

    public void verifyEmbibeChatDisplay(){
        softAssert.assertEquals(mb.isEnabled(),true,"mb is not displayed");
    }

    public  void clickonMb(){
        waitForElementToBeVisible(mb);
        mb.click();
    }

    public void verifySendMsgButtonDisabled(){
        waitForElementToBeVisible(sendMessageButton);
        Assert.assertEquals(sendMessageButton.isEnabled(),false,"senmsg button is enabled");
    }
    public void clickOntakemetolearn(){
      //  waitForElementToBeVisible(takemetolearn);
        takemetolearn.click();
    }

    @Override
    public void LearnPageIsTheDefaultPage() {

    }

    public void clickOntakemetoPractice(){
   arrowButton.click();

    }

    @Override
    public void naviGateBack() {
        arrowButton.click();

    }

    @Override
    public void verifyWelcomeMsg() {

    }

    @Override
    public void clickOnFeedbackUp() {

    }

    public  void clickonGiveFeedBack(){
        waitForElementToBeVisible(mbimageview.get(0));
        mbimageview.get(0).click();
        waitForElementToBeVisible(givefeedback);
        givefeedback.click();
    }

    @Override
    public void clickOnFeedbackDown() {

    }

    @Override
    public void clickonComment() {

    }

    @Override
    public void verifyAllTheElementsOnFeedBackScreen() {

    }

    @Override
    public void verifySubmitButtonDisabled() {

    }

    @Override
    public void clickOnNote() {

    }

    @Override
    public void verifySubmitButtonEnabled() {

    }

    @Override
    public void clickOnCancelButton() {

    }

    @Override
    public void clickOnSubmitButton() {

    }

    @Override
    public void verifyLikeAndCommentDisabled() {

    }

    @Override
    public void verifyUnLikeAndCommentEnabled() {

    }

    @Override
    public void verifyUnLikeAndCommentDisabled() {

    }

    @Override
    public void verifyLikeAndCommentEnabled() {

    }

    public void verifySendMsgButtonEnabled(){
        waitForElementToBeVisible(sendMessageButton);
        sendMessageButton.click();
        driver().getKeyboard().sendKeys("Hi");
        Assert.assertEquals(sendMessageButton.isEnabled(),false,"senmsg button is disabled");
        sendMessageButton.click();
    }
    public void verifyAllTheElementsOnMb(){
        softAssert.assertEquals(mbText.isEnabled(),true,"mb text is not displayed");
        softAssert.assertEquals(sendMessageButton.isEnabled(),false,"sendMessageButton is not displayed");
      //  softAssert.assertEquals(takemetolearn.isEnabled(),true,"takemetolearn is not displayed");
      //  softAssert.assertEquals(takemetoPractice.isEnabled(),true,"takemetoPractice is not displayed");
        softAssert.assertEquals(mbimageview.get(0).isEnabled(),true,"Viewfeedback not displayed");
        softAssert.assertEquals(mbimageview.get(1).isEnabled(),true,"MbImage not displayed");
        softAssert.assertEquals(arrowButton.isEnabled(),true,"arrow button is not displayed");
        softAssert.assertAll();

    }

}

