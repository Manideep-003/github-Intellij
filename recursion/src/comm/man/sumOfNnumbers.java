package comm.man;

public class sumOfNnumbers {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
    }
    static int sum(int n){
        if(n<=0){
            return 0;
        }
        return n+sum(n-1);
    }
    static int fact(int n){
        if(n==1||n==0){
            return 1;

        }
        return n*fact(n-1);
    }
}
