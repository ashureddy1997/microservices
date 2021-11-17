package pageObjects.onboardingPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class OnboardingPageAndroid  extends BasePage implements OnboardingPage{
    SoftAssert softAssert=null;
    public OnboardingPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBys({@FindBy(id="tvPrepareFor")})
    private List<WebElement> listOfPrepareFor;

    @FindBy(id="title")
    private WebElement title;

    @FindBy(id="app_bar_title")
    private WebElement title_WhoLearning;

    @FindBys({@FindBy(id = "username")})
    private List<WebElement> AllProfiles;

    @FindBy(xpath ="//android.widget.TextView[@text='I am aiming for']")
    private WebElement I_am_aiming_for;

    @FindBy(xpath ="//android.widget.TextView[@text='Start Learning']")
    private WebElement startsLearningButton;

    @FindBy(id="tvPrepareNext")
    private WebElement nextBtn;

    public void verifyTitle(){
      /*  try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(title);
        waitForElementToBeVisible(listOfPrepareFor.get(0));
        Assert.assertEquals(title.getText(), I_Want_To_Prepare_For.Title,"Title not found");
*/
    }
    public String verifyTitlesForOnBoardingScreens(){
        waitForElementToBeVisible(title);
        String screenTitle=title.getText();
        System.out.println("title name :"+title.getText());
        Assert.assertEquals(title.isDisplayed(),true,"Title not found");
        return screenTitle;
    }
    public String verifyTitlesForWhoIsLearningScreens(){
        waitForElementToBeVisible(title_WhoLearning);
        String screenTitle=title_WhoLearning.getText();
        System.out.println("title name :"+title_WhoLearning.getText());
        Assert.assertEquals(title_WhoLearning.isDisplayed(),true,"Title not found");
        return screenTitle;
    }
    public void verifyAllProfilesDisplayed() {
        waitForElementToBeVisible(AllProfiles.get(0));
        System.out.println("Profile Size" + AllProfiles.size());
        Set<String> profileList = new LinkedHashSet<>();
        for (int i = 0; i < AllProfiles.size(); i++) {
            profileList.add(AllProfiles.get(i).getText());
        }
        System.out.println("Profile list" + profileList);
    }
    public void VerifyFourProfilesAdded(){
        waitForElementToBeVisible(AllProfiles.get(0));
        softAssert.assertEquals(AllProfiles.get(0).isDisplayed(),true,"profile 1 is not displayed");
        softAssert.assertEquals(AllProfiles.get(1).isDisplayed(),true,"profile 2 is not displayed");
        softAssert.assertEquals(AllProfiles.get(2).isDisplayed(),true,"profile 3 is not displayed");
        softAssert.assertEquals(AllProfiles.get(3).isDisplayed(),true,"profile 4 is not displayed");
        softAssert.assertAll();
    }

    public void VerifyPlusMarkDoesNotAppearAfterAddingFourChild(){
        waitForElementToBeVisible(AllProfiles.get(4));
        softAssert.assertEquals(AllProfiles.get(4).isDisplayed(),false,"plus mark is still displayed");

    }
    public void clickOnNextButton(){
        waitForElementToBeVisible(nextBtn);
        nextBtn.click();
    }

    public void VerifyIamamingforTittle()
    {
        waitForElementToBeVisible(I_am_aiming_for);
        Assert.assertEquals(I_am_aiming_for.isDisplayed(),true,"I am aiming for is not Displayed");
    }


    public void clickONPrepare(String prepareFor){

     /*   waitForElementToBeVisible(listOfPrepareFor.get(0));
        for(int i=0;i<listOfPrepareFor.size();i++){
            if(listOfPrepareFor.get(i).getText().equalsIgnoreCase(prepareFor)){
                listOfPrepareFor.get(i).click();
            }
        }
*/
    }

    @Override
    public void VerifyStartLearningButtonDisplay() {

    }
}


