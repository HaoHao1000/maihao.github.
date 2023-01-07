package FactoryMethod.Pseudocode.Ex_1;

import FactoryMethod.Pseudocode.Ex_1.Button;
import FactoryMethod.Pseudocode.Ex_1.Dialog;
import FactoryMethod.Pseudocode.Ex_1.WindowsButton;

public class WindowsDialog extends Dialog {
    public Button createButton() {
        return new WindowsButton();
    }
}
