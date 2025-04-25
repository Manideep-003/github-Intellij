package comm.man.strin;

import java.util.*;

public class phonenumber {
    public static void main(String[] args) {
     ArrayList<String> ans=phonennumberprint1("","89");
        System.out.println(ans);
    }
    static void phonennumberprint(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        int start = 0;
        int end = 0;
        if (digit >= 2 && digit <= 6) {
            start = (digit - 2) * 3;
            end = (digit - 1) * 3;
        } else if (digit == 7) {
            start = (digit - 2) * 3;
            end = start + 4;
        } else if (digit == 8) {
            start = (digit - 2) * 3 + 1;
            end = start + 3;
        } else if (digit == 9) {
            start = ((digit - 2) * 3) + 1;
            end = start + 4;
        } else {
            return;
        }

        for (int i = start; i < end && i < 26; i++) {
            char ch = (char) ('a' + i);
            phonennumberprint(p + ch, up.substring(1));

        }

    }



        // ArrayList version: Returns combinations as a list
        static ArrayList<String> phonennumberprint1(String p, String up) {
            if (up.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            int digit = up.charAt(0) - '0';
            int start = 0;
            int end = 0;
            if (digit >= 2 && digit <= 6) {
                start = (digit - 2) * 3;
                end = start+3;
            } else if (digit == 7) {
                start = (digit - 2) * 3;
                end = start + 4;
            } else if (digit == 8) {
                start = (digit - 2) * 3 + 1;
                end = start + 3;
            } else if (digit == 9) {
                start = ((digit - 2) * 3) + 1;
                end = start + 4;
            } else {
                return new ArrayList<>(); // Return empty list for invalid digits
            }

            ArrayList<String> list = new ArrayList<>();
            for (int i = start; i < end && i < 26; i++) {
                char ch = (char) ('a' + i);
                list.addAll(phonennumberprint1(p + ch, up.substring(1)));
            }
            return list;
        }
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans= phonennumberprint3("",digits);
        return ans;
    }
    static ArrayList<String> phonennumberprint3(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        int start = 0;
        int end = 0;
        if (digit >= 2 && digit <= 6) {
            start = (digit - 2) * 3;
            end = start+3;
        } else if (digit == 7) {
            start = (digit - 2) * 3;
            end = start + 4;
        } else if (digit == 8) {
            start = (digit - 2) * 3 + 1;
            end = start + 3;
        } else if (digit == 9) {
            start = ((digit - 2) * 3) + 1;
            end = start + 4;
        } else {
            return new ArrayList<>(); // Return empty list for invalid digits
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = start; i < end && i < 26; i++) {
            char ch = (char) ('a' + i);
            list.addAll(phonennumberprint1(p + ch, up.substring(1)));
        }
        return list;
    }

}
