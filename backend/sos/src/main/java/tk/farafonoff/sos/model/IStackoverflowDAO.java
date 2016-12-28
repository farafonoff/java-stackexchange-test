package tk.farafonoff.sos.model;

import tk.farafonoff.sos.domain.StackoverflowResponse;

/**
 * Created by faraf on 29.12.2016.
 */
public interface IStackoverflowDAO {
    StackoverflowResponse searchByTitle(String title, int page);
}
