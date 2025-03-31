package com.man;

public class PowerofN {
    public static void main(String[] args) {
        int n=64;
        boolean myans=(n & (n-1))==0;
        System.out.println(myans);
    }
}

