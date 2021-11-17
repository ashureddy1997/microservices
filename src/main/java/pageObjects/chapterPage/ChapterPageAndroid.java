package pageObjects.chapterPage;

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

public class ChapterPageAndroid extends BasePage implements ChapterPage {

    SoftAssert softAssert=null;
    public ChapterPageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id="custom_title2")
    private WebElement chapterTitleName;

    @FindBy(id="custom_title1")
    private WebElement chapterTitleNumber;

    @FindBys({@FindBy(id="book_chapter_name")})
    private List<WebElement> chapterNameList;

    @FindBy(id="book_topic_title")
    private WebElement book_topic_title;

    @FindBys({@FindBy(id="thumbPracticeForChapterIV")})
    private List<WebElement> chapterPracticeList;

    public void verifyChapterAllTheElementOnChapterDetailScreen(){
        waitForElementToBeVisible(chapterTitleNumber);
        softAssert.assertEquals(chapterTitleName.isDisplayed(),true,"Chapter title name not displayed");
        softAssert.assertEquals(chapterTitleNumber.isDisplayed(),true,"Chapter Number not displayed");
//        softAssert.assertEquals(chapterNameList.get(0).isDisplayed(),true,"Chapter name list not displayed");
//        softAssert.assertEquals(chapterPracticeList.get(0).isDisplayed(),true,"Chapter practice not displayed");
        softAssert.assertEquals(book_topic_title.isDisplayed(),true,"topic title not displayed");
        softAssert.assertAll();

    }

    public void verifyChapterAllTheElementOnBigBookChapterDetailScreen(){
        waitForElementToBeVisible(chapterTitleNumber);
        softAssert.assertEquals(chapterTitleName.isDisplayed(),true,"Chapter title name not displayed");
        softAssert.assertEquals(chapterTitleNumber.isDisplayed(),true,"Chapter Number not displayed");
//        softAssert.assertEquals(chapterNameList.get(0).isDisplayed(),true,"Chapter name list not displayed");
        softAssert.assertEquals(book_topic_title.isDisplayed(),true,"topic title not displayed");
        softAssert.assertAll();

    }



    public void verifyNavigationToChapter(String ChapterTitle) {
        waitForElementToBeVisible(chapterTitleName);
        waitForElementToBeVisible(chapterNameList.get(0));
        Assert.assertEquals(ChapterTitle.toLowerCase().contains(chapterTitleName.getText().toLowerCase()),true,"Navigation to the chapter is not working"+ChapterTitle+" "+chapterTitleName.getText());
    }
}

