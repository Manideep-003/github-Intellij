package com.man.introduction.Access;

public class subclass extends A{
    public subclass(int num, String name) {
        super(num, name);
    }
//private variable cant be accessable in different classes
//
    public static void main(String[] args) {
        subclass c=new subclass(45,"kunaal");
        int n=c.num;

    }
}
