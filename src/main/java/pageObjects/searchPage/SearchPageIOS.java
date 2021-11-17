package pageObjects.searchPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;
import pageObjects.signOutPage.SignOutPage;

import java.util.List;

public class SearchPageIOS extends BasePage implements SearchPage{
    SoftAssert softAssert=null;
    public SearchPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private List<WebElement> listOfVedios;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private List<WebElement> listOfPracticeChapter;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private List<WebElement> listOfTests;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private  List<WebElement> listOfBooks;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private List<WebElement> listOfChapters;


    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Videos\"]")
    private WebElement videos;


    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Questions\"]")
    private WebElement questions;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All\"]")
    private WebElement All;

    @FindBy(id = "tv_text_results")
    private WebElement tv_text_results;

    @FindBys({@FindBy(xpath="//XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeCollectionView/XCUIElementTypeCell")})
    private List<WebElement> tv_name;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"downArrow\"])[1]")
    private WebElement  arrowDown;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"downArrow\"])[1]")
    private WebElement  arrowUp;

    //vipin

    @FindBy(id = "desc_TV")
    private WebElement  description;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"search mic\"]")
    private WebElement  voice_search;

    @FindBys({@FindBy(id="tv_type")})
    private List<WebElement> typelist;


    @FindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[6]/XCUIElementTypeOther")
    private WebElement testBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Practice\"]")
    private WebElement practiceBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Books\"]")
    private WebElement booksBtn;



    public void clickonVideos(){
        waitForElementToBeVisible(videos);
        videos.click();
    }
    public void clickonQuestions(){
        waitForElementToBeVisible(questions);
        questions.click();

    }
    public void clickonPractice(){
        waitForElementToBeVisible(practiceBtn);
        practiceBtn.click();

    }
    public void clickonTest(){
      /*  waitForElementToBeVisible(testBtn);
        testBtn.click();*/

    }
    public void clickonBooks(){
        waitForElementToBeVisible(booksBtn);
        booksBtn.click();

    }
    public void clickonGoals(){
        tv_name.get(1).click();

    }
    public void clickonArrowUp(){
        waitForElementToBeVisible(arrowUp);
        arrowUp.click();
    }
    public void clickonArrowDown(){
        waitForElementToBeVisible(arrowDown);
        arrowDown.click();
    }

    @Override
    public void clickOnBook(int i) {
        waitForElementToBeVisible(listOfBooks.get(i));

        listOfBooks.get(i).click();

    }

    @Override
    public void clickOnPractice() {
        waitForElementToBeVisible(practiceBtn);

    }

    public void clickOnChapters() {
        waitForElementToBeVisible(listOfChapters.get(0));
        listOfChapters.get(0).click();
    }

    public void verifyDescription(){
       /* waitForElementToBeVisible(description);
        softAssert.assertEquals(description.isEnabled(),true,"Description is not displayed");*/
    }
    public void verifyAllTheElementsOnSearchPage(){
        //softAssert.assertEquals(tv_text_results.isEnabled(),true,"text_results text is not displayed");
        softAssert.assertEquals(tv_name.get(0).isEnabled(),true,"GoalName is not displayed");
        softAssert.assertEquals(arrowUp.isEnabled(),true,"arrowUp is not displayed");
        softAssert.assertEquals(voice_search.isEnabled(),true,"voice_search is not displayed");
        softAssert.assertEquals(videos.isEnabled(),true,"videos text is not displayed");
        softAssert.assertEquals(videos.isEnabled(),true,"videos text is not displayed");
        softAssert.assertEquals(practiceBtn.isEnabled(),true,"practice text is not displayed");
        softAssert.assertEquals(testBtn.isEnabled(),true,"test text is not displayed");
        testBtn.click();
        softAssert.assertEquals(booksBtn.isEnabled(),true,"books text is not displayed");
      //  softAssert.assertEquals(typelist.get(0).isEnabled(),true,"type is not displayed");
      //  softAssert.assertEquals(typelist.get(1).isEnabled(),true,"type is not displayed");
        softAssert.assertAll();


    }

}
