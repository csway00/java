package com.homework.fangwuchuzuxitong;

import java.util.Scanner;

/**
 * change（）方法添加功能
 *
 */
public class House {
    private String name;
    private String address;
    private long money;
    private String state;
    Scanner scanner = new Scanner(System.in);
    //数组长度初始化
    int j = 0;
    //new 数组
    House house[] = new House[j];
    //数组下标
    int i = 0;

    public House() {
    }

    public House(String name, String address, long money, String state) {
        this.name = name;
        this.address = address;
        this.money = money;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "name:" + name + "\t" +
                "address:" + address + "\t" +
                "state:" + state + "\t" +
                "money:" + money;
    }

    //菜单
    public void menu() {
        boolean flags = true;
        System.out.println("========菜单=======");
        System.out.println("\t1.增");
        System.out.println("\t2.查");
        System.out.println("\t3.删");
        System.out.println("\t4.改");
        System.out.println("\t5.列表");
        System.out.println("\t6.退出");
        do {
            System.out.print("输1-6：");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    find();
                    break;
                case 3:
                    del();
                    break;
                case 4:
                    change();
                    break;
                case 5:
                    list();
                    break;
                case 6:
                    System.out.print("确认退出？（y/n）：");
                    String yn = "";
                    while (true) {
                        yn = scanner.next();
                        if (yn.equals("y") || yn.equals("n")) {
                            break;
                        }
                        System.out.print("yn输错了，重输：");
                    }
                    switch (yn) {
                        case "y":
                            flags = false;
                            break;
                        case "n":
                            break;
                    }
                    break;
                default:
                    System.out.println("选项输错了");
                    break;
            }
        } while (flags);
    }

    //1
    public void add() {
        System.out.println("--------添加房屋----------");
//        int j = 0;
//        House house[] = new House[j];
        House[] houses = new House[house.length + 1];
        //复制数组
        for (int k = 0; k < house.length; k++) {
            houses[k] = house[k];
        }
        j++;
        house = houses;
        System.out.println(house.length);
        house[i] = new House();
//        House house[] = new House[0];
//        House[] houses = new House[house.length + 1];
//        house = houses;
//        System.out.println(house.length);
//        int i= 0;
//        house[i] = new House();
//        Scanner scanner = new Scanner(System.in);
        //name
        System.out.print("name:");
        String name = scanner.next();
        house[i].setName(name);

        System.out.print("address:");
        String address = scanner.next();
        house[i].setAddress(address);


        System.out.print("state:");
        String state = scanner.next();
        house[i].setState(state);

        System.out.print("money:");
        long money = scanner.nextLong();
        house[i].setMoney(money);
        System.out.println("--------添加完成----------");
        i++;

    }

    //2
    public void find() {
        System.out.println("--------查询房屋----------");
        System.out.print("请输入房屋编号：");
        int id = scanner.nextInt();
        if (id > house.length) {
            System.out.println("无此房屋！！！");
        } else {
            System.out.println(house[id - 1]);
        }
    }

    //5
    public void list() {
        System.out.println("--------房屋list----------");
        for (int k = 0; k < house.length; k++) {
            System.out.println(house[k]);

        }
    }

    //3
    public void del() {
        System.out.println("--------删除房屋----------");
        System.out.print("请输入要删除房屋的编号：");
        int id = scanner.nextInt();
        if (id > house.length) {
            System.out.println("无此房屋！！！");
        } else {
            //确认删除稍后写
            //house[id - 1] = null;
            for (int k = id; k < house.length; k++) {
                house[k - 1] = house[k];
            }
            House house1[] = new House[house.length - 1];
            for (int g = 0; g < house1.length; g++) {
                house1[g] = house[g];
            }
            house = house1;
            i--;
        }
    }

    //4
    public void change() {
        System.out.println("--------改房屋----------");
        System.out.print("请输入要改房屋的编号：");
        int id = scanner.nextInt();
        if (id > house.length) {
            System.out.println("无此房屋！！！");
        } else {
            System.out.print("name:(" + house[id - 1].name + ")");
            String name = scanner.next();
            //需增加若只回车，则不修改的功能
            house[id - 1].setName(name);

            System.out.print("address:");
            String address = scanner.next();
            house[id - 1].setAddress(address);

            System.out.print("state:");
            String state = scanner.next();
            house[id - 1].setState(state);

            System.out.print("money:");
            long money = scanner.nextLong();
            house[id - 1].setMoney(money);
            System.out.println("--------修改完成----------");
        }
    }
}


