package tk.farafonoff.sos;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import tk.farafonoff.sos.model.IStackoverflowDAO;
import tk.farafonoff.sos.model.StackoverflowDAO;

import javax.inject.Singleton;

/**
 * Created by faraf on 29.12.2016.
 */
public class MyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(StackoverflowDAO.class).to(IStackoverflowDAO.class).in(Singleton.class);
    }
}
