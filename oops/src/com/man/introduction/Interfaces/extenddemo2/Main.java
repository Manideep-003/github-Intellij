package com.man.introduction.Interfaces.extenddemo2;

public class Main implements A,B{
    @Override
    public void greet() {
        System.out.println("overriding from main");
    }

    public static void main(String[] args) {
        B.greeting();
        B obj=new Main();
        obj.fun();
    }

    @Override
    public void fun() {
        B.super.fun();
    }
}

