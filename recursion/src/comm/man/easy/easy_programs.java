package comm.man.easy;

public class easy_programs {
    public static void main(String[] args) {
        concept(5);
    }
    //concept n-- VS --n
    static int concept(int n){
        if(n==0){
            return 0;
        }
//        n-- vs --n
//        n-- subtracts but not stored in n  VS  --n subtracted and stored in n
        System.out.println(n);
        return concept(--n);
    }

    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
    static void funboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }


}
