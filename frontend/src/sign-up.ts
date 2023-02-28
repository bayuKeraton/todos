import {html, LitElement} from 'lit-element';



class SignUp extends LitElement {
    render() {
        return html`
            <div style="padding: 5rem ;">
                <vaadin-vertical-layout style="display:flex;width: 40%">
                    <h2 style="margin-bottom:-5px">User Form</h2>
                    <vaadin-text-field id="firstInput" label="Full Name"></vaadin-text-field>
                    <vaadin-text-field id="secondInput" label="Address"></vaadin-text-field>
                    <vaadin-text-field id="thirdInput" label="Email"></vaadin-text-field>
                    <vaadin-horizontal-layout style="justify-content:space-between; padding-left:39px;padding-top: 10px">
                        <vaadin-button id="Cancel" style="margin-right: 5px">Cancel</vaadin-button>
                        <vaadin-button id="Submit">Insert</vaadin-button>
                    </vaadin-horizontal-layout>
                </vaadin-vertical-layout>
            </div>`;
    }
}

customElements.define('sign-up',SignUp);