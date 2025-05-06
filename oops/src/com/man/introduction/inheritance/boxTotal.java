package com.man.introduction.inheritance;

public class boxTotal extends boxWeight{
    String color;
    boxTotal(){
        this.color="null";
    }
    boxTotal(int l,int w,int h,int weight,String color){
        super(l,h,w,weight);
        this.color=color;
    }
}
