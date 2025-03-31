package com.man;

public class complimentofnumber_lc1009 {
//    public static void main(String[] args) {
//        System.out.println(bitwiseComplement(5));
//    }
public static void main(String[] args) {
    int number = 5; // Binary: 00000000000000000000000000000101
    int bitLength = Integer.toBinaryString(number).length(); // Length of binary representation
    int mask = (1 << bitLength) -1 ; // Create a mask with all bits set to 1 for the given length
    int flipped = ~number & mask; // Flip bits and apply the mask
//    System.out.println("Original number: " + number); // Output: 5
  System.out.println(flipped); // Output: 2
//    System.out.println( Integer.toBinaryString(mask));
//    System.out.println(bitLength);
}

    static int bitwiseComplement(int n) {
       int x=n^1 ;
       int  ans=n-x -1;
        return ans;

    }
}
