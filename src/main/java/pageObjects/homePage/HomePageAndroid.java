package pageObjects.homePage;

import constant.Tabs;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class HomePageAndroid extends BasePage implements HomePage{
    SoftAssert softAssert=null;
    public HomePageAndroid(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "txt_HeroBannerTitleName")
    private WebElement txt_HeroBannerTitleName;

    @FindBy(id = "largeLabel")
    private WebElement selectedTab;

    @FindBy(id = "error_TV")
    private WebElement no_records;

    @FindBy(id = "txt_heroBanner_action_goal_switch")
    private WebElement goalSwitch;

    @FindBy(id = "txt_HeroBannerName")
    private WebElement heroBannerName;

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,’smallLabel′) and @text=’Learn′]")
    private WebElement learnTab;

    @FindBys({@FindBy(id = "smallLabel")})
    private List<WebElement> tab;

    @FindBy(id = "navigation_learn")
    private WebElement navigation_learn;

    @FindBy(id = "navigation_practice")
    private WebElement navigation_practice;

    @FindBy(id = "navigation_home")
    private WebElement navigation_home;

    @FindBy(id = "txt_HeroBannerCoins")
    private WebElement txt_HeroBannerCoins;

    @FindBy(id = "txt_HeroBannerDuration")
    private WebElement txt_HeroBannerDuration;

    // @FindBy(id = "navigation_test")
    @FindBy(id = "navigation_test_bottom")
    private WebElement navigation_test;

    @FindBy(id = "navigation_achieve")
    private WebElement navigation_achieve;

    @FindBy(id = "ic_embium_coin")
    private WebElement ic_embium_coin;

    @FindBy(xpath = "//*[@text='MY TIMELINE']")
    private WebElement myTimeline;

    @FindBys({@FindBy(id = "video_banner_card_view")})
    private List<WebElement> bookList;

    @FindBys({@FindBy(id = "imgBanner")})
    private List<WebElement> listOfSearchResult;

    @FindBys({@FindBy(id = "adBannerCardView")})
    private List<WebElement> listOfChapters;

    @FindBys({@FindBy(id = "video_lib_image_view")})
    private List<WebElement> listOfVedios;

    @FindBys({@FindBy(id = "video_lib_image_view")})
    private List<WebElement> listOfPracticeChapter;

    @FindBys({@FindBy(id = "group")})
    private List<WebElement> listOfTests;

    @FindBy(id = "search")
    private WebElement searchBtn;

    @FindBy(id = "query")
    private WebElement query;

    @FindBys({@FindBy(id = "tv_name")})
    private List<WebElement> ListOfGoalsDisplayedInSearchResult;

    @FindBy(id = "tv_name")
    private WebElement GoalDisplayedInSearchResult;

    @FindBy(id = "imgBanner")
    private WebElement imgBanner_SearchData;

    @FindBy(id = "upgrade_goal_TV")
    private WebElement upgrade_goal_TV;

    @FindBy(id = "bring_back_TV")
    private WebElement bring_back_TV;

    @FindBy(id = "voice_search")
    private WebElement voice_search;

    @FindBy(id = "imageView")
    private WebElement searchIcon;

    @FindBy(id = "subject_name")
    private WebElement subjectName;

    @FindBy(id = "results_count_tv")
    private WebElement resultscount;

    @FindBy(id = "quick_links")
    private WebElement quicklinks;

    @FindBys({@FindBy(className = "android.widget.Button")})
    private List<WebElement> listOfQuicklinks;

    @FindBy(xpath= "//android.widget.TextView[@text='Test'] ")
    private WebElement test;

    @FindBy(xpath= "//android.widget.TextView[@text='Books'] ")
    private WebElement books;

    @FindBy(xpath= "//android.widget.TextView[@text='Practice'] ")
    private WebElement practice;

    @FindBy(xpath= "//android.widget.TextView[@text='Videos'] ")
    private WebElement videos;


    public void clickOnBook(int index) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollToText("Books With Videos & Solutions");
        verticalSwipeByPercentages(0.6, 0.2, 0.2);
        waitForElementToBeVisible(bookList.get(0));
        bookList.get(index).click();
    }
    public void ClickOnQuickLinks(){
        waitForElementToBeVisible(quicklinks);
        quicklinks.click();
    }
    public void clickOnChapters() {
        scrollToText("Books With Videos & Solution");
        waitForElementToBeVisible(listOfChapters.get(0));
        listOfChapters.get(0).click();
    }
    public void clickOnPracticeChapter(){
        scrollToText("Achieve Now");
        waitForElementToBeVisible(listOfPracticeChapter.get(0));
        listOfPracticeChapter.get(0).click();
    }

    public void clickOnMyTimeline(){
        scrollDown();
        waitForElementToBeVisible(myTimeline);
        myTimeline.click();
    }
    public void scrollDown(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        swipeScreen(Direction.DOWN);
       verticalSwipeByPercentages(0.3, 0.1, 0.1);
    }
    public void queryOnSearch(String queryValue) {
        waitForElementToBeVisible(query);
        query.sendKeys(queryValue);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver().getKeyboard().sendKeys(Keys.ENTER);

        driver().getKeyboard().pressKey(Keys.ENTER);
    }

    public void verifySearchResult() {
        waitForElementToBeVisible(listOfSearchResult.get(0));
        Assert.assertEquals(listOfSearchResult.get(0).isDisplayed(), true, "Search Result not displayed");
    }
    public String clickOnAGoalDisplayedInSearchResult(){
        waitForElementToBeVisible(ListOfGoalsDisplayedInSearchResult.get(1));
       String Update_goal= ListOfGoalsDisplayedInSearchResult.get(1).getText();
       System.out.println("Goal : "+ListOfGoalsDisplayedInSearchResult.get(1).getText());
        ListOfGoalsDisplayedInSearchResult.get(1).click();
        return Update_goal;
    }

    public void clickOnASearchData(){
        waitForElementToBeVisible(imgBanner_SearchData);
        imgBanner_SearchData.click();
    }
    public void clickOnUpdateMYGoalFromSearch(){
        waitForElementToBeVisible(upgrade_goal_TV);
        upgrade_goal_TV.click();
        driver().navigate().back();
    }
    public void clickOnBringMeBack(){
        waitForElementToBeVisible(bring_back_TV);
        bring_back_TV.click();
    }
    public String verifyGoalIsUpdatedCorrectly() {
        waitForElementToBeVisible(goalSwitch);
        String updated_Goal= goalSwitch.getText();
        System.out.println("Updated goal :"+goalSwitch.getText());
        Assert.assertEquals(goalSwitch.isDisplayed(),true, "Goal displayed");
        return updated_Goal;
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
       // clickOnHeroBannerSubject();
        waitForElementToBeVisible(navigation_home);
        navigation_home.click();


    }

    public void clickOnPracticeTab() {
        waitForElementToBeVisible(navigation_practice);
        navigation_practice.click();


    }

    public void clickOnTest() {
        waitForElementToBeVisible(test);
        test.click();

    }
    public void clickOnPractice() {
        waitForElementToBeVisible(practice);
        practice.click();

    }
    public void clickOnBooks() {
        waitForElementToBeVisible(books);
        books.click();

    }
    public void clickOnVideos() {
        waitForElementToBeVisible(videos);
        videos.click();

    }
    @FindBy(id = "txt_HeroBannerSubject")
    private WebElement HeroBannerSubject;

    public void clickOnHeroBannerSubject(){
        waitForElementToBeVisible(HeroBannerSubject);
        HeroBannerSubject.click();
    }

    public void clickOnTestTab() {
        //clickOnHeroBannerSubject();
        waitForElementToBeVisible(navigation_test);
        navigation_test.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void verifyNavigationToUserHomePage() {
        waitForElementToBeVisible(selectedTab);
        Assert.assertEquals(selectedTab.getText(), Tabs.Home, "Default tab is not My Home");
    }

    public void verifyHomePageIsTheDefaultPage() {
        waitForElementToBeVisible(selectedTab);
        Assert.assertEquals(selectedTab.getText(), Tabs.Learn, "Default tab is not Learn");
    }

    public void verifyHeroBannerCoins(){
        waitForElementToBeVisible(txt_HeroBannerCoins);
        softAssert.assertEquals(txt_HeroBannerCoins.isDisplayed(),true,"txt_HeroBannerCoins is not displayed");
        softAssert.assertAll();
    }
    public void verifyHeroBannerDuration(){
        waitForElementToBeVisible(txt_HeroBannerDuration);
        softAssert.assertEquals(txt_HeroBannerDuration.isDisplayed(),true,"txt_HeroBannerDuration is not displayed");
        softAssert.assertAll();
    }
    public void PracticePageIsTheDefaultPage() {
        waitForElementToBeVisible(selectedTab);
        Assert.assertEquals(selectedTab.getText(), Tabs.Practice, "Default tab is not practice");
    }

    public void LearnPageIsTheDefaultPage() {
        waitForElementToBeVisible(selectedTab);
        Assert.assertEquals(selectedTab.getText(), Tabs.Learn, "Default tab is not practice");
    }

    public void TestPageIsTheDefaultPage() {
        waitForElementToBeVisible(selectedTab);
        Assert.assertEquals(selectedTab.getText(), Tabs.Test, "Default tab is not Test");
    }
    public void AchievePageIsTheDefaultPage() {
        waitForElementToBeVisible(selectedTab);
        Assert.assertEquals(selectedTab.getText(), Tabs.Achieve, "Default tab is not Achieve");
    }


    public void clickOnAchieveTab() {
        waitForElementToBeVisible(tab.get(0));
        for (WebElement element : tab) {
            if (element.getText().equalsIgnoreCase(Tabs.Achieve)) {
                element.click();
            }
        }
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
      //  waitForElementToBeVisible(heroBannerName);
        //   Assert.assertEquals(txt_HeroBannerTitleName.getText(), "Welcome " + title, "Title not matched AR" + txt_HeroBannerTitleName.getText() + " ER " + "Welcome " + title);

    }
    public void verifyembiumcoinDisplay(){
        waitForElementToBeVisible(ic_embium_coin);
        Assert.assertEquals(ic_embium_coin.isDisplayed(),true,"embium coins not displayed");

    }
    public void verifyAllTheTabDisplay() {
        waitForElementToBeVisible(selectedTab);
        softAssert.assertEquals(selectedTab.isDisplayed(), true, "Learn tab not displayed");
        softAssert.assertEquals(tab.get(0).isDisplayed(), true, "Practice tab not displayed");
        softAssert.assertEquals(tab.get(1).isDisplayed(), true, "Test tab not displayed");
        //  softAssert.assertEquals(tab.get(2).isDisplayed(),true,"achieve tab not displayed");
        softAssert.assertEquals(tab.get(2).isDisplayed(), true, "More tab not displayed");
        softAssert.assertAll();

    }

    public void verifyClickOnPracticeTab() {
        waitForElementToBeVisible(tab.get(0));
        clickOnPracticeTab();
//        Assert.assertEquals(selectedTab.getText(), Tabs.Practice, "Click on practice tab not working");
    }

    public void verifyClickOnTestTab() {
        waitForElementToBeVisible(tab.get(0));
        clickOnTestTab();
        Assert.assertEquals(selectedTab.getText(), Tabs.Test, "Click on Test tab not working");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyClickOnAchieveTab() {
        waitForElementToBeVisible(tab.get(0));
        clickOnAchieveTab();
        Assert.assertEquals(selectedTab.getText(), Tabs.Achieve, "Click on Achieve tab not working");
    }

    public void verifyClickOnMoreTab() {
        waitForElementToBeVisible(tab.get(0));
        clickOnMoreTab();
        Assert.assertEquals(selectedTab.getText(), Tabs.More, "Click on More tab not working");
    }

    public void verifySearchButtonDisplay() {
        waitForElementToBeVisible(searchBtn);
        Assert.assertEquals(searchBtn.isDisplayed(), true, "Search button not displayed");
    }

    public void clickOnSearch() {
        waitForElementToBeVisible(searchBtn);
        searchBtn.click();
    }

    @Override
    public void clickOnEnter() {

    }

    public void verifyGoalSwitch(String goal) {
        waitForElementToBeVisible(goalSwitch);
        Assert.assertEquals(goalSwitch.getText(), goal, "Goal not matched");
    }

    public void verifySearchScreenUI() {
        waitForElementToBeVisible(query);
        softAssert.assertEquals(searchIcon.isDisplayed(), true, "Search icon is not displayed");
        softAssert.assertEquals(voice_search.isDisplayed(), true, "Voice search is not displayed");
        softAssert.assertEquals(query.getText(), "Search for subject, topic etc.", "Text on search field not matched");
        softAssert.assertAll();

    }

    public void clickOnSearchResult() {
        waitForElementToBeVisible(listOfSearchResult.get(0));
        listOfSearchResult.get(0).click();
    }

    public void verifySearchForInvalidInput() {
        waitForElementToBeVisible(no_records);
        Assert.assertEquals(no_records.isDisplayed(), true, "No record text is not displaying");
    }

    public void verifyQuickLinksAndResultCount() {
        Assert.assertEquals(resultscount.isDisplayed(), true, "Resultscount is not displaying");
        Assert.assertEquals(quicklinks.isDisplayed(), true, "QuickLinks are not displaying");

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

        waitForElementToBeVisible(listOfQuicklinks.get(0));
        String a = listOfQuicklinks.get(0).getText();
        System.out.println("the value of a" + a);
        listOfQuicklinks.get(0).click();
        waitForElementToBeVisible(query);
        String b = query.getText();
        Assert.assertEquals(b, a);

    }


}

