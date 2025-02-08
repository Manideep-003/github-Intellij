package com.m;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println(summ());
    }

    static int  summ() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int x= sc.nextInt();
        int y= sc.nextInt();
        return (x+y);
    }
}
