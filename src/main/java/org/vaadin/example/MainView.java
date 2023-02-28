package org.vaadin.example;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the main-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("main-view")
@JsModule("./main-view.ts")
@Route()
public class MainView extends LitTemplate {

    /**
     * Creates a new MainView.
     */

    @Id("firstInput")
    private TextField textField;

    @Id("secondInput")
    private TextField address;



    public MainView() {

        VerticalLayout Vlayout = new VerticalLayout();
        TextField test =  new TextField();
        TextField address = new TextField();


        Vlayout.add(test,address);

        // You can initialise any data required for the connected UI components here.
    }

}
