package com.company.prototype;

public class Apple extends SmartPhone {

    public Apple(String model) {
        this.setPrice(15000);
        this.setModel(model);
    }

    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        return (Apple) super.clone();
    }
}
