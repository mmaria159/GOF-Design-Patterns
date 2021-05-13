package com.company.behavioralpatterns.memento;

public interface Originator {
    Memento save();

    void restore(Memento memento);

    void setSalary(float salary);
}