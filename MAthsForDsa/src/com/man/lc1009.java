package com.man;

public class lc1009 {
    public static void main(String[] args) {

    }
    public int bitwiseComplement(int n) {
        int bit_lenth=Integer.toBinaryString(n).length();
        int mask=(1<<bit_lenth)-1;
        int result=~n & mask;
        return result;
    }
}
