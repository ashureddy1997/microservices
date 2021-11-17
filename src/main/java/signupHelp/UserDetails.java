
package signupHelp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserDetails {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("org_id")
    @Expose
    private String orgId;
    @SerializedName("user_type_id")
    @Expose
    private Integer userTypeId;
    @SerializedName("country_code_id")
    @Expose
    private Integer countryCodeId;
    @SerializedName("email_verified")
    @Expose
    private Boolean emailVerified;
    @SerializedName("mobile_verified")
    @Expose
    private Boolean mobileVerified;
    @SerializedName("user_status_id")
    @Expose
    private Integer userStatusId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Integer getCountryCodeId() {
        return countryCodeId;
    }

    public void setCountryCodeId(Integer countryCodeId) {
        this.countryCodeId = countryCodeId;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public Boolean getMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(Boolean mobileVerified) {
        this.mobileVerified = mobileVerified;
    }

    public Integer getUserStatusId() {
        return userStatusId;
    }

    public void setUserStatusId(Integer userStatusId) {
        this.userStatusId = userStatusId;
    }

}
