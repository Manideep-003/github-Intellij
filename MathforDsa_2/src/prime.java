public class prime {
    public static void main(String[] args) {
//        System.out.println(isPrime(29 ));
        for (int i = 0; i <=20; i++) {
            System.out.println(i +" "+ isPrime(i));
        }
    }
    static boolean isPrime(int n){
        int c=2;
        if(n<=1){
            return false;
        }
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

}
