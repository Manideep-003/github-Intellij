package com.man;

public class all_patterns {
//    https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2s
public static void main(String[] args) {
//pattern1(4);
//pattern2(5);
//pattern3(5);
//   pattern4(5);
//    pattern6(5);
//    pattern5(5);
//pattern7(5);
//    patter28(5);
//    patter8(5);
//patter9(5);
//pattern11(5);
//pattern2(5);
//pattern14(5);
//    pattern13(5);
    pattern20(5);
}

static void pattern1(int n){
    for(int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            System.out.print("* ");

        }
        System.out.println();
    }

}
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=1;i<=2*n-1;i++){
            int x=(i>n)?2*n-i:i;
            for(int j=1;j<=x;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patter8(int n){
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patter9(int n){
        for(int i=1;i<=n;i++){

            int spaces=i;
            for(int j=1;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            // Calculate spaces (decreasing with each row)
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" "); // Print leading spaces
            }
            // Print stars (increasing with each row)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
    static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            // Calculate spaces (decreasing with each row)
            int spaces = i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" "); // Print leading spaces
            }
            // Print stars (increasing with each row)
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }

//    static void patter12(int n){
//        for(int i=0;i<2*n;i++){
//           int col=(i<n)?2*n-i:i;
//           int spaces
//            for(int j=1;j<spaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=col;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
static void pattern13(int n){
    for (int i = 1; i <= n; i++) {
        int spaces = n - i;
        for (int j = 1; j <= spaces; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            // Print '*' only for the boundaries or the last row
            if (k == 1 || k == i || i == n) {
                System.out.print("* ");
            } else {
                System.out.print("  "); // Print spaces for the hollow part
            }
        }
        System.out.println();
    }
}
    static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            int spaces = i;
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n-i; k++) {
                // Print '*' only for the boundaries or the last row

                    if(i==0 || k==1 || k==n-i){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }

            }
            System.out.println();
        }
    }

static void pattern20(int n){
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n; j++) {
            if(i==1|| j==1|| i == n ||j==n){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }

        }
        System.out.println();

    }
}

    static void patter28(int n){
        for(int i=1;i<=2*n;i++){

            int col=(i>n)? 2*n-i:i;
            int spaces=n-col;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
