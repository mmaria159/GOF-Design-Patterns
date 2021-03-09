package com.company.abstractfactory;


import com.company.abstractfactory.button.Button;
 import com.company.abstractfactory.textbox.TextBox;

public  abstract class UIFactory {
    public abstract Button drawButton();
    public abstract TextBox createText();
}
