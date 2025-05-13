package com.man.introduction.polymorphism;

 class Calculator {
    // Method with one integer parameter
    public int add(int a) {
        return a;
    }

    // Overloaded method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Single int: " + calc.add(5));                // Output: 5
        System.out.println("Two ints: " + calc.add(5, 10));             // Output: 15
        System.out.println("Three ints: " + calc.add(5, 10, 15));       // Output: 30
        System.out.println("Two doubles: " + calc.add(5.5, 10.5));      // Output: 16.0
        calc c= new calc();
        System.out.println(c.add(2,3,1));
    }
}
class calc{
     public int add(int a,int b,int c){
         return a+b+c;
     }
    static int add(int a,int b){
        return a+b;
    }
}
