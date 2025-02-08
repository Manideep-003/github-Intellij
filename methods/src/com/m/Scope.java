package com.m;

public class Scope {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x=40;
        System.out.println(x);
        foo();
    }
    static void foo(){
        System.out.println(x);
    }
}
