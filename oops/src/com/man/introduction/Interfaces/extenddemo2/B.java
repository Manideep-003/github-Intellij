package com.man.introduction.Interfaces.extenddemo2;

public interface B {
    public void greet();
    static void greeting(){
        System.out.println("im from b");
    }
    default void fun(){
        System.out.println("im from B");
    }
}
