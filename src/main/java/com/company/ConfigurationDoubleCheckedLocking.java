package com.company;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

public class ConfigurationDoubleCheckedLocking {
    private static volatile ConfigurationDoubleCheckedLocking instance;
    private static HashMap<String, String> hmap = new HashMap<String, String>();
    public static  int counter = 0;

    private ConfigurationDoubleCheckedLocking() {
        counter++;
    }

    public static ConfigurationDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (ConfigurationDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new ConfigurationDoubleCheckedLocking();
                }
            }
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

