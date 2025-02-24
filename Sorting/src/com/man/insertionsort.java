package com.man;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        insertionrt(a);
        System.out.println(Arrays.toString(a));
    }

    static void insertionrt(int [] arr){
      for(int i=1;i<arr.length;i++){
          int temp=arr[i];
          int j=i-1;
          while(j>=0 &&arr[j]>temp){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=temp;
      }
    }


}
