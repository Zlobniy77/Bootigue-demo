package modules;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;
import modules.vaadin.sami.javaday.TetrisUI;

import javax.servlet.annotation.WebServlet;

/**
 * Created by Aleksandr on 25.11.2016.
 */
@WebServlet(value = {"/c"}, asyncSupported = true)
@VaadinServletConfiguration(productionMode = false, ui = TetrisUI.class)
public class MyVaadinServlet extends VaadinServlet {
}
