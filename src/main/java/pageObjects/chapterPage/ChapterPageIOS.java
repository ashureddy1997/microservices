package pageObjects.chapterPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class ChapterPageIOS extends BasePage implements ChapterPage{
    SoftAssert softAssert=null;
    public ChapterPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Books\"]")
    private WebElement my_books_button;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"backButtonShadow\"]")
    private WebElement backArrowButton;

    @FindBys({@FindBy(xpath= "//XCUIElementTypeStaticText")})
    private List<WebElement> chapterTitleName;

    @FindBys({@FindBy(xpath= "//XCUIElementTypeStaticText")})
    private List<WebElement> chapterTitleNumber;

    @FindBys({@FindBy(xpath= "//XCUIElementTypeStaticText")})
    private List<WebElement> chapterNameList;

    @FindBys({@FindBy(xpath= "//XCUIElementTypeStaticText")})
    private List<WebElement> book_topic_title;

    @FindBys({@FindBy(id="thumbPracticeForChapterIV")})
    private List<WebElement> chapterPracticeList;

    public void goBackToBookFirstPage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
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

    public void verifyChapterAllTheElementOnChapterDetailScreen(){
        goBackToBookFirstPage();
        int size=chapterTitleNumber.size();
        waitForElementToBeVisible(chapterTitleNumber.get(size-1));
        softAssert.assertEquals(chapterTitleName.get(0).isEnabled(),true,"Chapter title name not displayed");
        softAssert.assertEquals(chapterTitleNumber.get(size-1).isEnabled(),true,"Chapter Number not displayed");
//        softAssert.assertEquals(chapterNameList.get(0).isDisplayed(),true,"Chapter name list not displayed");
//        softAssert.assertEquals(chapterPracticeList.get(0).isDisplayed(),true,"Chapter practice not displayed");
        softAssert.assertEquals(book_topic_title.get(0).isEnabled(),true,"topic title not displayed");
        softAssert.assertAll();

    }

    public void verifyChapterAllTheElementOnBigBookChapterDetailScreen(){
        int size=chapterTitleNumber.size();
        waitForElementToBeVisible(chapterTitleNumber.get(size-1));
        softAssert.assertEquals(chapterTitleNumber.get(size-1).isEnabled(),true,"Chapter title name not displayed");
        softAssert.assertEquals(chapterTitleNumber.get(size-1).isEnabled(),true,"Chapter Number not displayed");
//        softAssert.assertEquals(chapterNameList.get(0).isDisplayed(),true,"Chapter name list not displayed");
        softAssert.assertEquals(book_topic_title.get(0).isEnabled(),true,"topic title not displayed");
        softAssert.assertAll();

    }



    public void verifyNavigationToChapter(String ChapterTitle) {
        waitForElementToBeVisible(chapterTitleName.get(0));
        waitForElementToBeVisible(chapterNameList.get(0));
        Assert.assertEquals(ChapterTitle.toLowerCase().contains(chapterTitleName.get(0).getText().toLowerCase()),true,"Navigation to the chapter is not working"+ChapterTitle+" "+chapterTitleName.get(0).getText());
    }
}