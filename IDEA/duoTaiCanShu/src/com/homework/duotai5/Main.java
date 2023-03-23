package com.homework.duotai5;

public class Main {
    public static void main(String[] args) {
        Person s1 = new Student("kiti",23,2123);
        Person s2 = new Student("kay",21,2124);
        Person t1 = new Teacher("smith",33,11);
        Person t2= new Teacher("join",43,21);

        Person arry[] =  {s1,s2,t1,t2};
        for (int i = 0; i <arry.length-1 ; i++) {
            for (int j = 0; j <arry.length-1-i; j++) {
                if (arry[j].getAge() < arry[j + 1].getAge()) {
                    Person temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;

                    }
                }

            }
        for (int i = 0; i < arry.length
                ; i++) {
            arry[i].print(arry[i]);

        }

        }




    }

//Promise法2
//class Promise{
//    public static void promise(Person p){
//        if(p instanceof Student){
//            ((Student) p).stady();
//        } else if(p instanceof Teacher){
//            ((Teacher)p).say();
//        }
//    }
//}
