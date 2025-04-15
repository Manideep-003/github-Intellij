package com.man;

public class Numberofbits_lc191 {
//    https://leetcode.com/problems/number-of-1-bits/
    public int hammingWeight(int n) {
            int count =0;
                while(n>0){
                    count+=1;
                    n=n & (n-1);
                }
                return count;
    }
}
