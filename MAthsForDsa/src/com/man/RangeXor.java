package com.man;

public class RangeXor {
    public static void main(String[] args) {
      //range xor a,b
      //       ans=xor(b)-xor(a-1)
        int a=3,b=9;
        int ans= xor(b) ^ xor(a-1);
        System.out.println(ans);
//        int ans2=0; this will give TLE time limit exceed
//        for(int i=a;i<=b;i++){
//            ans2^=i;
//        }
//        System.out.println(ans2);
    }
    static int xor(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
      return 0;
    }
}
