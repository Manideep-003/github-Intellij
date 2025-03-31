package comm.man;

public class sumofArrayElements {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        System.out.println(sum(arr,arr.length-1));
    }
    static int sum(int [] arr,int n){
        if(n<0){
            return 0;
        }
        return arr[n]+sum(arr,n-1);
    }
}
