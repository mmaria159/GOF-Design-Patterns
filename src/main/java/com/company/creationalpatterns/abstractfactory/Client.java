package com.company.creationalpatterns.abstractfactory;
import com.company.creationalpatterns.abstractfactory.button.Button;
import com.company.creationalpatterns.abstractfactory.textbox.TextBox;

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
