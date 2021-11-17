package regression.userHome;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class RevisionList_TestCases extends TestBase {

    @Test(groups = { Categories.Descoped}, description = "Verify if user can view and open revision lists in user home")
    public void VerifyIfUserCanViewAndOpenRevisionlistInUserHome() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");

        //verify all the elements of revision lists
        userHomePage.verifyAllTheElementsOfRevisionLists();
        logger.info("verifyAllTheElementsOfRevisionLists");

        //verify if user can open Topics to revise revision lists
        userHomePage.clickOnTopicsToRevise();
        logger.info("clickOnTopicsToRevise");

      /*  //verify all the elements of Topics to revise
        userHomePage.verifyAllTheElementsOfTopicsToRevise();
        logger.info("verifyAllTheElementsOfTopicsToRevise");
        userHomePage.verifyShowingAllTopics();
        logger.info("verifyShowingAllTopics");

        //verify if user can open Questions to revise revision lists
        userHomePage.clickOnQuestionsToRevise();
        logger.info("clickOnQuestionsToRevise");

        //verify all the elements of Questions to revise
        userHomePage.verifyAllTheElementsOfQuestionsToRevise();
        logger.info("verifyAllTheElementsOfQuestionsToRevise");
        userHomePage.verifyShowingAllChapters();
        logger.info("verifyShowingAllChapters");*/
    }
    @Test(groups = { Categories.Descoped}, description = "Verify that user is directed to the User Home Page on clicking on Home icon from revision list")
    public void verifyThatUserIsDirectedToTheUserHomePageOnClickingOnHomeIconFromRevisionList() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");
        userHomePage.clickOnMyHomeTile();
        logger.info("clickOnMyHomeTile");
    }
    @Test(groups = { Categories.Descoped}, description = "1 verify if user can expand chapter in from showing all chapter.")
    public void verifyIfUserCanExpandChapterInFromShowingAllChapter() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");
        userHomePage.expandChapters();
        logger.info("expandChapters");

        //2 verify if user can collapse chapter in from showing all chapter.
        userHomePage.collapseChapters();
        logger.info("collapseChapters");
    }
    @Test(groups = {Categories.Descoped}, description = "verify if user can click on practice and continue to do practice")
    public void verifyAllTheElementsOfPracticeAttemptedInRevisionList() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");
        userHomePage.expandChapters();
        logger.info("expandChapters");

        //3 verify if user can see practice attempted, verify all elements
        userHomePage.verifyAllElementsOfPracticeAttempted();
        logger.info("verifyAllElementsOfPracticeAttempted");

        //4 verify if user can click on practice and continue to do practice
        userHomePage.clickOnPracticeButton();
        logger.info("clickOnPracticeButton");
    }
    @Test(groups = {Categories.Descoped}, description = "verify if user can click on the chapter tile and navigate to view list of questions")
    public void verifyIfUserCanClickOnTheChapterTileNndNavigateToViewListOfQuestions(){
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");
        userHomePage.expandChapters();
        logger.info("expandChapters");

        //5 verify if user can click on the chapter tile and navigate to view list of questions
        userHomePage.clickOnPracticeAttempted_tile();
        logger.info("clickOnPracticeAttempted_tile");

        //6 verify all the elements in Questions list Attempted
        userHomePage.verifyAllTheElementsInQuestionsListAttempted();
        logger.info("verifyAllTheElementsInQuestionsListAttempted");
        userHomePage.verifyShowingAllQuestions();
        logger.info("verifyShowingAllQuestions");

    }
    @Test(groups = {Categories.Descoped}, description = "Verify if user can filter Questions to Revise by applying different filter parameters ")
    public void verifyIfUserCanFilterQuestionsToRevise() throws InterruptedException {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");
        userHomePage.clickOnFilterSubjectsUnitsAndChapters();
        logger.info("clickOnFilterSubjectsUnitsAndChapters");

        //verifyAllElementsOnFilterScreen
        userHomePage.verifyAllElementsOnFilterScreen();
        logger.info("verifyAllElementsOnFilterScreen");

        //Verify that when user selects Questions to Revise,"Subject name" drop down list is present covering all subjects
        userHomePage.clickOnAllSubject();
        logger.info("clickOnAllSubject");

        //verifyAllElementsOnSelectSubjectList
        userHomePage.verifyAllElementsOnSelectSubjectList();
        logger.info("verifyAllElementsOnSelectSubjectList");

        userHomePage.selectASubject();
        logger.info("selectASubject");
        userHomePage.clickOnDone();
        logger.info("clickOnDone");

        //Verify that when user selects Questions to Revise,"units" drop down list is present covering all units
        userHomePage.clickOnAllUnits();
        logger.info("clickOnAllUnits");
        //verifyAllElementsOnSelectUnitScreen
        userHomePage.verifyAllElementsOnSelectUnitScreen();
        logger.info("verifyAllElementsOnSelectUnitScreen");
        userHomePage.selectAUnit();
        logger.info("selectAUnit");
        userHomePage.clickOnDone();
        logger.info("clickOnDone");

        //Verify that when user selects Questions to Revise,"Chapters" drop down list is present covering all Chapters
        userHomePage.clickOnAllChapter();
        logger.info("clickOnAllChapter");

        //verifyAllElementsOnSelectChapterScreen
        userHomePage.verifyAllElementsOnSelectChapterScreen();
        logger.info("verifyAllElementsOnSelectChapterScreen");
        userHomePage.selectChapter();
        logger.info("selectChapter");
        userHomePage.clickOnDone();
        logger.info("clickOnDone");
        userHomePage.clickOnDone();
        logger.info("clickOnDone");

        //Verify if user can clear the filters applied
        userHomePage.clickOnFilterSubjectsUnitsAndChapters();
        logger.info("clickOnFilterSubjectsUnitsAndChapters");
        userHomePage.clickOnCrossButton();
        logger.info("clickOnCrossButton");
    }

    @Test(groups = {Categories.Descoped}, description = "Verify if user can filter Topics to Revise by applying different filter parameters ")
    public void verifyIfUserCanFilterTopicsToRevise()   {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");
        userHomePage.clickOnTopicsToRevise();
        logger.info("clickOnTopicsToRevise");
        userHomePage.clickOnFilterSubjectsUnitsAndChapters();
        logger.info("clickOnFilterSubjectsUnitsAndChapters");

        //verifyAllElementsOnFilterScreen
        userHomePage.verifyAllElementsOnFilterScreen();
        logger.info("verifyAllElementsOnFilterScreen");

        //Verify that when user selects Topics to Revise,"Subject name" drop down list is present covering all subjects
        userHomePage.clickOnAllSubject();
        logger.info("clickOnAllSubject");

        //verifyAllElementsOnSelectSubjectList
        userHomePage.verifyAllElementsOnSelectSubjectList();
        logger.info("verifyAllElementsOnSelectSubjectList");

        userHomePage.selectASubject();
        logger.info("selectASubject");
        userHomePage.clickOnDone();
        logger.info("clickOnDone");

        //Verify that when user selects Topics to Revise,"units" drop down list is present covering all units
        userHomePage.clickOnAllUnits();
        logger.info("clickOnAllUnits");
        //verifyAllElementsOnSelectUnitScreen
        userHomePage.verifyAllElementsOnSelectUnitScreen();
        logger.info("verifyAllElementsOnSelectUnitScreen");
        userHomePage.selectAUnit();
        logger.info("selectAUnit");
        userHomePage.clickOnDone();
        logger.info("clickOnDone");

        //Verify that when user selects Topics to Revise,"Chapters" drop down list is present covering all Chapters
        userHomePage.clickOnAllChapter();
        logger.info("clickOnAllChapter");

        //verifyAllElementsOnSelectChapterScreen
        userHomePage.verifyAllElementsOnSelectChapterScreen();
        logger.info("verifyAllElementsOnSelectChapterScreen");
        userHomePage.selectChapter();
        logger.info("selectChapter");
        userHomePage.clickOnDone();
        logger.info("clickOnDone");
        userHomePage.clickOnDone();
        logger.info("clickOnDone");

        //Verify if user can clear the filters applied
        userHomePage.clickOnFilterSubjectsUnitsAndChapters();
        logger.info("clickOnFilterSubjectsUnitsAndChapters");
        userHomePage.clickOnCrossButton();
        logger.info("clickOnCrossButton");
    }
    @Test(groups = {Categories.Descoped}, description = "1 verify if user can expand topics in from showing all topics.")
    public void verifyIfUserCanExpandTopicsInFromShowingAllTopics() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");
        userHomePage.clickOnTopicsToRevise();
        logger.info("clickOnTopicsToRevise");

        takeTestPage.clickOnSubmitTestButton();
        logger.info("clickOnSubmitTestButton");
        userHomePage.expandTopics();
        logger.info("expandTopics");

        //2 verify if user can collapse topics in from showing all topics.
        userHomePage.collapseTopics();
        logger.info("collapseTopics");
    }

    @Test(groups = {Categories.Descoped}, description = "verify if user can click on learn and continue to do learning")
    public void verifyAllTheElementsOfTopicsAttempted() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("verifyAllTheElementsInTopicDetails");
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");
        userHomePage.expandChapters();
        logger.info("expandChapters");

        //3 verify if user can see topics attempted, verify all elements
        userHomePage.verifyAllElementsOfTopicsAttempted();
        logger.info("verifyAllElementsOfTopicsAttempted");

        //4 verify if user can click on learn and continue to do learning
        userHomePage.clickOnLearnButton();
        logger.info("clickOnLearnButton");
    }

    @Test(groups = {Categories.Descoped}, description = "verify if user can click on the topic tile and navigate to view list of videos for topic")
    public void verifyIfUserCanClickOnTheTopicTileNndNavigateToViewListOfVideosForTopic() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        loginPage.loginAs(Properties.username, Properties.password);
        loginPage.waitForTitle_WhoLearning();
        homePage.verifyTitleOnHomeScreen(loginPage.clickOnProfile(0) + " ");
        logger.info("verifyTitleOnHomeScreen");
        homePage.clickOnHomeTab();
        userHomePage.clickOnRevisionList();
        logger.info("clickOnRevisionList");
        userHomePage.clickOnTopicsToRevise();
        logger.info("clickOnTopicsToRevise");

        userHomePage.expandTopics();
        logger.info("expandTopics");

        //5 verify if user can click on the topic tile and navigate to view list of videos for topic
        userHomePage.clickOnTopicTile();
        logger.info("clickOnTopicTile");

        //6 verify all the elements in topic details
        userHomePage.verifyAllTheElementsInTopicDetails();
        logger.info("verifyAllTheElementsInTopicDetails");
    }

    @Test(groups = { Categories.Descoped}, description = "Verify that user is directed to the My Home  on clicking on Home icon")
    public void VerifyThatUserIsDirectedToTheMyHome() {
        logger.info("verify all the Tab Display Learn, Practice, Test, Achieve and More");
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
        logger.info("Verify that user is directed to the My Home  on clicking on Home icon");
        homePage.clickOnHomeTab();
        userHomePage.VerifyMyHome();
        logger.info("Verify My Home Tile is present");
        userHomePage.clickOnWatchButton();
        logger.info("Watch button is present and functional");

    }
}

