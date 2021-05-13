package com.company.creationalpatterns.abstractfactory;

import com.company.creationalpatterns.abstractfactory.button.Button;
import com.company.creationalpatterns.abstractfactory.button.LightButton;
import com.company.creationalpatterns.abstractfactory.textbox.LightTextBox;
import com.company.creationalpatterns.abstractfactory.textbox.TextBox;

public class LightUIFactory extends UIFactory {
    public Button drawButton() {
        return new LightButton();
    }
     public TextBox createText(){
        return new LightTextBox();
     }
}
