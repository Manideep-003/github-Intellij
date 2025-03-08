package com.x;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        int a=0,b=1,c=0;
        for(int i=1; i<=x;i++)
        {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }

    }

}
