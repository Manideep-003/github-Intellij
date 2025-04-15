package comm.man.strin;

public class permutations_count {
    public static void main(String[] args) {
        System.out.println(subseqqPermutation("","abcd"));
    }
    static int subseqqPermutation(String p, String up) {
        if (up.isEmpty()) {

            return 1;
        }
        int count=0;
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f= p.substring(0,i);
            String l=p.substring(i);
            count=count+subseqqPermutation(f+ch+l,up.substring(1));
        }
        return count;
    }
}
