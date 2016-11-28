package modules;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Aleksandr on 25.11.2016.
 */

@WebServlet(
        name = "myservlet",
        urlPatterns = "/b",
        initParams = {
                @WebInitParam(name = "p1", value = "v1"),
                @WebInitParam(name = "p2", value = "v2")
        }
)
public class AnnotatedServlet extends HttpServlet {

    public void doGet( HttpServletRequest request, HttpServletResponse response ){

        try{
            response.sendRedirect("/jsp/test.jsp");
        } catch( IOException e ){
            e.printStackTrace();
        }

//        try{
//            response.getWriter().write( "Hello servlet" );
//        } catch( IOException e ){
//            e.printStackTrace();
//        }
//        System.out.println( "doGet" );
    }

    public void doService( HttpServletRequest request, HttpServletResponse response ){
        System.out.println( "doService" );
    }

}
