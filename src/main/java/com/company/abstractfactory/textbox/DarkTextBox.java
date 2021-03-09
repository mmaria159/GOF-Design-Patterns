package com.company.abstractfactory.textbox;

public class DarkTextBox extends TextBox {
    @Override
    public void create() {
        System.out.println("here I created a dark text box");
    }
}
