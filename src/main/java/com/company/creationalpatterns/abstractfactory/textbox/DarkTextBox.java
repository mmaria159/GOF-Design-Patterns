package com.company.creationalpatterns.abstractfactory.textbox;

public class DarkTextBox extends TextBox {
    @Override
    public void create() {
        System.out.println("here I created a dark text box");
    }
}
