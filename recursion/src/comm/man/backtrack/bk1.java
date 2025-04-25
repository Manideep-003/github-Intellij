package comm.man.backtrack;

import java.util.ArrayList;
import java.util.List;

public class bk1 {
    public static void main(String[] args) {
        int n=4,k=2;
//        List<List<Integer>> combinations = combine(n, k);
//        for(List<Integer> combination:combinations){
//            System.out.println(combination);
//        }
        System.out.println(combine(4,2));
    }
    static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(1,n,k,new ArrayList<>(),result);
        return result;
    }
    static void backtrack(int start,int n,int k,List<Integer> current,List<List<Integer>> result){
        if(current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=n;i++){
            current.add(i);

            backtrack(i+1,n,k,current,result);

           current.remove(current.size()-1);
        }
    }
}
