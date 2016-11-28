package modules.vaadin.sami.javaday;

import org.vaadin.viritin.components.DisclosurePanel;
import org.vaadin.viritin.label.RichText;


/**
 *
 * @author Matti Tahvonen
 */
public class About extends DisclosurePanel {

    public About() {

        setCaption("Server side Tetris game? Read more »");
        setContent(new RichText().withMarkDownResource("/about.md"));
    }

}
