package com.homwork.dt4;

public class Employee {
    private String name;
    private double salary;
    private int days;

    public Employee() {
    }

    public Employee(String name, double salary, int days) {
        this.name = name;
        this.salary = salary;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void print(){
        System.out.println(getName() + "工资 " + salary * days);
    }
}
