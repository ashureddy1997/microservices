package pageObjects.searchPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class SearchPageAndriod extends BasePage implements SearchPage{
    SoftAssert softAssert=null;
    public SearchPageAndriod(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath= "//android.widget.TextView[@text='Test'] ")
    private WebElement test;

    @FindBy(xpath= "//android.widget.TextView[@text='Books'] ")
    private WebElement books;

    @FindBy(xpath= "//android.widget.TextView[@text='Practice'] ")
    private WebElement practice;

    @FindBy(xpath= "//android.widget.TextView[@text='Videos'] ")
    private WebElement videos;

    @FindBy(xpath= "//android.widget.TextView[@text='Questions'] ")
    private WebElement questions;

    @FindBy(xpath= "//android.widget.TextView[@text='All'] ")
    private WebElement All;

    @FindBy(id = "tv_text_results")
    private WebElement tv_text_results;

    @FindBys({@FindBy(id="tv_name")})
    private List<WebElement> tv_name;

    @FindBy(id = "arrowUp")
    private WebElement  arrowUp;

    @FindBy(id = "desc_TV")
    private WebElement  description;

    @FindBy(id = "voice_search")
    private WebElement  voice_search;

    @FindBys({@FindBy(id="tv_type")})
    private List<WebElement> typelist;

    @FindBys({@FindBy(id = "video_banner_card_view")})
    private List<WebElement> bookList;


   public void clickonVideos(){
       waitForElementToBeVisible(videos);
       videos.click();
   }
    public void clickonQuestions(){
       waitForElementToBeVisible(questions);
       questions.click();

    }
    public void clickonPractice(){
       waitForElementToBeVisible(practice);
       practice.click();

    }
    public void clickonTest(){
       waitForElementToBeVisible(test);
       test.click();

    }
    public void clickonBooks(){
       waitForElementToBeVisible(books);
       books.click();

    }
    public void clickonGoals(){
        tv_name.get(0).click();
//        tv_name.get(1).click();

    }
    public void clickonArrowUp(){
       waitForElementToBeVisible(arrowUp);
       arrowUp.click();
    }
    public void clickonArrowDown(){
        waitForElementToBeVisible(arrowUp);
        arrowUp.click();
        arrowUp.click();
    }

    @Override
    public void clickOnBook(int i) {
      //  scrollToText("Books With Videos & Solutions");
     //   verticalSwipeByPercentages(0.8, 0.2, 0.5);
        waitForElementToBeVisible(bookList.get(0));
        bookList.get(i).click();


    }

    @Override
    public void clickOnPractice() {

    }

    @Override
    public void clickOnChapters() {

    }

    public void verifyDescription(){
       waitForElementToBeVisible(description);
       softAssert.assertEquals(description.isDisplayed(),true,"Description is not displayed");
    }
    public void verifyAllTheElementsOnSearchPage(){
        softAssert.assertEquals(tv_text_results.isDisplayed(),true,"text_results text is not displayed");
        softAssert.assertEquals(tv_name.get(0).isDisplayed(),true,"GoalName is not displayed");
        softAssert.assertEquals(arrowUp.isDisplayed(),true,"arrowUp is not displayed");
        softAssert.assertEquals(voice_search.isDisplayed(),true,"voice_search is not displayed");
        softAssert.assertEquals(videos.isDisplayed(),true,"videos text is not displayed");
        softAssert.assertEquals(videos.isDisplayed(),true,"videos text is not displayed");
        softAssert.assertEquals(practice.isDisplayed(),true,"practice text is not displayed");
        softAssert.assertEquals(test.isDisplayed(),true,"test text is not displayed");
        test.click();
        softAssert.assertEquals(books.isDisplayed(),true,"books text is not displayed");
        softAssert.assertEquals(typelist.get(0).isDisplayed(),true,"type is not displayed");
        softAssert.assertEquals(typelist.get(1).isDisplayed(),true,"type is not displayed");
        softAssert.assertAll();


    }










}
