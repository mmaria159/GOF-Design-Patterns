package com.company.creationalpatterns.factory;

public class ReportFactory {

    public Report createReport(String type) {
        switch (type) {
            case "Bonus":
                return new BonusReport();
            case "Income":
                return new IncomeReport();
            case "Production":
                return new ProductionReport();
            case "Client":
                return new ClientReport();
            default:
                throw new RuntimeException("This type of report " + type + " is unknown!");
        }
    }
}

