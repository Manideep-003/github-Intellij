package com.man;

public class singleNumber_lc136 {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
      int result=0;
      for(int x:nums){
          result^=x;
      }
      return result;
    }

}
