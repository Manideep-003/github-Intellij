package comm.man.strin;

import java.util.ArrayList;

public class dice_sum_permutation {
    public static void main(String[] args) {
//        subseqqPermutation("",4);
//        ArrayList<String> ans= subseqqPermutationArraylist("",4);
//        System.out.println();
//        System.out.println(ans);
        ArrayList<String> ans= sub(4);
        System.out.println(ans);
    }
    static void subseqqPermutation(String p, int up) {
        if (up == 0) { // Base case: When 'up' becomes 0, print the accumulated string 'p'.
            System.out.print(p + " ");
            return;
        }

        for (int i = 1; i <= 6 && i <= up; i++) { // Loop to iterate within valid bounds.
            subseqqPermutation(p + i, up - i); // Recursive call with updated 'p' and reduced 'up'.
        }
    }
    static ArrayList<String> subseqqPermutationArraylist(String p, int up) {
        if (up == 0) { // Base case: When 'up' becomes 0, print the accumulated string 'p'.
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <= 6 && i <= up; i++) { // Loop to iterate within valid bounds.
            ans.addAll(subseqqPermutationArraylist(p + i, up - i)); // Recursive call with updated 'p' and reduced 'up'.
        }
        return ans;
    }
    static ArrayList<String> sub(int up){
        ArrayList<String> ans=new ArrayList<>();
         track("",up,ans);
        return ans;
    }
    static void track(String p, int up,ArrayList<String> ans){
        if(up==0){
            ans.add(p);
            return;
        }
        for(int i=1;i<=6 && i<=up;i++){
            track(p+i,up-i,ans);
        }
    }
}
