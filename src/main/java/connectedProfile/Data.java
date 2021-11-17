
package connectedProfile;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
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
    private List<LinkedProfile> linkedProfiles = null;
    @SerializedName("login_count")
    @Expose
    private Integer loginCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public List<LinkedProfile> getLinkedProfiles() {
        return linkedProfiles;
    }

    public void setLinkedProfiles(List<LinkedProfile> linkedProfiles) {
        this.linkedProfiles = linkedProfiles;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

}
