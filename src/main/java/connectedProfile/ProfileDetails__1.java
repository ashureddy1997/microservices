
package connectedProfile;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ProfileDetails__1 {

    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("meta")
    @Expose
    private Object meta;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("primary_goal")
    @Expose
    private String primaryGoal;
    @SerializedName("primary_exam")
    @Expose
    private String primaryExam;
    @SerializedName("secondary_goal")
    @Expose
    private String secondaryGoal;
    @SerializedName("secondary_exam")
    @Expose
    private String secondaryExam;
    @SerializedName("profile_pic")
    @Expose
    private String profilePic;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPrimaryGoal() {
        return primaryGoal;
    }

    public void setPrimaryGoal(String primaryGoal) {
        this.primaryGoal = primaryGoal;
    }

    public String getPrimaryExam() {
        return primaryExam;
    }

    public void setPrimaryExam(String primaryExam) {
        this.primaryExam = primaryExam;
    }

    public String getSecondaryGoal() {
        return secondaryGoal;
    }

    public void setSecondaryGoal(String secondaryGoal) {
        this.secondaryGoal = secondaryGoal;
    }

    public String getSecondaryExam() {
        return secondaryExam;
    }

    public void setSecondaryExam(String secondaryExam) {
        this.secondaryExam = secondaryExam;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

}
