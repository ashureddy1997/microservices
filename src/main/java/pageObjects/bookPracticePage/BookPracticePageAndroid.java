package pageObjects.bookPracticePage;

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

public class BookPracticePageAndroid extends BasePage implements BookPracticePage{
    SoftAssert softAssert=null;
    public BookPracticePageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "title")
    private WebElement title;

    @FindBy(id = "txt_bookHeader_description")
    private WebElement bookHeader_description;

    @FindBy(id = "txt_BookHeader_Subject")
    private WebElement bookHeader_Subject;

    @FindBy(id = "txt_author")
    private WebElement txt_author;

    @FindBy(id = "custom_title1")
    private WebElement custom_title1;

    @FindBy(id = "custom_title2")
    private WebElement custom_title2;

    @FindBy(id = "book_topic_title")
    private WebElement topic_title;

    @FindBy(id = "book_chapter_title")
    private WebElement book_chapter_title;

    @FindBys({@FindBy(id = "book_chapter_name")})
    private List<WebElement> chapterNameList;

    @FindBys({@FindBy(id = "book_chapter_name1")})
    private List<WebElement> topicNameList;

    @FindBys({@FindBy(id = "imgBanner")})
    private List<WebElement> thumbnailsList;

    @FindBys({@FindBy(id = "subheader")})
    private List<WebElement> subHeaderList;

    @FindBy(id = "txt_BookHeader_Duration")
    private WebElement bookHeader_Duration;

    @FindBy(id = "custom_back_arrow")
    private WebElement backarrowbutton;

    @FindBy(id = "iv_pause")
    private WebElement pausebutton;

    @FindBys({@FindBy(id="thumbPracticeForChapterIV")})
    private List<WebElement> chapterPracticeList;


    @FindBys({@FindBy(id = "video_lib_image_view")})
    private List<WebElement> videoList;

    @FindBys({@FindBy(id = "adBannerCardView")})
    private List<WebElement> EnrichYourLearning;

    @FindBy(xpath= "//span[@class='sc-lgqmxq FGHoO text-ellipsis' or @class='sc-dtTInj bRFhLZ text-ellipsis'] ")
    private WebElement topicname;

    @FindBy(id = "txt_BookHeader_Coins")
    private WebElement BookHeader_Coins;


    public void verifyAllTheElementPresentOnBookTOC() {
        waitForElementToBeVisible(book_chapter_title);
        softAssert.assertEquals(title.isDisplayed(), true, "Book Title not displayed");
        softAssert.assertEquals(bookHeader_description.isDisplayed(), true, "Book description not displayed");
        softAssert.assertEquals(bookHeader_Subject.isDisplayed(), true, "Book Subject header not displayed");
        // softAssert.assertEquals(txt_author.isDisplayed(), true, "Book author name is not displayed");
        softAssert.assertEquals(book_chapter_title.isDisplayed(), true, "Book Chapter title is not displayed");
        softAssert.assertEquals(chapterNameList.get(0).isDisplayed(), true, "Book Chapter name is not displayed");
        softAssert.assertEquals(bookHeader_Duration.isDisplayed(), true, "Book duration is not displayed");
        softAssert.assertEquals(BookHeader_Coins.isDisplayed(), true, "Book duration is not displayed");
        softAssert.assertAll();

    }

    public void verifyAllTheElementPresentOnBigBook() {
        waitForElementToBeVisible(book_chapter_title);
        softAssert.assertEquals(title.isDisplayed(), true, "Book Title not displayed");
        softAssert.assertEquals(bookHeader_description.isDisplayed(), true, "Book description not displayed");
        softAssert.assertEquals(bookHeader_Subject.isDisplayed(), true, "Book Subject header not displayed");
        softAssert.assertEquals(book_chapter_title.isDisplayed(), true, "Book Chapter title is not displayed");
        softAssert.assertEquals(chapterNameList.get(0).isDisplayed(), true, "Book Chapter name is not displayed");
        softAssert.assertAll();

    }
    public void verifyuserabletoseethechapter()
    {
        waitForElementToBeVisible(topic_title);
        softAssert.assertEquals(topic_title.isDisplayed(), true, "Book Chapter title is not displayed");
    }
    public void clickonpausebutton()
    {
        waitForElementToBeVisible(pausebutton);
        pausebutton.click();

    }
    public void verifyuserabletoseethechaptersandrelevanttopicnameappear(){
        waitForElementToBeVisible(custom_title2);
        String Topicname=custom_title2.getText().toLowerCase();
        waitForElementToBeVisible(chapterPracticeList.get(0));
        chapterPracticeList.get(0).click();
        switchToWebView();
        waitForElementToBeVisible(topicname);
        String Topicname2=topicname.getText().toLowerCase();
        System.out.println("a"+Topicname2);
        Assert.assertEquals(Topicname,Topicname2);
        switchToNativeApp();
    }
    public void verifypracticequestionscontainsrelevanttothechapterandtopicsselected(){
        waitForElementToBeVisible(custom_title2);
        String Topicname=custom_title2.getText().toLowerCase();
        waitForElementToBeVisible(chapterPracticeList.get(0));
        chapterPracticeList.get(0).click();
        switchToWebView();
        waitForElementToBeVisible(topicname);
        String Topicname2=topicname.getText().toLowerCase();
        System.out.println("a"+Topicname2);
        Assert.assertEquals(Topicname,Topicname2);
        switchToNativeApp();
    }


    public void Verifyonclickondownbuttonthenextchaptergetshighlighted(){
        softAssert.assertEquals(custom_title2.isDisplayed(), true, "Custom Title not displayed");
        softAssert.assertAll();

    }
    public void VerifyThumbnailIsAppearingForAllTheBookTiles(){
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        verticalSwipeByPercentages(0.8, 0.2, 0.5);
        softAssert.assertEquals(thumbnailsList.get(0).isDisplayed(), true, "thumbnail is not displayed");
        softAssert.assertEquals(thumbnailsList.get(1).isDisplayed(), true, "thumbnail is not displayed");
        softAssert.assertAll();

    }
    public void Verifyonclickonleftbuttonwhenontopicthefirstchaptergetshighlighted(){
        waitForElementToBeVisible(backarrowbutton);
        backarrowbutton.click();
        waitForElementToBeVisible(custom_title2);
        Assert.assertEquals(custom_title2.isDisplayed(),true,"chapter is not highlated");
    }
    public void VerifyClickinonanychapterthetopicsrelatedtoitaredisplayed()
    {
        String Chapter=chapterNameList.get(0).getText();
        clickOnChapterName(0);
        waitForElementToBeVisible(custom_title2);
        String Topic=custom_title2.getText();
        Assert.assertNotEquals(Chapter,Topic);


    }
    public void VerifyClickingOnOkOnAnyConceptVideoTheVideoGetsPlayed(){
        waitForElementToBeVisible(videoList.get(0));
        videoList.get(0).click();
    }
    public void VerifyClickingOnAnyTopicTheConceptsRelatedToItAreDisplayed(){
        String Topic=chapterNameList.get(0).getText().toLowerCase();
        System.out.println(Topic);
        clickOnChapterName(0);
        waitForElementToBeVisible(custom_title2);
        String Concept=custom_title2.getText().toLowerCase();
        System.out.println(Concept);
        Assert.assertEquals(Topic.contains(Concept),true);

    }




    public void verifyBigBookDescription() {
        softAssert.assertEquals(bookHeader_description.isDisplayed(), true, "Book Description is not displayed");
    }
    public void ClickOnTopic(int i)
    {
        waitForElementToBeVisible(topicNameList.get(i));
        topicNameList.get(i).click();
    }

    public String clickOnChapterName(int i) {
        waitForElementToBeVisible(chapterNameList.get(i));
        String chapterName = chapterNameList.get(i).getText();
        chapterNameList.get(i).click();
        return chapterName;
    }

    public void VerifyUserCanPlayEmbibeExplainersVideosInBooksTopic() {
        waitForElementToBeVisible(videoList.get(0));
        videoList.get(0).click();
    }
    public void VerifyUserCanPlayEnrichYourLearningVideosInBooksTopic()
    {
        waitForElementToBeVisible(EnrichYourLearning.get(0));
        EnrichYourLearning.get(0).click();
    }
    public void verifyAlltheelementsonTopic()
    {
        softAssert.assertEquals(videoList.get(0).isDisplayed(), true, "Embibe Explainers Videos is not displayed");
        softAssert.assertEquals(EnrichYourLearning.get(0).isDisplayed(), true, "EnrichYourLearning Videos is not displayed");
        softAssert.assertEquals(subHeaderList.get(0).isDisplayed(), true, " subheader not displayed");
        softAssert.assertEquals(custom_title1.isDisplayed(), true, "Custom Title not displayed");
        softAssert.assertEquals(custom_title2.isDisplayed(), true, "Custom Title not displayed");
        softAssert.assertAll();

    }

    @Override
    public void clickOnPractice() {

    }

    @Override
    public void verifyAllElementsOnThePracticePage() {

    }
}
