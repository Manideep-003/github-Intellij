package comm.man;

public class sumOfdigits {
    public static void main(String[] args) {
        System.out.println(sumofdigits(25));
    }
    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        int r=n%10;
        return r+sumofdigits((int)(n/10));

    }
}
