package com.company.factory;

public class Main {
    public static void main(String[] args)
    {
        ReportFactory reportFactory = new ReportFactory();
        Report report = reportFactory.createReport("Bonus");
        Report report2 = reportFactory.createReport("Production");
        Report report3 = reportFactory.createReport("Income");
        //Report report4 = reportFactory.createReport("Sales");

        report.generateReport();
        report2.generateReport();
        report3.generateReport();
        //report4.generateReport();

    }
}

