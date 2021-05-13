package com.company.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop implements Observable {
    private List<Observer> users = new ArrayList<>();
    private List<String> notifications = new ArrayList<>();

    public void addNotification(String notification) {
        System.out.println("New notification was added: " + notification);
        notifications.add(notification);
        notifyUsers();
    }

    public void deleteNotification(String notification) {
        System.out.println("Notification was removed: " + notification );
        notifications.remove(notification);
        notifyUsers();
    }

    @Override
    public void addUser(Observer user) {
        users.add(user);
    }

    @Override
    public void deleteUser(Observer user) {
        users.remove(user);
    }

    @Override
    public void notifyUsers() {
        users.forEach(i -> i.handleNotification(notifications));
    }
}
