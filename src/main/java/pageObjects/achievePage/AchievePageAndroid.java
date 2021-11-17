package pageObjects.achievePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class AchievePageAndroid  extends BasePage implements AchievePage{
    SoftAssert softAssert=null;

    public AchievePageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @FindBy(id="predicted_improvement_title")
    private WebElement predicted_improvement_title;

    @FindBy(id="lv_circular_sphere")
    private WebElement lv_circular_sphere;

    @FindBy(id="tv_layout_a")
    private WebElement predicted_Grade;

    @FindBy(id="tv_subject_percentage")
    private WebElement tv_subject_percentage;

    @FindBy(id="tv_subject")
    private WebElement tv_subject;

    @FindBy(id="progress_bar_purple")
    private WebElement progress_bar_purple;

    @FindBy(id="rv_predicted")
    private WebElement rv_predicted;

    @FindBy(id="tv_based_on_test")
    private WebElement tv_based_on_test;

    @FindBy(id="tv_based_on_ambie")
    private WebElement tv_based_on_ambie;

    @FindBy(id="achieve_text")
    private WebElement achieve_text;

    @FindBys({@FindBy(id="book_chapter_name")})
    private List<WebElement> chapterNameList;


    public void verifyAllTheElementOnAchieveHomePage(){
        softAssert.assertEquals(predicted_improvement_title.isDisplayed(),true,"predicted_improvement_title is not displayed");
        softAssert.assertEquals(lv_circular_sphere.isDisplayed(),true,"lv_circular_sphere is not displayed");
        softAssert.assertEquals(predicted_Grade.isDisplayed(),true,"predicted_Grade is not displayed");
        softAssert.assertEquals(tv_subject_percentage.isDisplayed(),true,"subject_percentage is not displayed");
        softAssert.assertEquals(tv_subject.isDisplayed(),true,"subject is not displayed");
        softAssert.assertEquals(progress_bar_purple.isDisplayed(),true,"progress_bar is not displayed");
        softAssert.assertEquals(rv_predicted.isDisplayed(),true,"rv_predicted is not displayed");
        softAssert.assertEquals(tv_based_on_test.isDisplayed(),true,"based_on_test is not displayed");
        softAssert.assertEquals(tv_based_on_ambie.isDisplayed(),true,"based_on_ambie is not displayed");
        softAssert.assertEquals(achieve_text.isDisplayed(),true,"achieve_text is not displayed");
        softAssert.assertAll();

    }
}
