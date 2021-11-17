
package signupHelp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileDetails {

    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("meta")
    @Expose
    private Meta meta;
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
    private Object primaryExam;
    @SerializedName("secondary_goal")
    @Expose
    private Object secondaryGoal;
    @SerializedName("secondary_exam")
    @Expose
    private Object secondaryExam;
    @SerializedName("profile_pic")
    @Expose
    private Object profilePic;

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
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

    public Object getPrimaryExam() {
        return primaryExam;
    }

    public void setPrimaryExam(Object primaryExam) {
        this.primaryExam = primaryExam;
    }

    public Object getSecondaryGoal() {
        return secondaryGoal;
    }

    public void setSecondaryGoal(Object secondaryGoal) {
        this.secondaryGoal = secondaryGoal;
    }

    public Object getSecondaryExam() {
        return secondaryExam;
    }

    public void setSecondaryExam(Object secondaryExam) {
        this.secondaryExam = secondaryExam;
    }

    public Object getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Object profilePic) {
        this.profilePic = profilePic;
    }

}
