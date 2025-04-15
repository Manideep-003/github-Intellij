package comm.man.strin;


import java.util.*;

public class permutations_iteration {
    public static void main(String[] args) {
         List<String> ans=subseqqPermutation("","abc");
        System.out.println(ans);
    }
    static List<String> subseqqPermutation(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans= new ArrayList<>();
        for (int i = 0; i <=p.length(); i++) {
            String f= p.substring(0,i);
            String l=p.substring(i);
            ans.addAll(subseqqPermutation(f+ch+l,up.substring(1)));
        }
        return ans;
    }
}
//Call: p="", up="abc"
//ch='a', p="", insert 'a' at i=0 → "a"
//        ↓
//Call: p="a", up="bc"
//ch='b', p="a", insert 'b' at i=0,1
//        ├── i=0: f="", l="a" → "b+a" = "ba"
//        │   ↓
//        │ Call: p="ba", up="c"
//        │   ch='c', p="ba", insert 'c' at i=0,1,2
//        │   ├── i=0: f="", l="ba" → "c+ba" = "cba"
//        │   │   ↓
//        │   │ Call: p="cba", up="" (base case)
//        │   │   → Return: ["cba"]
//        │   ├── i=1: f="b", l="a" → "b+c+a" = "bca"
//        │   │   ↓
//        │   │ Call: p="bca", up=""
//        │   │   → Return: ["bca"]
//        │   └── i=2: f="ba", l="" → "ba+c" = "bac"
//        │       ↓
//        │     Call: p="bac", up=""
//        │       → Return: ["bac"]
//        │   Returns: ["cba", "bca", "bac"]
//        │
//        └── i=1: f="a", l="" → "a+b" = "ab"
//        ↓
//Call: p="ab", up="c"
//ch='c', p="ab", insert 'c' at i=0,1,2
//        ├── i=0: f="", l="ab" → "c+ab" = "cab"
//        │   ↓
//        │ Call: p="cab", up=""
//        │   → Return: ["cab"]
//        ├── i=1: f="a", l="b" → "a+c+b" = "acb"
//        │   ↓
//        │ Call: p="acb", up=""
//        │   → Return: ["acb"]
//        └── i=2: f="ab", l="" → "ab+c" = "abc"
//        ↓
//Call: p="abc", up=""
//        → Return: ["abc"]
//Returns: ["cab", "acb", "abc"]
//Returns: ["cba", "bca", "bac", "cab", "acb", "abc"]
//Returns: ["abc", "acb", "bac", "bca", "cab", "cba"]
