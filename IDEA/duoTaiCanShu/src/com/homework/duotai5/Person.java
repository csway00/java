package com.homework.duotai5;

public class Person {
    private String name;
    private int age;
    private double id;

    public Person() {
    }

    public Person(String name, int age, double id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
    public void print(Person p){
        System.out.println("xxx基本信息\n" + "naem：" + getName()+
                "\nage:"+ getAge() + "\nid:"+ getId()+
                "\n-----------");
    }
    public  void promise(Person p){
        if(p instanceof Student){
            ((Student) p).stady();
        } else if(p instanceof Teacher){
            ((Teacher)p).say();
        }
    }
}
