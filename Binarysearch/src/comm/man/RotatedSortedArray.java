package comm.man;

public class RotatedSortedArray {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int pivot=findMax(nums);
       if(pivot==-1){
           return binarysearch(nums,target,0,nums.length-1);
       }
       if(nums[pivot] == target){
           return pivot;
       }
       if(target> nums[0]){
           return binarysearch(nums,target,0,pivot-1);
       }
       return binarysearch(nums,target,pivot+1,nums.length-1);

    }
    int findMax(int [] arr){
        int max=arr[0];
        int maxi=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]> max){
                max=arr[i];
                maxi=i;
            }
        }
        return maxi;
    }
    static int binarysearch(int [] arr,int target,int start,int end)
    {
        // Adjusted to arr.length - 1 to include the last inde
        while (start<= end) { // Changed from l < r to l <= r to include the last element
            int mid = start + (end-start) / 2; // Moved inside the loop
            if(target==arr[mid]){
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {

                start= mid + 1;
            }

        }
        return -1;
    }
}
