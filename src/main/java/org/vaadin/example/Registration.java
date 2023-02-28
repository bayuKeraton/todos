package org.vaadin.example;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * A Designer generated component for the main-view template.
 * <p>
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */

@Route("/registration")
@Tag("sign-up")
@JsModule("./src/sign-up.ts")
public class Registration extends LitTemplate {

    /**
     * Creates a new MainView.
     */

    @Id("firstInput")
    private TextField textField;
    @Id("secondInput")
    private TextField address;
    @Id("thirdInput")
    private TextField email;

    @Id("Submit")
    private Button submit;

    @Id("Cancel")
    private Button cancel;


    public Registration() {

        submit.addThemeVariants(ButtonVariant.LUMO_SUCCESS);
        cancel.addThemeVariants(ButtonVariant.LUMO_ERROR);
    }

}
