package modules;

import com.google.inject.Module;
import io.bootique.BQModuleProvider;

/**
 * Created by Aleksandr on 22.11.2016.
 */
public class DemoModuleProvider implements BQModuleProvider {
    @Override
    public Module module(){
        return new DemoModule();
    }
}
