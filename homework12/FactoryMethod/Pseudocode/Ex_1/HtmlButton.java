package FactoryMethod.Pseudocode.Ex_1;

import FactoryMethod.Pseudocode.Ex_1.Button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! - browser");
    }
}
