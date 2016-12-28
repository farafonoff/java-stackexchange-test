package tk.farafonoff.sos.response;

import java.util.List;

/**
 * Created by faraf on 29.12.2016.
 */
public class SearchResponse {
    List<FoundQuestion> questions;

    boolean hasMore;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<FoundQuestion> getQuestions() {

        return questions;
    }

    public void setQuestions(List<FoundQuestion> questions) {
        this.questions = questions;
    }
}
