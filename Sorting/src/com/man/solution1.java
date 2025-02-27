package com.man;

import java.util.ArrayList;
import java.util.List;

public class solution1 {
    public int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        //just find missing number
        List<Integer> ans=new ArrayList<>();
        for (int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    }
 void swap(int[] arr, int i, int correct) {
    int temp=arr[i];
    arr[i]=arr[correct];
    arr[correct]=temp;
 }

}
