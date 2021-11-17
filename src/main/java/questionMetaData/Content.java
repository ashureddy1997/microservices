
package questionMetaData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Content {

    @SerializedName("question_details")
    @Expose
    private QuestionDetails questionDetails;
    @SerializedName("question_meta_tags")
    @Expose
    private List<QuestionMetaTag> questionMetaTags = null;

    public QuestionDetails getQuestionDetails() {
        return questionDetails;
    }

    public void setQuestionDetails(QuestionDetails questionDetails) {
        this.questionDetails = questionDetails;
    }

    public List<QuestionMetaTag> getQuestionMetaTags() {
        return questionMetaTags;
    }

    public void setQuestionMetaTags(List<QuestionMetaTag> questionMetaTags) {
        this.questionMetaTags = questionMetaTags;
    }

}
