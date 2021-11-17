
package connectedProfile;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LinkedProfile {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_details")
    @Expose
    private UserDetails__1 userDetails;
    @SerializedName("profile_details")
    @Expose
    private ProfileDetails__1 profileDetails;
    @SerializedName("embibe_token")
    @Expose
    private String embibeToken;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserDetails__1 getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails__1 userDetails) {
        this.userDetails = userDetails;
    }

    public ProfileDetails__1 getProfileDetails() {
        return profileDetails;
    }

    public void setProfileDetails(ProfileDetails__1 profileDetails) {
        this.profileDetails = profileDetails;
    }

    public String getEmbibeToken() {
        return embibeToken;
    }

    public void setEmbibeToken(String embibeToken) {
        this.embibeToken = embibeToken;
    }

}
