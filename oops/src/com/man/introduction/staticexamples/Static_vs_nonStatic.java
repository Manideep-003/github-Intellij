package com.man.introduction.staticexamples;
 class  runn{
        // Renamed `car` to `Car`
     class car {
            int speed;

            void speedSet(int speed) { // Changed `Speedset` to `speedSet`
                this.speed = speed;
            }

            void display() {
                System.out.println("Speed is " + speed);
            }
     }
}

public class Static_vs_nonStatic {
    public static void main(String[] args) {
        runn m = new runn();
        runn.car n=m.new car();



        n.speedSet(20); // Fixed method call
        n.display();
        n.speedSet(30);
        n.display();
       car frmstatic1 =new car();
       frmstatic1.inside();
        car frmstatic2 =new car();
        frmstatic2.inside();
        car frmstatic3 =new car();
        frmstatic3.inside();


        car.display();
        new car2();
        new car2();
        car2.display(10);
    }
}
class car{
     static int cars=0;
     void inside(){
         cars++;
     }
     static void display(){
         System.out.println(cars);
     }
}
class car2{
     int cars=0;
     static int carsstatic=0;
    car2(){
        cars++;
        carsstatic++;
    }
    static void display(int x){
        System.out.println(x);
        System.out.println(carsstatic);
    }
}