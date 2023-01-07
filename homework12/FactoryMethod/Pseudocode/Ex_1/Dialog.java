package FactoryMethod.Pseudocode.Ex_1;

import FactoryMethod.Pseudocode.Ex_1.Button;

public abstract class Dialog {
    public abstract Button createButton();
    public void render(){
        Button newButton = createButton();
        newButton.render();
    }


}
