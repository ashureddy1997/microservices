package pageObjects.bookPage;

public interface BookPage {
    void clickOnChapterName(int i);

    void VerifyClickingOnAnyTopicTheConceptsRelatedToItAreDisplayed();

    void VerifyClickingOnOkOnAnyConceptVideoTheVideoGetsPlayed();

    void ClickOnTopic(int i);

    void verifyAllTheElementPresentOnBookTOC();

    void VerifyThumbnailIsAppearingForAllTheBookTiles();

    void verifyAllTheElementPresentOnBigBook();

    void VerifyUserCanPlayEmbibeExplainersVideosInBooksTopic();

    void VerifyUserCanPlayEnrichYourLearningVideosInBooksTopic();

    void verifyuserabletoseethechapter();

    void verifyuserabletoseethechaptersandrelevanttopicnameappear();

    void clickonpausebutton();

    void Verifyonclickondownbuttonthenextchaptergetshighlighted();

    void verifyAlltheelementsonTopic();

    void VerifyClickinonanychapterthetopicsrelatedtoitaredisplayed();

    void verifyMyBooksButton();

    void verifypracticequestionscontainsrelevanttothechapterandtopicsselected();

    void navigateToEmbibeBook();

    void VerifPracticeCountDisplayOnTopics();

    void VerifvideoCountDisplayOnTopics();
}
