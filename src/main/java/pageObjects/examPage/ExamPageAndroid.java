package pageObjects.examPage;

import constant.Exam;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class ExamPageAndroid  extends BasePage implements ExamPage {
    SoftAssert softAssert = null;

    public ExamPageAndroid(AppiumDriver driver) {
        softAssert = new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "title")
    private WebElement title;

    @FindBys({@FindBy(id = "tv_goal_exam")})
    private List<WebElement> examList;

    @FindBy(id = "tvPrimaryExamNext")
    private WebElement doneButton;

    public void clickOnDoneButton() {
        waitForElementToBeVisible(doneButton);
        doneButton.click();
    }

    public void selectExam(String ExamName) {
        waitForElementToBeVisible(examList.get(0));
        scrollToText(ExamName);
        for (int i = 0; i < examList.size(); i++) {
            if (examList.get(i).getText().toUpperCase().equalsIgnoreCase(ExamName)) {
                examList.get(i).click();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void verifyAllTheElementPresent() {
        waitForElementToBeVisible(title);
        softAssert.assertEquals(title.getText(), Exam.Select_Exam,"Title not matched ");
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"Exam Not displayed ");
        examList.get(0).click();
        softAssert.assertEquals(doneButton.isDisplayed(),true,"Next button not displayed");
        softAssert.assertAll();
    }
    public void verifyAllExamsAreDisplayed(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"6th Grade Not displayed ");
        softAssert.assertEquals(examList.get(1).isDisplayed(), true,"7th Grade Not displayed ");
        softAssert.assertEquals(examList.get(2).isDisplayed(), true,"8th Grade Not displayed ");
        softAssert.assertEquals(examList.get(3).isDisplayed(), true,"9th Grade Not displayed ");
        softAssert.assertEquals(examList.get(4).isDisplayed(), true,"10th Grade Not displayed ");
        softAssert.assertEquals(examList.get(5).isDisplayed(), true,"11th Grade Not displayed ");
        softAssert.assertEquals(examList.get(6).isDisplayed(), true,"12th Grade Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForEngineering(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"JEE Main Not displayed ");
        softAssert.assertEquals(examList.get(1).isDisplayed(), true,"JEE Advanced Not displayed ");
        softAssert.assertEquals(examList.get(2).isDisplayed(), true,"VITEEE is not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForMedical(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"NEET Main Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForBanking(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"IBPS PO Mains Not displayed ");
        softAssert.assertEquals(examList.get(1).isDisplayed(), true,"IBPS RRB Officer Scale-I Prelims Not displayed ");
        softAssert.assertEquals(examList.get(2).isDisplayed(), true,"IBPS Clerk Prelims Not displayed ");
        softAssert.assertEquals(examList.get(3).isDisplayed(), true,"IBPS Clerk Mains Not displayed ");
        softAssert.assertEquals(examList.get(4).isDisplayed(), true,"IBPS RRB Office Assistant Mains Not displayed ");
        softAssert.assertEquals(examList.get(5).isDisplayed(), true,"IBPS RRB Office Assistant Prelims Not displayed ");
        softAssert.assertEquals(examList.get(6).isDisplayed(), true,"IBPS PO Prelims Not displayed ");
        softAssert.assertEquals(examList.get(7).isDisplayed(), true,"SBI PO Mains Not displayed ");
        softAssert.assertEquals(examList.get(8).isDisplayed(), true,"IBPS RRB Officer Scale-I Mains Not displayed ");
        softAssert.assertAll();

    }

    public void verifyAllExamsAreDisplayedForSSC(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"SSC MTS Tier I Not displayed ");
        softAssert.assertEquals(examList.get(1).isDisplayed(), true,"SSC Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForRailways(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"RRC Group D CBT Not displayed ");
        softAssert.assertEquals(examList.get(1).isDisplayed(), true,"RRB NTPC CBT 1 Not displayed ");
        softAssert.assertEquals(examList.get(2).isDisplayed(), true,"Railways Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForDefence(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"DRDO MTS Tier I Not displayed ");
        softAssert.assertEquals(examList.get(1).isDisplayed(), true,"CISF Head Constable Not displayed ");
        softAssert.assertEquals(examList.get(2).isDisplayed(), true,"Defence Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForInsurance(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"LIC Assistant Prelims Not displayed ");
        softAssert.assertEquals(examList.get(1).isDisplayed(), true,"Insurance Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForTeaching(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isDisplayed(), true,"CTET Paper 1 Prelims Not displayed ");
        softAssert.assertEquals(examList.get(1).isDisplayed(), true,"CTET Paper 2 Not displayed ");
        softAssert.assertAll();

    }
}


