package com.man;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = getmaxindex(arr, 0, last);
            swap(arr, maxindex, last);
        }

    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static int getmaxindex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i < last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}