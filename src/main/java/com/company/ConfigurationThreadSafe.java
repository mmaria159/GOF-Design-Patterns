package com.company;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

public class ConfigurationThreadSafe {
    private static ConfigurationThreadSafe instance = null;
    private static HashMap<String, String> hmap = new HashMap<String, String>();

    private ConfigurationThreadSafe() {
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
