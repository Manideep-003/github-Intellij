package com.man.introduction.inheritance;

public class boxWeight extends box{
    int weight;
    public boxWeight(){
        this.weight=-1;
    }
     boxWeight(int l,int w,int h,int weight){
        super(l,h,w);
        this.weight=weight;
    }
}
