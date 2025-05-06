package com.man.introduction.inheritance;

public class box {
    int l;
    int h;
    int w;
    box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    //cube
    box(int side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    //cuboid
    box(int len,int bredth,int height){
        this.l=len;
        this.w=bredth;
        this.h=height;
    }
    box(box old){
        this.l= old.l;
        this.h= old.h;
        this.w= old.w;
    }
    public void info(){
        System.out.println("running the box");
    }
}
