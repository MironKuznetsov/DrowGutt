package New;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class TopUiInTheWorld extends HorizontalLayout {
    protected VerticalLayout menu;
    protected Button pencilButton;
    protected Button rectangleButton;

    public TopUiInTheWorld() {
        Design.read(this);
    }


    /*



     final VerticalLayout layout = new VerticalLayout();
        final HorizontalLayout layout1 = new HorizontalLayout();
        final TopUiInTheWorld tuintw = new TopUiInTheWorld();
        final Label label = new Label("This Needs to be Colored");
        label.addStyleName("coloredlabel");

// Some UI logic to change CSS
        final ColorPicker sample = new ColorPicker("Set the Color Here");
        //sample = new ColorPicker();
        sample.setSwatchesVisibility(false);
        sample.setHistoryVisibility(false);
        sample.setTextfieldVisibility(false);
        sample.setHSVVisibility(false);

        sample.addValueChangeListener(event -> Notification.show(
                "Color changed: " + event.getValue().getCSS()
                ));

        tuintw.pencilButton.addClickListener( e -> {


            layout.addComponents(label, sample);
            layout1.addComponent(layout);
        });
        layout1.addComponents(tuintw);
        setContent(layout1);




     */



}