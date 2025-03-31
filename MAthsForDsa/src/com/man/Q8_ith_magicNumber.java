package com.man;

public class Q8_ith_magicNumber {
    public static void main(String[] args) {
        System.out.println(magicNumbre(4));
    }
    static int magicNumbre(int n){
        int sum=0;
        int i=1;
        while(n>0){
//            int bin=n &(1<<(i-1))!=0?1:0;  it wont work beacuse as u right shift n you cant get its ith bit
            int bin= n & 1;
            sum+=bin*Math.pow(5,i);
            n=n>>1;
            i+=1;
        }
        return sum;
    }
}
