package regression.userHome;

import api.SignUpAPI;

import com.amazonaws.services.simpleworkflow.flow.core.TryCatch;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.ExcelUtilities;
import utils.Properties;

public class MyFavouriteBooks_TestCases extends TestBase {

    SignUpAPI signUpAPI = null;
    ExcelUtilities excelUtilities = new ExcelUtilities();
    String userDir = System.getProperty("user.dir");

    @Test(priority=1,groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify All The Elelments Of My Favourite Books In UserHome Page")
    public void verifyAllTheElementsOfMyFavouriteBooksInUserHomePage() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username, Properties.password);
        logger.info("loginAs username and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnHomeTab();
        userHomePage.verifyElementsOfFavouriteBooks();
        logger.info("verifyElementsOfFavouriteBooks");

    }
    @Test(priority=2,groups = {Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify All The Elements Of Manage Books")
    public void VerifyAllTheElementsOfManageBooks() {
        logger.info("launch the app");
        logger.info("login with username:- " + Properties.username + " , password:-" + Properties.password);
        logger.info("Login with username and password " + Properties.username + " , " + Properties.password);
        loginPage.navigationToSignInScreen();
        logger.info("Click on SignInButton");
        loginPage.clickOnSignInWithPassword();
        logger.info("clickOnSignInWithPassword");
        loginPage.loginAs(Properties.username, Properties.password);
        logger.info("loginAs username and password");
        loginPage.waitForTitle_WhoLearning();
        logger.info("waitForTitle_WhoLearning");
        loginPage.clickOnProfile(0);
        logger.info("clickOnProfile");
        homePage.clickOnHomeTab();
        userHomePage.clickOnManageBooks();
        logger.info("clickOnManageBooks");
        manageBooksPage.verifyElementsOnManageBooksScreen();
        logger.info("verifyElementsOnManageBooksScreen");
    }
    @Test(priority=3,groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify If User Can Add Books From Manage Books")
    public void VerifyIfUserCanAddBooksFromManageBooks() {
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
        userHomePage.clickOnManageBooks();
        logger.info("clickOnManageBooks");
        manageBooksPage.selectBooks();
        logger.info("selectBooks");
        manageBooksPage.clickOnDoneButton();
        logger.info("clickOnDoneButton");
        userHomePage.verifyBookIsAddedToMyFavouriteBooksList();
        logger.info("verifyBookIsAddedToMyFavouriteBooksList");
/*
       // verifyUserCanClickOnAParticularBookFromFavouriteBooksAndNaviagteToViewDetails
        userHomePage.viewAFavouriteBook();
        logger.info("viewAFavouriteBook");

        //verifyAllElementsPresentInFavouriteBookDetailsScreen
        userHomePage.verifyAllElementsPresentInFavouriteBookDetailsScreen();
        logger.info("verifyAllElementsPresentInFavouriteBookDetailsScreen");

        //verifyAllChaptersDisplayed
        userHomePage.verifyAllChaptersDisplayed();
        logger.info("verifyAllChaptersDisplayed");*/
    }

    @Test(groups = {Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta}, description = "verify that user can view favourite book details")
    public void verifyThatUserCanViewFavouriteBookDetails() {
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

        try {
            // verifyUserCanClickOnAParticularBookFromFavouriteBooksAndNaviagteToViewDetails
            userHomePage.viewAFavouriteBook();
            logger.info("viewAFavouriteBook");

            //verify that "Book Added" Tag is displayed for favourite books.
            userHomePage.verifyBookAddedTag();
            logger.info("verifyBookAddedTag");
            //verifyAllElementsPresentInFavouriteBookDetailsScreen
            userHomePage.verifyAllElementsPresentInFavouriteBookDetailsScreen();
            logger.info("verifyAllElementsPresentInFavouriteBookDetailsScreen");

            //verifyAllChaptersDisplayed
            userHomePage.verifyAllChaptersDisplayed();
            logger.info("verifyAllChaptersDisplayed");

        }catch (Exception e) {
            System.out.println("No books added yet!!");
            driver().navigate().back();
            userHomePage.clickOnManageBooks();
            logger.info("clickOnManageBooks");
            manageBooksPage.selectBooks();
            logger.info("selectBooks");
            manageBooksPage.clickOnDoneButton();
            logger.info("clickOnDoneButton");
            userHomePage.verifyBookIsAddedToMyFavouriteBooksList();
            logger.info("verifyBookIsAddedToMyFavouriteBooksList");

            // verifyUserCanClickOnAParticularBookFromFavouriteBooksAndNaviagteToViewDetails
            userHomePage.viewAFavouriteBook();
            logger.info("viewAFavouriteBook");

            //verifyAllElementsPresentInFavouriteBookDetailsScreen
            userHomePage.verifyAllElementsPresentInFavouriteBookDetailsScreen();
            logger.info("verifyAllElementsPresentInFavouriteBookDetailsScreen");

            //verify that "Book Added" Tag is displayed for favourite books.
            userHomePage.verifyBookAddedTag();
            logger.info("verifyBookAddedTag");

            //verify that user can see list of chapters displayed for favourite book
            userHomePage.verifyAllChaptersDisplayed();
            logger.info("verifyAllChaptersDisplayed");

            userHomePage.clickOnChapter();
            logger.info("clickOnChapter");

            //verify that user can see list of topics displayed for favourite book
            userHomePage.verifyAllTopicsDisplayed();
            logger.info("verifyAllTopicsDisplayed");

        }
    }
    @Test(groups = {Categories.BETA_SANITY,Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify that usercan remove books by clicking on Manage Books tile")
    public void VerifyThatUserCanRemoveBooksByClickingOnManageBooksTile(){
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
        userHomePage.clickOnManageBooks();
        logger.info("clickOnManageBooks");
        manageBooksPage.removeBooks();
        logger.info("removeBooks");
    }

    @Test(priority=5,groups = {Categories.BETAREGRESSION,Categories.UserHomeREGRESSION,Categories. UserHomeAndTestBeta}, description = "Verify the number of Book selected count is corrector not")
    public void VerifyTheNumberOfBookSelectedCountIsCorrectOrNot() {
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
        userHomePage.clickOnManageBooks();
        logger.info("clickOnManageBooks");
         manageBooksPage.verifySelectedBookCounts();
        logger.info("verifySelectedBookCounts");
    }
    @DataProvider(name = "GoalAndExam")
    public Object[][] getGoalAndExam() {
        Object[][] data = excelUtilities.getDataFromExcel("Regression", userDir + "/GoalAndExam.xlsx");
        return data;
    }
}
