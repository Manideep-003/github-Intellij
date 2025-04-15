package comm.man.strin;

public class skip_a_letter {
    public static void main(String[] args) {
     String s="ramaus";
     skip("",s);
     //or you can use repalce method
        System.out.println(skip1(s));
    }
    static void skip(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a' || ch=='A'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip1(String up){
        if(up.isEmpty()) {

           return "";
        }
        char ch=up.charAt(0);
        if(ch=='a' || ch=='A'){
          return   skip1(up.substring(1));
        }
        else{
            return ch+ skip1(up.substring(1));
        }
    }
}
