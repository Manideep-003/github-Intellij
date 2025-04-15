package comm.man.strin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subseq_iteration {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=subsetDuplicate(arr);
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
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
//}The inner loop is the core of this algorithm's logic—it ensures that for every num in the array, subsets are extended to include it. Here's a step-by-step breakdown of how the inner loop works:
//        - Purpose:- For each num in arr, the inner loop iterates over all the subsets already present in outer (at the time of processing) and creates new subsets by adding num to them.
//
//
//        - What Happens Inside the Inner Loop:- List<Integer> inner = new ArrayList<>(outer.get(i));: This creates a copy of the current subset at index i from outer. This ensures that the original subset remains unchanged.
//        - inner.add(num);: The element num is added to this copy to form a new subset.
//- outer.add(inner);: The newly formed subset is added to outer.
//
//        - Effect:- Each existing subset in outer spawns one new subset that includes the current num.
//        - By the end of the inner loop, outer contains all the old subsets plus the new subsets formed by adding num.





