package tk.farafonoff.sos.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Created by faraf on 29.12.2016.
 */
public class FoundQuestion {
    long id;
    String title;
    String link;
    @JsonProperty("create_date")
    long createDate;
    @JsonProperty("activity_date")
    long activityDate;

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public long getActivityDate() {

        return activityDate;
    }

    public void setActivityDate(long activityDate) {
        this.activityDate = activityDate;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    boolean answered;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoundQuestion that = (FoundQuestion) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(activityDate, that.activityDate) &&
                Objects.equals(answered, that.answered) &&
                Objects.equals(title, that.title) &&
                Objects.equals(link, that.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, link, createDate, activityDate, answered);
    }
}
