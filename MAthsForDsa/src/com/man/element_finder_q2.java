package com.man;

public class element_finder_q2 {
    public static void main(String[] args) {
      int [] arr={2,2,2,3,3,1,1,1,1,6,2,3,3,4,4,4,4};
        System.out.println(ans(arr));
    }
    static int ans(int [] arr){
        int unique=0;
        for(int x:arr){
            unique=unique^x;
        }
        return unique;
    }
}
