package com.company.behavioralpatterns.memento;

public class EmployeCareTaker implements Caretaker {
    @Override
    public void addMemento(Memento m) {
        stack.push(m);
    }
    @Override
    public Memento getMemento() {
        return stack.pop();
    }
}