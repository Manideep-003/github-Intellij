package comm.man;

public class Findfirstandlastelement {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {

        int [] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    //this fumction returns index value
    int search(int [] nums,int target,boolean findstartindex){
       int ans=-1;
        int start = 0;
        int end = nums.length - 1; // Adjusted to arr.length - 1 to include the last index
        while (start<= end) { // Changed from l < r to l <= r to include the last element
            int mid = start + (end - start) / 2; // Moved inside the loop

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            }
            //here we just updated the target==mid case and we dont know that element may be left side or right side
            // so we use boolean case if true we reduce the right to mid -1 else we modify it to left to mid+1
            else {
                //potential answer found
                ans = mid;
                if (findstartindex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
         return ans;
    }
}