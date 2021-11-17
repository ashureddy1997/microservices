package pageObjects.homePage;

import constant.Tabs;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class HomePageIOS extends BasePage implements HomePage{
    SoftAssert softAssert=null;
    public HomePageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "txt_HeroBannerTitleName")
    private WebElement txt_HeroBannerTitleName;

    @FindBy(xpath= "//XCUIElementTypeTabBar/XCUIElementTypeButton")
    private List<WebElement> selectedTab;

    @FindBy(id = "no_records")
    private WebElement no_records;

    @FindBy(id = "txt_heroBanner_action_goal_switch")
    private WebElement goalSwitch;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Learn\"]")
    private WebElement learnBtn;


    @FindBys({@FindBy(id = "smallLabel")})
    private List<WebElement> tab;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Learn\"])")
    private WebElement navigation_learn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Practice\"]")
    private WebElement navigation_practice;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My Home\"]")
    private WebElement navigation_home;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Test\"]")
    private WebElement navigation_test;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Videos\"]")
    private WebElement videoBtn;


    @FindBys({@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Embibe\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther")})
    private List<WebElement> bookList;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]")})
    private List<WebElement> listOfSearchResult;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private List<WebElement> listOfChapters;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private List<WebElement> listOfVedios;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private List<WebElement> listOfPracticeChapter;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private List<WebElement> listOfTests;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"search btn\"]")
    private WebElement searchBtn;

    @FindBy(xpath= "//XCUIElementTypeTextField")
    private WebElement query;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Tests\"]")
    private WebElement testBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Practice\"]")
    private WebElement practiceBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Books\"]")
    private WebElement booksBtn;

    @FindBy(xpath= "//XCUIElementTypeButton[@name=\"search mic\"]")
    private WebElement voice_search;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"search_btn\"]")
    private WebElement searchIcon;

    @FindBy(id = "subject_name")
    private WebElement subjectName;

    @FindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeStaticText")
    private WebElement resultscount;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell")})
    private List<WebElement> quicklinks;

    @FindBys({@FindBy(className = "android.widget.Button")})
    private List<WebElement> listOfQuicklinks;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")})
    private List<WebElement> listofHeader;

    @FindBys({@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeStaticText")})
    private List<WebElement> chapterNameList;




    public void clickOnBook(int index) {
        int i=7;
        while (i<listofHeader.size()) {
           i++;
            System.out.println(i+" "+listofHeader.get(i).getText());
            if(listofHeader.get(i).getText().equalsIgnoreCase("Books With Videos & Solutions")){
                for(int k=0;k<i-9;k++) {
                    verticalSwipeByPercentages(0.8, 0.6, 0.5);

                }
                break;
            }
        }

       List<WebElement> element= driver().findElements(By.xpath("//XCUIElementTypeCell//XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther"));
       element.get(0).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void ClickOnQuickLinks(){
        waitForElementToBeVisible(quicklinks.get(0));
        quicklinks.get(0).click();
    }
    public void clickOnChapters() {

        verticalSwipeByPercentages(0.8, 0.7, 0.5);
        int i=7;
        while (i<listofHeader.size()) {
            i++;
            System.out.println(i+" "+listofHeader.get(i).getText());
            if(listofHeader.get(i).getText().contains("Chapters")){
                for(int k=0;k<i-9;k++) {
                    verticalSwipeByPercentages(0.8, 0.6, 0.5);

                }
                break;
            }
        }

        List<WebElement> element= driver().findElements(By.xpath("//XCUIElementTypeCell/XCUIElementTypeButton[2]"));
        element.get(1).click();
    }
    public void clickOnPracticeChapter(){
        scrollToText("Achieve Now");
        waitForElementToBeVisible(listOfPracticeChapter.get(0));
        listOfPracticeChapter.get(0).click();
    }

    @Override
    public void clickOnTest() {
        waitForElementToBeVisible(testBtn);
        testBtn.click();

    }

    @Override
    public void clickOnBooks() {
        waitForElementToBeVisible(booksBtn);
        booksBtn.click();

    }

    @Override
    public void clickOnPractice() {
        waitForElementToBeVisible(practiceBtn);
        practiceBtn.click();
    }

    @Override
    public void clickOnVideos() {
        waitForElementToBeVisible(videoBtn);
        videoBtn.click();

    }

    public void queryOnSearch(String queryValue) {
        waitForElementToBeVisible(query);
        query.sendKeys(queryValue);

    }

    public void clickOnEnter(){
        driver().findElement(By.xpath("//XCUIElementTypeButton[@name=\"Search\"]")).click();
    }

    public void verifySearchResult() {
        waitForElementToBeVisible(listOfSearchResult.get(0));
        Assert.assertEquals(listOfSearchResult.get(0).isDisplayed(), true, "Search Result not displayed");
    }


    public void clickOnSwitchGoal() {
        waitForElementToBeVisible(goalSwitch);
        goalSwitch.click();
    }

  /*  public void clickOnLearnTab() {
        waitForElementToBeVisible(navigation_learn));
        for (WebElement element : tab) {
            if (element.getText().equalsIgnoreCase(Tabs.Learn)) {
                element.click();
            }
        }
    }
    public void clickOnHomeTab() {
        waitForElementToBeVisible(tab.get(0));
        for (WebElement element : tab) {
            if (element.getText().equalsIgnoreCase(Tabs.Home)) {
                element.click();
            }
        }
    }

    public void clickOnPracticeTab() {
        waitForElementToBeVisible(tab.get(0));
        for (WebElement element : tab) {
            if (element.getText().equalsIgnoreCase(Tabs.Practice)) {
                element.click();
            }
        }

    }
     public void clickOnTestTab() {
        waitForElementToBeVisible(tab.get(0));
        //noinspection ForLoopReplaceableByForEach
        for (WebElement element : tab) {
            if (element.getText().equalsIgnoreCase(Tabs.Test)) {
                element.click();
            }
        }
    }


    */

    public void clickOnLearnTab() {
        waitForElementToBeVisible(navigation_learn);
        navigation_learn.click();

    }

    public void clickOnHomeTab() {
        waitForElementToBeVisible(navigation_home);
        navigation_home.click();


    }

    public void clickOnPracticeTab() {
        waitForElementToBeVisible(navigation_practice);
        navigation_practice.click();


    }

    public void clickOnTestTab() {
        waitForElementToBeVisible(navigation_test);
        navigation_test.click();
    }


    public void verifyHomePageIsTheDefaultPage() {
        waitForElementToBeVisible(selectedTab.get(0));
        Assert.assertEquals(selectedTab.get(0).getText(), "My Home", "Default tab is not Learn");
    }

    public void PracticePageIsTheDefaultPage() {
        waitForElementToBeVisible(selectedTab.get(2));
        Assert.assertEquals(selectedTab.get(2).getText(), "Practice", "Default tab is not practice");
    }

    public void LearnPageIsTheDefaultPage() {
        waitForElementToBeVisible(selectedTab.get(1));
        Assert.assertEquals(selectedTab.get(1).getText(), "1", "Default tab is not Learn");
    }

    public void TestPageIsTheDefaultPage() {
        waitForElementToBeVisible(selectedTab.get(3));
        Assert.assertEquals(selectedTab.get(3).getText(), "1", "Default tab is not Test");
    }


    public void clickOnAchieveTab() {
        waitForElementToBeVisible(tab.get(0));
        for (WebElement element : tab) {
            if (element.getText().equalsIgnoreCase(Tabs.Achieve)) {
                element.click();
            }
        }
    }

    @Override
    public void AchievePageIsTheDefaultPage() {

    }

    @Override
    public void verifyembiumcoinDisplay() {

    }

    @Override
    public void clickOnMyTimeline() {

    }

    @Override
    public void verifyHeroBannerCoins() {

    }

    @Override
    public void verifyHeroBannerDuration() {

    }

    @Override
    public String clickOnAGoalDisplayedInSearchResult() {

        return null;
    }

    @Override
    public void clickOnASearchData() {

    }

    @Override
    public void clickOnUpdateMYGoalFromSearch() {

    }

    @Override
    public String verifyGoalIsUpdatedCorrectly() {
        return null;
    }

    @Override
    public void clickOnBringMeBack() {

    }

    @Override
    public void verifyNavigationToUserHomePage() {

    }

    public void clickOnMoreTab() {
        waitForElementToBeVisible(tab.get(0));
        for (WebElement element : tab) {
            if (element.getText().equalsIgnoreCase(Tabs.More)) {
                element.click();
            }
        }
    }

    public void verifyTitleOnHomeScreen(String title) {

        waitForElementToBeVisible(learnBtn);
        //   Assert.assertEquals(txt_HeroBannerTitleName.getText(), "Welcome " + title, "Title not matched AR" + txt_HeroBannerTitleName.getText() + " ER " + "Welcome " + title);

    }

    public void verifyAllTheTabDisplay() {
        waitForElementToBeVisible(selectedTab.get(0));
        softAssert.assertEquals(selectedTab.get(0).isEnabled(), true, "Learn tab not displayed");
        softAssert.assertEquals(tab.get(0).isEnabled(), true, "Practice tab not displayed");
        softAssert.assertEquals(tab.get(1).isDisplayed(), true, "Test tab not displayed");
        //  softAssert.assertEquals(tab.get(2).isDisplayed(),true,"achieve tab not displayed");
        softAssert.assertEquals(tab.get(2).isDisplayed(), true, "More tab not displayed");
        softAssert.assertAll();

    }

    public void verifyClickOnPracticeTab() {

        clickOnPracticeTab();

    }

    public void verifyClickOnTestTab() {
        waitForElementToBeVisible(tab.get(0));
        clickOnTestTab();
        Assert.assertEquals(selectedTab.get(3).getText(), Tabs.Test, "Click on Test tab not working");
    }

    public void verifyClickOnAchieveTab() {
        waitForElementToBeVisible(tab.get(0));
        clickOnAchieveTab();
        Assert.assertEquals(selectedTab.get(4).getText(), Tabs.Achieve, "Click on Achieve tab not working");
    }

    public void verifyClickOnMoreTab() {
        waitForElementToBeVisible(tab.get(0));
        clickOnMoreTab();
        Assert.assertEquals(selectedTab.get(5).getText(), Tabs.More, "Click on More tab not working");
    }

    public void verifySearchButtonDisplay() {
        waitForElementToBeVisible(searchBtn);
        Assert.assertEquals(searchBtn.isDisplayed(), true, "Search button not displayed");
    }

    public void clickOnSearch() {
        waitForElementToBeVisible(searchBtn);
        searchBtn.click();
    }

    public void verifyGoalSwitch(String goal) {
        waitForElementToBeVisible(goalSwitch);
        Assert.assertEquals(goalSwitch.getText(), goal, "Goal not matched");
    }

    public void verifySearchScreenUI() {
        waitForElementToBeVisible(query);
        softAssert.assertEquals(searchIcon.isEnabled(), true, "Search icon is not displayed");
        softAssert.assertEquals(voice_search.isEnabled(), true, "Voice search is not displayed");
        softAssert.assertEquals(query.getText(), "Search for subject, topic, etc.", "Text on search field not matched");
        softAssert.assertAll();

    }

    public void clickOnSearchResult() {
        waitForElementToBeVisible(listOfSearchResult.get(0));
        listOfSearchResult.get(0).click();
    }

    public void verifySearchForInvalidInput() {

    }

    public void verifyQuickLinksAndResultCount() {
        Assert.assertEquals(resultscount.isEnabled(), true, "Resultscount is not displaying");
        Assert.assertEquals(quicklinks.get(0).isEnabled(), true, "QuickLinks are not displaying");

    }

    public void UserCanNavigateToChaptersInSearch() {
        scrollToText("Topics");
        waitForElementToBeVisible(listOfVedios.get(0));
        listOfVedios.get(0).click();

    }

    public void UserCanNavigateToTopicsInSearch() {
        scrollToText("Practice for Chapters");
        waitForElementToBeVisible(listOfVedios.get(0));
        listOfVedios.get(0).click();

    }

    public void verifyNavigateToVedios() {
        waitForElementToBeVisible(listOfVedios.get(0));
        listOfVedios.get(0).click();
    }

    public void UserCanNavigateToBoksInSearch() {
        scrollToText("Practice for Chapters");
        waitForElementToBeVisible(bookList.get(0));
        bookList.get(0).click();
    }

    public void verifyNavigateToPracticeChapters() {
        waitForElementToBeVisible(listOfChapters.get(0));
        listOfChapters.get(0).click();
    }

    public void verifyNavigateToTestsInSearch() {
        scrollToText("Tests");
        // swipeScreen(Direction.UP);
        waitForElementToBeVisible(listOfTests.get(0));
        listOfTests.get(0).click();
    }

    public void Verifyrecommendedvideosdisplaysbasedonsearchresult() {
        waitForElementToBeVisible(query);
        String a = query.getText();
        waitForElementToBeVisible(subjectName);
        String b = subjectName.getText();
        Assert.assertEquals(a.contains(b), true);


    }

    public void VerifyReleventTestResultsDisplaysBasedOnSearchResult() {
        waitForElementToBeVisible(query);
        String a = query.getText();
        waitForElementToBeVisible(subjectName);
        String b = subjectName.getText();
        Assert.assertEquals(a.contains(b), true);
    }

    public void VerifyReleventTopicsResultsDisplaysBasedOnSearchResult() {
        scrollToText("Topics");
        waitForElementToBeVisible(query);
        String a = query.getText();
        waitForElementToBeVisible(subjectName);
        String b = subjectName.getText();
        Assert.assertEquals(a.contains(b), false);

    }


    public void verifyUserAbleToGetSameTextInSearchBar() {

        Assert.assertEquals(listOfQuicklinks.size(), 0);

    }
}
