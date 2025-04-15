package comm.man.strin;

import java.util.ArrayList;

public class substringreturnusingArraylist {
    public static void main(String[] args) {
        System.out.println(subseqq("","abc"));
    }
    static ArrayList<String> subseqq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
         ArrayList<String> left=  subseqq(p+ch,up.substring(1));
         ArrayList<String> right= subseqq(p,up.substring(1));
         left.addAll(right);
         return left;
    }
}
