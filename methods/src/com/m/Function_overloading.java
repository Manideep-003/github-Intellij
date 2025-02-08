package com.m;

public class Function_overloading {
    public static void main(String[] args) {
        fun(10);
        fun(10,20);
    }
    static void fun(int x){
        System.out.println(x);
    }
    static void fun(int x ,int y){
        System.out.println((x+y));
    }
}
