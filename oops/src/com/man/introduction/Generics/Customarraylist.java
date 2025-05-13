package com.man.introduction.Generics;

import java.util.Arrays;

public class Customarraylist{
    private int [] data;
    private static int defaultsize=2;
    private int size=0;
    public Customarraylist(){
        this.data=new int[defaultsize];
    }
    public void add(int num){
        if (isfull()) {
            resize();
        }
        data[size++]=num;
    }
    private boolean isfull(){
        return size== data.length;
    }
    public void resize(){
        int[] temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];

        }
        data=temp;
    }
    public int remove(){
        int removed=data[size--];
        return removed;
    }
    public int size(){
        return size;
    }
    public void setData(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        Customarraylist c= new Customarraylist();
        c.add(1);
        c.add(3);
        c.add(4);
        c.add(6);
        c.add(10);
        System.out.println(c);
        System.out.println(c.size);
    }
}
