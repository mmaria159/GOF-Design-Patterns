package com.company.creationalpatterns.abstractfactory.button;

public class DarkButton extends Button {
    @Override
    public void draw() {
        System.out.println("here I draw a dark round button");
    }
}
