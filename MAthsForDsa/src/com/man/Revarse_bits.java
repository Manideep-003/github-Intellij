package com.man;

public class Revarse_bits {
    public static void main(String[] args) {
//    input is 00000010100101000001111010011100
//    output is 00111001011110000010100101000000 (reversing given 32 bit number)
    }
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            result=result<<1;
            result=result | (n & 1);
            n=n>>1;

        }
        return result;
    }
}
