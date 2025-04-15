package comm.man.strin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequences_containing_duplicates {
    public static void main(String[] args) {
      int [] x={1,2,2};
      List<List<Integer>> ans=subsetDuplicate(x);
        System.out.println(ans);
    }
    static List<List<Integer>> subsetDuplicate(int [] arr){
        Arrays.sort(arr);
        int start=0;
        int end=0;
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            start=0;
            int n=outer.size();
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            for (int j = start; j < n; j++) {
                List<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
