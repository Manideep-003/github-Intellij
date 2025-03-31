package com.man;

public class ith_bitofANumber {
    public static void main(String[] args) {
        int n=10;
        System.out.println(ithbit(n,2));
    }
    static int ithbit(int n, int i) {
        return (n & (1 << (i - 1))) != 0 ? 1 : 0;
    }
}
