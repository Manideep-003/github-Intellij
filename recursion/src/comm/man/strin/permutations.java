package comm.man.strin;

public class permutations {
    public static void main(String[] args) {
        subseqqPermutation("","abc");
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
}
