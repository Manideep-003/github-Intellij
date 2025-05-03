package com.man.introduction.pakage;

public class human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    public human(int age,String name,int salary,boolean married){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
        this.population+=1;
    }


}
