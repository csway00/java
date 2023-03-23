package com.homework.equalsChongXie;

public class Equals {
    public static void main(String[] args) {
        Person lisu = new Person("nike", 13, "student");
        Person nike = new Person("nike", 13, "student");
        System.out.println(lisu.equals(nike));

    }
}
