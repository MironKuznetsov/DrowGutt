package New;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.*;
import com.vaadin.ui.*;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import sun.font.FontAccess;

import java.awt.*;
import java.lang.Object;


/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        final HorizontalLayout layout1 = new HorizontalLayout();
        final MenuBar menu = new MenuBar();
        final Label label = new Label("This Needs to be Colored");
        final MenuBar.MenuItem pencil = menu.addItem("Pencil", FontAwesome.PENCIL, null);
        final MenuBar.MenuItem size = pencil.addItem("Size",null,null);
        size.addItem(null, new ThemeResource("1"), null);
        layout1.addComponents( label);
        setContent(layout1);


    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
