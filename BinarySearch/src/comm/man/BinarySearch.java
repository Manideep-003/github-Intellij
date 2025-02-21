package comm.man;

public class BinarySearch {
    public static void main(String[] args) {

    }
    static int binarysearch(int [] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1; // Adjusted to arr.length - 1 to include the last inde
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


