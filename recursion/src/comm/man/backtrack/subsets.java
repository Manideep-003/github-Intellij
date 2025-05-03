package comm.man.backtrack;

import java.util.ArrayList;
import java.util.List;


public class subsets {
    public static void main(String[] args) {

    }
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result= new ArrayList<>();
        backtrackans(nums,new ArrayList<>(),result);
        return result;
    }
    static void backtrackans(int[] nums,List<Integer> current,List<List<Integer>> result){

    }
}
