package pageObjects.viewTestFeedBackPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.util.List;

public class ViewTestFeedBackPageIOS extends BasePage implements ViewTestFeedBackPage{
    SoftAssert softAssert=null;
    public ViewTestFeedBackPageIOS(AppiumDriver driver) {
        softAssert=new SoftAssert();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Marks and Overall Performance')]")
    private WebElement MarksAndOverallPerformance;

    @FindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeButton[2]")
    private WebElement scoreCard;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Score\"]")
    private WebElement scoreText;

    @FindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    private WebElement scoreNumber;

    @FindBys( @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+\"][1]"))
    private List<WebElement> score_plusIcon;


    @FindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeButton[2]")
    private WebElement yourTopSkill;

    @FindBy(id = "txt_replay")
    private WebElement Click_to_watch_your_action;

    @FindBy(id = "iv_play_btn")
    private WebElement PlayButton;

    @FindBy(className = "android.widget.LinearLayout")
    private WebElement EarnCoins;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Question Analysis\"]")
    private WebElement question_wise;

    @FindBy(id = "tv_top_skill_too_fast")
    private WebElement tv_top_skill_too_fast;

    @FindBy(id = "tv_incorrect")
    private WebElement tv_incorrect;

    @FindBy(id = "tv_unattempted")
    private WebElement tv_unattempted;

    @FindBy(id = "iv_plus_4")
    private WebElement question_PlusIcon;

    @FindBy(id = "tv_sphere_1_left")
    private WebElement YourCurrentScoreInCurrentGoal;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"BASED ON AMBIE© PREDICTION\"]")
    private WebElement PredictedImprovement;

    @FindBy(id = "tv_sphere_1_right")
    private WebElement tv_sphere_1_right;

    @FindBy(id = "tv_continue_learning")
    private WebElement tv_continue_learning;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Average Time Spent\"]")
    private WebElement tv_avg_time_taken;

    @FindBy(id = "tv_avg_time")
    private WebElement tv_avg_time;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'POSITIVE behaviours')]")
    private WebElement tv_sincerity_score_positive;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'NEGATIVE behaviours')]")
    private WebElement tv_sincerity_score_negative;

    @FindBy(id = "tv_neg_behaviour_num")
    private WebElement tv_neg_behaviour_num;

    @FindBy(id = "tv_strength_analysis")
    private WebElement tv_strength_analysis;

    @FindBy(id = "tv_chapters_strength")
    private WebElement tv_chapters_strength;

    @FindBy(id = "tv_weakness_analysis")
    private WebElement tv_weakness_analysis;

    @FindBy(id = "tv_chapters_weak")
    private WebElement tv_chapters_weak;

    @FindBy(id = "tv_positive_behavior")
    private WebElement tv_positive_behavior;

    @FindBy(id = "tv_how_do_i_achieve")
    private WebElement How_do_I_Achieve_a_higher_score;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your current score\"]")
    private WebElement yourCurrentScoreCard;

    @FindBy(xpath = "//android.widget.TextView[@text='Get Your Revision Lists']")
    private WebElement GetYourRevisionLists;

    @FindBy(id = "iv_plus_minus")
    private WebElement plus;

    @FindBy(xpath = "//android.widget.TextView[@text='Improve Your \n" +
            "Test Taking Strategy']")
    private WebElement ImproveYourTestTakingStrategy;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"backButtonShadow\"]\n")
    private WebElement backFromScoreDetails;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Correctly Answered\"]")
    private WebElement correctlyAnsweredLL;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Score\"]")
    private WebElement scoreTitle;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Score\"]")
    private WebElement scores;

    @FindBy(id = "tv_correct_question_no_score")
    private WebElement correct_questions;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Questions')]")
    private WebElement questionsCounts;

    @FindBy(id = "progress_bar_good_score")
    private WebElement score_bars;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Test Analysis\"]")
    private WebElement TestAnalysis;

    @FindBy(className = "android.widget.LinearLayout")
    private WebElement backFromYourTopSkill;

    @FindBy(id = "tv_title")
    private WebElement YourTopSkills_title;

    @FindBy(id = "iv_back")
    private WebElement Back_From_Your_top_skill;

    @FindBy(id = "textView2")
    private WebElement Your_top_skill;

    @FindBys({@FindBy(className = "android.view.ViewGroup")})
    private List<WebElement> Skill_wise_accuracy_Graph;

    @FindBy(id = "rv_top_skill")
    private WebElement skill_wise_accuracy_Graph_banner;

    @FindBy(id = "txt_skill_wise_accuracy")
    private WebElement skill_wise_accuracy;

    @FindBy(id = "linearLayout2")
    private WebElement Correctly_answered;

    @FindBy(className = "android.widget.LinearLayout")
    private WebElement backFromQuestionWiseAnalysisWithSolutions;

    @FindBys({@FindBy(className = "android.view.ViewGroup")})
    private List<WebElement> QuestionWiseList;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Perfect Attempts')]")
    private WebElement PerfectAttempts;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Overtime Correct Attempts')]")
    private WebElement btn_overtime_correct;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Too fast correct Attempts')]")
    private WebElement btn_too_fast_correct;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Incorrect Attempts')]")
    private WebElement btn_incorrect_attempts;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Overtime Incorrect Attempts')]")
    private WebElement btn_overtime_incorrect;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Wasted Attempts')]")
    private WebElement btn_wasted_attempts;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Unattempted')]")
    private WebElement btn_unattempted;

    @FindBy(id = "layout_jars")
    private WebElement layout_jars;

    @FindBy(id = "rv_child_revision_list")
    private WebElement ChaptersYouDidNotAttempt;

    @FindBy(id = "rv_child_revision_list")
    private WebElement ChaptersYouGotWrong;

    @FindBys({@FindBy(className = "android.view.ViewGroup")})
    private List<WebElement> ListOfChaptersYouDidNotAttempt;

    @FindBys({@FindBy(id = "tv_text")})
    private List<WebElement> ListOfChaptersName_YouDidNotAttempt;

    @FindBy(id = "txt_header")
    private WebElement chapter_title;

    @FindBy(id = "tv_header")
    private WebElement chapter_Header;

    @FindBys({@FindBy(id = "cl_topic_layout")})
    private List<WebElement> ListOfTopics_YouDidNotAttempt;

    @FindBys({@FindBy(id = "tv_first_header")})
    private List<WebElement> ListOfTopicsName_YouDidNotAttempt;

    @FindBys({@FindBy(id = "tv_second_text")})
    private List<WebElement> ListOfYourAccuracy_YouDidNotAttempt;

    @FindBys({@FindBy(id = "tv_description")})
    private List<WebElement> ListOf_ConceptMastery_YouDidNotAttempt;

    @FindBys({@FindBy(id = "tv_description")})
    private List<WebElement> ListOf_ConceptMastery_YouGotWrong;

    @FindBy(xpath = "//android.widget.TextView[@text='Understand My Negative Behaviour']")
    private WebElement UnderstandMyNegativeBehaviour;

    @FindBy(id = "tv_title")
    private WebElement UnderstandMyNegativeBehaviours_tile;

    @FindBy(id = "iv_back")
    private WebElement UnderstandMyNegativeBehaviours_NavigateBack;

    @FindBys({@FindBy(id = "iv_main_bg")})
    private List<WebElement> ListOfSincerityScore;

    @FindBys({@FindBy(id = "iv_bg")})
    private List<WebElement> ListOfImg;

    @FindBys({@FindBy(id = "iv_play_btn")})
    private List<WebElement> ListOfPlayButton;

    @FindBys({@FindBy(id = "tv_first_header")})
    private List<WebElement> ListOfScoreCardHeader;

    @FindBys({@FindBy(id = "tv_second_text")})
    private List<WebElement> tv_second_text;

    @FindBys({@FindBy(id = "tv_description")})
    private List<WebElement> ScoreCardDescription;

    @FindBy(id = "tv_msg2")
    private WebElement Do_you_really_want_to_quit_learning;

    @FindBy(id = "btn_continue_learning")
    private WebElement continueLearningBtn;

    @FindBy(id = "btn_quit")
    private WebElement  quit;

    @FindBy(id = "tv_showing_wasted")
    private WebElement ShowingPercentageOvertimeCorrectAttemptsForAllSubjects;

    @FindBy(id = "iv_play_button")
    private WebElement playButton;

    @FindBy(id = "tv_wasted_attempts_txt")
    private WebElement Click_to_understand;

    @FindBy(id = "card_view_scatter")
    private WebElement Chapter_wise_analysis_with_conceptual_weaknesses;

    @FindBy(id = "ll_filter_difficulty_lvl")
    private WebElement DifficultyLevel;

    @FindBys({@FindBy(id = "layout_jar_attempt_quality")})
    private List<WebElement> overtimeCorrect;

    @FindBy(xpath = "//android.widget.TextView[@text='Too Fast Correct Attempts']")
    private WebElement TooFastCorrectAttempts;

    @FindBy(xpath = "//android.widget.TextView[@text='Perfect Attempts']")
    private WebElement PerfectAttempts1;

    @FindBy(xpath = "//android.widget.TextView[@text='Overtime Correct Attempts']")
    private WebElement OvertimeCorrectAttempts;

    @FindBy(xpath = "//android.widget.TextView[@text='Wasted Attempts']")
    private WebElement WastedAttempts;

    @FindBy(xpath = "//android.widget.TextView[@text='Incorrect Attempts']")
    private WebElement IncorrectAttempts;

    @FindBy(xpath = "//android.widget.TextView[@text='Overtime Incorrect Attempts']")
    private WebElement OvertimeIncorrectAttempts;

    @FindBy(xpath = "//android.widget.TextView[@text='Unattempted']")
    private WebElement Unattempted;

    @FindBy(id = "iv_back")
    private WebElement NavBackFrom_AttemptTypeDetails;

    @FindBy(id = "tv_title")
    private WebElement title_AttemptTypeDetails;

    @FindBy(id = "iv_wasted_attempts_bg")
    private WebElement img_ShowingPercentageIncorrectAttemptsForAllSubjects_AttemptTypeDetails;

    @FindBy(id = "tv_showing_wasted")
    private WebElement text_ShowingPercentageIncorrectAttemptsForAllSubjects_AttemptTypeDetails;

    @FindBy(id = "scatterChart")
    private WebElement AttemptGraphshowingUnattemptedGraph;

    @FindBy(id = "attempt_graph_TV")
    private WebElement AttemptGraphshowingUnattempted;

    @FindBy(className = "android.view.ViewGroup")
    private WebElement img_ChapterWiseAnalysisWithConceptualWeaknesses_AttemptTypeDetails;

    @FindBy(className = "android.widget.TextView")
    private WebElement text_ChapterWiseAnalysisWithConceptualWeaknesses_AttemptTypeDetails;

    @FindBy(id = "tv_click_showing_wasted")
    private WebElement ClickToUnderstandUnattempted;

    @FindBy(id = "attempt_graph_TV")
    private WebElement AttemptGraphShowingUnattempted;

    @FindBy(id = "iv_badge")
    private WebElement badge_IncorrectAttempts_AttemptTypeDetails;

    @FindBy(id = "tv_filter_difficulty_lvl")
    private WebElement text_IncorrectAttempts_AttemptTypeDetails;

    @FindBy(id = "iv_drop_down")
    private WebElement drop_down_AttemptTypeDetails;

    @FindBy(id = "fl_lottie")
    private WebElement lottie_jar_AttemptTypeDetails;

    @FindBy(id = "ll_aq_jar")
    private WebElement text_AttemptQuality_AttemptTypeDetails;

    @FindBy(id = "iv_back")
    private WebElement Back_Feedback;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Marks and Overall Performance')]")
    private WebElement title_Feedback;

    public void verifyTestNameAppearCorrectlyInFeedbackScreen(String TestName){
        waitForElementToBeVisible(title_Feedback);
        System.out.println(title_Feedback.getText()+ " " + TestName);
        Assert.assertEquals(title_Feedback.getText().toUpperCase().contains(TestName),true,"not");

    }

    public void verifyGradeIsAppearCorrectlyInFeedbackScreen(String GradeName){
        waitForElementToBeVisible(title_Feedback);
        System.out.println(title_Feedback.getText()+ " " + GradeName);
        Assert.assertEquals(title_Feedback.getText().toUpperCase().contains(GradeName),true,"not");

    }
    public void verifyElementsOnFeedbackScreen(){
        waitForElementToBeVisible(MarksAndOverallPerformance);
        softAssert.assertEquals(title_Feedback.isEnabled(),true,"title_Feedback is not visible");
        softAssert.assertEquals(scoreCard.isEnabled(),true,"score card is not visible");
        softAssert.assertEquals(scoreText.isEnabled(),true,"score text is not visible");
        softAssert.assertEquals(yourTopSkill.isEnabled(),true,"Your top skill is not displayed");
        softAssert.assertEquals(yourCurrentScoreCard.isEnabled(),true,"Your current score not displayed");
        softAssert.assertEquals(PredictedImprovement.isEnabled(),true,"PredictedImprovement is not displayed");
      //  softAssert.assertEquals(tv_sphere_1_right.isEnabled(),true,"tv_sphere_1_right is not displayed");
       // softAssert.assertEquals(tv_continue_learning.isEnabled(),true,"tv_continue_learning is not displayed");
        softAssert.assertEquals(tv_avg_time_taken.isEnabled(),true,"tv_avg_time_taken is not displayed");
       // softAssert.assertEquals(tv_avg_time.isEnabled(),true,"tv_avg_time is not displayed");
        softAssert.assertEquals(tv_sincerity_score_positive.isEnabled(),true,"tv_sincerity_score_positive is not displayed");
        softAssert.assertEquals(tv_sincerity_score_negative.isEnabled(),true,"tv_sincerity_score_negative is not displayed");
       // softAssert.assertEquals(tv_neg_behaviour_num.isEnabled(),true,"tv_neg_behaviour_num is not displayed");
        softAssert.assertAll();

    }
    public void clickToWatchYourActionReplayAgain(){
        waitForElementToBeVisible(PlayButton);
        PlayButton.click();
    }
    public void clickOnScoreCard(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(scoreCard);
        scoreCard.click();
    }
    public void clickOnYourTopSkillCard(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(yourTopSkill);
        yourTopSkill.click();
    }
    public void clickOnQuestionWiseAnalysisWithSolutionsCard(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeVisible(question_wise);
        question_wise.click();
    }
    public void verifyElementsOnScoreDetailsPage(){
        waitForElementToBeVisible(scores);
        softAssert.assertEquals(backFromScoreDetails.isEnabled(),true,"Back arrow is not available in score details");
     //   softAssert.assertEquals(score_bars.isEnabled(),true,"score bars not displayed");
        softAssert.assertEquals(questionsCounts.isEnabled(),true,"questions count not displayed");
        softAssert.assertEquals(TestAnalysis.isEnabled(),true,"Test analysis not displayed");
        //  softAssert.assertEquals(correct_questions.isEnabled(),"correct questions not displayed");
        softAssert.assertEquals(scoreTitle.isEnabled(),true,"score title not displayed");
          softAssert.assertEquals(correctlyAnsweredLL.isEnabled(),true,"correctlyAnsweredLL not displayed");

        softAssert.assertAll();
    }

    public void verifyElementsOnYourTopSkill(){
        waitForElementToBeVisible(Your_top_skill);
        softAssert.assertEquals(backFromYourTopSkill.isEnabled(),true,"Back arrow is not available on your top skill screen");
        softAssert.assertEquals(Your_top_skill.isEnabled(),true,"Your_top_skill is not displayed");
        softAssert.assertEquals(Correctly_answered.isEnabled(),true,"Correctly_answered is not displayed");
        softAssert.assertEquals(skill_wise_accuracy.isEnabled(),true,"skill_wise_accuracy is not displayed");
        softAssert.assertEquals(skill_wise_accuracy_Graph_banner.isEnabled(),true,"skill_wise_accuracy_Graph is not displayed");
        softAssert.assertEquals(YourTopSkills_title.isEnabled(),true,"YourTopSkills_title is not displayed");
//        softAssert.assertEquals(Back_From_Your_top_skill.isEnabled(),true,"Back button is not available");
        softAssert.assertEquals(Skill_wise_accuracy_Graph.get(0).isEnabled(),true,"Graph 1 is not visible");
        softAssert.assertEquals(Skill_wise_accuracy_Graph.get(1).isEnabled(),true,"Graph 2 is not visible");
        softAssert.assertEquals(Skill_wise_accuracy_Graph.get(2).isEnabled(),true,"Graph 3 is not visible");
        softAssert.assertEquals(Skill_wise_accuracy_Graph.get(3).isEnabled(),true,"Graph 4 is not visible");
        softAssert.assertAll();

    }

    public void verifyAllTheElementsOnQuestionWiseAnalysisWithSolutions(){
      //  waitForElementToBeVisible(PerfectAttempts);
        softAssert.assertEquals(PerfectAttempts.isEnabled(),true,"Perfect Attempts is not visible");
        softAssert.assertEquals(btn_overtime_correct.isEnabled(),true,"Overtime Correct Attempts is not visible");
        softAssert.assertEquals(btn_too_fast_correct.isEnabled(),true,"Too Fast Correct Attempts is not visible");
        softAssert.assertEquals(btn_incorrect_attempts.isEnabled(),true,"Incorrect Attempts is not visible");
        softAssert.assertEquals(btn_overtime_incorrect.isEnabled(),true,"Overtime Incorrect Attempts is not visible");
        softAssert.assertEquals(btn_wasted_attempts.isEnabled(),true,"Wasted Attempts is not visible");
        softAssert.assertEquals(btn_unattempted.isEnabled(),true,"Unattempted is not visible");
        // softAssert.assertEquals(layout_jars.isEnabled(),true,"layout_jars are not displayed");
        softAssert.assertAll();

    }
    public String clickOnPerfectAttemptsAndNavigateToViewDetails(){
        waitForElementToBeVisible(PerfectAttempts);
        String attempt_Type=PerfectAttempts.getText();
        System.out.println("Name is :"+PerfectAttempts.getText());
        PerfectAttempts.click();
        return attempt_Type;    }

    public String clickOnOvertimeCorrectAttempts(){
        waitForElementToBeVisible(btn_overtime_correct);
        String attempt_Type_1=btn_overtime_correct.getText();
        System.out.println("Name is :"+btn_overtime_correct.getText());
        btn_overtime_correct.click();
        return attempt_Type_1;
    }

    public String clickOnTooFastCorrectAttempts(){
        waitForElementToBeVisible(btn_too_fast_correct);
        String attempt_Type_2=btn_too_fast_correct.getText();
        System.out.println("Name is :"+btn_too_fast_correct.getText());
        btn_too_fast_correct.click();
        return attempt_Type_2;
    }

    public String clickOnIncorrectAttempts(){
        waitForElementToBeVisible(btn_incorrect_attempts);
        String attempt_Type_3 =btn_incorrect_attempts.getText();
        System.out.println("Name is :"+QuestionWiseList.get(3).getText());
        btn_incorrect_attempts.click();
        return attempt_Type_3;
    }

    public String clickOnOvertimeIncorrectAttempts(){
        waitForElementToBeVisible(btn_overtime_incorrect);
        String attempt_Type_4=btn_overtime_incorrect.getText();
        System.out.println("Name is :"+btn_overtime_incorrect.getText());
        btn_overtime_incorrect.click();
        return attempt_Type_4;
    }

    public String clickOnWastedAttempts(){
        waitForElementToBeVisible(btn_wasted_attempts);
        String attempt_Type_5=btn_wasted_attempts.getText();
        System.out.println("Name is :"+btn_wasted_attempts.getText());
        btn_wasted_attempts.click();
        return attempt_Type_5;
    }

    public String clickOnUnattempted(){
        waitForElementToBeVisible(btn_unattempted);
        String attempt_Type_6=btn_unattempted.getText();
        System.out.println("Name is :"+btn_unattempted.getText());
        btn_unattempted.click();
        return attempt_Type_6;
    }
    public void verifyElementOfUnderstandMyNegativeBehaviour(){
        waitForElementToBeVisible(UnderstandMyNegativeBehaviours_tile);
        softAssert.assertEquals(UnderstandMyNegativeBehaviours_tile.isEnabled(),true,"UnderstandMyNegativeBehaviours_tile is not displayed");
        // softAssert.assertEquals(UnderstandMyNegativeBehaviours_NavigateBack.isEnabled(),true,"UnderstandMyNegativeBehaviours_NavigateBack is not displayed");
        softAssert.assertEquals(ListOfSincerityScore.get(0).isEnabled(),true,"score card is not displayed");
        softAssert.assertEquals(ListOfImg.get(0).isEnabled(),true,"score card img is not displayed");
        softAssert.assertEquals(ListOfPlayButton.get(0).isEnabled(),true,"score card play button is not displayed");
        softAssert.assertEquals(ListOfScoreCardHeader.get(0).isEnabled(),true,"score card header is not displayed");
        softAssert.assertEquals(tv_second_text.get(0).isEnabled(),true,"score card data is not displayed");
        softAssert.assertEquals(ScoreCardDescription.get(0).isEnabled(),true,"score card description is not displayed");
        softAssert.assertAll();
    }
    public String verifyUnderstandMyNegativeBehavioursTitle(){
        waitForElementToBeVisible(UnderstandMyNegativeBehaviours_tile);
        String title=UnderstandMyNegativeBehaviours_tile.getText();
        System.out.println("title :"+UnderstandMyNegativeBehaviours_tile.getText());
        return title;
    }
    public void clickOnPlayButtonOfSincerityScoreCard(){
        waitForElementToBeVisible(ListOfPlayButton.get(0));
        ListOfPlayButton.get(0).click();
    }

    public void verifyElementsOfQuitLearn(){
        waitForElementToBeVisible(Do_you_really_want_to_quit_learning);
        softAssert.assertEquals(Do_you_really_want_to_quit_learning.isEnabled(),true,"Do_you_really_want_to_quit_learning is not displayed");
        softAssert.assertEquals(continueLearningBtn.isEnabled(),true,"continueLearningBtn is not displayed");
        softAssert.assertEquals(quit.isEnabled(),true,"quit option is not displayed");
        softAssert.assertAll();
    }
    public void clickOnQuit(){
        waitForElementToBeVisible(quit);
        quit.click();
    }
    public void clickOnRevisionListPlusButton(){
        waitForElementToBeVisible(GetYourRevisionLists);
        GetYourRevisionLists.click();
    }
    public void clickOnChaptersYouDidNotAttemptTab(){
        waitForElementToBeVisible(ChaptersYouDidNotAttempt);
        ChaptersYouDidNotAttempt.click();
    }
    public void clickOnChaptersYouGotWrongTab(){
        waitForElementToBeVisible(ChaptersYouGotWrong);
        ChaptersYouGotWrong.click();
    }
    public void verifyElementsOnChaptersYouDidNotAttemptDetails(){
        waitForElementToBeVisible(ListOfChaptersYouDidNotAttempt.get(0));
        softAssert.assertEquals(ListOfChaptersYouDidNotAttempt.get(0).isEnabled(),true,"chapter is not displayed");
        softAssert.assertAll();
    }
    public void verifyElementsOnChaptersYouGotWrongDetails(){
        waitForElementToBeVisible(ListOfChaptersYouDidNotAttempt.get(0));
        softAssert.assertEquals(ListOfChaptersYouDidNotAttempt.get(0).isEnabled(),true,"chapter is not displayed");
        softAssert.assertAll();
    }
    public String clickOnAChapterFromChaptersYouDidNotAttempt(){
        waitForElementToBeVisible(ListOfChaptersYouDidNotAttempt.get(0));
        String chapter=ListOfChaptersName_YouDidNotAttempt.get(0).getText();
        System.out.println("name :"+ListOfChaptersYouDidNotAttempt.get(0).getText());
        ListOfChaptersYouDidNotAttempt.get(0).click();
        return chapter;
    }
    public String clickOnAChapterFromChaptersYouGotWrongAttempt(){
        waitForElementToBeVisible(ListOfChaptersYouDidNotAttempt.get(0));
        String chapter=ListOfChaptersName_YouDidNotAttempt.get(0).getText();
        System.out.println("name :"+ListOfChaptersYouDidNotAttempt.get(0).getText());
        ListOfChaptersYouDidNotAttempt.get(0).click();
        return chapter;
    }
    public void verifyElementsOnChapterDetailsOfYouGotWrong(){
        waitForElementToBeVisible(chapter_title);
        softAssert.assertEquals(chapter_title.isEnabled(),true,"chapter_title is not displayed");
        softAssert.assertEquals(chapter_Header.isEnabled(),true,"chapter_Header is not displayed");
        softAssert.assertEquals(ListOfTopics_YouDidNotAttempt.get(0).isEnabled(),true,"topic is not displayed");
        softAssert.assertEquals(ListOfTopicsName_YouDidNotAttempt.get(0).isEnabled(),true,"topic name is not displayed");
        softAssert.assertEquals(ListOfYourAccuracy_YouDidNotAttempt.get(0).isEnabled(),true,"Accuracy is not displayed");
        softAssert.assertEquals(ListOf_ConceptMastery_YouGotWrong.get(0).isEnabled(),true,"ConceptMastery is not displayed");
        softAssert.assertAll();
    }
    public void verifyElementsOnChapterDetailsOfYouDidNotAttempt(){
        waitForElementToBeVisible(chapter_title);
        softAssert.assertEquals(chapter_title.isEnabled(),true,"chapter_title is not displayed");
        softAssert.assertEquals(chapter_Header.isEnabled(),true,"chapter_Header is not displayed");
        softAssert.assertEquals(ListOfTopics_YouDidNotAttempt.get(0).isEnabled(),true,"topic is not displayed");
        softAssert.assertEquals(ListOfTopicsName_YouDidNotAttempt.get(0).isEnabled(),true,"topic name is not displayed");
        softAssert.assertEquals(ListOfYourAccuracy_YouDidNotAttempt.get(0).isEnabled(),true,"Accuracy is not displayed");
        softAssert.assertEquals(ListOf_ConceptMastery_YouDidNotAttempt.get(0).isEnabled(),true,"ConceptMastery is not displayed");
        softAssert.assertAll();
    }
    public String clickOnTopicOfYouDidNotAttempt(){
        waitForElementToBeVisible(ListOfTopicsName_YouDidNotAttempt.get(0));
        String topic=ListOfTopicsName_YouDidNotAttempt.get(0).getText();
        System.out.println("name "+ListOfTopicsName_YouDidNotAttempt.get(0).getText());
        ListOfTopicsName_YouDidNotAttempt.get(0).click();
        return topic;
    }

    public String clickOnUnderstandMyNegativeBehaviourTab(){
        swipeScreen(Direction.DOWN);
        scrollToText("Understand My Negative Behaviour");
        waitForElementToBeVisible(UnderstandMyNegativeBehaviour);
        String title_tab=UnderstandMyNegativeBehaviour.getText();
        System.out.println("title is :"+UnderstandMyNegativeBehaviour.getText());
        UnderstandMyNegativeBehaviour.click();
        return title_tab;
    }
    public void clickOnImproveYourTestTakingStrategyTab(){
        waitForElementToBeVisible(ImproveYourTestTakingStrategy);
        ImproveYourTestTakingStrategy.click();
    }

    public void clickOnChapterWiseAnalysisWithConceptualWeaknesses(){
        waitForElementToBeVisible(Chapter_wise_analysis_with_conceptual_weaknesses);
        Chapter_wise_analysis_with_conceptual_weaknesses.click();
    }
    public void verifyAllElementsOnPerfectAttemptDetailsScreen(){
        waitForElementToBeVisible(ShowingPercentageOvertimeCorrectAttemptsForAllSubjects);
        //   softAssert.assertEquals(playButton.isEnabled(),true,"playButton is not visible");
        softAssert.assertEquals(AttemptGraphshowingUnattempted.isEnabled(),true,"AttemptGraphshowingUnattempted not visible");
        softAssert.assertEquals(Chapter_wise_analysis_with_conceptual_weaknesses.isEnabled(),true,"Chapter_wise_analysis_with_conceptual_weaknesses, is not visible");
        softAssert.assertEquals(DifficultyLevel.isEnabled(),true,"OvertimeCorrectAttempts is not visible");
        softAssert.assertEquals(overtimeCorrect.get(0).isEnabled(),true,"Attempt quality jar is not displayed");
        softAssert.assertEquals(AttemptGraphshowingUnattemptedGraph.isEnabled(),true,"AttemptGraphshowingUnattemptedGraph , is not displayed ");
        softAssert.assertAll();

    }
    public void verifyAllElementsOnAttemptTypeDetailsScreen(){
      /*  waitForElementToBeVisible(title_AttemptTypeDetails);
        //    softAssert.assertEquals(NavBackFrom_AttemptTypeDetails.isEnabled(),true,"NavBackFrom_AttemptTypeDetails is not displayed");
        softAssert.assertEquals(title_AttemptTypeDetails.isEnabled(),true,"title_AttemptTypeDetails is not displayed");
        softAssert.assertEquals(AttemptGraphShowingUnattempted.isEnabled(),true,"AttemptGraphShowingUnattempted is not displayed");
        softAssert.assertEquals(text_ShowingPercentageIncorrectAttemptsForAllSubjects_AttemptTypeDetails.isEnabled(),true,"text_ShowingPercentageIncorrectAttemptsForAllSubjects_AttemptTypeDetails is not displayed");
        softAssert.assertEquals(img_ChapterWiseAnalysisWithConceptualWeaknesses_AttemptTypeDetails.isEnabled(),true,"img_ChapterWiseAnalysisWithConceptualWeaknesses_AttemptTypeDetails is not displayed");
        softAssert.assertEquals(text_ChapterWiseAnalysisWithConceptualWeaknesses_AttemptTypeDetails.isEnabled(),true,"text_ChapterWiseAnalysisWithConceptualWeaknesses_AttemptTypeDetails is not displayed");
        softAssert.assertEquals(ClickToUnderstandUnattempted.isEnabled(),true,"ClickToUnderstandUnattempted is not displayed");
        //   softAssert.assertEquals(text_IncorrectAttempts_AttemptTypeDetails.isEnabled(),true,"text_IncorrectAttempts_AttemptTypeDetails is not displayed");
        // softAssert.assertEquals(drop_down_AttemptTypeDetails.isEnabled(),true,"drop_down_AttemptTypeDetails is not displayed");
        // softAssert.assertEquals(lottie_jar_AttemptTypeDetails.isEnabled(),true,"lottie_jar_AttemptTypeDetails is not displayed");
//        softAssert.assertEquals(text_AttemptQuality_AttemptTypeDetails.isEnabled(),true,"text_AttemptQuality_AttemptTypeDetails is not displayed");
        softAssert.assertAll();*/
    }
    public String verifyIfAttemptTypeIsSelectedSameByDefaultInAttemptTypeDetailsScreen(){
        waitForElementToBeVisible(text_IncorrectAttempts_AttemptTypeDetails);
        String attemptType= text_IncorrectAttempts_AttemptTypeDetails.getText();
        System.out.println("Name is :"+ text_IncorrectAttempts_AttemptTypeDetails.getText());
        return attemptType;
    }

    public void clickOnDifficultyLevel(){
        waitForElementToBeVisible(DifficultyLevel);
        DifficultyLevel.click();
    }

    public void VerifyElementsOfDifficultyList(){
        waitForElementToBeVisible(TooFastCorrectAttempts);
        softAssert.assertEquals(TooFastCorrectAttempts.isEnabled(),true,"Too Fast Correct Attempts, is not visible");
        softAssert.assertEquals(PerfectAttempts1.isEnabled(),true,"Perfect Attempts is not visible");
        softAssert.assertEquals(OvertimeCorrectAttempts.isEnabled(),true,"Overtime Correct Attempts is not visible");
        softAssert.assertEquals(WastedAttempts.isEnabled(),true,"Wasted Attempts is not visible");
        softAssert.assertEquals(IncorrectAttempts.isEnabled(),true,"Incorrect Attempts is not visible");
        softAssert.assertEquals(OvertimeIncorrectAttempts.isEnabled(),true,"Overtime Incorrect Attempts is not visible");
        softAssert.assertEquals(Unattempted.isEnabled(),true,"Unattempted is not visible");
        softAssert.assertAll();

    }
    public void SelectDifficultyLevel(){
        waitForElementToBeVisible(TooFastCorrectAttempts);
        TooFastCorrectAttempts.click();
    }
}
