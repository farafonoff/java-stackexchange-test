package tk.farafonoff.sos.model;

import org.jvnet.hk2.annotations.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Created by Artem_Farafonov on 12/27/2016.
 */
@Service
public class StackoverflowDAO {
    public void searchByTitle(String title, int page) {
        //https://jersey.java.net/documentation/latest/client.html
        Client client = ClientBuilder.newClient();
        client.target("http://api.stackexchange.com/2.2/");
        //search?page=100&order=desc&sort=activity&intitle=java&site=stackoverflow
    }
}
