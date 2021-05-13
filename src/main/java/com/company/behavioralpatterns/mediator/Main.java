package com.company.behavioralpatterns.mediator;

public class Main
{
    public static void main(String[] args)
    {
        IChatRoom chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom,"1", "Alex");
        User user2 = new ChatUser(chatroom,"2", "Ion");
        User user3 = new ChatUser(chatroom,"3", "Maria");
        User user4 = new ChatUser(chatroom,"4", "David");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.send("Hello Ion", "2");
        user2.send("Hey Alex", "1");
    }
}