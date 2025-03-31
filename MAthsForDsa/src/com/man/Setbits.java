package com.man;

public class Setbits {
    public static void main(String[] args) {
        int n=7 ;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(set_bits(n));
    }

    private static int set_bits(int n) {
        int count=0;
        while (n>0){
            count+=1;
            n= n & (n-1);
        }
//
//        while (n>0){
//            count+=1;
//            n-= (n & -n);
//        }
        return count;
    }
}
