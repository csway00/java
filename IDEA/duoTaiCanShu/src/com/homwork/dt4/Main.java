package com.homwork.dt4;

public class Main {
    public static void main(String[] args) {
        Manger mile = new Manger("mile", 300, 30);
        OrdinaryEmployees bob = new OrdinaryEmployees("bob", 200, 30);
        mile.print();
        bob.print();
    }
}
