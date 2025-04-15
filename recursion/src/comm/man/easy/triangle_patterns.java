package comm.man.easy;

import java.util.ArrayList;

public class triangle_patterns {
    public static void main(String[] args) {

//        trinangle2(5,0);
        ArrayList<String> ans=countoccurences("","abc");
        System.out.println(ans);
    }
    static void trinangle1(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            trinangle1(r,c+1);


        }
        else {
            System.out.println();
            trinangle1(r-1,0);


        }
    }
    static void trinangle2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){

            trinangle2(r,c+1);
            System.out.print("* ");


        }
        else {

            trinangle2(r-1,0);
            System.out.println();


        }
    }
 static ArrayList<String> countoccurences(String p,String up){
        if(up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
            return  list;
        }
        //lower call
        char ch=up.charAt(0);
        ArrayList<String> lowerleft=countoccurences(p+ch,up.substring(1));
        ArrayList<String> lowerright=countoccurences(p,up.substring(1));
        lowerleft.addAll(lowerright);
         return lowerleft;


 }

}
