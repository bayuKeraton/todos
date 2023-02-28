package org.vaadin.example;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.Route;

@Route
@Tag("main-view")
@JsModule("./src/main-view.ts")
public class MainView extends LitTemplate {
    public MainView(){

    }
}
