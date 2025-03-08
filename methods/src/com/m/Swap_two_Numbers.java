package com.m;
import java.util.*;
public class Swap_two_Numbers {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("after swapping:"+swap(a,b));

    }
    static int swap(int x,int y){
        int temp;
        temp=x;
        x=y;
        y=temp;

        return x;
    }
}
