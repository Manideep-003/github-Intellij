package comm.man.leetcode;
import java.util.*;
public class combinations {
    public static void main(String[] args) {
      List<List<Integer>> ans=combine(4,2);
        System.out.println(ans);
    }

    static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        helper(1,n,k,new ArrayList<>(),ans);
        return ans;
    }

    static void helper(int start, int n, int k, List<Integer> current, List<List<Integer>> result){
          if(current.size()==k){
              result.add(new ArrayList<>(current));
              return;
          }
          for (int i=start;i<=n;i++){
              current.add(i);
              helper(i+1,n,k,current,result);
              current.remove(current.size()-1);
          }
    }
}

