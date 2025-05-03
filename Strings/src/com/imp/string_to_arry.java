package com.imp;
import java.util.*;
import java.lang.StringBuffer;
import java.lang.String;
public class string_to_arry {
    public static void main(String[] args) {
        String s="Mani deep likes video editing";
        char [] s1=s.toCharArray();
        String [] s2=s.split(" ");
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        ArrayList<String> an=new ArrayList<>();
        for(String x:s2){
           StringBuilder sb= new StringBuilder(x);
           StringBuilder ans=sb.reverse();
            System.out.print(ans);
        }
        System.out.println(an);

    }
}
