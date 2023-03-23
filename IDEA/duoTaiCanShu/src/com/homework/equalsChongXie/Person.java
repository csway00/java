package com.homework.equalsChongXie;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //方法1
    public boolean equals(Object p) {
        if (this == p) {
            return true;
        } else if (p instanceof Person) {
            Person p1 = (Person) p;
            return name.equals(p1.name) &&
                    job.equals(p1.job) &&
                    age == p1.age;
        }
        return false;


    }
}
//方法2
//public boolean equals(Object p) {
//       if(this == p){
//           return true;
//       } else if(p instanceof Person) {
//           Person p1 = (Person) p;
//           if (name == p1.name) {
//                if (age == p1.age) {
//                    if (job == p1.job) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }



