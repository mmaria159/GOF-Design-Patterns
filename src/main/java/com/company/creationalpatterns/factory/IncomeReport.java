package com.company.creationalpatterns.factory;

public class IncomeReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("There is an income report");
    }
}
