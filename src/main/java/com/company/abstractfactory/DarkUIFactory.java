package com.company.abstractfactory;
import com.company.abstractfactory.button.Button;
import com.company.abstractfactory.button.DarkButton;
import com.company.abstractfactory.textbox.DarkTextBox;
import com.company.abstractfactory.textbox.TextBox;

public class DarkUIFactory extends UIFactory {
    public Button drawButton() {
        return new DarkButton();
    }

    public TextBox createText() {
        return new DarkTextBox();
    }

}
