package com.x;
import java.util.*;
public class Occurance_of_a_number {
    public static void main(String[] args) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            int r=n%10;
            if(r==7)
            {
                c+=1;
            }
            n=n/10;
        }
        System.out.println("occurance of 7 is :"+c);
    }
}
