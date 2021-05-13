package com.company.creationalpatterns.factory;

public class BonusReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("There is a report about bonus");
    }
}
