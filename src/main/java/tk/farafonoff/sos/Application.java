package tk.farafonoff.sos;

import org.glassfish.jersey.server.ResourceConfig;
import tk.farafonoff.sos.helpers.CORSFilter;

/**
 * Created by faraf on 29.12.2016.
 */
public class Application extends ResourceConfig {
    public Application() {
        register(new MyBinder());
        register(new CORSFilter());
        packages(true, "tk.farafonoff.sos");
    }
}
