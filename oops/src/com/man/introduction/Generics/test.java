package com.man.introduction.Generics;

import java.util.Arrays;

public class test<T>{
    private Object [] data;
    private static int defaultsize=2;
    private int size=0;
    public test(){
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
        Object[] temp=new Object[data.length*2];
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
      test<Integer> list =new test<>();
      list.add(2);
      list.add(4);
      list.add(6);
      list.add(5);
      list.add(4);
        System.out.println(list);
    }
}
