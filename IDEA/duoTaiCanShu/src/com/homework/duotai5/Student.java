package com.homework.duotai5;

public class Student extends Person{
    public Student(String name, int age, double id) {
        super(name, age, id);
    }
    public void stady(){
        System.out.println(getName() +"承诺：我要好好学习" + "\n-----------");
    }
    public void print(Person p){
        System.out.println("学生基本信息\n" + "naem：" + getName()+
                "\nage:"+ getAge() + "\nid:"+ getId()
                );
        promise(p);
    }
}
