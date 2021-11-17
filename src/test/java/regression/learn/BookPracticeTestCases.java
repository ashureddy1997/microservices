package regression.learn;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class BookPracticeTestCases extends TestBase {

    @Test(groups = {Categories.LearnREGRESSION,Categories.BETAREGRESSION}, description = "Verify on click on practice tile the user is directed to practice page " +
            "the user is directed to practice page")
    public void verifyNavigationToBookPractice(){
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
        //homePage.clickOnPracticeTab();
        logger.info("click On Book");
        homePage.clickOnBook(0);
        logger.info("click On PracticeTab");
        bookPage.clickOnChapterName(0);
        logger.info("Verify User is able to see Chapters of the Book displayed in the Page");
        bookPage.clickOnChapterName(1);
        logger.info("click On ChapterName");
        bookPage.clickOnChapterName(0);
        logger.info("click On ChapterName");
        logger.info("Verify User is able to navigate to different Chapters");
       // bookPracticePage.clickOnPractice();
      //  bookPracticePage.verifyAllElementsOnThePracticePage();


    }
}
