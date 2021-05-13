package com.company.creationalpatterns.factory;

public class ClientReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("There is a report about a list of clients");
    }
}
