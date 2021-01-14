package com;

public class Teacher {
    public String name; //老师姓名

    public Teacher(){
        this.name = name;
    }


    public void check(int score){
        try{System.out.println(score/0);}
        catch(MyException e){
            System.out.println("成功");
        }
    }
}
