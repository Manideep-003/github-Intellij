package comm.man;

public class BSearch {
    public static void main(String[] args) {
        int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 20};
        int ans = binarysearch(arr, 20);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1; // Adjusted to arr.length - 1 to include the last index
        while (l <= r) { // Changed from l < r to l <= r to include the last element
            int mid = l + (r - l) / 2; // Moved inside the loop
            if (target == arr[mid]) { // Corrected comparison
                return mid;
            } else if (target < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
