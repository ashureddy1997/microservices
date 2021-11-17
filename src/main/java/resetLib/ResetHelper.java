
package resetLib;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ResetHelper {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("testName")
    @Expose
    private Object testName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("learningMap")
    @Expose
    private Object learningMap;
    @SerializedName("status")
    @Expose
    private Object status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getTestName() {
        return testName;
    }

    public void setTestName(Object testName) {
        this.testName = testName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getLearningMap() {
        return learningMap;
    }

    public void setLearningMap(Object learningMap) {
        this.learningMap = learningMap;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

}
