package comm.man.strin;

public class skip_string {
    public static void main(String[] args) {
      String s="gappleappwithme";
        System.out.println(skip1(s));
        System.out.println(skipappApple(s));
    }
    static String skip1(String up){
        if(up.isEmpty()) {

            return "";
        }

        if(up.startsWith("apple")){
            return skip1(up.substring(5));
        }
        else{
            return up.charAt(0)+ skip1(up.substring(1));
        }
    }

    static String skipappApple(String up){
        if(up.isEmpty()) {

            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return   skip1(up.substring(3));
        }
        else{
            return up.charAt(0)+ skip1(up.substring(1));
        }
    }
//    def skip_string(up):
//            if not up:
//            return ""
//            if up.startswith("apple"):
//            return skip_string(up[5:])
//     else:
//            return up[0] + skip_string(up[1:])
//
//
//if __name__ == "__main__":
//    s = "gapplewithme" pyhton code
//    print(skip_string(s))
}
