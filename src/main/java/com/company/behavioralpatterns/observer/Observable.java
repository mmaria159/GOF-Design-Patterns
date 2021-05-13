package com.company.behavioralpatterns.observer;

public interface Observable {
    void addUser(Observer user);

    void deleteUser(Observer user);

    void notifyUsers();
}
