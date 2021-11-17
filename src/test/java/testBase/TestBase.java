package testBase;

import appiumSupport.AppiumBaseClass;
import appiumSupport.AppiumController;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import constant.OS;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pageObjects.achievePage.AchievePage;
import pageObjects.achievePage.AchievePageAndroid;
import pageObjects.achievePage.AchievePageIOS;
import pageObjects.addProfilePage.AddProfilePage;
import pageObjects.addProfilePage.AddProfilePageAndroid;
import pageObjects.addProfilePage.AddProfilePageIOS;
import pageObjects.bookPage.BookPage;
import pageObjects.bookPage.BookPageAndroid;
import pageObjects.bookPage.BookPageIOS;
import pageObjects.bookPracticePage.BookPracticePage;
import pageObjects.bookPracticePage.BookPracticePageAndroid;
import pageObjects.bookPracticePage.BookPracticePageIOS;
import pageObjects.chapterPage.ChapterPage;
import pageObjects.chapterPage.ChapterPageAndroid;
import pageObjects.chapterPage.ChapterPageIOS;
import pageObjects.examPage.ExamPage;
import pageObjects.examPage.ExamPageAndroid;
import pageObjects.examPage.ExamPagePageIOS;
import pageObjects.goalPage.GoalPage;
import pageObjects.goalPage.GoalPageAndroid;
import pageObjects.goalPage.GoalPageIOS;
import pageObjects.homePage.HomePage;
import pageObjects.homePage.HomePageAndroid;
import pageObjects.homePage.HomePageIOS;
import pageObjects.learnPage.LearnPage;
import pageObjects.learnPage.LearnPageAndroid;
import pageObjects.learnPage.LearnPageIOS;
import pageObjects.loginPage.LoginPageAndroid;
import pageObjects.loginPage.LoginPageIOS;
import pageObjects.loginPage.LogingPage;
import pageObjects.manageBooksPage.ManageBooksPage;
import pageObjects.manageBooksPage.ManageBooksPageAndroid;
import pageObjects.manageBooksPage.ManageBooksPageIOS;
import pageObjects.mbPage.MbPage;
import pageObjects.mbPage.MbPageAndroid;
import pageObjects.mbPage.MbPageIOS;
import pageObjects.morePage.MorePage;
import pageObjects.morePage.MorePageAndroid;
import pageObjects.morePage.MorePageIOS;
import pageObjects.myBookMarksPage.MyBookMarksPage;
import pageObjects.myBookMarksPage.MyBookMarksPageAndroid;
import pageObjects.myBookMarksPage.MyBookMarksPageIOS;
import pageObjects.onboardingPage.OnboardingPage;
import pageObjects.onboardingPage.OnboardingPageAndroid;
import pageObjects.onboardingPage.OnboardingPageIOS;
import pageObjects.otpPage.OTPPage;
import pageObjects.otpPage.OTPPageAndroid;
import pageObjects.otpPage.OTPPageIOS;
import pageObjects.practicePage.PracticePage;
import pageObjects.practicePage.PracticePageAndroid;
import pageObjects.practicePage.PracticePageIOS;
import pageObjects.practiceTakingPage.PracticeTakingPage;
import pageObjects.practiceTakingPage.PracticeTakingPageAndroid;
import pageObjects.practiceTakingPage.PracticeTakingPageIOS;
import pageObjects.searchPage.SearchPage;
import pageObjects.searchPage.SearchPageAndriod;
import pageObjects.searchPage.SearchPageIOS;
import pageObjects.signOutPage.SignOutPage;
import pageObjects.signOutPage.SignOutPageAndroid;
import pageObjects.signOutPage.SignOutPageIOS;
import pageObjects.signUpPage.SignUpPage;
import pageObjects.signUpPage.SignUpPageAndroid;
import pageObjects.signUpPage.SignUpPageIOS;
import pageObjects.startLearningPage.StartLearningPage;
import pageObjects.startLearningPage.StartLearningPageAndroid;
import pageObjects.startLearningPage.StartLearningPageIOS;
import pageObjects.takeATest.TakeATestPage;
import pageObjects.takeATest.TakeATestPageAndroid;
import pageObjects.takeATest.TakeATestPageIOS;
import pageObjects.takeTestPage.TakeTestPage;
import pageObjects.takeTestPage.TakeTestPageAndroid;
import pageObjects.takeTestPage.TakeTestPageIOS;
import pageObjects.testPage.TestPage;
import pageObjects.testPage.TestPageAndroid;
import pageObjects.testPage.TestPageIOS;
import pageObjects.testPaperSummaryPage.TestPaperSummaryPage;
import pageObjects.testPaperSummaryPage.TestPaperSummaryPageAndroid;
import pageObjects.testPaperSummaryPage.TestPaperSummaryPageIOS;
import pageObjects.testSummaryPage.TestSummaryPage;
import pageObjects.testSummaryPage.TestSummaryPageAndroid;
import pageObjects.testSummaryPage.TestSummaryPageIOS;
import pageObjects.StudentActivities.StudentActivitiesAndroid;
import pageObjects.StudentActivities.StudentActivitiesPage;
import pageObjects.StudentActivities.StudentActivitiesiOS;
import pageObjects.timelinePage.TimelinePage;
import pageObjects.timelinePage.TimelinePageAndroid;
import pageObjects.timelinePage.TimelinePageIOS;
import pageObjects.userHomePage.UserHomePage;
import pageObjects.userHomePage.UserHomePageAndroid;
import pageObjects.userHomePage.UserHomePageIOS;
import pageObjects.viewTestFeedBackPage.ViewTestFeedBackPage;
import pageObjects.viewTestFeedBackPage.ViewTestFeedBackPageAndroid;
import pageObjects.viewTestFeedBackPage.ViewTestFeedBackPageIOS;
import utils.Properties;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestBase extends AppiumBaseClass {
    //Extend Report
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

    //Pages

    protected LogingPage loginPage;
    protected SignUpPage signUpPage;
    protected PracticePage practicePage;
    protected AchievePage achievePage;
    protected AddProfilePage addProfilePage;
    protected BookPage bookPage;
    protected BookPracticePage bookPracticePage;
    protected ChapterPage chapterPage;
    protected ExamPage examPage;
    protected GoalPage goalPage;
    protected HomePage homePage;
    protected LearnPage learnPage;
    protected ManageBooksPage manageBooksPage;
    protected MorePage morePage;
    protected MyBookMarksPage myBookMarksPage;
    protected OnboardingPage onboardingPage;
    protected OTPPage otpPage;
    protected PracticeTakingPage practiceTakingPage;
    protected SignOutPage signOutPage;
    protected StartLearningPage startLearningPage;
    protected TestPage testPage;
    protected TestPaperSummaryPage testPaperSummaryPage;
    protected TestSummaryPage testSummaryPage;
    protected UserHomePage userHomePage;
    protected ViewTestFeedBackPage viewTestFeedBackPage;
    protected TakeATestPage takeATestPage;
    protected TakeTestPage takeTestPage;
    protected StudentActivitiesPage studentActivitiesPage;
    protected MbPage mbPage;
    protected SearchPage searchPage;
    protected TimelinePage timelinePage;


    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() throws Exception {

        createFolderExtendReport();
        htmlReporter = new ExtentHtmlReporter(
                System.getProperty("user.dir") + "/ExtendReport/" + "TestReport" + ".html");
        htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");

        extent = new ExtentReports();

        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host name", "QA");
        extent.setSystemInfo("Environment", System.getProperty("env"));
        extent.setSystemInfo("GroupName", System.getProperty("groups"));

        htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
        htmlReporter.config().setReportName("Automation suite for Student App "+System.getProperty("os")); // name of the report
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); // location of the chart
        htmlReporter.config().setTheme(Theme.STANDARD);

    }
    public void createFolderExtendReport() {
        try {
            File file = new File(System.getProperty("user.dir") + "/" + "ExtendReport");
            file.mkdir();
            boolean flag = file.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @BeforeMethod(alwaysRun = true)
    public void initialiseDriver(ITestResult result, Method methodName) throws Exception {
        AppiumController.instance.start();
        //Extend Report
        logger = extent.createTest(methodName.getName()); // create new entry in the report
        switch (Properties.os) {
            case OS.Android:
            case OS.AndroidP:
                loginPage=new LoginPageAndroid(driver());
                signUpPage=new SignUpPageAndroid(driver());
                practicePage=new PracticePageAndroid(driver());
                achievePage=new AchievePageAndroid(driver());
                addProfilePage=new AddProfilePageAndroid(driver());
                bookPage  =new BookPageAndroid(driver());
                bookPracticePage=new BookPracticePageAndroid(driver());
                chapterPage=new ChapterPageAndroid(driver());
                examPage=new ExamPageAndroid(driver());
                goalPage=new GoalPageAndroid(driver());
                homePage=new HomePageAndroid(driver());
                learnPage=new LearnPageAndroid(driver());
                manageBooksPage=new ManageBooksPageAndroid(driver());
                morePage=new MorePageAndroid(driver());
                myBookMarksPage=new MyBookMarksPageAndroid(driver());
                onboardingPage=new OnboardingPageAndroid(driver());
                otpPage=new OTPPageAndroid(driver());
                practiceTakingPage=new PracticeTakingPageAndroid(driver());
                signOutPage=new SignOutPageAndroid(driver());
                startLearningPage=new StartLearningPageAndroid(driver());
                takeTestPage=new TakeTestPageAndroid(driver());
                testPage=new TestPageAndroid(driver());
                testPaperSummaryPage=new TestPaperSummaryPageAndroid(driver());
                testSummaryPage=new TestSummaryPageAndroid(driver());
                userHomePage=new UserHomePageAndroid(driver());
                viewTestFeedBackPage=new ViewTestFeedBackPageAndroid(driver());
                takeATestPage=new TakeATestPageAndroid(driver());
                studentActivitiesPage =new StudentActivitiesAndroid(driver());
                mbPage=new MbPageAndroid(driver()) ;
                searchPage=new SearchPageAndriod(driver());
                timelinePage =new TimelinePageAndroid(driver());

                break;
            case OS.Ios:
            case OS.IosP:
                loginPage=new LoginPageIOS(driver());
                signUpPage=new SignUpPageIOS(driver());
                practicePage=new PracticePageIOS(driver());
                achievePage=new AchievePageIOS(driver());
                addProfilePage=new AddProfilePageIOS(driver());
                bookPage =new BookPageIOS(driver());
                bookPracticePage=new BookPracticePageIOS(driver());
                chapterPage=new ChapterPageIOS(driver());
                examPage=new ExamPagePageIOS(driver());
                goalPage=new GoalPageIOS(driver());
                homePage=new HomePageIOS(driver());
                learnPage=new LearnPageIOS(driver());
                manageBooksPage=new ManageBooksPageIOS(driver());
                morePage=new MorePageIOS(driver());
                myBookMarksPage=new MyBookMarksPageIOS(driver());
                onboardingPage=new OnboardingPageIOS(driver());
                otpPage=new OTPPageIOS(driver());
                practiceTakingPage=new PracticeTakingPageIOS(driver());
                signOutPage=new SignOutPageIOS(driver());
                startLearningPage=new StartLearningPageIOS(driver());
                takeTestPage=new TakeTestPageIOS(driver());
                testPage=new TestPageIOS(driver());
                testPaperSummaryPage=new TestPaperSummaryPageIOS(driver());
                testSummaryPage=new TestSummaryPageIOS(driver());
                userHomePage=new UserHomePageIOS(driver());
                viewTestFeedBackPage=new ViewTestFeedBackPageIOS(driver());
                takeATestPage=new TakeATestPageIOS(driver());
                studentActivitiesPage =new StudentActivitiesiOS(driver());

                mbPage=new MbPageIOS(driver()) ;
                searchPage=new SearchPageIOS(driver());
                timelinePage =new TimelinePageIOS(driver());

                break;

        }
    }

    @AfterMethod(alwaysRun = true)
    public void captureScreen(ITestResult result, Method methodname) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot ts = driver();
            File source = ts.getScreenshotAs(OutputType.FILE); // capture screenshot file
            String targetpath = "./ExtendReport/" + result.getName() + ".png";
            FileUtils.copyFile(source, new File(targetpath));
            System.out.println("screenshot captured");
            logger.log(Status.FAIL, MarkupHelper.createLabel(methodname.getName(), ExtentColor.RED));
            logger.fail(result.getThrowable().getMessage());
            try {
                logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath("." + targetpath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            logger.log(Status.PASS, MarkupHelper.createLabel(methodname.getName(), ExtentColor.GREEN));
        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.log(Status.SKIP, MarkupHelper.createLabel(methodname.getName(), ExtentColor.ORANGE));
        }


        AppiumController.instance.stop();

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        extent.flush();
    }
}
