package com.company.behavioralpatterns.observer;

public class ObserverTest {
    public static void main(String[] args) {

        OnlineShop onlineShop = new OnlineShop();

        onlineShop.addNotification("Only now get a 15% discount on the entire range of shoes");
        onlineShop.addNotification("Zara and Mango are waiting for you, 10% discount");

        Observer user1 = new User("Maria");
        Observer user2 = new User("Ion");

        onlineShop.addUser(user1);
        onlineShop.addUser(user2);
        onlineShop.addNotification("Super hot deals");
        onlineShop.deleteNotification("Zara and Mango are waiting for you, 10% discount");

    }
}
