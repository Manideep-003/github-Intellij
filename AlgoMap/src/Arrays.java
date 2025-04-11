public class Arrays {
    public static void main(String[] args) {

    }
//    problem 1
class Solution {
    public int findClosestNumber(int[] nums) {
        int min=nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if(Math.abs(nums[i])<Math.abs(min)){

                min=Math.abs(nums[i]);
            }

            else if (Math.abs(nums[i])==Math.abs(min) && nums[i]>min){


                    min = nums[i];

            }

        }
        return min;
    }
}
    public int removeElement(int[] nums, int val) {
       int xr=0;
       int count=0;
        int result=0;
        for(int x:nums){
            xr^=x;

            if(xr==0 &&){
                count++;
            }
        }
        return count;

    }
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<=r){

            if(numbers[l]+numbers[r]==target) {
                return new int[]{l, r};
            }
            if (numbers[l]+numbers[r]>target){
                r--;
            }
            else {
                l++;
            }

        }
        return new int []{-1,-1};
    }
    public int removeElement(int[] nums, int val) {

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int : nums) {
                if (num == val) {
                    count++;
                }
            }


        }
        return nums.length-count;
    }
    public void rotate(int[] nums, int k) {
        int [] x=new int[nums.length];
        for (int j = 0; j < k; j++) {
            x[j]=nums[j];
        }
        int xy=0;
        for (int i = nums.length-k;i <nums.length ; i++) {
            nums[xy]=nums[i];
            xy++;
        }
        for (int m=nums.length-k;m<nums.length;m++){
            nums[m]=nums[]
        }
    }
}
