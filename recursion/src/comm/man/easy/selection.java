package comm.man.easy;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int [] arr={4,3,2,1};
        int [] arr1={4,3,2,4,6,7,1};
        selection_sort_rec(arr, arr.length,0,0 );
        selection1(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void selection_sort_rec(int [] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection_sort_rec(arr,r,c+1,c);
            }
            else {
                selection_sort_rec(arr,r,c+1,max);
            }
        }
        else {
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selection_sort_rec( arr,r-1,0,0);

        }
    }
    static void selection1(int[] arr){
        for (int i=0;i<arr.length-1;i++)
        {
            int last=arr.length-1-i;
            int maxindex=getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    static int getmaxindex(int[] arr,int s,int last){
        int max=s;
        for (int i=s+1;i<=last;i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int [] arr,int max,int last){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;

    }
}
