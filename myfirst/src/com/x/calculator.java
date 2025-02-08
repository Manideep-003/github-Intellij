package com.x;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans = 0;
        while (true){
            char x=sc.next().trim().charAt(0);
            if(x=='+' || x=='-'|| x=='*'||x=='/')
            {
                int n1= sc.nextInt();
                int n2=sc.nextInt();
                if(x=='+'){
                    ans=n1+n2;
                }
                if(x=='-'){
                    ans=n1-n2;
                }
                if(x=='*'){
                    ans=n1*n2;
                }
                if(x=='/'){
                    ans=n1/n2;
                }
            }
            if(x=='x')
            {
                break;
            }
            System.out.println(ans);
        }

    }
}
