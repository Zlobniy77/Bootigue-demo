package modules;

import com.google.inject.Module;
import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;

/**
 * Created by Aleksandr on 22.11.2016.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("test");
//        Module module = binder ->
//                JerseyModule.contributeResources( binder ).addBinding().to(DemoApplication.class);
//
//        Bootique.app( args ).module(module).autoLoadModules().run();
    }

}
