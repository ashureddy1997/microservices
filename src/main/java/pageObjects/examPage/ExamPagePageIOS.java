package pageObjects.examPage;

import constant.Exam;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class ExamPagePageIOS extends BasePage implements ExamPage{
    SoftAssert softAssert=null;
    public ExamPagePageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select Exam\"]")
    private WebElement title;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")})
    private List<WebElement> examList;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Done\"]")
    private WebElement doneButton;

    public void clickOnDoneButton() {
        waitForElementToBeVisible(doneButton);
        doneButton.click();
    }

    public void selectExam(String ExamName) {
      //  waitForElementToBeVisible(examList.get(examList.size()-1));
        WebElement element= driver().findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+ExamName+"\"]"));
        scrollToElementIos(element);

        element.click();
      /*  for (int i = examList.size()-1; i > 0; i--) {
            if (examList.get(i).getText().toUpperCase().equalsIgnoreCase(ExamName)) {
                examList.get(i).click();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                break;
            }
        }*/
    }

    public void verifyAllTheElementPresent() {
        waitForElementToBeVisible(title);
        softAssert.assertEquals(title.getText(), Exam.Select_Exam,"Title not matched ");
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"Exam Not displayed ");
        examList.get(0).click();
        softAssert.assertEquals(doneButton.isEnabled(),true,"Next button not displayed");
        softAssert.assertAll();
    }
    public void verifyAllExamsAreDisplayed(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"6th Grade Not displayed ");
        softAssert.assertEquals(examList.get(1).isEnabled(), true,"7th Grade Not displayed ");
        softAssert.assertEquals(examList.get(2).isEnabled(), true,"8th Grade Not displayed ");
        softAssert.assertEquals(examList.get(3).isEnabled(), true,"9th Grade Not displayed ");
        softAssert.assertEquals(examList.get(4).isEnabled(), true,"10th Grade Not displayed ");
        softAssert.assertEquals(examList.get(5).isEnabled(), true,"11th Grade Not displayed ");
        softAssert.assertEquals(examList.get(6).isEnabled(), true,"12th Grade Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForEngineering(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"JEE Main Not displayed ");
        softAssert.assertEquals(examList.get(1).isEnabled(), true,"JEE Advanced Not displayed ");
        softAssert.assertEquals(examList.get(2).isEnabled(), true,"VITEEE is not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForMedical(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"NEET Main Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForBanking(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"IBPS PO Mains Not displayed ");
        softAssert.assertEquals(examList.get(1).isEnabled(), true,"IBPS RRB Officer Scale-I Prelims Not displayed ");
        softAssert.assertEquals(examList.get(2).isEnabled(), true,"IBPS Clerk Prelims Not displayed ");
        softAssert.assertEquals(examList.get(3).isEnabled(), true,"IBPS Clerk Mains Not displayed ");
        softAssert.assertEquals(examList.get(4).isEnabled(), true,"IBPS RRB Office Assistant Mains Not displayed ");
        softAssert.assertEquals(examList.get(5).isEnabled(), true,"IBPS RRB Office Assistant Prelims Not displayed ");
        softAssert.assertEquals(examList.get(6).isEnabled(), true,"IBPS PO Prelims Not displayed ");
        softAssert.assertEquals(examList.get(7).isEnabled(), true,"SBI PO Mains Not displayed ");
        softAssert.assertEquals(examList.get(8).isEnabled(), true,"IBPS RRB Officer Scale-I Mains Not displayed ");
        softAssert.assertAll();

    }

    public void verifyAllExamsAreDisplayedForSSC(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"SSC MTS Tier I Not displayed ");
        softAssert.assertEquals(examList.get(1).isEnabled(), true,"SSC Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForRailways(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"RRC Group D CBT Not displayed ");
        softAssert.assertEquals(examList.get(1).isEnabled(), true,"RRB NTPC CBT 1 Not displayed ");
        softAssert.assertEquals(examList.get(2).isEnabled(), true,"Railways Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForDefence(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"DRDO MTS Tier I Not displayed ");
        softAssert.assertEquals(examList.get(1).isEnabled(), true,"CISF Head Constable Not displayed ");
        softAssert.assertEquals(examList.get(2).isEnabled(), true,"Defence Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForInsurance(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"LIC Assistant Prelims Not displayed ");
        softAssert.assertEquals(examList.get(1).isEnabled(), true,"Insurance Not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllExamsAreDisplayedForTeaching(){
        waitForElementToBeVisible(examList.get(0));
        softAssert.assertEquals(examList.get(0).isEnabled(), true,"CTET Paper 1 Prelims Not displayed ");
        softAssert.assertEquals(examList.get(1).isEnabled(), true,"CTET Paper 2 Not displayed ");
        softAssert.assertAll();

    }
}
