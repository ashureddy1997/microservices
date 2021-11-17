package pageObjects.takeATest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class TakeATestPageAndroid  extends BasePage implements TakeATestPage{
    SoftAssert softAssert=null;
    public TakeATestPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
          @FindBy(id = "btnSaveNext")
        private WebElement SaveAndNext;

        @FindBy(xpath = "//div[text()='%s']")
        private WebElement selectDropdown;

        @FindBy(id = "btnSubmitTest")
        private WebElement submitButton;

        @FindBy(id = "tv_header")
        private WebElement Are_you_sure_you_want_to_submit_the_test;

        @FindBy(id = "tv_header")
        private  WebElement feedBackSuccessMessage;

        @FindBy(xpath ="//android.widget.TextView[@text='Submit Test']")
        private WebElement submitTest;

        @FindBy(id = "btnContinueTest")
        private WebElement ContinueToTestFeedback;

        public void clickOnSaveAndNext(){
            waitForElementToBeVisible(SaveAndNext);
            SaveAndNext.click();
        }
        public void clickOnSubmitButton(){
            waitForElementToBeVisible(submitButton);
            submitButton.click();
        }

        public void clickOnSubmitTestButton(){
            waitForElementToBeVisible(submitTest);
            submitTest.click();
        }
        public void clickOnContinueToTestFeedback(){
            waitForElementToBeVisible(ContinueToTestFeedback);
            ContinueToTestFeedback.click();
        }
        public Object getSubmitTestPopupText() {
            waitForElementToBeVisible(Are_you_sure_you_want_to_submit_the_test);
            Are_you_sure_you_want_to_submit_the_test.getText();
            return null;
        }

        public Object getSubmitSuccessMessage() {
            waitForElementToBeVisible(feedBackSuccessMessage);
            feedBackSuccessMessage.getText();
            return null;
        }


        public void takeATest(Map<String,String> questionAndTypeMap, Map<String, List<Map<String,Object>>> questionAnswersMap, String totalAttempts) throws InterruptedException {
            if (totalAttempts.equals("all")){
                Set<String> questions = questionAndTypeMap.keySet();
                for (String questionId:questions) {
                    System.out.println(questionId+":"+questionAndTypeMap.get(questionId));
                    switchToWebView();
                    attemptQuestion(questionId,questionAndTypeMap.get(questionId).toString(),questionAnswersMap.get(questionId),"correct");
                    wait(1000);
                    switchToNativeApp();
                    clickOnSaveAndNext();
                    wait(1000);
                }
            }else {
                clickOnSubmitButton();
                Assert.assertEquals(Objects.equals(getSubmitTestPopupText(), "Are you sure you want to submit the test?"),true);
                wait(4000);
                clickOnSubmitTestButton();
                Assert.assertEquals(Objects.equals(getSubmitSuccessMessage(), "Your test is submitted successfully"),true);
                wait(4000);
                clickOnContinueToTestFeedback();
            }
        }
        public void  selectAnswer(String questionType,String questionId, String answer,String option,int ... nthOption){

            switch (questionType){
                case "SubjectiveAnswer":
                case "Integer":
                case "Subjective Numerical":


                    try{
                        String subjectNum = "//span[@id='%s']";
                        WebElement subjectNumEle = driver().findElement(By.xpath(String.format(subjectNum,questionId)));

                        subjectNumEle.click();
                        driver().getKeyboard().sendKeys(answer);
                        driver().hideKeyboard();

                    }catch (Exception e){
                        System.out.println("Question id :"+  questionId +" not able to attempt");
                        e.printStackTrace();

                    }
                    break;

                case "True-False":
                case "Assertion" :
                case "Multiple Choice":
                case "Single Choice":
                case "Matrix Single Choice":
                    try{
                        String matrixSingle="//span[text()='%s']";
                        WebElement matrixSingleEle = driver().findElement(By.xpath(String.format(matrixSingle,option)));
                        Thread.sleep(5000);
                        matrixSingleEle.click();
                    }catch (Exception e){
                        System.out.println("Question id :"+  questionId +" not able to attempt");
                        e.printStackTrace();

                    }
                    break;
                case "Matrix":
                    try{
                        int a[][] = new int[4][4];
                        String [] ans1 = answer.split(";;");
                        String [] ans2 = ans1[1].split(";");
                        for (int i = 0; i <ans2.length ; i++) {
                            String[] ans3 = ans2[i].split("-");
                            int rowIndex = getIndex(ans3[0]);
                            int calIndex = getIndex(ans3[1]);
                            rowIndex =rowIndex+1;
                            WebElement element = driver().findElement(By.xpath("//div[@class='matrix']/table/tbody/tr["+rowIndex+"]/td["+calIndex+"]"));
                            Thread.sleep(5000);
                            element.click();
                        }
                    }catch (Exception e){
                        System.out.println("Question id :"+  questionId +" not able to attempt");
                        e.printStackTrace();

                    }
                    break;
                case "MultipleFillInTheBlanks":
                case "FillInTheBlanks":
                    try {
                        WebElement fillInTheBlankEle = driver().findElement(By.xpath("//span[@id='fb-blank-0']"));
                        fillInTheBlankEle.click();
                        driver().getKeyboard().sendKeys(answer);
                        driver().hideKeyboard();
                    }catch (Exception e){
                        System.out.println("Question id :"+  questionId +" not able to attempt");
                        e.printStackTrace();


                    }
                    break;
                case "SingleDropDown":
                    try{
                        waitForElementToBeVisible(selectDropdown);
                        selectDropdown.click();
                        String singleDrop="//div[text()='%s']";
                        WebElement matrixSingleEle = driver().findElement(By.xpath(String.format(singleDrop,answer)));
                        Thread.sleep(5000);
                        matrixSingleEle.click();
                    }catch (Exception e){
                        System.out.println("Question id :"+  questionId +" not able to attempt");
                        e.printStackTrace();


                    }
            }
        }
        public void attemptQuestion(String questionId,String questionType, List<Map<String,Object>> options, String flag){
            String answer = null;
            String option = null;
            int nthOption =0;

            for (int i = 0; i <options.size() ; i++) {
                try{
                    Map<String,Object> optionMap = options.get(i);
                    if (flag.equals("correct")){
                        if ((boolean)optionMap.get("is_correct") == true){
                            answer = optionMap.get("body").toString();
                            option = getOption(i);
                            System.out.println(questionType);
                            selectAnswer(questionType,questionId,answer,option,nthOption++);
                            if (questionType.equals("Multiple Choice") || questionType.equals("MultipleFillInTheBlanks")){
                                continue;
                            }else {
                                nthOption=0;
                                break;
                            }
                        }else {
                            continue;
                        }
                    }else if (flag.equals("incorrect")){
                        if ((boolean)optionMap.get("is_correct") == false){
                            answer = optionMap.get("body").toString();
                            option = getOption(i);
                            selectAnswer(questionType,questionId,answer,option);
                            break;
                        }else {
                            continue;
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();


                }

            }
        }
        public String getOption(int i){
            String option = null;
            switch (i){
                case 0: option ="A";
                    break;
                case 1: option ="B";
                    break;
                case 2: option ="C";
                    break;
                case 3: option ="D";
                    break;
                case 4: option ="E";
                    break;
                case 5: option ="F";
                    break;
                case 6: option ="G";
                    break;
            }
            return option;
        }
        public int getIndex(String value){
            int index = -1;
            switch (value){
                case "a":
                case "p": index =1;
                    break;
                case "b":
                case "q": index =2;
                    break;
                case "c":
                case "r": index =3;
                    break;
                case "d":
                case "s": index =4;
                    break;
                case "e":
                case "t": index =5;
                    break;
                case "f":
                case "u": index =6;
                    break;
                case "g":
                case "v": index =7;
                    break;
                case "h":
                case "w": index =8;
                    break;
            }
            return index;
        }

    @Override
    public void clickOnCheckBox() {

    }

    @Override
    public void clickOnStartNowButton() {

    }
}


