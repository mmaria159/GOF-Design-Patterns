package com.company.abstractfactory;
import com.company.abstractfactory.button.Button;
import com.company.abstractfactory.textbox.TextBox;

public class Client {
    public static void main(String[] args) {
        //UIFactory factory = new DarkUIFactory();
        UIFactory factory = new LightUIFactory();
        Button button = factory.drawButton();
        TextBox textBox = factory.createText();
        button.draw();
        textBox.create();
    }
}
