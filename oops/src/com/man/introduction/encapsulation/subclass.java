package com.man.introduction.encapsulation;

import com.man.introduction.Access.A;

public class subclass extends A {
    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass c=new subclass(45,"kunaal");
        int n=c.num;

    }
}
