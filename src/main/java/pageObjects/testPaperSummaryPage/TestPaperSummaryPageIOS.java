package pageObjects.testPaperSummaryPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class TestPaperSummaryPageIOS extends BasePage implements TestPaperSummaryPage{
    SoftAssert softAssert=null;
    public TestPaperSummaryPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @Override
    public void verifyAllElementsOnTestSummary() {

    }

    @Override
    public void clickOnInstructionTab() {

    }

    @Override
    public void verifyElementsOfInstructionsScreenOfTestSummary() {

    }

    @Override
    public void clickOnNavigationTab() {

    }

    @Override
    public void verifyElementsOnNavigationScreenOfTestSummary() {

    }

    @Override
    public void clickOnViewPaper() {

    }

    @Override
    public void verifyElementsOnViewPaperScreenOfTestSummary() {

    }

    @Override
    public void clickOnFilterByAttemptTypes() {

    }

    @Override
    public void verifyElementsOnFilterByAttemptTypeScreen() {

    }

    @Override
    public void clickOnFilterParametersCheckBox() {

    }

    @Override
    public void UncheckFilterParameters() {

    }

    @Override
    public void FilterTestSummaryByAnswered() {

    }

    @Override
    public void FilterTestSummaryByNotAnswered() {

    }

    @Override
    public void FilterTestSummaryByNotVisited() {

    }

    @Override
    public void FilterTestSummaryByMarkedForReview() {

    }

    @Override
    public void FilterTestSummaryByAnsweredAndMarkedForReview() {

    }

    @Override
    public int getTotalQuestionCount() {
        return 0;
    }
}
