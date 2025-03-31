package com.man;

public class ispowerofTwo {
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo(int n) {
      if(n>0){
          if((n & (n-1))==0){
              return true;

          }
      } else if (n==0) {
          return false;
      }


        return false;
    }
}
