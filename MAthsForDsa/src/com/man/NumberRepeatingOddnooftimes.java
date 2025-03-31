package com.man;

public class NumberRepeatingOddnooftimes {
    public static void main(String[] args) {
      int [] arr={2,2,2,4,4,4,3,3,3,5,5,5,6};
        System.out.println(findelement(arr));
    }

    private static int findelement(int[] arr) {
        int twos=0;
        int ones=0;
        for(int num:arr){
            ones=(ones^num)&~twos;
            twos=(twos^num)&~ones;

        }
        return ones;
    }

}
