package com.man.introduction.Generics;

import java.util.Arrays;

public class wildcard<T extends Number>{
    private Object [] data;
    private static int defaultsize=2;
    private int size=0;
    public wildcard(){
        this.data=new Object[defaultsize];
    }
    public void add(T num){
        if (isfull()) {
            resize();
        }
        data[size++]=num;
    }
    private boolean isfull(){
        return size== data.length;
    }
    public void resize(){
        Object[] temp=new Object[data.length*3];
        for (int i = 0; i < data.length; i++) {
            temp[i]=(T)(data[i]);

        }
        data=temp;
    }
    public T remove(){
        T removed=(T)(data[size--]);
        return removed;
    }
    public int size(){
        return size;
    }
    public void setData(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
      wildcard<Integer> s= new wildcard<>();
//        wildcard<String> s1= new wildcard<>();

    }
}
