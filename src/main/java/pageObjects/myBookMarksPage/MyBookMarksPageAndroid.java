package pageObjects.myBookMarksPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class MyBookMarksPageAndroid extends BasePage implements MyBookMarksPage{
    SoftAssert softAssert=null;
    public MyBookMarksPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

   @FindBy(id = "manageBooks_title")
   private WebElement manageBooks_title;

    @FindBy(id = "header")
    private WebElement header1;

    @FindBys({@FindBy(id="video_banner_card_view")})
    private List<WebElement> itemList1;

    @FindBy(id = "header")
    private WebElement header2;

    @FindBys({@FindBy(className="android.widget.FrameLayout")})
    private List<WebElement> itemList2;

    @FindBy(id = "txt_book_count")
    private WebElement CountOfBook_Selected;

    @FindBy(id = "txt_done")
    private WebElement Done;

    @FindBys({@FindBy(id="img_tick")})
    private List<WebElement> tick_selected;


    public void verifyElementsOnManageBooksScreen(){
        waitForElementToBeVisible(itemList1.get(0));
        softAssert.assertEquals(manageBooks_title.isDisplayed(),true,"title is not displayed");
        softAssert.assertEquals(header1.isDisplayed(),true,"header 1 is not displayed");
        softAssert.assertEquals(itemList1.get(0).isDisplayed(),true,"Book is not displayed");
        softAssert.assertEquals(itemList1.get(1).isDisplayed(),true,"Book is not displayed");
        swipeScreen(Direction.DOWN);
        softAssert.assertEquals(header2.isDisplayed(),true,"header 2 is not displayed ");
        softAssert.assertEquals(itemList2.get(0).isDisplayed(),true,"Book Is not displayed");
        softAssert.assertEquals(itemList2.get(1).isDisplayed(),true,"Book Is not displayed");
        softAssert.assertEquals(CountOfBook_Selected.isDisplayed(),true, "selected book count is not displayed");
        softAssert.assertEquals(Done.isDisplayed(),true,"Done button is not displayed");
        softAssert.assertAll();
    }
    public void selectBooks(){
        waitForElementToBeVisible(itemList1.get(0));
        itemList1.get(0).click();
    }
    public void clickOnDoneButton(){
        waitForElementToBeVisible(Done);
        Done.click();
    }
    public void removeBooks(){
        waitForElementToBeVisible(itemList1.get(0));
        itemList1.get(0).click();
        itemList1.get(1).click();
        itemList1.get(0).click();
        itemList1.get(1).click();
        Done.click();

    }
    public void verifySelectedBookCounts(){
        waitForElementToBeVisible(itemList1.get(0));
        itemList1.get(0).click();
        itemList1.get(1).click();
        waitForElementToBeVisible(tick_selected.get(0));
        softAssert.assertEquals(tick_selected.get(0).isDisplayed(),true,"book is not selected");
//        softAssert.assertEquals(tick_selected.get(1).isDisplayed(),true,"book is not selected");
        softAssert.assertEquals(CountOfBook_Selected.isDisplayed(),true,"count is not displayed");
        System.out.println("count :"+CountOfBook_Selected.getText());
        softAssert.assertAll();
    }

    @Override
    public void verifyElementsOfMyBookMarkSection() {

    }

    @Override
    public void clickOnBookMarkVideoCard() {

    }

    @Override
    public void verifyElementsOfMyBookMarksDetailsScreen() {

    }

    @Override
    public void verifyBookMarkLstIsGetUpdated() {

    }

    @Override
    public void verifyAllBookmarkedVideosDisplaying() {

    }

    @Override
    public void openBookMarkedVideo() {

    }

    @Override
    public void UnBookMarkVideo() {

    }

    @Override
    public void verifyMessageInMyBookmarksVideosScreenWhenThereAreNoBookmarkedVideosAvailable() {

    }

    @Override
    public void clickOnQuestionsTab() {

    }

    @Override
    public void verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfQuestionsTab() {

    }

    @Override
    public void verifyScreenHeader() {

    }

    @Override
    public void verifyBookmarkedQuestionsDisplayed() {

    }

    @Override
    public void clickOnVideosTab() {

    }

    @Override
    public void verifyContentOfMyBookMarkHeroBannerChangesOnSwitchOfVideoTab() {

    }

    @Override
    public void verifyMessageInMyBookmarksQuestionsScreenWhenThereAreNoBookmarkedQuestionsAvailable() {

    }

    @Override
    public void verifyBookmarkedVideosDisplayed() {

    }

    @Override
    public void clickOnBookMarkQuestionsCard() {

    }

    @Override
    public void clickOnPracticeAll() {

    }

    @Override
    public void VerifyAllTheElementsOfQuitPracticeScreen() {

    }

    @Override
    public void clickOnContinueLearningButton() {

    }

    @Override
    public void clickOnQuitButton() {

    }
}

