package com.mann;
import java.util.*;
public class Search_in_String {
    public static void main(String[] args) {
        String name="David goggins";
        char t='d';
        System.out.println(search(name,t));
    }
    static boolean search(String str, char x){
      if(str.length()==0){
        return false;

      }
//      for(int i=0;i<str.length();i++){
//        if(x==str.charAt(i)){
//            return true;
//        }
//      }
        for(char ch: str.toCharArray())
        {
            if (x==ch){
                return true;
            }
        }
      return false;
    }
}
