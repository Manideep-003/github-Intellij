package comm.man;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {

    }
  int search(int[] arr, int target){
        int peak=peakindexarray(arr);
        int firstTry=binarysearch(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        else {
            return ordrAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
        }

  }

    public int peakindexarray(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start< end){
            int mid=start+(end-start)/2;
            if(arr[mid]> arr[mid+1]){
                end=mid;

            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
    static int ordrAgnosticBinarySearch(int [] arr,int target,int l,int r)
    {
         // Adjusted to arr.length - 1 to include the last index
        boolean isAsc=arr[l]<arr[r];
        while (l <= r) { // Changed from l < r to l <= r to include the last element
            int mid = l + (r - l) / 2; // Moved inside the loop
            if (target == arr[mid]) { // Corrected comparison
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }


    static int binarysearch(int [] arr,int target ,int start,int end)
    {
        // Adjusted to arr.length - 1 to include the last inde

        while (start<= end) { // Changed from l < r to l <= r to include the last element
            int mid = start + (end-start) / 2; // Moved inside the loop
            if (target == arr[mid]) { // Corrected comparison
                return arr[mid];
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
