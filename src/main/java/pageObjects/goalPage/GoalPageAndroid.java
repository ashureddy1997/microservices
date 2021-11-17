package pageObjects.goalPage;

import constant.Goal;
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

public class GoalPageAndroid  extends BasePage implements GoalPage{
    SoftAssert softAssert=null;
    public GoalPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "title")
    private WebElement title;

    @FindBys({@FindBy(id = "tv_goal_exam")})
    private List<WebElement> goalList;

    @FindBy(id = "tvPrimaryGoalNext")
    private WebElement nextButton;

    @FindBy(id = "tvPrimaryExamNext")
    private WebElement MyClassnextButton;

    public void clickOnNextButton() {
        waitForElementToBeVisible(nextButton);
        nextButton.click();
    }
    public void clickOnNextButtonInMyClass() {
        waitForElementToBeVisible(MyClassnextButton);
        MyClassnextButton.click();
    }
    public void selectGoal(String GoalName) {
        waitForElementToBeVisible(goalList.get(0));
        // goalList.get(0).click();
        scrollToText(GoalName);
        for (int i = 0; i < goalList.size(); i++) {
            if (goalList.get(i).getText().equalsIgnoreCase(GoalName)) {
                goalList.get(i).click();
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void verifyAllTheElementPresent() {
        waitForElementToBeVisible(title);
        softAssert.assertEquals(title.getText(), Goal.Select_Goal,"Title not matched ");
        softAssert.assertEquals(goalList.get(0).isDisplayed(), true,"Goal Not displaying ");
        goalList.get(0).click();
        softAssert.assertEquals(nextButton.isDisplayed(),true,"Next button not displayed");
        softAssert.assertAll();
    }
}

