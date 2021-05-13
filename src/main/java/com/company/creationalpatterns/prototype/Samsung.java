package com.company.creationalpatterns.prototype;

public class Samsung extends SmartPhone {

    public Samsung(String model) {
        this.setPrice(5000);
        this.setModel(model);
    }

    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        Samsung newPhone = new Samsung(this.getModel());
        newPhone.display = new Display();
        newPhone.display.name = this.display.name;
        return (Samsung) newPhone;
    }
}
