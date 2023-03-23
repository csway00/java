package com.homwork.dt4;

public class Manger extends Employee{
    public Manger(String name, double salary, int days) {
        super(name, salary, days);
    }

    @Override
    public void print() {
        double gongZi = getSalary() * getDays() * 1.2 + 1000;
        System.out.println(getName() + "工资 " + (getSalary() * getDays() * 1.2 + 1000));
        System.out.println(getSalary() * getDays() * 1.2 + 1000);
    }
}
