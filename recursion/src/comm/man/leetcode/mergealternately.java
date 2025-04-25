package comm.man.leetcode;

public class mergealternately {
    public static void main(String[] args) {
        String s = mergeAlternately1("abc", "cd");
        System.out.println(s);
    }
    static String mergeAlternately1(String word1, String word2) {
       char []first =word1.toCharArray();
        char []second =word2.toCharArray();
        char [] mix=new char[first.length+ second.length];
        int i=0,j=0,k=0;
        while(i< word1.length() && i < word2.length()){
            mix[k]=first[i];
            i++;
            k++;
            mix[k]=second[j];
            j++;
            k++;
        }
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

        return new String(mix);
    }
}
