import {LitElement,html} from 'lit-element';



class MainView extends LitElement{
render(){
    return html`
        <div style="padding: 5rem ;">
            <vaadin-text-field id="firstInput" label="Full Name"></vaadin-text-field>
            <vaadin-text-field id="secondInput" label="Address"></vaadin-text-field>
            <vaadin-text-field id="thirdInput" label="Email"></vaadin-text-field>
        </div>`
}
}


customElements.define('main-view',MainView);