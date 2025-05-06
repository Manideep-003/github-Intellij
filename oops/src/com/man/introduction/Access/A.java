package com.man.introduction.Access;

public class A {
    protected int num;
    String name;


    public void setNum(int num) {
        this.num = num;
    }
    public int getnum(){
        return num;
    }

    public A(int num, String name){
        this.num=num;
        this.name=name;

    }
}
