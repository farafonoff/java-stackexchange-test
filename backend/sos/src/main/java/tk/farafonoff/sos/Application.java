package tk.farafonoff.sos;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by faraf on 29.12.2016.
 */
public class Application extends ResourceConfig {
    public Application() {
        register(new MyBinder());
        packages(true, "tk.farafonoff.sos");
    }
}
