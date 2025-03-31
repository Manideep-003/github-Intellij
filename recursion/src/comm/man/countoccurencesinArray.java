package comm.man;

public class countoccurencesinArray {
    public static void main(String[] args) {
        int [] arr={1,3,3,3,4,3,3,9};
        int target=3;
        int start=0;
        System.out.println(counthelper(arr,target,start));
    }
    static int counthelper(int [] arr,int target,int index){
        if(index>=arr.length){
            return 0;
        }
        int currentCount=(arr[index]==target)?1:0;
        return currentCount+counthelper(arr,target,index+1);
    }
}
