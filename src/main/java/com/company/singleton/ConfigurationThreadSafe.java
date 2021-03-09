package com.company.singleton;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

public class ConfigurationThreadSafe {
    private static ConfigurationThreadSafe instance;
    private static HashMap<String, String> hmap = new HashMap<String, String>();
    public static int counter = 0;

    private ConfigurationThreadSafe() {
        counter++;
    }

    public static synchronized ConfigurationThreadSafe getInstance() {
        if (instance == null) {
            instance = new ConfigurationThreadSafe();
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
