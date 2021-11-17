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

public class TakeTestPageAndroid  extends BasePage implements TakeTestPage{
    SoftAssert softAssert=null;
    public TakeTestPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(id = "labelInstructions")
    private WebElement Instructions;

    @FindBy(id = "testName")
    private WebElement testName;

    @FindBy(id = "tabLayout")
    private WebElement about_marking_navigation;

    @FindBy(id = "layoutTestDetail")
    private WebElement testDetails;

    @FindBys({@FindBy(className="android.view.ViewGroup")})
    private List<WebElement> instructionsPoints;

    @FindBy(id = "iv_checkbox")
    private WebElement checkbox;

    @FindBy(id = "tv_read_instructions")
    private WebElement I_have_read_and_understood_the_instructions_TEXT;

    @FindBy(id = "btn_start")
    private WebElement startNow;

    @FindBy(id = "back")
    private WebElement backArrow;

    @FindBy(id = "fb-blank-0")
    private WebElement AnswerField;

    @FindBy(id = "textTimer")
    private WebElement textTimer;

    @FindBy(id = "iconList")
    private WebElement sideMenu;

    @FindBys({@FindBy(id="textQuestionNo")})
    private List<WebElement> questionNumbers;

    @FindBys({@FindBy(id="cl_row_ques_summary")})
    private List<WebElement> questions;

    @FindBy(id = "btnSubmitTest")
    private WebElement submitButton;

    @FindBy(id = "iv_checkbox")
    private WebElement MarkForReview_checkbox;

    @FindBy(id = "textMarkForReview")
    private WebElement MarkForReview_text;

    @FindBy(id = "frameQuestion")
    private WebElement questionFrame;

    @FindBy(id = "btnPrevious")
    private WebElement Previous;

    @FindBy(id = "btnSaveNext")
    private WebElement SaveAndNext;

    @FindBy(xpath = "//span[@id=\"fb-blank-0\"]")
    private WebElement input;

    //  @FindBys({@FindBy(xpath="//span[text()='A']")})
    @FindBy(xpath = "//*[text()='A']")
    private WebElement multiple_option;

    @FindBys({@FindBy(id="cl_row_ques_summary")})
    private List<WebElement> ListOfQuestionNumbers;

    @FindBy(xpath = "//div[@id='EM2240332-en_FillInTheBlanks']")
    private WebElement body;

    @FindBy(className = "sc-hTZrWc gIoqJs")
    private WebElement true_false;

    @FindBy(id = "iv_feedback_icon")
    private WebElement testSubmit_Image;

    @FindBy(id = "btnContinueTest")
    private WebElement ContinueToTestFeedback;

    @FindBy(id = "iv_back")
    private WebElement Back;

    @FindBy(id = "tv_header")
    private WebElement Are_you_sure_you_want_to_submit_the_test;

    @FindBy(id = "cl_answered")
    private WebElement answered;

    @FindBy(id = "cl_not_answered")
    private WebElement not_answered;

    @FindBy(id = "cl_not_visited")
    private WebElement not_visited;

    @FindBy(id = "cl_mark_review")
    private WebElement mark_review;

    @FindBy(id = "cl_answer_mark_review")
    private WebElement answer_mark_review;

    @FindBy(id = "ll_timer")
    private WebElement timerLeft;

    @FindBy(id = "btnContinueTest")
    private WebElement ContinueTest;

    @FindBy(xpath ="//android.widget.TextView[@text='Submit Test']")
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
        softAssert.assertEquals(Are_you_sure_you_want_to_submit_the_test.isDisplayed(),true,"Are_you_sure_you_want_to_submit_the_test, is not visible");
        softAssert.assertEquals(answered.isDisplayed(),true,"Answered is not visible");
        softAssert.assertEquals(not_answered.isDisplayed(),true,"Not answered is not visible");
        softAssert.assertEquals(not_visited.isDisplayed(),true,"Not visited is not visible");
        softAssert.assertEquals(mark_review.isDisplayed(),true,"Marked for review is not visible");
        softAssert.assertEquals(answer_mark_review.isDisplayed(),true,"Answer and marked for review is not visible");
        softAssert.assertEquals(timerLeft.isDisplayed(),true,"Timer Left is not visible");
        softAssert.assertEquals(ContinueTest.isDisplayed(),true,"Continue test button is not visible");
        softAssert.assertEquals(submitTest.isDisplayed(),true,"submitTest button is not visible");
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
        softAssert.assertEquals(Instructions.isDisplayed(),true,"Instructions is not visible");
        softAssert.assertEquals(testName.isDisplayed(),true,"Test name is not visible");
        softAssert.assertEquals(about_marking_navigation.isDisplayed(),true,"about_marking_navigation tab is not visible");
        softAssert.assertEquals(testDetails.isDisplayed(),true,"Test Details is not available");
        softAssert.assertEquals(instructionsPoints.get(0).isDisplayed(),true,"instructions Points 1,is not available");
        softAssert.assertEquals(instructionsPoints.get(1).isDisplayed(),true,"instructions Points 2,is not available");
        softAssert.assertEquals(instructionsPoints.get(2).isDisplayed(),true,"instructions Points 3,is not available");
        softAssert.assertEquals(instructionsPoints.get(3).isDisplayed(),true,"instructions Points 4,is not available");
        softAssert.assertEquals(instructionsPoints.get(4).isDisplayed(),true,"instructions Points 5,is not available");
        softAssert.assertEquals(instructionsPoints.get(5).isDisplayed(),true,"instructions Points 6,is not available");
        softAssert.assertEquals(checkbox.isDisplayed(),true,"checkbox is not available");
        softAssert.assertEquals(I_have_read_and_understood_the_instructions_TEXT.isDisplayed(),true,"I_have_read_and_understood_the_instructions is not available");
        softAssert.assertEquals(startNow.isDisplayed(),true,"start now button is not available");
        //    softAssert.assertEquals(backArrow.isDisplayed(),true,"Back arrow is not available");
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
        softAssert.assertEquals(textTimer.isDisplayed(),true,"Timer is not displayed");
        softAssert.assertEquals(sideMenu.isDisplayed(),true,"side menue is not displayed");
        softAssert.assertEquals(questions.get(3).isDisplayed(),true,"Question numbers are not displayed");
        //softAssert.assertEquals(submitButton.isDisplayed(),true,"submit button is not displayed");
        softAssert.assertEquals(textQuestionType.isDisplayed(),true,"Question type is not displayed");
        softAssert.assertEquals(MarkForReview_text.isDisplayed(),true,"Mark for review check is not displayed");
        softAssert.assertEquals(Previous.isDisplayed(),true,"Previous button is not displayed");
        softAssert.assertEquals(SaveAndNext.isDisplayed(),true," Save and next button is not displayed");
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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        softAssert.assertEquals(textTimer.isDisplayed(),true,"Timer not displayed");
        return time;
    }

}

