package com.company.behavioralpatterns.observer;

import java.util.List;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleNotification(List<String> notifications) {
        System.out.println("Dear: " + name + "\nWe have some changes in your watching list:" + notifications);

        System.out.println("..........................................");
    }
}
