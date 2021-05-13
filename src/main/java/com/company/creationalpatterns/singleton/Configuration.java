package com.company.creationalpatterns.singleton;

import java.util.*;

public class Configuration {
    private static Configuration instance;
    private static HashMap<String, String> hmap = new HashMap<String, String>();
    public static int counter = 0;

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

    public String getEmailUser() {
        return getProperty("email.user");
    }

    public String getEmailPwd() {
        final String encodedPwd = getProperty("email.pwd");
        final String password = new String(Base64.getDecoder().decode(encodedPwd));
        return password;
    }


}

