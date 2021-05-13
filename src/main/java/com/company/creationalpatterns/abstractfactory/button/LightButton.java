package com.company.creationalpatterns.abstractfactory.button;

public class LightButton extends Button {
    @Override
    public void draw() {
        System.out.println("here I draw a light square button");
    }
}
