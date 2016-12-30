package tk.farafonoff.sos;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tk.farafonoff.sos.response.FoundQuestion;
import tk.farafonoff.sos.response.SearchResponse;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class SearchTest {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp() throws Exception {
        // start the server
        server = Main.startServer();
        // create the client
        Client c = ClientBuilder.newClient();

        // uncomment the following line if you want to enable
        // support for JSON in the client (you also have to uncomment
        // dependency on jersey-media-json module in pom.xml and Main.startServer())
        // --
        //c.configuration().enable(new org.glassfish.jersey.media.json.JsonJaxbFeature());

        target = c.target(Main.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testSearch() {
        SearchResponse response = target.path("stackoverflow/search/java/1").request().get(SearchResponse.class);
        assertThat(response, notNullValue());
        assertThat(response.getItems(), notNullValue());
        assertTrue(response.getItems().size()>1);
        FoundQuestion item = response.getItems().get(0);
        assertTrue(item.getCreateDate()>0);
        assertTrue(item.getActivityDate()>0);
        assertThat(item.getLink(), notNullValue());
        assertThat(item.getTitle(), notNullValue());
        SearchResponse response2 = target.path("stackoverflow/search/java/2").request().get(SearchResponse.class);
        assertNotSame(response.getItems().get(0), response2.getItems().get(0));
    }
}
