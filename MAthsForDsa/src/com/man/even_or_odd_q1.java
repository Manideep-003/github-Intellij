package com.man;

public class even_or_odd_q1 {
    public static void main(String[] args) {
       int n=47 ;
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n) {
        return (n & 1)==1;
    }
}
