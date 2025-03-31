public class BsearchSqurt {
    public static void main(String[] args) {
     int n=40;
     int p=3;
//     precession value
        System.out.println(squrt(n,p));
    }
    static double squrt(int n,int p){
        int s=0;
        int e=n;
        double root=0.0;

        while (s<=e){
            int mid=s+(e-s)/2;
           if(mid*mid==n){
               return mid;
           } else if (mid *mid > n) {
               e=mid-1;

           }
           else{
               s=mid+1;
               root=mid;
           }
        }
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc; // Backtrack one step
            inc /= 10;   // Decrease the increment
        }

        return root;
    }

}
