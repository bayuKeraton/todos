import {html, LitElement} from 'lit-element';

class MainView extends LitElement {
    render() {
        return html`

            <vaadin-form-layout style="display: flex;padding: 10%;">
                <vaadin-horizontal-layout style="display: flex;justify-content: space-between">
                    <vaadin-text-field id="firstInput" label="Full Name"></vaadin-text-field>
                    <vaadin-text-field id="secondInput" label="Address"></vaadin-text-field>
                </vaadin-horizontal-layout>
            </vaadin-form-layout>
        `;
    }
}

customElements.define('main-view', MainView);