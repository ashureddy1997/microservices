package regression.learn;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class BookTestCases extends TestBase {

    @Test(priority = 1,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify Clicking on any of the book in Books with Videos and Solutions, " +
            "the user is directed to the Book description page.")
    public void verifyClickingOnBookTakesUserToBookDescriptionPage(){
        logger.info("Verify Clicking on any of the book in Books with Videos and Solutions, the user is directed to the Book description page.");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on LearnTab");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.verifyAllTheElementPresentOnBookTOC();

    }



   /* @Test(priority = 1,groups = {Categories.Descoped}, description = "Verify practice questions contains relevant to the chapter and Topics selected")
    public void VerifyClickingOnAnyTopicTheConceptsRelatedToItAreDisplayed() {
        logger.info("Verify User Able To See The Chapters And Relevant Topic Name Appears");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnLearnTab();
        logger.info("Click on LearnTab");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.VerifyClickingOnAnyTopicTheConceptsRelatedToItAreDisplayed();

    }*/
    @Test(priority = 2,groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify Clicking on ok on any concept video the video gets played")
    public void VerifyClickingOnOkOnAnyConceptVideoTheVideoGetsPlayed()  {
        logger.info("Verify User Able To See The Chapters And Relevant Topic Name Appears");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.clickOnChapterName(0);
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.ClickOnTopic(0);
        logger.info("click On Topic");
        bookPage.VerifPracticeCountDisplayOnTopics();
        logger.info("VerifPracticeCountDisplayOnTopics");
        bookPage.VerifvideoCountDisplayOnTopics();
        logger.info("VerifvideoCountDisplayOnTopics");
        bookPage.VerifyClickingOnOkOnAnyConceptVideoTheVideoGetsPlayed();
        logger.info("Verify Subject Tag is displayed on Embibe Explainers videos in Book");
        logger.info("Verify Embibe logo is displayed on Embibe Explainers videos in Book");
        logger.info("Verify video library image displayed on Embibe Explainers videos in Book");
    }

    @Test(priority = 3,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify the book description page contains the details of a book title, description, subject, learning map, Time duration, Embiums, achievement, behaviour and learns button.")
    public void verifyAllTheElementOnBookTOC()  {
        logger.info("Verify the book description page contains the details of a book title, description, subject, learning map, Time duration, Embiums, achievement, behaviour and learns button.");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.verifyAllTheElementPresentOnBookTOC();
        logger.info("Verify User is able to see the Book Description and Author Name displayed in the Page");

    }


    @Test(priority = 4,groups = {Categories.LearnREGRESSION,Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify all the element present on the chapter details screen")
    public void verifyAllTheElementOnChapterPage()  {
        logger.info("Verify all the element present on the chapter details screen");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on LearnTab");
        homePage.clickOnBook(0);
        logger.info("Click on Book");
        bookPage.clickOnChapterName(0);
        logger.info("Click on Chapter");
        chapterPage.verifyChapterAllTheElementOnChapterDetailScreen();

    }


    @Test(priority = 5,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify user user can Navigate to Embibe Big Books \n")
    public void VerifyNavigateToEmbibeBigBook() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on LearnTab");
        bookPage.navigateToEmbibeBook();
        homePage.clickOnBook(0);
        logger.info("Click on Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        learnPage.VerifyAllTheElementsOnPoinysToRememberTile();
        logger.info("VerifyAllTheElementsOnPoinysToRememberTileInBook");
        learnPage.VerifyAllTheElementsOnPointsToRememberPage();
        logger.info("VerifyAllTheElementsOnPointsToRememberPageInBook");
        learnPage.navigatBack();
        learnPage.VerifyAllTheElementsOnPoinysToRememberTile();
        logger.info("Verify user can Navigate back to Topic page from Points to Remeber");

    }
    @Test(priority =6,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify User is able to see Practice Thumbnail in Topics Section.")
    public void VerifyUserIsAbleToSeePracticeThumbnailInTopicsSection(){
        logger.info("Verify User is able to see Practice Thumbnail in Topics Section");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("Click on LearnTab");
        homePage.clickOnBook(0);
        logger.info("click On Book");
        bookPage.verifyMyBooksButton();
        logger.info("verify My Books button present in Book");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        practicePage.verifyUserCanTakePractice();

    }

}
