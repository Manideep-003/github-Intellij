package com.m;
import java.util.*;
import java.util.Arrays;
public class Passing_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] x={1,2,3,4,5};
        passing_array(x);
        System.out.println(Arrays.toString(x));
    }
    static void passing_array(int[] arr){
        arr[0]=67;

    }
}
