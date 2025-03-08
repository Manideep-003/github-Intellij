package com.mann;

public class FindMin {
    public static void main(String[] args) {
        int[] array=new int[5];
        array= new int[]{64, 107, 44, 56, 99};
        System.out.println(FindMin(array));

    }
    static int FindMin(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min)
            {
                min=arr[i];

            }
        }
        return min;
    }
}
