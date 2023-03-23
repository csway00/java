package com.homework.duotai5;

public class Teacher extends Person {
    public Teacher(String name, int age, double id) {
        super(name, age, id);
    }

    public void say() {
        System.out.println(getName() + "承诺：我要好好教书" + "\n-----------");
    }

    public void print(Person p) {
        System.out.println("老师基本信息\n" + "naem：" + getName() +
                "\nage:" + getAge() + "\nid:" + getId()
        );
        promise(p);

    }
}
