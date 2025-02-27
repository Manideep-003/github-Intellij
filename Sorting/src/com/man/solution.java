package com.man;

import java.util.ArrayList;
import java.util.List;

//asked google
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class Solution {
    public int findDuplicate(int[] nums){
        int i=0;
        while (i<nums.length){
            if(nums[i]== i+1){
              i++;
            }
            else{
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else{
                    return nums[i];
                }
            }
        }



      return -1;
    }


     void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}