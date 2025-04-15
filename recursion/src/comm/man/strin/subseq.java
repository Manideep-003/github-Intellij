package comm.man.strin;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        // Print all subsequences
        subseqqPrint("", "abc");

        // Get all subsequences and print the list
        ArrayList<String> result = subseqqList("", "abc");
        System.out.println(result);
    }

    // Method to print all subsequences
    static void subseqqPrint(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqqPrint(p + ch, up.substring(1));
        subseqqPrint(p, up.substring(1));
    }

    // Method to return all subsequences as a list
    static ArrayList<String> subseqqList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqqList(p + ch, up.substring(1));
        ArrayList<String> right = subseqqList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}