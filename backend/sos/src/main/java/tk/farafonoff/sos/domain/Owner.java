package tk.farafonoff.sos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;

public class Owner {

    @JsonProperty("reputation")
    private long reputation;
    @JsonProperty("user_id")
    private long userId;
    @JsonProperty("user_type")
    private String userType;
    @JsonProperty("accept_rate")
    private long acceptRate;
    @JsonProperty("profile_image")
    private String profileImage;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("link")
    private String link;

    @JsonProperty("reputation")
    public long getReputation() {
        return reputation;
    }

    @JsonProperty("reputation")
    public void setReputation(long reputation) {
        this.reputation = reputation;
    }

    @JsonProperty("user_id")
    public long getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(long userId) {
        this.userId = userId;
    }

    @JsonProperty("user_type")
    public String getUserType() {
        return userType;
    }

    @JsonProperty("user_type")
    public void setUserType(String userType) {
        this.userType = userType;
    }

    @JsonProperty("accept_rate")
    public long getAcceptRate() {
        return acceptRate;
    }

    @JsonProperty("accept_rate")
    public void setAcceptRate(long acceptRate) {
        this.acceptRate = acceptRate;
    }

    @JsonProperty("profile_image")
    public String getProfileImage() {
        return profileImage;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }
}