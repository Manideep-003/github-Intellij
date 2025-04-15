public class main {
    public static void main(String[] args) {
        String s= "mani";
        for (int i = 0; i < s.length(); i++) {

            System.out.print(s.charAt(i)+" ");
            System.out.print( Character.isDigit(s.charAt(i)));
        }
    }

}
