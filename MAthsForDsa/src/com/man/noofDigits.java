package com.man;

public class noofDigits {
    public static void main(String[] args) {
      int n=10;
      int b=2;
      int ans=(int)Math.ceil((Math.log(n)/Math.log(b)));
        System.out.println(ans);
        System.out.println(count(10));
    }
    static int count(int n){
//        method -2
        int cout=0;
        while (n>0){
            int bit=n&1;
            cout=cout+1;
            n>>=1;
        }
        return cout;
    }
}
