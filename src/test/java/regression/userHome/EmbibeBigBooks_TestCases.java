package regression.userHome;


import org.testng.annotations.Test;
import testBase.TestBase;
import utils.Categories;
import utils.Properties;

public class EmbibeBigBooks_TestCases extends TestBase {

    @Test(groups = {Categories.BETA_SANITY,Categories.UserHomeREGRESSION,Categories.BETAREGRESSION,Categories.UserHomeAndTestBeta}, description = "Verify All The Elements Of Embibe Big Books In User Home Page")
    public void verifyAllTheElementsOfEmbibeBigBooksInUserHomePage() throws InterruptedException {
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

        userHomePage.verifyAllTheElementsOfTheEmbibeBigBooks();
        logger.info("verifyAllTheElementsOfTheEmbibeBigBooks");

        //Verify that user is able to open any book under this Embibe Big Book carousel
        userHomePage.clickOnTheEmbibeBigBooksTile();
        logger.info("clickOnTheEmbibeBigBooksTile");

        //verify all the elements of embibe big book details screen
        userHomePage.verifyElementsOnEmbibeBigBookDetailsScreen();
        logger.info("verifyElementsOnEmbibeBigBookDetailsScreen");

        //verifyNavigation back to userhome from embibebigbook screen
       // userHomePage.clickOnBackButtonInEmbibeBigBook();
        driver().navigate().back();
        logger.info("clickOnBackButtonInEmbibeBigBook");

        //verify navigation is successfull to userhome
        userHomePage.verifyElementsOfHeroBanner();
        logger.info("verifyElementsOfHeroBanner");


    }

}
