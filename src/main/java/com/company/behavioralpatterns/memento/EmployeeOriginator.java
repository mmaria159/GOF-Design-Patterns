package com.company.behavioralpatterns.memento;

public class EmployeeOriginator implements Originator {
    private String name;
    private int id;
    private String birthday;
    private String city;
    private float salary;

    public EmployeeOriginator(String name, int id, String birthday, String city, float salary) {
        super();
        this.name = name;
        this.id = id;
        this.birthday = birthday;
        this.city = city;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public Memento save() {
        return new EmployeMemento(salary);
    }

    @Override
    public void restore(Memento memento) {
        this.salary = memento.getSalary();
    }

    @Override
    public String toString() {
        return "EmployeeOriginator [Name=" + name + ", id=" + id + ", Birthday" +
                "=" + birthday + ", City=" + city + ", Salary="
                + salary + "]";
    }
}
