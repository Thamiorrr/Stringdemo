package com;

public class Student {
    public String name; //学生姓名
    public int age; //学生年龄

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
