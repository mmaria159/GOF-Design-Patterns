package com.company.creationalpatterns.abstractfactory.textbox;

public class LightTextBox extends TextBox {
    @Override
    public void create() {
        System.out.println("here I created a light text box");
    }
}
