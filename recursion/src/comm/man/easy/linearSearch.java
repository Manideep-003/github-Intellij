package comm.man.easy;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr={1,1,1,5,3,4};
        ArrayList<Integer> ans=findallindex(arr,1,0);
        ArrayList<Integer> ans23=findallindex1(arr,1,0);

        System.out.println(ans);
        System.out.println(ans23);
    }
    static ArrayList<Integer> findallindex(int[] arr,int target,int index){
        ArrayList<Integer> list =new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelow=findallindex(arr, target, index+1);
        list.addAll(ansfrombelow);
        return list;
    }
    static ArrayList<Integer> findallindex1(int[] arr, int target, int index) {
        // Base condition
        if (index == arr.length) {
            return new ArrayList<>();
        }

        // Recursive call to get indices from the rest of the array
        ArrayList<Integer> list = findallindex(arr, target, index + 1);

        // Add the current index if it matches the target
        if (arr[index] == target) {
            list.add(0, index); // Add at the beginning to maintain order
        }

        return list;
    }
//    findallindex(arr, 5, 0)
//        |
//        |-- list = [0] (adds index 0 as arr[0] == 5)
//            |-- ansfrombelow = findallindex(arr, 5, 1)
//            |
//            |-- list = [] (arr[1] != 5)
//            |-- ansfrombelow = findallindex(arr, 5, 2)
//                |
//                |-- list = [2] (adds index 2 as arr[2] == 5)
//            |-- ansfrombelow = findallindex(arr, 5, 3)
//                    |
//                    |-- list = [] (arr[3] != 5)
//            |-- ansfrombelow = findallindex(arr, 5, 4)
//                        |
//                        |-- list = [4] (adds index 4 as arr[4] == 5)
//            |-- ansfrombelow = findallindex(arr, 5, 5)
//                            |
//                            |-- Base condition (returns an empty list)
//                        |
//                        |-- Combined result: [4]
//            |
//            |-- Combined result: [4]
//            |
//            |-- Combined result: [2, 4]
//            |
//            |-- Combined result: [2, 4]
//            |
//            |-- Combined result: [0, 2, 4]
}
