package com.homework.duoTai3;

public class AssociateProfessor extends Teacher {
    private String post = "AssociateProfessor";
    private double salary = 1.2;
    public AssociateProfessor(){}

    public AssociateProfessor(String name, int age, String post, double salary, String post1, double salary1) {
        super(name, age, post, salary);
        this.post = post1;
        this.salary = salary1;
    }

    @Override
    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPost() {
        return post;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void interoduce() {
        System.out.println( "AssociateProfessor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary() +
                '}');
    }
}
