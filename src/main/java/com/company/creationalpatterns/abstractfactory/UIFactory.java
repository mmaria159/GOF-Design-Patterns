package com.company.creationalpatterns.abstractfactory;


import com.company.creationalpatterns.abstractfactory.button.Button;
 import com.company.creationalpatterns.abstractfactory.textbox.TextBox;

public  abstract class UIFactory {
    public abstract Button drawButton();
    public abstract TextBox createText();
}
