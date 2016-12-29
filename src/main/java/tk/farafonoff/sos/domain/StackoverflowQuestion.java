package tk.farafonoff.sos.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StackoverflowQuestion {

    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("is_answered")
    private boolean isAnswered;
    @JsonProperty("view_count")
    private long viewCount;
    @JsonProperty("answer_count")
    private long answerCount;
    @JsonProperty("score")
    private long score;
    @JsonProperty("last_activity_date")
    private long lastActivityDate;
    @JsonProperty("creation_date")
    private long creationDate;
    @JsonProperty("question_id")
    private long questionId;
    @JsonProperty("link")
    private String link;
    @JsonProperty("title")
    private String title;
    @JsonProperty("accepted_answer_id")
    private long acceptedAnswerId;
    @JsonProperty("last_edit_date")
    private long lastEditDate;
    @JsonProperty("closed_date")
    private long closedDate;
    @JsonProperty("closed_reason")
    private String closedReason;

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("is_answered")
    public boolean isIsAnswered() {
        return isAnswered;
    }

    @JsonProperty("is_answered")
    public void setIsAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    @JsonProperty("view_count")
    public long getViewCount() {
        return viewCount;
    }

    @JsonProperty("view_count")
    public void setViewCount(long viewCount) {
        this.viewCount = viewCount;
    }

    @JsonProperty("answer_count")
    public long getAnswerCount() {
        return answerCount;
    }

    @JsonProperty("answer_count")
    public void setAnswerCount(long answerCount) {
        this.answerCount = answerCount;
    }

    @JsonProperty("score")
    public long getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(long score) {
        this.score = score;
    }

    @JsonProperty("last_activity_date")
    public long getLastActivityDate() {
        return lastActivityDate;
    }

    @JsonProperty("last_activity_date")
    public void setLastActivityDate(long lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    @JsonProperty("creation_date")
    public long getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creation_date")
    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("question_id")
    public long getQuestionId() {
        return questionId;
    }

    @JsonProperty("question_id")
    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("accepted_answer_id")
    public long getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    @JsonProperty("accepted_answer_id")
    public void setAcceptedAnswerId(long acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    @JsonProperty("last_edit_date")
    public long getLastEditDate() {
        return lastEditDate;
    }

    @JsonProperty("last_edit_date")
    public void setLastEditDate(long lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    @JsonProperty("closed_date")
    public long getClosedDate() {
        return closedDate;
    }

    @JsonProperty("closed_date")
    public void setClosedDate(long closedDate) {
        this.closedDate = closedDate;
    }

    @JsonProperty("closed_reason")
    public String getClosedReason() {
        return closedReason;
    }

    @JsonProperty("closed_reason")
    public void setClosedReason(String closedReason) {
        this.closedReason = closedReason;
    }

}
