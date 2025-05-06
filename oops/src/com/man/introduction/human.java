package com.man.introduction;

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

    public static void main(String[] args) {
        human h= new human(18,"mallesh",67899,false);

    }


}
