package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Setter @Getter @Accessors (chain = true)
public class Project {

    @SerializedName("key") @Expose @Getter @Setter
    private String key;

    @SerializedName("name") @Expose @Getter @Setter
    private String name;

    @SerializedName("projectTypeKey") @Expose @Getter @Setter
    private String projectTypeKey;

    @SerializedName("projectTemplateKey") @Expose @Getter @Setter
    private String projectTemplateKey;

    @SerializedName("description") @Expose @Getter @Setter
    private String description;

    @SerializedName("lead") @Expose @Getter @Setter
    private String lead;

    @SerializedName("url") @Expose @Getter @Setter
    private String url;

    @SerializedName("assigneeType") @Expose @Getter @Setter
    private String assigneeType;

    @SerializedName("avatarId") @Expose @Getter @Setter
    private Integer avatarId;

    @SerializedName("issueSecurityScheme") @Expose @Getter @Setter
    private Integer issueSecurityScheme;

    @SerializedName("permissionScheme") @Expose @Getter @Setter
    private Integer permissionScheme;

    @SerializedName("notificationScheme") @Expose @Getter @Setter
    private Integer notificationScheme;

    @SerializedName("categoryId") @Expose @Getter @Setter
    private Integer categoryId;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("key", key).append("name", name).append("projectTypeKey", projectTypeKey).append("projectTemplateKey", projectTemplateKey).append("description", description).append("lead", lead).append("url", url).append("assigneeType", assigneeType).append("avatarId", avatarId).append("issueSecurityScheme", issueSecurityScheme).append("permissionScheme", permissionScheme).append("notificationScheme", notificationScheme).append("categoryId", categoryId).toString();
    }

}