package tk.farafonoff.sos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

public class StackoverflowResponse {

    @JsonProperty("items")
    private List<StackoverflowQuestion> items = null;
    @JsonProperty("has_more")
    private boolean hasMore;
    @JsonProperty("quota_max")
    private long quotaMax;
    @JsonProperty("quota_remaining")
    private long quotaRemaining;

    @JsonProperty("items")
    public List<StackoverflowQuestion> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<StackoverflowQuestion> items) {
        this.items = items;
    }

    @JsonProperty("has_more")
    public boolean isHasMore() {
        return hasMore;
    }

    @JsonProperty("has_more")
    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    @JsonProperty("quota_max")
    public long getQuotaMax() {
        return quotaMax;
    }

    @JsonProperty("quota_max")
    public void setQuotaMax(long quotaMax) {
        this.quotaMax = quotaMax;
    }

    @JsonProperty("quota_remaining")
    public long getQuotaRemaining() {
        return quotaRemaining;
    }

    @JsonProperty("quota_remaining")
    public void setQuotaRemaining(long quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }
}