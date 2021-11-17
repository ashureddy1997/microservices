
package questionMetaData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {

    @SerializedName("_created")
    @Expose
    private String created;
    @SerializedName("_etag")
    @Expose
    private String etag;
    @SerializedName("_updated")
    @Expose
    private String updated;
    @SerializedName("assigned_to")
    @Expose
    private Integer assignedTo;
    @SerializedName("author_id")
    @Expose
    private Integer authorId;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("content_schema_version")
    @Expose
    private Integer contentSchemaVersion;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("created_by")
    @Expose
    private Integer createdBy;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_atg_ready")
    @Expose
    private Integer isAtgReady;
    @SerializedName("is_prof_approved")
    @Expose
    private Integer isProfApproved;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("modifier")
    @Expose
    private String modifier;
    @SerializedName("owning_partner_id")
    @Expose
    private Integer owningPartnerId;
    @SerializedName("purpose")
    @Expose
    private List<String> purpose = null;
    @SerializedName("question_code")
    @Expose
    private String questionCode;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("subtype")
    @Expose
    private String subtype;
    @SerializedName("tenant")
    @Expose
    private String tenant;
    @SerializedName("tenant_id")
    @Expose
    private Integer tenantId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("updated_by")
    @Expose
    private Integer updatedBy;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("version")
    @Expose
    private Integer version;

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Integer assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Integer getContentSchemaVersion() {
        return contentSchemaVersion;
    }

    public void setContentSchemaVersion(Integer contentSchemaVersion) {
        this.contentSchemaVersion = contentSchemaVersion;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsAtgReady() {
        return isAtgReady;
    }

    public void setIsAtgReady(Integer isAtgReady) {
        this.isAtgReady = isAtgReady;
    }

    public Integer getIsProfApproved() {
        return isProfApproved;
    }

    public void setIsProfApproved(Integer isProfApproved) {
        this.isProfApproved = isProfApproved;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Integer getOwningPartnerId() {
        return owningPartnerId;
    }

    public void setOwningPartnerId(Integer owningPartnerId) {
        this.owningPartnerId = owningPartnerId;
    }

    public List<String> getPurpose() {
        return purpose;
    }

    public void setPurpose(List<String> purpose) {
        this.purpose = purpose;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}
