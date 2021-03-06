package com.company.behavioralpatterns.mediator;

public interface IChatRoom
{
    void sendMessage(String msg, String userId);

    void addUser(User user);
}