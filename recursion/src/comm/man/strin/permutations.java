package comm.man.strin;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
       subseqqPermutation("","abc");
           ArrayList<String> permu=perm("hel");
        System.out.println(permu);
    }
    static void subseqqPermutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f= p.substring(0,i);
            String l=p.substring(i);
            subseqqPermutation(f+ch+l,up.substring(1));
        }
    }
    static ArrayList<String> perm(String s){
        ArrayList<String> ans= new ArrayList<>();
        if(s.isEmpty() ||s==null ){
            return ans;
        }
        else {
            helper("",s,ans);
            return ans;
        }
    }
    static void helper(String p,String up,ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        char ch= up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            helper(f+ch+l,up.substring(1),ans);
        }
    }
}
