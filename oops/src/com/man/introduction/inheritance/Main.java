package com.man.introduction.inheritance;

public class Main {
    public static void main(String[] args) {
        box box=new box();
        System.out.println(box.l+" "+ box.h+" "+box.w);
        boxWeight b=new boxWeight(2,4,6,8);
        System.out.println(b.l+" "+b.w+" "+b.h+" "+b.weight);
        boxTotal t=new boxTotal(2,4,6,8,"blue");
        System.out.println(t.l+" "+t.w+" "+t.h+" "+t.weight+t.color);
    }
}
