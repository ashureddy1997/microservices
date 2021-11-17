package regression.learn;

import api.SignUpAPI;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;


public class LearnTestCases extends TestBase {

    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");
    SignUpAPI signUpAPI = null;


    @Test(priority = 1,groups = { Categories.LearnREGRESSION, Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "verify Learn Button Clickable")
    public void verifyLearnButtonClickable() {
        logger.info("verify Learn Button Clickable");
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
        learnPage.verifyLearnButtonWorking();
        logger.info("Verify that Learn button is present and functional");

    }

    @Test(priority = 2,groups = {Categories.Descoped}, description = "Verify user can select given subject tile and view the content related only to that")
    public void verifyClickOnGivenSubjectDisplayContentRelatedOnlyToThat() {
        logger.info("Verify user can select given subject tile and view the content related only to that");
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
        learnPage.clickOnSubject("PHYSICS");
        logger.info("Click on Subject");
        learnPage.verifyClickOnGivenSubjectDisplayContentRelatedOnlyToThat("PHYSICS");

    }

    @Test(priority = 3,groups = {Categories.Descoped}, description = "verify Avatar Icon Is Displayed")
    public void verifyAvatarIconIsDisplayed() {
        logger.info("verify Avatar Icon Is Displayed");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.verifyAvatarIcon();
        logger.info("Verify that Embibe logo is seen clearly on the top left");
        learnPage.verifyEmbibeLogoDisplay();

    }

    @Test(priority = 4,groups = {Categories.LearnREGRESSION, Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify the Embibe Logo is present only on Embibe Explainer video")
    public void VerifyEmbibeLogoDisplayedOnEmbibeVideos() {
        logger.info("Verify Embibe Logo Displayed On EmbibeVideos");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.verifyEmbibeLogoDisplay();

    }

    @Test(priority = 5,groups = {Categories.LearnREGRESSION, Categories.SMOKE,Categories.BETAREGRESSION}, description = "1.Verify on click on the tile user is directed to description page" +
            "2.Verify the all the elements on Embibe Explainers Video description page ")
    public void VerifyClickOnTileUserIsdirectedToDescriptionPageAndVerifyAllTheElements() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
    //    homePage.clickOnLearnTab();
        learnPage.VerifyuserIsdirectedToDescriptionPage();

    }



    @Test(priority = 6,groups = {Categories.LearnREGRESSION, Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "1.Verify that user can bookmark Embibe Explainers video by clicking on bookmark button" +
            "2.Verify that user can unbookmark Embibe Explainers video by clicking on bookmark button")
    public void VerifyUserCanBookMarkAndUnBookMarkTheEmbibeExplainersVideos() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.VerifyuserIsdirectedToDescriptionPage();
        logger.info("Verify user Is directed To DescriptionPage");
        learnPage.VerifyUserCanBookMarkTheVideoByClickingOnBookMarkButton();
        learnPage.VerifyUserCanUnBookMarkTheVideoByClickingOnBookMarkButton();

    }

    @Test(priority = 7,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "1.Verify user can play any of the video listed in related concept" + "2.Verify on click on Related concept link more video related to the concept are listed ")
    public void VerifyUserCanPlayAnyOfTheVideoListedInRelatedConcept() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.VerifyuserIsdirectedToDescriptionPage();
    }


 /*   @Test(priority = 8,groups = {Categories.SMOKE,Categories.BETAREGRESSION}, description = "verify Attempt Quality Display")
    public void verifyAttemptQualityDisplay() {
        logger.info("verify Attempt Quality Display");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.ClickOnChaptersInLearnHomepage();
        logger.info("Click on Chapters");
        learnPage.VerifyAttemptQualityDisplay();

    }

   @Test(priority = 10,groups = { Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify the Sincerity Score is displayed and working")
    public void VerifyTheSincerityScoreIsDisplayedAndworking() {
        logger.info("Verify the Sincerity Score is displayed and working");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.ClickOnChaptersInLearnHomepage();
        logger.info("Click on Chapters");
        learnPage.verifySencirityScoreDescription();

    }
*/
    @Test(priority = 11,groups = {Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify the all the data are displayed correctly for the Check Progress + Achievement")
    public void VerifyAllTheElementsOnProgressDetailScreen() {
        logger.info("Verify the all the data are displayed correctly for the Check Progress + Achievement");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.ClickOnChaptersInLearnHomepage();
        logger.info("Click on Chapters");
        learnPage.VerifyUserCanNavigateCheckProgress();
        logger.info("Click on CheckProgress");
        learnPage.VerifyAllTheElementsOnProgressDetailsScreen();
    }

    @Test(priority = 8,groups = {Categories.LearnREGRESSION, Categories.SMOKE,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "Verify thumbnail is appearing for all the book tiles ")
    public void VerifyThumbnailIsAppearingForAllTheBookTiles
            () {
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
        bookPage.VerifyThumbnailIsAppearingForAllTheBookTiles();

    }


    @Test(priority = 9,groups = { Categories.LearnREGRESSION, Categories.SMOKE,Categories.BETAREGRESSION}, description = "Verify the Enrich Your Learning videos are playing")
    public void VerifyTheEnrichYourLearningVideosArePlaying() {
        logger.info("Verify the Continue Learning Carousel  is displayed-Continue_Learning");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.VerifyUserCanPlayEnrichYourLearningVideos();
    }

    @Test(priority = 10,dataProvider="GoalAndExam",groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION,Categories.BETA_SANITY}, description = "1.Verify the continue Learning carousel "
            )
    public void VerifyTheContinueLearningCarouselDisplay(String PrepareFor, String GoalName, String ExamName) {
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.VerifyClickOnTheEmbibeExplainersTileuserIsdirectedToDescriptionPage();
        learnPage.ClickOnHeroBannerVideo();
        learnPage.ClickOnPauseButton();
        learnPage.NavigateBack();
        learnPage.clickOnQuitButton();
        learnPage.NavigateBack();
        //don't uncomment below line
       /* learnPage.clickOnbackButton();
        learnPage.clickOnbackButton();
        learnPage.verifyContinueLaerningDisplay();

        learnPage.VerifyOnClickOnStartButtonTheContinueLearningVideoStartsFromTheBeginning();*/
    }


    @Test(priority = 11,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify User can Navigate to Points to remember in Learn summery page")
    public void VerifyUserCanNavigateToPointsToRemember() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.ClickOnChaptersInLearnHomepage();
        logger.info("Click on Chapters");
        learnPage.VerifyUserCanNavigateCheckProgress();
        logger.info("Click on CheckProgress");
        learnPage.VerifyAllTheElementsOnProgressDetailsScreen();
        learnPage.verifySencirityScoreDescription();
        learnPage.VerifyAttemptQualityDisplay();
        learnPage.VerifyAllTheElementsOnPoinysToRememberTile();
        logger.info("Verify All The Elements on Points to remember Tile in Learn summery page");
        learnPage.VerifyAllTheElementsOnPointsToRememberPage();


    }

   /*  @Test(priority = 16,groups = {Categories.BETAREGRESSION}, description = "Verify All The Elements on Points to remember Page")
    public void VerifyAllTheElementsOnPointsToRememberPage()  {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.ClickOnChaptersInLearnHomepage();
        logger.info("Click on Chapters");
        learnPage.VerifyAllTheElementsOnPointsToRememberPage();
    }

    @Test(priority = 17,groups = {Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "VerifySincerityScoreExplanation")
    public void VerifySincerityScoreExplanation() {
        logger.info("Verify that user is able to start the practice from results in \"Practice on this chapter\"");
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
        learnPage.ClickOnChaptersInLearnHomepage();
        logger.info("Click on Chapter");
        learnPage.verifySencirityScoreDescription();
    }

     @Test(groups = {Categories.Descoped}, description = "Verify Here  Where  You Stand Display")
     public void VerifyHereWhereYouStandDisplay() {
        logger.info("Verify that user is able to start the practice from results in \"Practice on this chapter\"");
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
        learnPage.ClickOnChaptersInLearnHomepage();
        logger.info("Click on Chapters");
       // learnPage.VerifyUserIsAbleToSeeHereIsWhereYouStandWidget();
        logger.info("Verify Here where You Stand");
        learnPage.VerifyCheckProgressButtonDisplay();
        logger.info("Verify Check Progress Button");
    }*/

    @Test(priority = 12,groups = {Categories.REGRESSION, Categories.PracticeREGRESSION,Categories.BETAREGRESSION}, description = "Verify Practice On This Chapter Present And Functional")
    public void VerifyTopicsInThisChapterPresentAndFunctional() {
        logger.info("Verify Topics In This Chapter Present And Functional");
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        learnPage.ClickOnChaptersInLearnHomepage();
        logger.info("Click on Chapters");
        learnPage.verifyThumbnailPresent();
        logger.info(" Verify that the thumbnails are shown for every tile");
        learnPage.ClickOnPracticeOnThisChapters();
        logger.info("Click on Practice On This Chapters");
    }


    @Test(priority = 13,groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify that clicking on either of the tabs takes the user to the correct module")
    public void VerifyThatClickingOnEitherOfTheTabsTakesTheUserToTheCorrectModule() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.verifyHomePageIsTheDefaultPage();
        logger.info("verify HomePage Is The Default Page");
        homePage.LearnPageIsTheDefaultPage();
        logger.info("Learn Page Is The Default Page");
        homePage.clickOnPracticeTab();
        logger.info("Click on  PracticeTab");
        homePage.PracticePageIsTheDefaultPage();
        logger.info("Verify Learn Page Is The Default Page");
        homePage.clickOnTestTab();
        logger.info("Click on TestTab");
        homePage.TestPageIsTheDefaultPage();
        logger.info("Verify Test Page Is The Default Page");
    }



    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;

    }
}