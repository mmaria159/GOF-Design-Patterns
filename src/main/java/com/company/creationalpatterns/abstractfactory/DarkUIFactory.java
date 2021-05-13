package com.company.creationalpatterns.abstractfactory;
import com.company.creationalpatterns.abstractfactory.button.Button;
import com.company.creationalpatterns.abstractfactory.button.DarkButton;
import com.company.creationalpatterns.abstractfactory.textbox.DarkTextBox;
import com.company.creationalpatterns.abstractfactory.textbox.TextBox;

public class DarkUIFactory extends UIFactory {
    public Button drawButton() {
        return new DarkButton();
    }

    public TextBox createText() {
        return new DarkTextBox();
    }

}
