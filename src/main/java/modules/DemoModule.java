package modules;

import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.jersey.JerseyModule;
import io.bootique.jetty.JettyModule;
import io.bootique.jetty.MappedServlet;

import java.util.Collections;

/**
 * Created by Aleksandr on 22.11.2016.
 */
public class DemoModule implements Module {
    @Override
    public void configure( Binder binder ){
        //JerseyModule.contributePackages( binder ).addBinding().toInstance( DemoApplication.class.getPackage() );
        JettyModule.contributeServlets( binder ).addBinding().to( AnnotatedServlet.class );

        MappedServlet mappedServlet = new MappedServlet(
                new MyVaadinServlet(),
                Collections.singleton("/c"),
                "myVaadin");

        JettyModule.contributeMappedServlets(binder).addBinding().toInstance(mappedServlet);

    }
}
