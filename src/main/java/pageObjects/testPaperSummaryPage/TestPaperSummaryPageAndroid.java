package pageObjects.testPaperSummaryPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class TestPaperSummaryPageAndroid  extends BasePage implements TestPaperSummaryPage{
    SoftAssert softAssert=null;
    public TestPaperSummaryPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(id = "testName")
    private WebElement testName;

   /* @FindBys({@FindBy(className="android.widget.LinearLayout")})
    private List<WebElement> Summary_Instruction_ViewPaper;*/

    @FindBy(xpath = "//*[@text='View Paper']")
    private WebElement ViewPaper;

    @FindBy(xpath = "//*[@text='Instruction']")
    private WebElement Instruction;

    @FindBy(xpath = "//*[@text='Summary']")
    private WebElement Summary;

    @FindBys({@FindBy(id="layout")})
    private List<WebElement> Filter;

    @FindBy(id="recyclerQuestionSummary")
    private WebElement QuestionSummary;

    @FindBys({@FindBy(className="android.widget.LinearLayout")})
    private List<WebElement> About_MakingScheme_Navigation;

    @FindBy(id = "layoutTestDetail")
    private WebElement testDetails;

    @FindBys({@FindBy(className="android.view.ViewGroup")})
    private List<WebElement> InstructionPointers;

    @FindBy(id = "tv_filter_by_attempts_type")
    private WebElement Filter_by_attempt_types;

    @FindBys({@FindBy(className="android.view.View")})
    private List<WebElement> ListOfQuestions;

    @FindBys({@FindBy(className="android.view.ViewGroup")})
    private List<WebElement> FilterParameters;

    @FindBy(xpath = "//android.widget.TextView[@text='Navigation']")
    private WebElement NavigationTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Marking Scheme']")
    private WebElement MarkingSchemeTab;

    @FindBy(xpath = "//android.widget.TextView[@text='About']")
    private WebElement AboutTab;

    @FindBys({@FindBy(className="android.view.ViewGroup")})
    private List<WebElement> Duration_Questions_Marks;

    @FindBys({@FindBy(className="android.widget.TextView")})
    private List<WebElement> Navigation_Tab_Elements;

    @FindBys({@FindBy(className="android.view.ViewGroup")})
    private List<WebElement> Legends;

    @FindBy(className = "androidx.recyclerview.widget.RecyclerView")
    private WebElement FilteredResultForTestSummary;

    @FindBys({@FindBy(id="tvCount")})
    private List<WebElement> tvCount;

    @FindBy(id = "back")
    private WebElement back;

    public void clickOnBack(){
        waitForElementToBeVisible(back);
        back.click();
    }

    public void verifyAllElementsOnTestSummary(){
        waitForElementToBeVisible(Filter.get(0));
        softAssert.assertEquals(Filter.get(0).isDisplayed(),true,"Answered");
        softAssert.assertEquals(Filter.get(1).isDisplayed(),true,"Not Answered");
        softAssert.assertEquals(Filter.get(2).isDisplayed(),true,"Not Visited");
        softAssert.assertEquals(Filter.get(3).isDisplayed(),true,"Marked");
        softAssert.assertEquals(QuestionSummary.isDisplayed(),true,"");
        softAssert.assertEquals(testName.isDisplayed(),true,"Test Name is not displayed");
        softAssert.assertEquals(Summary.isDisplayed(),true,"Summary is not displayed");
        softAssert.assertEquals(Instruction.isDisplayed(),true,"Instruction, is not displayed");
        softAssert.assertEquals(ViewPaper.isDisplayed(),true,"ViewPaper, is not displayed");
        softAssert.assertAll();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnInstructionTab(){
        waitForElementToBeVisible(Instruction);
        Instruction.click();
    }
    public void FilterTestSummaryByAnswered(){
        waitForElementToBeVisible(Filter.get(0));
        Filter.get(0).click();
    }
    public void FilterTestSummaryByNotAnswered(){
        waitForElementToBeVisible(Filter.get(1));
        Filter.get(1).click();
    }
    public void FilterTestSummaryByNotVisited(){
        waitForElementToBeVisible(Filter.get(2));
        Filter.get(2).click();
    }
    public void FilterTestSummaryByMarkedForReview(){
        waitForElementToBeVisible(Filter.get(3));
        Filter.get(3).click();
    }
    public void FilterTestSummaryByAnsweredAndMarkedForReview(){
        waitForElementToBeVisible(Filter.get(4));
        Filter.get(4).click();
    }
    public int byAnswered(){
        waitForElementToBeVisible(Filter.get(1));
        Filter.get(1).click();
        waitForElementToBeVisible(FilteredResultForTestSummary);
        int value = FilteredResultForTestSummary.getText().length();

        return value;
    }
    public int getTotalQuestionCount(){
        waitForElementToBeVisible(tvCount.get(2));
        int count= Integer.parseInt(tvCount.get(2).getText());
        System.out.println("totel ques.:"+tvCount.get(2).getText());
        return count;
    }

    public void clickOnMakingSchemeTab(){
        waitForElementToBeVisible(MarkingSchemeTab);
        MarkingSchemeTab.click();
    }
    public void verifyElementsOfMakingSchemeScreenOfTestSummary(){
        waitForElementToBeVisible(Duration_Questions_Marks.get(0));
        softAssert.assertEquals(Duration_Questions_Marks.get(0).isDisplayed(),true,"Duration is not displayed");
        softAssert.assertEquals(Duration_Questions_Marks.get(1).isDisplayed(),true,"Questions counts is not displayed");
        softAssert.assertEquals(Duration_Questions_Marks.get(2).isDisplayed(),true,"Marks is not displayed");
        softAssert.assertAll();

    }
    public void verifyElementsOfInstructionsScreenOfTestSummary(){
        waitForElementToBeVisible(About_MakingScheme_Navigation.get(0));
        softAssert.assertEquals(About_MakingScheme_Navigation.get(0).isDisplayed(),true,"About Tab is displayed");
        softAssert.assertEquals(About_MakingScheme_Navigation.get(1).isDisplayed(),true,"Making Scheme Tab is displayed");
        softAssert.assertEquals(About_MakingScheme_Navigation.get(2).isDisplayed(),true,"Navigation Tab is displayed");
        softAssert.assertEquals(testDetails.isDisplayed(),true,"Test details are not displayed");
        softAssert.assertEquals(InstructionPointers.get(0).isDisplayed(),true,"Instruction Point 1 is not displayed");
        softAssert.assertEquals(InstructionPointers.get(1).isDisplayed(),true,"Instruction Point 2 is not displayed");
        softAssert.assertEquals(InstructionPointers.get(2).isDisplayed(),true,"Instruction Point 3 is not displayed");
        softAssert.assertEquals(InstructionPointers.get(3).isDisplayed(),true,"Instruction Point 4 is not displayed");
        softAssert.assertEquals(InstructionPointers.get(4).isDisplayed(),true,"Instruction Point 5 is not displayed");
        softAssert.assertEquals(InstructionPointers.get(5).isDisplayed(),true,"Instruction Point 6 is not displayed");
        softAssert.assertAll();

    }
    public void clickOnViewPaper(){
        waitForElementToBeVisible(ViewPaper);
        ViewPaper.click();
    }
    public void verifyElementsOnViewPaperScreenOfTestSummary(){
        waitForElementToBeVisible(Filter_by_attempt_types);
        softAssert.assertEquals(Filter_by_attempt_types.isDisplayed(),true,"Filter_by_attempt_types is not displayed");
        softAssert.assertEquals(ListOfQuestions.get(0).isDisplayed(),true,"Question 1 is not displayed");
        softAssert.assertEquals(ListOfQuestions.get(1).isDisplayed(),true,"Question 2 is not displayed");
        softAssert.assertAll();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void clickOnFilterByAttemptTypes(){
        waitForElementToBeVisible(Filter_by_attempt_types);
        Filter_by_attempt_types.click();
    }
    public void verifyElementsOnFilterByAttemptTypeScreen(){
        waitForElementToBeVisible(FilterParameters.get(0));
        softAssert.assertEquals(FilterParameters.get(0).isDisplayed(),true,"Filter By Answered is not visible");
        softAssert.assertEquals(FilterParameters.get(1).isDisplayed(),true,"Filter By Not Answered is not visible");
        softAssert.assertEquals(FilterParameters.get(2).isDisplayed(),true,"Filter By Not Visited is not visible");
        softAssert.assertEquals(FilterParameters.get(3).isDisplayed(),true,"Filter By Marked For Review is not visible");
        softAssert.assertEquals(FilterParameters.get(4).isDisplayed(),true,"Filter By Answered and marked for review is not visible");
        softAssert.assertAll();
    }
    public void clickOnFilterParametersCheckBox(){
        waitForElementToBeVisible(FilterParameters.get(0));
        FilterParameters.get(0).click();
        FilterParameters.get(2).click();
    }
    public void UncheckFilterParameters(){
        waitForElementToBeVisible(FilterParameters.get(0));
        FilterParameters.get(0).click();
        FilterParameters.get(2).click();
    }
    public void clickOnNavigationTab(){
        waitForElementToBeVisible(NavigationTab);
        NavigationTab.click();
    }
    public void verifyElementsOnNavigationScreenOfTestSummary(){
        waitForElementToBeVisible(Navigation_Tab_Elements.get(0));
        softAssert.assertEquals(Navigation_Tab_Elements.get(0).isDisplayed(),true,"Save and net button not displayed");
        softAssert.assertEquals(Navigation_Tab_Elements.get(1).isDisplayed(),true,"Save and net button not displayed");
        softAssert.assertEquals(Navigation_Tab_Elements.get(2).isDisplayed(),true,"Save and net button not displayed");
        softAssert.assertEquals(Navigation_Tab_Elements.get(3).isDisplayed(),true,"Save and net button not displayed");
        softAssert.assertEquals(Navigation_Tab_Elements.get(4).isDisplayed(),true,"Save and net button not displayed");
        softAssert.assertEquals(Navigation_Tab_Elements.get(5).isDisplayed(),true,"Save and net button not displayed");
        softAssert.assertEquals(Legends.get(0).isDisplayed(),true,"Answered is not displayed");
        softAssert.assertEquals(Legends.get(1).isDisplayed(),true,"Not Answered is not displayed");
        softAssert.assertEquals(Legends.get(2).isDisplayed(),true,"Not Visited is not displayed");
        softAssert.assertEquals(Legends.get(3).isDisplayed(),true,"Marked for review is not displayed");
        softAssert.assertEquals(Legends.get(4).isDisplayed(),true,"Answered is not displayed");
        softAssert.assertEquals(Legends.get(5).isDisplayed(),true,"Answered and marked for review is not displayed");
        softAssert.assertAll();


    }

}

