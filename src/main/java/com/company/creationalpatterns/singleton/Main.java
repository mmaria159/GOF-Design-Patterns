package com.company.creationalpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a lazy implementation");
        Configuration configuration = Configuration.getInstance();
        Configuration configuration1 = Configuration.getInstance();
        System.out.println(configuration.getProperty("db.url"));
        System.out.println(configuration1.getProperty("db.user"));
        System.out.println(Configuration.counter);

        System.out.println("This is a synchronized thread-safe implementation ");
        ConfigurationThreadSafe configurationThreadSafe = ConfigurationThreadSafe.getInstance();
        ConfigurationThreadSafe configThreadSafe = ConfigurationThreadSafe.getInstance();
        System.out.println(configurationThreadSafe.getProperty("db.user"));
        System.out.println(configThreadSafe.getProperty("db.url"));
        System.out.println(ConfigurationThreadSafe.counter);

        System.out.println("This is a Double Checked Locking implementation ");
        ConfigurationDoubleCheckedLocking configDoubleCheckedLocking = ConfigurationDoubleCheckedLocking.getInstance();
        System.out.println(configDoubleCheckedLocking.getProperty("db.password"));
    }
}
