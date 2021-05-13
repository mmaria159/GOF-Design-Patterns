package com.company.behavioralpatterns.memento;

public class Main{
    public static void main(String[] args) {
        Caretaker caretaker = new EmployeCareTaker();
        Originator originator = new EmployeeOriginator("Maria",22,"1999-02-15","Milano",80000);
        originator.setSalary(85000);
        System.out.println(originator);
        caretaker.addMemento(originator.save());
        originator.setSalary(90000);
        System.out.println(originator);
        caretaker.addMemento(originator.save());
        originator.setSalary(95000);
        System.out.println(originator);
        originator.restore( caretaker.getMemento() );
        System.out.println(originator);
    }
}
