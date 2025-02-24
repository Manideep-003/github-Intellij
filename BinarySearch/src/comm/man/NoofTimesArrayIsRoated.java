package comm.man;

public class NoofTimesArrayIsRoated {
    public static void main(String[] args) {

    }
    int findMax(int [] arr){
        int max=arr[0];
        int maxi=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]> max){
                max=arr[i];
                maxi=i;
            }
        }
        return maxi+1;
    }

}
