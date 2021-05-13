package com.company.creationalpatterns.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        SmartPhone note10 = new Samsung("Note10");
        SmartPhone iphoneX = new Apple("iPhoneX");

        System.out.println(note10);
        System.out.println(iphoneX);

        System.out.println("Cloneable SmartPhone");

        note10.display.name = "abc";
        SmartPhone note10Gold = note10.clone();
        note10.display.name = "xyz";

        System.out.println(note10.display.name);
        System.out.println(note10Gold.display.name);


        note10Gold.setAdditionalPrice(1200);
        System.out.println("The price of " + note10Gold.getModel() + " is "+ note10Gold.getPrice());
        System.out.println(note10Gold);

        SmartPhone iphoneX128 = iphoneX.clone();
        iphoneX128.setAdditionalPrice(2200);
        System.out.println("The price of " + iphoneX128.getModel() + " is "+ iphoneX128.getPrice());
        System.out.println(iphoneX128);
    }
}
