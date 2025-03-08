public class LinearSearch {
    public static void main(String[] args) {
      int [] nums={1,2,3,4,5,6,7,8,9,10};
      int t=10;
        System.out.println(linearsearch(nums,t));
    }
    static int linearsearch(int[] arr,int target)
    {
        if(arr.length==0){
            return -1;
        }
        else
        {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {

                    return i;

                }
            }
           return -1;

        }
    }
}
