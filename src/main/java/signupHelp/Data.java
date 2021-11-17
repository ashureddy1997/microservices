
package signupHelp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("user_details")
    @Expose
    private UserDetails userDetails;
    @SerializedName("profile_details")
    @Expose
    private ProfileDetails profileDetails;
    @SerializedName("embibe_token")
    @Expose
    private String embibeToken;
    @SerializedName("linked_profiles")
    @Expose
    private List<Object> linkedProfiles = null;

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public ProfileDetails getProfileDetails() {
        return profileDetails;
    }

    public void setProfileDetails(ProfileDetails profileDetails) {
        this.profileDetails = profileDetails;
    }

    public String getEmbibeToken() {
        return embibeToken;
    }

    public void setEmbibeToken(String embibeToken) {
        this.embibeToken = embibeToken;
    }

    public List<Object> getLinkedProfiles() {
        return linkedProfiles;
    }

    public void setLinkedProfiles(List<Object> linkedProfiles) {
        this.linkedProfiles = linkedProfiles;
    }

}
