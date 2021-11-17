package pageObjects.bookPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;
import pageObjects.addProfilePage.AddProfilePage;

import java.util.List;

public class BookPageIOS extends BasePage implements BookPage {
    SoftAssert softAssert = null;

    public BookPageIOS(AppiumDriver driver) {
        softAssert = new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBys({@FindBy(xpath = "//XCUIElementTypeStaticText")})
    private List<WebElement> title;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeStaticText")})
    private List<WebElement> bookHeader_description;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeStaticText")})
    private List<WebElement> bookHeader_Subject;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeStaticText")})
    private List<WebElement> txt_author;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeStaticText")})
    private List<WebElement> custom_title1;

    @FindBy(id = "custom_title2")
    private WebElement custom_title2;

    @FindBy(id = "book_topic_title")
    private WebElement topic_title;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeStaticText")})
    private List<WebElement> book_chapter_title;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeStaticText")})
    private List<WebElement> chapterNameList;

    @FindBys({@FindBy(id = "book_chapter_name1")})
    private List<WebElement> topicNameList;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeImage")})
    private List<WebElement> thumbnailsList;

    @FindBys({@FindBy(id = "subheader")})
    private List<WebElement> subHeaderList;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"learnPlay\"]")
    private WebElement bookHeader_Duration;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"backButtonShadow\"]")
    private WebElement backArrowButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"vp play\"]")
    private WebElement pausebutton;

    @FindBys({@FindBy(id = "thumbPracticeForChapterIV")})
    private List<WebElement> chapterPracticeList;


    @FindBys({@FindBy(xpath = "//XCUIElementTypeButton[2]")})
    private List<WebElement> videoList;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeButton[2]")})
    private List<WebElement> EnrichYourLearning;

    @FindBy(xpath = "//span[@class='sc-lgqmxq FGHoO text-ellipsis' or @class='sc-dtTInj bRFhLZ text-ellipsis'] ")
    private WebElement topicname;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Books\"]")
    private WebElement my_books_button;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"PracticeIcon\"]")
    private WebElement BookHeader_Coins;


    public void verifyAllTheElementPresentOnBookTOC() {
        goBackToBookFirstPage();
        waitForElementToBeVisible(book_chapter_title.get(3));
        softAssert.assertEquals(title.get(0).isEnabled(), true, "Book Title not displayed");
        softAssert.assertEquals(bookHeader_description.get(1).isEnabled(), true, "Book description not displayed");
        softAssert.assertEquals(bookHeader_Subject.get(1).isEnabled(), true, "Book Subject header not displayed");
        // softAssert.assertEquals(txt_author.isDisplayed(), true, "Book author name is not displayed");
        softAssert.assertEquals(book_chapter_title.get(3).isEnabled(), true, "Book Chapter title is not displayed");
        softAssert.assertEquals(chapterNameList.get(0).isEnabled(), true, "Book Chapter name is not displayed");
        softAssert.assertEquals(bookHeader_Duration.isEnabled(), true, "Book duration is not displayed");
        softAssert.assertEquals(BookHeader_Coins.isEnabled(), true, "Book duration is not displayed");
        softAssert.assertAll();

    }

    public void verifyAllTheElementPresentOnBigBook() {
        goBackToBookFirstPage();
        waitForElementToBeVisible(book_chapter_title.get(3));
        softAssert.assertEquals(title.get(0).isEnabled(), true, "Book Title not displayed");
        softAssert.assertEquals(bookHeader_description.get(1).isDisplayed(), true, "Book description not displayed");
        softAssert.assertEquals(bookHeader_Subject.get(1).isEnabled(), true, "Book Subject header not displayed");
        softAssert.assertEquals(book_chapter_title.get(3).isEnabled(), true, "Book Chapter title is not displayed");
        softAssert.assertEquals(chapterNameList.get(0).isDisplayed(), true, "Book Chapter name is not displayed");
        softAssert.assertAll();

    }

    public void verifyuserabletoseethechapter() {
        waitForElementToBeVisible(topic_title);
        softAssert.assertEquals(topic_title.isDisplayed(), true, "Book Chapter title is not displayed");
    }

    public void clickonpausebutton() {
        waitForElementToBeVisible(pausebutton);
        pausebutton.click();

    }

    public void goBackToBookFirstPage() {

        for (int i = 0; i < 5; i++) {
            if (isMyBookPresent()) {

                break;
            } else {
                backArrowButton.click();
            }
        }

    }

    public boolean isMyBookPresent() {
        boolean flag = false;

        try {

            Assert.assertTrue(my_books_button.isEnabled());
            flag = true;

        } catch (NoSuchElementException e) {

        }

        return flag;
    }

    public void verifyMyBooksButton() {

        goBackToBookFirstPage();
        softAssert.assertEquals(my_books_button.isEnabled(), true, "My Books Button is not displayed");
        softAssert.assertAll();


    }

    public void verifyuserabletoseethechaptersandrelevanttopicnameappear() {
        waitForElementToBeVisible(custom_title2);
        String Topicname = custom_title2.getText().toLowerCase();
        waitForElementToBeVisible(chapterPracticeList.get(0));
        chapterPracticeList.get(0).click();
        switchToWebView();
        waitForElementToBeVisible(topicname);
        String Topicname2 = topicname.getText().toLowerCase();
        System.out.println("a" + Topicname2);
        Assert.assertEquals(Topicname, Topicname2);
        switchToNativeApp();
    }

    public void verifypracticequestionscontainsrelevanttothechapterandtopicsselected() {
        backArrowButton.click();
        String TopicName = chapterNameList.get(0).getText().toLowerCase().substring(3);
        chapterNameList.get(0).click();
        Assert.assertEquals(custom_title1.get(0).getText().toLowerCase().substring(10).contains(TopicName),true,"Not matched");

    }

    @Override
    public void navigateToEmbibeBook() {

    }

    @Override
    public void VerifPracticeCountDisplayOnTopics() {

    }

    @Override
    public void VerifvideoCountDisplayOnTopics() {

    }


    public void Verifyonclickondownbuttonthenextchaptergetshighlighted() {
        softAssert.assertEquals(custom_title2.isDisplayed(), true, "Custom Title not displayed");
        softAssert.assertAll();

    }

    public void VerifyThumbnailIsAppearingForAllTheBookTiles() {
        softAssert.assertEquals(thumbnailsList.get(0).isEnabled(), true, "thumbnail is not displayed");
        softAssert.assertEquals(thumbnailsList.get(1).isEnabled(), true, "thumbnail is not displayed");
        softAssert.assertAll();

    }

    public void Verifyonclickonleftbuttonwhenontopicthefirstchaptergetshighlighted() {
        waitForElementToBeVisible(backArrowButton);
        backArrowButton.click();
        waitForElementToBeVisible(custom_title2);
        Assert.assertEquals(custom_title2.isDisplayed(), true, "chapter is not highlated");
    }

    public void VerifyClickinonanychapterthetopicsrelatedtoitaredisplayed() {
        String Chapter = chapterNameList.get(0).getText();
        clickOnChapterName(0);
        waitForElementToBeVisible(custom_title2);
        String Topic = custom_title2.getText();
        Assert.assertNotEquals(Chapter, Topic);


    }

    public void VerifyClickingOnOkOnAnyConceptVideoTheVideoGetsPlayed() {
        //  waitForElementToBeVisible(videoList.get(0));
        chapterNameList.get(0).click();
        chapterNameList.get(0).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        videoList.get(1).click();
    }

    public void VerifyClickingOnAnyTopicTheConceptsRelatedToItAreDisplayed() {
        backArrowButton.click();
        backArrowButton.click();
        String TopicName = chapterNameList.get(0).getText().toLowerCase().substring(3);
        chapterNameList.get(0).click();
        Assert.assertEquals(custom_title1.get(0).getText().toLowerCase().substring(10).contains(TopicName),true,"Not matched");

    }


    public void verifyBigBookDescription() {
        softAssert.assertEquals(bookHeader_description.get(1).isDisplayed(), true, "Book Description is not displayed");
    }

    public void ClickOnTopic(int i) {

    }

    public void clickOnChapterName(int i) {
        goBackToBookFirstPage();
        chapterNameList.get(i).click();

    }

    public void VerifyUserCanPlayEmbibeExplainersVideosInBooksTopic() {
        chapterNameList.get(0).click();
        chapterNameList.get(0).click();
        waitForElementToBeVisible(videoList.get(0));
        videoList.get(0).click();
    }

    public void VerifyUserCanPlayEnrichYourLearningVideosInBooksTopic() {
        chapterNameList.get(0).click();
        chapterNameList.get(0).click();
        swipeScreen(Direction.UP);
        EnrichYourLearning.get(0).click();
    }

    public void verifyAlltheelementsonTopic() {
        softAssert.assertEquals(videoList.get(0).isEnabled(), true, "Embibe Explainers Videos is not displayed");
        softAssert.assertEquals(EnrichYourLearning.get(0).isEnabled(), true, "EnrichYourLearning Videos is not displayed");
        softAssert.assertEquals(subHeaderList.get(0).isEnabled(), true, " subheader not displayed");
        softAssert.assertEquals(custom_title1.get(0).isEnabled(), true, "Custom Title not displayed");
        softAssert.assertEquals(custom_title2.isEnabled(), true, "Custom Title not displayed");
        softAssert.assertAll();

    }
}
