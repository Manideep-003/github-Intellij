package comm.man;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,3,4,5,6};
        int ans = ordrAgnosticBinarySearch(arr, 20);
        System.out.println(ans);
        int [] arr2={70,60,50,40,30,20,10};
        int ans2=ordrAgnosticBinarySearch(arr2,10);
        System.out.println(ans2);
    }
    static int ordrAgnosticBinarySearch(int [] arr,int target)
    {
        int l = 0;
        int r = arr.length - 1; // Adjusted to arr.length - 1 to include the last index
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
}
