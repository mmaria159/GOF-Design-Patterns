package com.company.behavioralpatterns.memento;

import java.util.Stack;

public interface Caretaker {
    Stack<Memento> stack = new Stack<Memento>();

    void addMemento(Memento m);

    Memento getMemento();
}