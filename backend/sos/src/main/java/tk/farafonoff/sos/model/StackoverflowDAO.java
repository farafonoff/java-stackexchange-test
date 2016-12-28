package tk.farafonoff.sos.model;

import org.glassfish.jersey.client.filter.EncodingFilter;
import org.glassfish.jersey.message.GZipEncoder;
import org.jvnet.hk2.annotations.Service;
import tk.farafonoff.sos.domain.StackoverflowResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Artem_Farafonov on 12/27/2016.
 */
@Service
public class StackoverflowDAO {

    WebTarget defaultTarget;

    public StackoverflowDAO() {
        Client client = ClientBuilder.newClient();
        client.register(GZipEncoder.class);
        client.register(EncodingFilter.class);
        this.defaultTarget = client.target("http://api.stackexchange.com/2.2/").path("search")
                .queryParam("order","desc")
                .queryParam("sort","activity")
                .queryParam("site","stackoverflow");
    }

    public void searchByTitle(String title, int page) {
        //https://jersey.java.net/documentation/latest/client.html
        WebTarget target = defaultTarget.queryParam("intitle", title)
                .queryParam("page", page);
        Response response = target.request(MediaType.APPLICATION_JSON).get();
        System.out.println(target.getUri());
        if (response.getStatus()==200) {
            StackoverflowResponse soresponse = response.readEntity(StackoverflowResponse.class);
            System.out.println(soresponse.getItems().size());
        }
        //search?page=100&order=desc&sort=activity&intitle=java&site=stackoverflow
    }
}
