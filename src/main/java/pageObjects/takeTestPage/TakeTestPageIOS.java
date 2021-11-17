package pageObjects.takeTestPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class TakeTestPageIOS extends BasePage implements TakeTestPage{
    SoftAssert softAssert=null;
    public TakeTestPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Instructions\"]")
    private WebElement Instructions;

    @FindBy(id = "testName")
    private WebElement testName;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Navigation\"]")
    private WebElement about_marking_navigation;

    @FindBy(id = "layoutTestDetail")
    private WebElement testDetails;

    @FindBys({@FindBy(xpath="//XCUIElementTypeTable//XCUIElementTypeCell//XCUIElementTypeStaticText")})
    private List<WebElement> instructionsPoints;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"I have read and understood the instruction\"]")
    private WebElement checkbox;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I have read and understood the instruction\"]")
    private WebElement I_have_read_and_understood_the_instructions_TEXT;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Start now\"]")
    private WebElement startNow;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"backButtonShadow\"]")
    private WebElement backArrow;

    @FindBy(id = "fb-blank-0")
    private WebElement AnswerField;

    @FindBy(id = "textTimer")
    private WebElement textTimer;

    @FindBy(id = "//XCUIElementTypeImage[@name=\"side_menu_icon\"]")
    private WebElement sideMenu;

    @FindBys({@FindBy(id="textQuestionNo")})
    private List<WebElement> questionNumbers;

    @FindBys({@FindBy(id="cl_row_ques_summary")})
    private List<WebElement> questions;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit\"]")
    private WebElement submitButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mark For Review\"]")
    private WebElement MarkForReview_checkbox;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mark For Review\"]")
    private WebElement MarkForReview_text;

    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]")
    private WebElement questionFrame;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Previous\"]")
    private WebElement Previous;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save & Next\"]")
    private WebElement SaveAndNext;

    @FindBy(xpath = "//span[@id=\"fb-blank-0\"]")
    private WebElement input;

    //  @FindBys({@FindBy(xpath="//span[text()='A']")})
    @FindBy(xpath = "//*[text()='A']")
    private WebElement multiple_option;

    @FindBys({@FindBy(xpath="//XCUIElementTypeCollectionView/XCUIElementTypeCell")})
    private List<WebElement> ListOfQuestionNumbers;

    @FindBy(xpath = "//div[@id='EM2240332-en_FillInTheBlanks']")
    private WebElement body;

    @FindBy(className = "sc-hTZrWc gIoqJs")
    private WebElement true_false;

    @FindBy(id = "iv_feedback_icon")
    private WebElement testSubmit_Image;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue To Test Feedback\"]")
    private WebElement ContinueToTestFeedback;

    @FindBy(id = "iv_back")
    private WebElement Back;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you sure you want to submit the test?\"]")
    private WebElement Are_you_sure_you_want_to_submit_the_test;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Answered\"]")
    private WebElement answered;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Not Answered\"]")
    private WebElement not_answered;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Not Visited\"]")
    private WebElement not_visited;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Marked For Review\"]")
    private WebElement mark_review;

    @FindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Answered & Marked For Review\"]")
    private WebElement answer_mark_review;

    @FindBy(xpath = "XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeStaticText")
    private WebElement timerLeft;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue Test\"]")
    private WebElement ContinueTest;

    @FindBy(xpath ="//XCUIElementTypeButton[@name=\"Submit Test\"]")
    private WebElement submitTest;

    @FindBy(xpath = "//textQuestionType[@text='True False']")
    private WebElement TrueFalse;

    @FindBy(xpath = "//android.widget.TextView[@text='Single Choice']")
    private WebElement SingleChoice;

    @FindBy(id = "textQuestionType")
    private WebElement textQuestionType;

    @FindBy(id = "tv_answered")
    private WebElement CountOfAnswered;

    @FindBy(id = "tv_not_answered")
    private WebElement CountOfNotAnswered;

    @FindBy(id = "tv_not_visited")
    private WebElement CountOfNotVisited;

    @FindBy(id = "tv_mark_review")
    private WebElement CountOfMarkedForReview;

    @FindBy(id = "tv_answere_mark_review")
    private WebElement CountOfAnsweredAndMarkedForReview;

    @FindBys({@FindBy(id = "textInstruction")})
    private List<WebElement> textInstruction;


    public void attemptQuestion(String questionType){

        if(questionType.equals(textQuestionType)) {
            waitForElementToBeVisible(input);
            fillInTheBlank("test");
        }
        else if(SingleChoice.getText().equals("Single Choice")) {
            waitForElementToBeVisible(multiple_option);
            multipleOptions();
        }
        else if(questionType.equals(TrueFalse)) {
            waitForElementToBeVisible(multiple_option);
            multipleOptions();
        }
        else {
            System.out.println("No Question found");
        }
    }
    public void fillInTheBlank(String value) {
        waitForElementToBeVisible(body);
        driver().getKeyboard();
        try {
            input.click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            driver().getKeyboard().sendKeys(value);
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void multipleOptions() {
        waitForElementToBeVisible(multiple_option);
        try {
            multiple_option.click();
            System.out.println( multiple_option.isSelected()+"selected");
            softAssert.assertEquals(multiple_option.isSelected(),true,"Not Selected");
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void verifyElementsOfTestSubmitConfirmation(){
        waitForElementToBeVisible(testSubmit_Image);
        softAssert.assertEquals(Are_you_sure_you_want_to_submit_the_test.isEnabled(),true,"Are_you_sure_you_want_to_submit_the_test, is not visible");
        softAssert.assertEquals(answered.isEnabled(),true,"Answered is not visible");
        softAssert.assertEquals(not_answered.isEnabled(),true,"Not answered is not visible");
        softAssert.assertEquals(not_visited.isEnabled(),true,"Not visited is not visible");
        softAssert.assertEquals(mark_review.isEnabled(),true,"Marked for review is not visible");
        softAssert.assertEquals(answer_mark_review.isEnabled(),true,"Answer and marked for review is not visible");
        softAssert.assertEquals(timerLeft.isEnabled(),true,"Timer Left is not visible");
        softAssert.assertEquals(ContinueTest.isEnabled(),true,"Continue test button is not visible");
        softAssert.assertEquals(submitTest.isEnabled(),true,"submitTest button is not visible");
        // softAssert.assertAll();
    }

    public void TotalCountOfTestSubmitSummary(){
        int total = CountOfAnswered.getText().concat(CountOfNotAnswered.getText()).concat(CountOfNotVisited.getText())
                .concat(CountOfMarkedForReview.getText()).compareTo(instructionsPoints.get(2).getText());
        System.out.println("Total count is :"+total);
    }
    public int verifyCountOfQuestionsAnswered(){
        waitForElementToBeVisible(CountOfAnswered);
        int answeredCount= Integer.parseInt(CountOfAnswered.getText());
        System.out.println("Total Answered is:"+CountOfAnswered.getText());
        return answeredCount;
    }
    public int verifyCountOfQuestionsNotAnswered(){
        waitForElementToBeVisible(CountOfNotAnswered);
        int notAnsweredCount= Integer.parseInt(CountOfNotAnswered.getText());
        System.out.println("Total Not Answered is:"+CountOfNotAnswered.getText());
        return notAnsweredCount;
    }
    public int verifyCountOfQuestionsNotVisited(){
        waitForElementToBeVisible(CountOfNotVisited);
        int notVisitedCount= Integer.parseInt(CountOfNotVisited.getText());
        System.out.println("Total Not Visited is:"+CountOfNotVisited.getText());
        return notVisitedCount;
    }
    public int verifyCountOfMarkedForReview(){
        waitForElementToBeVisible(CountOfMarkedForReview);
        int markedForReviewCount= Integer.parseInt(CountOfMarkedForReview.getText());
        System.out.println("Total Marked for review is:"+CountOfMarkedForReview.getText());
        return markedForReviewCount;
    }
    public int verifyCountOfAnsweredAndMarkedForReview(){
        waitForElementToBeVisible(CountOfAnsweredAndMarkedForReview);
        int answeredAndMarkedForReviewCount= Integer.parseInt(CountOfAnsweredAndMarkedForReview.getText());
        System.out.println("Total Answered and marked for review is:"+CountOfAnsweredAndMarkedForReview.getText());
        return answeredAndMarkedForReviewCount;
    }
    public void totalQuestions(){
        waitForElementToBeVisible(textInstruction.get(2));
        System.out.println(textInstruction.size());
        System.out.println("Total Questions is : "+textInstruction.get(2).getText());

    }

    public void clickOnContinueTest(){
        waitForElementToBeVisible(ContinueTest);
        ContinueTest.click();
    }
    public void clickOnSubmitTestButton(){
        waitForElementToBeVisible(submitTest);
        submitTest.click();

    }
    public void takeText(){
        waitForElementToBeVisible(body);
        System.out.println( body.getText()+"vipin");
    }
    public void enterAnswer(){
        waitForElementToBeVisible(AnswerField);
        AnswerField.sendKeys("123");
    }
    public void selectTrueOrFalse(){
        waitForElementToBeVisible(true_false);
        true_false.click();
    }
    public void clickOnSaveAndNext(){
        waitForElementToBeVisible(SaveAndNext);
        SaveAndNext.click();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnPreviousButton(){
        waitForElementToBeVisible(Previous);
        Previous.click();
    }
    public void clickOnSubmitButton(){
        waitForElementToBeVisible(submitButton);
        submitButton.click();
    }
    public void verifyElementsOnInstructionsScreen(){
        waitForElementToBeVisible(Instructions);
        softAssert.assertEquals(Instructions.isEnabled(),true,"Instructions is not visible");
        softAssert.assertEquals(testName.isEnabled(),true,"Test name is not visible");
        softAssert.assertEquals(about_marking_navigation.isEnabled(),true,"about_marking_navigation tab is not visible");
        softAssert.assertEquals(testDetails.isEnabled(),true,"Test Details is not available");
        softAssert.assertEquals(instructionsPoints.get(0).isEnabled(),true,"instructions Points 1,is not available");
        softAssert.assertEquals(instructionsPoints.get(1).isEnabled(),true,"instructions Points 2,is not available");
        softAssert.assertEquals(instructionsPoints.get(2).isEnabled(),true,"instructions Points 3,is not available");
        softAssert.assertEquals(instructionsPoints.get(3).isEnabled(),true,"instructions Points 4,is not available");
        softAssert.assertEquals(instructionsPoints.get(4).isEnabled(),true,"instructions Points 5,is not available");
        softAssert.assertEquals(instructionsPoints.get(5).isEnabled(),true,"instructions Points 6,is not available");
        softAssert.assertEquals(checkbox.isEnabled(),true,"checkbox is not available");
        softAssert.assertEquals(I_have_read_and_understood_the_instructions_TEXT.isEnabled(),true,"I_have_read_and_understood_the_instructions is not available");
        softAssert.assertEquals(startNow.isEnabled(),true,"start now button is not available");
        //    softAssert.assertEquals(backArrow.isEnabled(),true,"Back arrow is not available");
        softAssert.assertAll();

    }
    public void clickOnBackArrow(){
        waitForElementToBeVisible(Back);
        Back.click();
    }
    public void clickOnCheckBox(){
        waitForElementToBeVisible(checkbox);
        checkbox.click();
    }
    public void clickOnStartNowButton(){
        waitForElementToBeVisible(startNow);
        startNow.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void verifyAllTheElementsOnTestScreen(){
        waitForElementToBeVisible(questionFrame);
        softAssert.assertEquals(textTimer.isEnabled(),true,"Timer is not displayed");
        softAssert.assertEquals(sideMenu.isEnabled(),true,"side menue is not displayed");
        softAssert.assertEquals(questions.get(3).isEnabled(),true,"Question numbers are not displayed");
        //softAssert.assertEquals(submitButton.isEnabled(),true,"submit button is not displayed");
        softAssert.assertEquals(textQuestionType.isEnabled(),true,"Question type is not displayed");
        softAssert.assertEquals(MarkForReview_text.isEnabled(),true,"Mark for review check is not displayed");
        softAssert.assertEquals(Previous.isEnabled(),true,"Previous button is not displayed");
        softAssert.assertEquals(SaveAndNext.isEnabled(),true," Save and next button is not displayed");
        softAssert.assertAll();

    }
    public void clickOnsideMenuBar(){
        waitForElementToBeVisible(sideMenu);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sideMenu.click();
    }
    public void clickOnQuestionNumber(int index){
        waitForElementToBeVisible(questionNumbers.get(index));
        questionNumbers.get(index).click();
    }
    public void clickOnContinueToTestFeedback(){
        waitForElementToBeVisible(ContinueToTestFeedback);
        ContinueToTestFeedback.click();

    }
    public void clickOnMarkForReviewCheckbox(){
        waitForElementToBeVisible(MarkForReview_checkbox);
        MarkForReview_checkbox.click();
    }
    public String verifyQuestionHasMarkedForReview(){
        waitForElementToBeVisible(MarkForReview_text);
        String questionIsMarked =MarkForReview_text.getText();
        System.out.println("Marked: "+ MarkForReview_text.getText());
        return questionIsMarked;
    }
    public void clickOnQuestion(int index){
        waitForElementToBeVisible(questionNumbers.get(index));
        questionNumbers.get(index).click();
    }
    public String getTimer(){
        waitForElementToBeVisible(textTimer);
        String time= textTimer.getText();
        System.out.println("time is: "+textTimer.getText());
        softAssert.assertEquals(textTimer.isEnabled(),true,"Timer not displayed");
        return time;
    }

}
