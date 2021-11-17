
package questionMetaData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuestionDetails {

    @SerializedName("en")
    @Expose
    private En en;

    public En getEn() {
        return en;
    }

    public void setEn(En en) {
        this.en = en;
    }

}
