package pageObjects.signOutPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class SignOutPageAndroid extends BasePage implements SignOutPage{
    SoftAssert softAssert=null;
    public SignOutPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "tv_by_signing_up")
    private WebElement By_signing_up_you_agree_to_our;

    @FindBy(id ="img_HeroBannerAvatar")
    private WebElement AvatarImage;

    @FindBys({@FindBy(id="user_logo")})
    private List<WebElement> profileNameList;

    @FindBy(id ="tv_more")
    private WebElement ManageProfile;

    @FindBy(xpath ="//android.widget.TextView[@text='Sign Out']")
    private WebElement SignUp;

    @FindBy(id = "btn_continue_learning")
    private WebElement signOut;

    @FindBy(id ="edit")
    private WebElement Edit;

    @FindBys({@FindBy(id = "iv_avatar")})
    private List<WebElement> AvatarIconList;

    @FindBy(id ="textView2")
    private WebElement Username;

    @FindBys({@FindBy(id = "username")})
    private List<WebElement> Profileusername;


    @FindBy(id ="tvSignup")
    private WebElement Proceed_Button;

    @FindBy(id ="title")
    private WebElement Title;

    @FindBy(id ="btn_quit")
    private WebElement CancelButton;

    @FindBy(id ="tv_i_want_to_prepare_for_label")
    private WebElement I_want_to_prepare_for;

    @FindBy(id ="tv_my_board_is_label")
    private WebElement My_Board_Is;

    @FindBy(id ="tv_my_class_is_label")
    private WebElement My_Class_Is;

    @FindBy(id ="tv_i_am_aiming_for")
    private WebElement Aiming_For;

    @FindBy(id ="editGoalsBtn")
    private WebElement EditGoalButton;

    @FindBy(id ="tv_i_studying_for")
    private WebElement Studying_For;

    @FindBy(xpath ="//android.widget.TextView[@text='My Downloads']")
    private WebElement My_Dowloads;

    @FindBy(xpath ="//android.widget.TextView[@text='Invite Friend']")
    private WebElement Invite_Friend;

    @FindBy(xpath ="//android.widget.TextView[@text='Download Quality']")
    private WebElement  Download_Quality;

    @FindBy(xpath ="//android.widget.TextView[@text='Terms & Conditions']")
    private WebElement  TermsConditions;

    @FindBy(xpath ="//android.widget.TextView[@text='https://www.embibe.com/']")
    private WebElement  embibeweb;

    @FindBy(xpath ="//android.view.View[@text='TERM AND CONDITIONS OF USE']")
    private WebElement  TermsConditionstitle;

    @FindBy(xpath ="//android.widget.TextView[@text='Streaming Video Quality']")
    private WebElement  Streaming_Video_Quality;

    @FindBy(xpath ="//android.widget.TextView[@text='Account Settings']")
    private WebElement  AccountSettings;

    @FindBys({@FindBy(id = "tv_more")})
    private List<WebElement> Menus;

    @FindBy(id ="custom_title1")
    private WebElement title_Feedback;

    @FindBy(id ="tv_thank_you_text")
    private WebElement ThankYouForUsingEmbibe;

    @FindBy(id ="tv_add_a_comment")
    private WebElement header;

    @FindBy(id ="iv_mic_bg")
    private WebElement mic;

    @FindBy(id ="et_comment_box")
    private WebElement commentBox;

    @FindBy(id ="btn_submit_feedback")
    private WebElement SubmitFeedbackButton;

    @FindBy(id ="tv_feedback_success")
    private WebElement feedback_success;


    public void verifyAlltheElementsOnFeedbackScreen(){
        waitForElementToBeVisible(title_Feedback);
        softAssert.assertEquals(title_Feedback.isDisplayed(),true,"title_Feedback is not displayed");
        softAssert.assertEquals(ThankYouForUsingEmbibe.isDisplayed(),true,"ThankYouForUsingEmbibe is not displayed");
        softAssert.assertEquals(header.isDisplayed(),true,"header is not displayed");
        softAssert.assertEquals(mic.isDisplayed(),true,"mic is not displayed");
        softAssert.assertEquals(commentBox.isDisplayed(),true,"commentBox is not displayed");
        softAssert.assertEquals(SubmitFeedbackButton.isDisplayed(),true,"SubmitFeedbackButton is not displayed");
        softAssert.assertAll();
    }
    public void writeFeedbackComments(String Feedback){
        waitForElementToBeVisible(commentBox);
        commentBox.sendKeys(Feedback);
    }
    public void tryToSubmitFeedbackWithoutWritingAnyFeedbackComments(){
        waitForElementToBeVisible(commentBox);
        commentBox.sendKeys("");
    }
    public void verifySubmitFeedbackButtonIsDisabledTillUserEntersAnyComment(){
        waitForElementToBeVisible(SubmitFeedbackButton);
        softAssert.assertEquals(SubmitFeedbackButton.isEnabled(),false,"SubmitFeedbackButton is not disabled");
    }
    public void clickOnSubmitFeedbackButton(){
        waitForElementToBeVisible(SubmitFeedbackButton);
        SubmitFeedbackButton.click();
    }
    public void clickOnTermsandCondition(){
        waitForElementToBeVisible(TermsConditions);
        TermsConditions.click();
    }
    public void verifyFeedbackSuccessMessage(){
        waitForElementToBeVisible(feedback_success);
        softAssert.assertEquals(feedback_success.isDisplayed(),true,"feedback_success message is not displayed");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   public void verifyUsercanNavigateTermsAndCondition(){
       clickOnTermsandCondition();
       softAssert.assertEquals(embibeweb.isDisplayed(),true," not displayed");

   }
    public void clickOnFeedback(){
        waitForElementToBeVisible(Menus.get(3));
        softAssert.assertEquals(Menus.get(3).isEnabled(),true,"Disabled");
        Menus.get(3).click();
    }

    public void clickOnProfilename(){
        waitForElementToBeVisible(profileNameList.get(0));
        profileNameList.get(0).click();
       // driver().navigate().back();
       // profileNameList.get(1).click();
      //  driver().navigate().back();
      //  profileNameList.get(2).click();

    }
    public void clickOnProfileAvtar(){
        waitForElementToBeVisible(profileNameList.get(0));
        profileNameList.get(0).click();
    }

    public void clickOnProfile(){
        waitForElementToBeVisible(AvatarImage);
        AvatarImage.click();
    }
    public void clickOnManageProfile(){
        waitForElementToBeVisible(ManageProfile);
        ManageProfile.click();

    }
    public void VerifyProfileNamesAreVisible(){
        softAssert.assertEquals(Profileusername.get(0).isDisplayed(),true,"ProfileNames are not Displayed");
        softAssert.assertEquals(Profileusername.get(1).isDisplayed(),true,"ProfileNames are not Displayed");
        softAssert.assertEquals(Profileusername.get(2).isDisplayed(),true,"ProfileNames are not Displayed");
        softAssert.assertEquals(Profileusername.get(3).isDisplayed(),true,"ProfileNames are not Displayed");
        softAssert.assertAll();

    }


    public void verifyUserAbleLogout(){
        waitForElementToBeVisible(SignUp);
        SignUp.click();
//        Assert.assertEquals(By_signing_up_you_agree_to_our.isDisplayed(), true, "By_signing_up_you_agree_to_our not displayed");
    }
    public void clickOnLogout(){
        waitForElementToBeVisible(signOut);
        signOut.click();
    }
    public void clickOnAddProfile(){
        profileNameList.get(1).click();
    }


    public void verifyalltheelementsonManageprofile(){
        Assert.assertEquals(My_Board_Is.isDisplayed(), true, "My_Board_Is Label is not displayed");
        Assert.assertEquals(My_Class_Is.isDisplayed(), true, "My_Class_Is Label is not displayed");
        //  Assert.assertEquals(Studying_For.isDisplayed(), true, " Studying_For Label is not displayed");
        //  Assert.assertEquals(Aiming_For.isDisplayed(), true, "Aiming_For Label is not displayed");
        Assert.assertEquals(I_want_to_prepare_for.isDisplayed(), true, "I_want_to_prepare_for label is not displayed");

    }
    public void verifyalltheelementsoncreateprofile() {
        Assert.assertEquals(CancelButton.isDisplayed(), true, "CanceButton is not displayed");
        Assert.assertEquals(Username.isDisplayed(), true, "Username is not displayed");
        Assert.assertEquals(Title.isDisplayed(), true, "Title is not displayed");
        Assert.assertEquals(Proceed_Button.isDisplayed(), true, "Title is not displayed");


    }
    public void clickOnCancelButton(){
        waitForElementToBeVisible(CancelButton);
        CancelButton.click();
    }

    public void VerifyUserAbleToSelectAvatar() {
        waitForElementToBeVisible(Edit);
        Edit.click();
        waitForElementToBeVisible(AvatarIconList.get(0));
        AvatarIconList.get(0).click();
        Edit.click();
        AvatarIconList.get(1).click();
        Edit.click();
        AvatarIconList.get(2).click();
        Edit.click();
        AvatarIconList.get(3).click();
    }
    public void ClickOnEditGoalButton()
    {
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(EditGoalButton);
        Assert.assertEquals(EditGoalButton.isDisplayed(),true,"EditGoalButton is not displayed ");
        EditGoalButton.click();
    }

    public void verifyalltheelementsonLogoutScreen() {
        Assert.assertEquals(ManageProfile.isDisplayed(), true, "Manage Profiles is not displayed");
        //  Assert.assertEquals(My_Dowloads.isDisplayed(), true, "My Downloads is not displayed");
//        Assert.assertEquals(Streaming_Video_Quality.isDisplayed(), true, "Streaming Video Quality is not displayed");
        // Assert.assertEquals(AccountSettings.isDisplayed(), true, "AccountSettings is not displayed");
        Assert.assertEquals(Download_Quality.isDisplayed(), true, "Download_Quality is not displayed");
        Assert.assertEquals(TermsConditions.isDisplayed(), true, "TermsConditions is not displayed");
    }

}
