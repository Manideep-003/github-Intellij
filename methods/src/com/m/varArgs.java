package com.m;
import java.util.Arrays;
public class varArgs {
    public static void main(String[] args) {
        arr(1,2,3,4,5,6,67,8,9);
    }
    static void arr(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
