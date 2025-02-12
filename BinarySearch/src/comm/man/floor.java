package comm.man;

public class floor {
    public static void main(String[] args) {

    }
    static int floor(int [] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1; // Adjusted to arr.length - 1 to include the last index
        boolean isAsc=arr[start]<arr[end];
        while (start<= end) { // Changed from l < r to l <= r to include the last element
            int mid = start + (end-start) / 2; // Moved inside the loop
            if (target == arr[mid]) { // Corrected comparison
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start= mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start= mid + 1;
                }
            }
        }
        return end;
    }
}
