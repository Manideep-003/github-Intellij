package comm.man;



public class onetoN {
    public static void main(String[] args) {
//      one2n(5);
        char [] ar={'h','e','l'};
      reverseString(ar);
        System.out.println(ar);
    }
    static void one2n(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        one2n(n-1);
        System.out.print(n+" ");
    }
    static void reverseString(char[] s) {
        if (s == null || s.length <= 1) { // Handle null or single-character/empty arrays
            return;
        }
        helper(s, 0, s.length - 1);
    }

    static void helper(char[] s, int first, int last) {
        if (first >= last) { // Corrected base case
            return;
        }
        char temp = s[first];
        s[first] = s[last];
        s[last] = temp;
        helper(s, first + 1, last - 1);
    }
}
