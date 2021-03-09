package com.company.abstractfactory;

import com.company.abstractfactory.button.Button;
import com.company.abstractfactory.button.LightButton;
import com.company.abstractfactory.textbox.LightTextBox;
import com.company.abstractfactory.textbox.TextBox;

public class LightUIFactory extends UIFactory {
    public Button drawButton() {
        return new LightButton();
    }
     public TextBox createText(){
        return new LightTextBox();
     }
}
