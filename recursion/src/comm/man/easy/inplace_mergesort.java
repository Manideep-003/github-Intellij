package comm.man.easy;

import java.util.Arrays;

public class inplace_mergesort {
    public static void main(String[] args) {
      int [] arr={5,4,3,2,1};
      mergesortinplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesortinplace(int [] arr ,int s ,int e ){
        if(e-s==1){
            return ;
        }
        int mid= (s+e)/2;
        mergesortinplace(arr,s,mid);
        mergesortinplace(arr,mid,e);

        merge(arr,s,mid,e);
    }
    private static void merge(int[] arr,int s,int mid,int e){
        int [] mix=new int[e-s];
        int i=s,j=mid,k=0;
        while (i< mid && j< e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i< mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
         arr[s+l]=mix[l];
        }
    }
}
