package com.company.behavioralpatterns.memento;

public class EmployeMemento implements Memento {
    private float salary;
    public EmployeMemento(float salary) {
        super();
        this.salary = salary;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}