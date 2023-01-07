package FactoryMethod.Pseudocode.Ex_1;


import FactoryMethod.Pseudocode.Ex_1.Button;

public class WindowsButton implements Button {

    public void render() {
        System.out.println("Button");
        onClick();
    }
    public void onClick() {
        System.out.println("Click! - OS click");
    }

}
