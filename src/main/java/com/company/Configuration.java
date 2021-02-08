package com.company;

import java.util.*;

public class Configuration {
    private static Configuration instance;
    private static HashMap<String, String> hmap = new HashMap<String, String>();
    public static  int counter = 0;

    private Configuration() {
        counter++;
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
            readProperties();
        }
        return instance;
    }

    public static void readProperties() {
        ResourceBundle rb = ResourceBundle.getBundle("config");
        Enumeration<String> keys = rb.getKeys();
        while (keys.hasMoreElements()) {
             String key = keys.nextElement();
            hmap.put(key, rb.getString(key));
        }
    }

    public String getProperty(String propertyName) {
        return hmap.get(propertyName);
    }
}

