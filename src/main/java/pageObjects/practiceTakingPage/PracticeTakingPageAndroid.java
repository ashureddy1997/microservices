package pageObjects.practiceTakingPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class PracticeTakingPageAndroid  extends BasePage implements PracticeTakingPage{
    SoftAssert softAssert=null;
    public PracticeTakingPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath= "//div[@id='PracticeConatiner']//span[contains(text(),'Question')]/..//span[2]")
    private WebElement questionType;

    @FindBy(xpath= "//*[text()='Continue']")
    private WebElement ContinueWeb;

    @FindBy(xpath="//*[text()='Solve With Us']")
    private  WebElement solvewithusWeb;

    @FindBy(xpath= " //*[ text() = 'Full Solution' ]")
    private WebElement FullSolutionWeb;

    @FindBy(xpath="//button[@class='sc-eGCarw hNhLam swu-reveal-btn']")
    private WebElement revealanswerweb;

    @FindBy(xpath ="//*[text()='Check']" )
    private WebElement checkbuttonweb;

    @FindBy(xpath="//button[@class='sc-eGCarw hNhLam swu-reveal-btn']")
    private WebElement revealbuttonweb;

    @FindBy(xpath="//span [//*[@id='1932756_10']/span[2]']")
    private WebElement subjectiveinputweb;

    @FindBy(xpath="//span [//*[@id='1932756_10']/span[2]']")
    private WebElement integerinputbutton;

    @FindBy(xpath= "//span[text()='A']")
    private WebElement selectOption_A;

    @FindBy(xpath= "//span[@class='mq-root-block mq-empty']")
    private WebElement subjectiveanswerinput;

    @FindBy(xpath= "//span[contains(@id,'solve-wus')]")
    private WebElement integerinput;

    @FindBy(xpath= "//div[@class='sc-iWFSnp cmuvkJ dropdown--select-arrow']")
    private WebElement selectdropdown;

    @FindBy(xpath= "//*[@inputmode='numeric']")
    private WebElement subjectivenumericalinput;

    @FindBy(xpath= "//div[@class='sc-eWVKcp sc-aKZfe sc-dkmKpi coSUJe fiTcEd ioWVHA dropdown--item']")
    private WebElement dropdownoption;

    @FindBy(xpath= "//span[@class='sc-jXktwP FSikw mq-editable-field mq-math-mode em-text-mode'] or //span[@id=' sc-jXktwP bKdPXW mq-editable-field mq-math-mode em-text-mode'] ")
    private WebElement fillintheblanksinput;

    @FindBy(xpath= "//span[@id='fb-blank-0']")
    private WebElement multiplefillintheblanksinput1;

    @FindBy(xpath= "//span[@id='fb-blank-1']")
    private WebElement multiplefillintheblanksinput2;

    @FindBy(id ="btn_continue_learning")
    private WebElement GoBackButton;

    public boolean isPracticeOver() {
        boolean flag = false;
        switchToNativeApp();

        try {
            Assert.assertEquals(GoBackButton.isDisplayed(), true, "Hero banner  not displayed");
            flag=true;


        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public boolean Attempt() throws InterruptedException {
        waitForElementToBeVisible(questionType);
        String QuestionTyp = questionType.getText();
        boolean flag=true;
        String questionIdText = "//div[@class='question-view-body']//div";
        String qID = driver().findElement(By.xpath(questionIdText)).getAttribute("id");
        int num = qID.indexOf("_");
        System.out.println(num);
        String hh = qID.substring(0, num);
        System.out.println(QuestionTyp);



        switch (QuestionTyp) {
            case "Subjective": {

                Thread.sleep(10000);
                FullSolutionWeb.click();
                Thread.sleep(10000);
                ContinueWeb.click();
            }
            break;

            case "True-False":
            case "Multiple Choice":
            case "Single Choice":
            case "Matrix Single Choice":
            case "Matrix Match Grid": {
                Thread.sleep(10000);
                selectOption_A.click();
                Thread.sleep(10000);
                checkbuttonweb.click();
                Thread.sleep(10000);
                ContinueWeb.click();
            }
            break;
            case "Subjective Numerical":
                Thread.sleep(10000);
                subjectivenumericalinput.click();
                driver().getKeyboard().sendKeys("1");
                driver().hideKeyboard();
                Thread.sleep(10000);
                checkbuttonweb.click();
                Thread.sleep(10000);
                ContinueWeb.click();
                break;

            case "Assertion": {
                Thread.sleep(10000);
                solvewithusWeb.click();
                Thread.sleep(10000);
                FullSolutionWeb.click();
                Thread.sleep(10000);
                ContinueWeb.click();

            }
            break;
            case "Subjective Answer": {
                Thread.sleep(10000);
                subjectiveanswerinput.click();
                driver().getKeyboard().sendKeys("hh");
                Thread.sleep(10000);
                checkbuttonweb.click();
                Thread.sleep(10000);
                ContinueWeb.click();

            }
            break;
            case "Fill in The Blanks":
                Thread.sleep(20000);
                fillintheblanksinput.click();
                driver().getKeyboard().sendKeys("hh");
                driver().hideKeyboard();
                Thread.sleep(10000);
                checkbuttonweb.click();
                Thread.sleep(15000);
                ContinueWeb.click();
                break;

            case "Multiple Fill in The Blanks":
                Thread.sleep(10000);
                multiplefillintheblanksinput1.click();
                driver().getKeyboard().sendKeys("hh");
                driver().hideKeyboard();
                Thread.sleep(10000);
                multiplefillintheblanksinput2.click();
                driver().getKeyboard().sendKeys("hh");
                driver().hideKeyboard();
                Thread.sleep(10000);
                checkbuttonweb.click();
                Thread.sleep(10000);
                ContinueWeb.click();
                break;
            case "Integer": {
                Thread.sleep(10000);
                integerinput.click();
                driver().getKeyboard().sendKeys("1");
                Thread.sleep(10000);
                checkbuttonweb.click();
                Thread.sleep(10000);
                ContinueWeb.click();
            }
            break;
            case "Single DropDown":
                Thread.sleep(10000);
                selectdropdown.click();
                Thread.sleep(10000);
                dropdownoption.click();
                Thread.sleep(10000);
                checkbuttonweb.click();
                Thread.sleep(10000);
                ContinueWeb.click();
                break;
            case "null":
                flag=false;

            default: {
            }
        }

        return flag;
    }
}



