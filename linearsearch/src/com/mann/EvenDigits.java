package com.mann;
import java.util.*;
public class EvenDigits {
    public static void main(String[] args) {
        System.out.println(digit_count(23456));
    }
    static int FindNumbers(int[] nums){
        int count =0;
        for(int num:nums){
            if (even(num))
            {
                count++;
            }
        }
        return count;
    }
    //function to check weather number contains even digits or not
    static boolean even(int num)
    {  int numberofdigits=digits(num);
        if(numberofdigits%2==0)
        {
            return true;
        }
        return numberofdigits%2==0;
    }
    static int digits(int num){
       if(num<0)
       {
           num=num*-1;
       }
        int count=0;
        if(num==0)
        {
            return 1;
        }
        while (num>0)
        {
            count++;
            num=num/10;

        }
        return count;
    }
    static int digit_count(int num)
    {
        return ((int)(Math.log10(num)+1));
    }
}
