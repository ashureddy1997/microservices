package pageObjects.bookPage;

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

public class BookPageAndroid extends BasePage implements BookPage {
    SoftAssert softAssert=null;
     public BookPageAndroid(AppiumDriver driver) {
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
    private WebElement practice_Duration;

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

    @FindBy(xpath= "//android.widget.Button[@text='Book Added' or @text='My Books'] ")
    private WebElement my_books_button;

    @FindBy(id = "txt_BookHeader_Coins")
    private WebElement BookHeader_Coins;

    @FindBy(id = "subject_name")
    private WebElement subject_name;

    @FindBy(id = "video_count")
    private WebElement video_count;

    @FindBy(id = "practice_count")
    private WebElement practice_count;

    @FindBy(id = "imgOwnerIcon")
    private WebElement EmbibeLogo;

    public void verifyAllTheElementPresentOnBookTOC() {
        waitForElementToBeVisible(book_chapter_title);
        softAssert.assertEquals(title.isDisplayed(), true, "Book Title not displayed");
        softAssert.assertEquals(bookHeader_description.isDisplayed(), true, "Book description not displayed");
        softAssert.assertEquals(bookHeader_Subject.isDisplayed(), true, "Book Subject header not displayed");
        // softAssert.assertEquals(txt_author.isDisplayed(), true, "Book author name is not displayed");
        softAssert.assertEquals(book_chapter_title.isDisplayed(), true, "Book Chapter title is not displayed");
        softAssert.assertEquals(chapterNameList.get(0).isDisplayed(), true, "Book Chapter name is not displayed");
        softAssert.assertEquals(practice_Duration.isDisplayed(), true, "Book duration is not displayed");
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
    public void verifyMyBooksButton()
    {
        waitForElementToBeVisible(my_books_button);
        softAssert.assertEquals(my_books_button.isDisplayed(), true, "My Books Button is not displayed");
        softAssert.assertAll();


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
    public void VerifPracticeCountDisplayOnTopics(){
        softAssert.assertEquals(practice_count.isDisplayed(), true, "Custom Title not displayed");
        softAssert.assertAll();

    }
    public void VerifvideoCountDisplayOnTopics(){
        softAssert.assertEquals(video_count.isDisplayed(), true, "Custom Title not displayed");
        softAssert.assertAll();

    }
    public void VerifyThumbnailIsAppearingForAllTheBookTiles(){
        scrollToText("Embibe Explainers");
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
        softAssert.assertEquals(subject_name.isDisplayed(), true, "subject Tag is not displayed");
        softAssert.assertEquals(EmbibeLogo.isDisplayed(), true, "Embibe Logo is not displayed");
        softAssert.assertEquals(videoList.get(0).isDisplayed(), true, "Video Library Image  is not displayed");
        softAssert.assertAll();
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
    public void navigateToEmbibeBook() {
        scrollToText("Embibe Big Books ");
        verticalSwipeByPercentages(0.3, 0.1, 0.1);

    }


    public void verifyBigBookDescription() {
        softAssert.assertEquals(bookHeader_description.isDisplayed(), true, "Book Description is not displayed");
    }

    public void ClickOnTopic(int i) {
        try {
            waitForElementToBeVisible(topicNameList.get(i));
            topicNameList.get(i).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public void clickOnChapterName(int i) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
            waitForElementToBeVisible(chapterNameList.get(i));
            String chapterName = chapterNameList.get(i).getText();
            chapterNameList.get(i).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
