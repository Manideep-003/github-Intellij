package comm.man.easy;

public class count_twonumberstoobtainzero {
    public static void main(String[] args) {

    }
   static int countOperations(int num1, int num2){
       return helper(num1,num2,0);
   }
   static int helper(int n1,int n2,int count){
        if(n1==0 || n2==0){
            return count;
        }
        if(n1>n2){
            n1-=n2;
            return helper(n1,n2,count+1);

        }
        n2-=n1;
        return helper(n1,n2,count+1);
   }


}
