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

public class MbPageAndroid extends BasePage implements MbPage {
    SoftAssert softAssert=null;
    public MbPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "imgEmbibeChat")
    private WebElement mb;

    @FindBy(id = "sendMessage")
    private WebElement sendMessageButton;

    @FindBy(xpath= "//android.widget.TextView[@text='Mb']")
    private WebElement mbText;

    @FindBy(xpath= "//android.widget.TextView[@text='Take me to learn']")
    private WebElement takemetolearn;

    @FindBy(xpath= "//android.widget.TextView[@text='Take me to Practice']")
    private WebElement takemetoPractice;

    @FindBy(id= "title")
    private WebElement  givefeedback;

    @FindBy(id= "icon")
    private WebElement  icon;

    @FindBy(id = "tag_one")
    private WebElement tag_one;

    @FindBy(id = "tag_two")
    private WebElement tag_two;

    @FindBy(id = "tag_three")
    private WebElement tag_three;

    @FindBy(id = "tag_four")
    private WebElement tag_four;

    @FindBy(id = "cancel")
    private WebElement cancel;

    @FindBy(className ="android.widget.ImageView")
    private List<WebElement> mbimageview;

    @FindBy(className ="android.widget.ImageButton")
    private WebElement arrowButton;

    @FindBy(id= "feedback_up")
    private WebElement  feedback_up;

    @FindBy(id= "textViewMessage")
    private WebElement  welcomemsg;

    @FindBy(id= "feedback_comment")
    private WebElement  feedback_comment;

    @FindBy(id= "feedback_down")
    private WebElement  feedback_down;

    @FindBy(id= "submit")
    private WebElement  submit;

    @FindBy(xpath ="//android.widget.Button[@text='Thank you so much! You made my day.']")
    private WebElement title ;

    public void verifyEmbibeChatDisplay(){
        waitForElementToBeVisible(mb);
        softAssert.assertEquals(mb.isDisplayed(),true,"mb is not displayed");
    }

    public  void clickonMb(){
        waitForElementToBeVisible(mb);
        mb.click();
    }
    public void naviGateBack(){
        arrowButton.click();
    }

    public void verifySendMsgButtonDisabled(){
    waitForElementToBeVisible(sendMessageButton);
        Assert.assertEquals(sendMessageButton.isEnabled(),false,"senmsg button is enabled");
    }
    public void clickOntakemetolearn(){
        waitForElementToBeVisible(takemetolearn);
        takemetolearn.click();
    }

    @Override
    public void LearnPageIsTheDefaultPage() {

    }
    public void verifyWelcomeMsg(){
        waitForElementToBeVisible(welcomemsg);
        Assert.assertEquals(welcomemsg.isEnabled(),true,"welcomemsg is not Displayed");
    }
    public void clickOntakemetoPractice(){
        waitForElementToBeVisible(takemetoPractice);
        takemetoPractice.click();
    }
    public  void clickonGiveFeedBack(){
        waitForElementToBeVisible(mbimageview.get(0));
        mbimageview.get(0).click();
        waitForElementToBeVisible(givefeedback);
        givefeedback.click();
    }
    public void clickOnFeedbackUp(){
        verifySendMsgButtonEnabled();
        waitForElementToBeVisible(feedback_up);
        feedback_up.click();
        softAssert.assertEquals(feedback_comment.isEnabled(),true,"feedback_comment is not Displayed");
        softAssert.assertEquals(feedback_up.isEnabled(),false,"feedback_comment is not Displayed");
        softAssert.assertAll();
    }
    public void clickOnFeedbackDown(){
        verifySendMsgButtonEnabled();
        waitForElementToBeVisible(feedback_down);
        feedback_down.click();
        softAssert.assertEquals(feedback_comment.isEnabled(),true,"feedback_comment is not Displayed");
        softAssert.assertEquals(feedback_down.isEnabled(),false,"feedback_comment is not Displayed");
        softAssert.assertAll();
    }
    public void verifySendMsgButtonEnabled(){
        waitForElementToBeVisible(sendMessageButton);
        sendMessageButton.click();
        driver().getKeyboard().sendKeys("Hi");
        Assert.assertEquals(sendMessageButton.isEnabled(),true,"senmsg button is disabled");
        sendMessageButton.click();
    }
    public void verifyAllTheElementsOnMb(){
        softAssert.assertEquals(mbText.isDisplayed(),true,"mb text is not displayed");
        softAssert.assertEquals(sendMessageButton.isDisplayed(),true,"sendMessageButton is not displayed");
        softAssert.assertEquals(takemetolearn.isDisplayed(),true,"takemetolearn is not displayed");
//        softAssert.assertEquals(takemetoPractice.isDisplayed(),true,"takemetoPractice is not displayed");
        softAssert.assertEquals(mbimageview.get(0).isDisplayed(),true,"Viewfeedback not displayed");
        softAssert.assertEquals(mbimageview.get(1).isDisplayed(),true,"MbImage not displayed");
        softAssert.assertEquals(arrowButton.isDisplayed(),true,"arrow button is not displayed");
        softAssert.assertAll();

    }
    public void verifyAllTheElementsOnFeedBackScreen(){
        softAssert.assertEquals(icon.isDisplayed(),true,"Like is not displayed");
        softAssert.assertEquals(tag_one.isDisplayed(),true,"tag_one is not displayed");
        softAssert.assertEquals(tag_two.isDisplayed(),true,"tag_two is not displayed");
        softAssert.assertEquals(tag_three.isDisplayed(),true,"tag_three is not displayed");
        softAssert.assertEquals(tag_four.isDisplayed(),true,"tag_four is not displayed");
//        softAssert.assertEquals(title.isDisplayed(),true,"title is not displayed");
        softAssert.assertAll();
    }
   public  void verifySubmitButtonEnabled(){
       softAssert.assertEquals(submit.isEnabled(),true,"submit Button is not disabled");
       softAssert.assertAll();
   }
    public  void verifySubmitButtonDisabled(){
        softAssert.assertEquals(submit.isEnabled(),false,"submit Button is Enabled");
        softAssert.assertAll();
    }
    public void clickOnCancelButton(){
        waitForElementToBeVisible(cancel);
        cancel.click();

    }
    public void verifyLikeAndCommentDisabled(){
        softAssert.assertEquals(feedback_comment.isEnabled(),false,"feedback_comment is not Displayed");
        softAssert.assertEquals(feedback_up.isEnabled(),false,"feedback_comment is not Displayed");
        softAssert.assertAll();
    }
    public void verifyLikeAndCommentEnabled(){
        softAssert.assertEquals(feedback_comment.isEnabled(),true,"feedback_comment is not Displayed");
        softAssert.assertEquals(feedback_up.isEnabled(),true,"feedback_comment is not Displayed");
        softAssert.assertAll();
    }
    public void verifyUnLikeAndCommentEnabled(){
        softAssert.assertEquals(feedback_comment.isEnabled(),true,"feedback_comment is not Displayed");
        softAssert.assertEquals(feedback_up.isEnabled(),true,"feedback_comment is not Displayed");
        softAssert.assertAll();
    }
    public void verifyUnLikeAndCommentDisabled(){
        softAssert.assertEquals(feedback_comment.isEnabled(),false,"feedback_comment is not Displayed");
        softAssert.assertEquals(feedback_down.isEnabled(),false,"feedback_comment is not Displayed");
        softAssert.assertAll();
    }
    public void clickOnSubmitButton(){
        waitForElementToBeVisible(submit);
        submit.click();
    }
    public void clickonComment(){
        waitForElementToBeVisible(feedback_comment);
        feedback_comment.click();

    }
    public void clickOnNote(){
        clickonComment();
        driver().getKeyboard().sendKeys("Hi");
        driver().hideKeyboard();
    }
}


