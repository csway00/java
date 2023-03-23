package com.duoTaiShuZu;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("红", 18, "IT");
        Person p2 = new Person("Mile", 34, "terchar");
        Person p3 = new Person("dk", 4, "cxy");
        Person p4 = new Person("rk", 24, "scs");
        Person arry[] = {p, p2, p3, p4};//多态数组
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i].getAge());
        }
        //对a[]进行冒泡排序
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j].getAge() < arry[j + 1].getAge()) {
                    Person temp = arry[j + 1];
                    arry[j + 1] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
    }
}
