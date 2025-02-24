package com.man;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        bubblesort(a);
        System.out.println(Arrays.toString(a));
    }

    static void bubblesort(int [] arr){
        int flag;
        for (int i=0;i<arr.length-1;i++){
            flag=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }

            }
            if(flag==0){
                break;
            }
        }

    }
}
