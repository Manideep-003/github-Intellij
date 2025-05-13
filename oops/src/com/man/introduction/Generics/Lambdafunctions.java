package com.man.introduction.Generics;

import java.util.ArrayList;

public class Lambdafunctions {
    public static void main(String[] args) {
        ArrayList<Integer> x=new ArrayList<>();
        for (int i=0;i<10;i++){
            x.add(i+1);

        }
        x.forEach((item)-> System.out.print(item+1+" "));
        System.out.println();
        Operation sum=(a,b)->(a+b);
        Operation sub=(a,b)->(a-b);
        Operation mul=(a,b)->(a*b);
        Operation div=(a,b)->(a/b);
        Operation mod=(a,b)->(a%b);
        Lambdafunctions mycal=new Lambdafunctions();
        System.out.println(mycal.operation(2,3,mul));
        System.out.println(mycal.operation(2,3,sum));
        System.out.println(mycal.operation(2,3,div));
        System.out.println(mycal.operation(2,3,sub));
    }
   private int operation(int a,int b,Operation op){
        return op.operation(a,b);
   }
}
interface Operation{
    int operation(int a,int b);
}