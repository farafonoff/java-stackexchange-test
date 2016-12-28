package tk.farafonoff.sos.response;

/**
 * Created by faraf on 29.12.2016.
 */
public class FoundQuestion {
    String title;
    String link;

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
}
