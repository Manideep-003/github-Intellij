package com.m;
import java.util.*;
public class prime {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isAmstongnumber(153));
    }
    static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean isAmstongnumber(int n){
       int og=n;
       int sum=0;
       int r;
       while(n>0){
           r=n%10;
           n=n/10;
           sum+=r*r*r;
       }
       if(og==sum){
           return true;
       }
       else{
           return false ;
       }
    }
}
