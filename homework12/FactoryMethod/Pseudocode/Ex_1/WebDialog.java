package FactoryMethod.Pseudocode.Ex_1;

import FactoryMethod.Pseudocode.Ex_1.Button;
import FactoryMethod.Pseudocode.Ex_1.Dialog;
import FactoryMethod.Pseudocode.Ex_1.HtmlButton;

public class WebDialog extends Dialog {
    public Button createButton() {
        return new HtmlButton();
    }
}
