package tk.farafonoff.sos.resources;

import tk.farafonoff.sos.domain.StackoverflowResponse;
import tk.farafonoff.sos.model.IStackoverflowDAO;
import tk.farafonoff.sos.model.StackoverflowDAO;
import tk.farafonoff.sos.response.FoundQuestion;
import tk.farafonoff.sos.response.SearchResponse;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.stream.Collectors;

/**
 * Created by faraf on 29.12.2016.
 */
@Path("/stackoverflow")
public class SearchResource {
    @Inject
    IStackoverflowDAO soDao;

    private SearchResponse map(StackoverflowResponse orig) {
        SearchResponse result = new SearchResponse();
        result.setHasMore(orig.isHasMore());
        result.setItems(orig.getItems().stream().map((item)->{
                FoundQuestion fq = new FoundQuestion();
                fq.setActivityDate(item.getLastActivityDate());
                fq.setCreateDate(item.getCreationDate());
                fq.setAnswered(item.isIsAnswered());
                fq.setLink(item.getLink());
                fq.setTitle(item.getTitle());
				fq.setId(item.getQuestionId());
                return fq;
        }).collect(Collectors.toList()));
        return result;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/search/{title}")
    public SearchResponse findByTitle(@PathParam("title") String title) {
        return map(soDao.searchByTitle(title,1));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/search/{title}/{page}")
    public SearchResponse findByTitle(@PathParam("title") String title, @PathParam("page") int page) {
        return map(soDao.searchByTitle(title, page));
    }
}
