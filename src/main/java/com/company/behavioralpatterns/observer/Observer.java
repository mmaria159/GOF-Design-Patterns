package com.company.behavioralpatterns.observer;

import java.util.List;

public interface Observer {
    void handleNotification(List<String> notifications);
}
