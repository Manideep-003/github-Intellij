package comm.man.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        int [] nums={1,2,2};
        List<List<Integer>> s=subsets(nums);
        System.out.println(s);
    }
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0,end=0;
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i++){
           int n=outer.size();
           start=0;
           if(i>0 && nums[i]==nums[i-1]){
               start=end+1;
           }
              end=outer.size()-1;
           for (int j=start;j< n;j++){
               List<Integer> inner=new ArrayList<Integer>(outer.get(j));
               inner.add(nums[i]);
               outer.add(inner);
           }
        }
        return outer;
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
       int s=0,e=candidates.length-1;
       int sum=0,i=0,j=0;
       while(s<=e){
           sum+=candidates[i];
           if

       }
    }
}
