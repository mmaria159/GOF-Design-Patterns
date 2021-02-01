package com.company;

import java.util.*;

public class Configuration {

    private static Configuration instance = null;
    private HashMap<String, String> hmap = new HashMap<String, String>();

    private Configuration() {
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();

            ResourceBundle rb = ResourceBundle.getBundle("config");
            HashMap<String, String> hmap = new HashMap<String, String>();
            Enumeration<String> keys = rb.getKeys();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                String value = rb.getString(key);
                hmap.put(key, value);
            }
            System.out.println(hmap.size());
            System.out.println(hmap.get(3));

        }

        return instance;
    }

    public String getProperties(String propertyName) {
        return hmap.get(propertyName);
    }

}

