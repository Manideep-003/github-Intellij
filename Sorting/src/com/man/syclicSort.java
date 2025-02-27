package com.man;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/1557393917/
//question google
public class syclicSort {
    public List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> ans=new ArrayList<>();
        for (int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
        return ans;




    }

  void swap(int[] arr, int i, int correct) {
    int temp=arr[i];
    arr[i]=arr[correct];
    arr[correct]=temp;
  }
}
