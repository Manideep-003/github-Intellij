package comm.man;

public class SmallestLetterGreaterThantheTarget {
    public static void main(String[] args) {
        int [] arr={2,3,9,14,16,18};
        int target=15;
        int ans=smallest(arr,target);
        System.out.println(ans);
    }
    static int smallest(int [] letters,int target)
    {
        int start = 0;
        int end = letters.length - 1; // Adjusted to arr.length - 1 to include the last index
        boolean isAsc=letters[start]<letters[end];
        while (start<= end) { // Changed from l < r to l <= r to include the last element
            int mid = start + (end-start) / 2; // Moved inside the loop

            if(isAsc){
                if (target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start= mid + 1;
                }
            }
            else{
                if (target > letters[mid]) {
                    end = mid - 1;
                } else {
                    start= mid + 1;
                  }
            }
        }

       if (start== letters.length){

           return letters[0];
       }
       return letters[start];
    }
}
