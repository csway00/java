package com.homework.duoTai3;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("李明", 34, "math", 0.8);
        Teacher mike = new Professor("Mike", 30,"professor",1.3,"professor",1.3);
        Teacher luse = new AssociateProfessor("Luse", 33,"AssociateProfessor",1.2,"AssociateProfessor",1.2);
        Teacher bob = new Lecturer("Bob", 38,"Lecturer",1.1,"Lecturer",1.1);
        teacher.interoduce();
        mike.interoduce();
        luse.interoduce();
        bob.interoduce();



    }
}
