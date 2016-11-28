package modules;

import com.google.inject.Inject;
import entity.Surveys;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.ObjectSelect;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Aleksandr on 22.11.2016.
 */
@Path( "/" )
@Produces( MediaType.TEXT_PLAIN )
public class DemoApplication {

    @Inject
    private ServerRuntime runtime;

    @GET
    public String get(){

        List<Surveys> surveys = ObjectSelect.query( Surveys.class )
                .where( Surveys.CLIENT_ID.eq( 1111606290 ) )
                .select( runtime.newContext() )
                .stream().limit( 10 ).collect( Collectors.toList() );

        StringBuilder builder = new StringBuilder(  );
        for( Surveys survey : surveys ){
            builder.append( survey.getTitle() + " - " + survey.getClientId() + " \n" );
        }

        return builder.toString();
    }

}
