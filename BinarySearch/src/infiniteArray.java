public class infiniteArray {
    public void main() {

        int [] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        print(ans(arr,target));
    }
    static int ans(int []arr,int target){
        int start=0;
        int end=1;
        while(target > arr[end]){
            int newstart=end+1;
            end=end+(end - start +1);
            start=newstart;

        }
        return binarysearch(arr,target ,start,end);
    }
}
    static int binarysearch(int[] arr,int target,int start,int end){

        // Adjusted to arr.length - 1 to include the last index
        while (start<= end) { // Changed from l < r to l <= r to include the last element
            int mid = start + (end - start) / 2; // Moved inside the loop
            if (target == arr[mid]) { // Corrected comparison
                return arr[mid];
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }




