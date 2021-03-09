package com.company.abstractfactory.textbox;

public class LightTextBox extends TextBox {
    @Override
    public void create() {
        System.out.println("here I created a light text box");
    }
}
