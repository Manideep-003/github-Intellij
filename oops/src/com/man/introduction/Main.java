package com.man.introduction;
public class Main {
    public static void main(String[] args)
    {
        student mani=new student();
         student ravi= new student();

        mani.name="manideep";
        mani.marks=45;
        mani.rollno=390;
        ravi.name="ravi";
        ravi.rollno=21;
        System.out.println(student.ppopulation);
        System.out.println(mani.ppopulation);
//
//        System.out.println(s.marks);
//        System.out.println(s.name);
//        System.out.println(s.rollno);

        student[] students =new student[5];
       x y= new x();

        int n=y.num;
        System.out.println(y.num);

//        observe this very carefully static takes only once the operation
        int xum=2*y.num;

           int m =10+4*xum;

        System.out.println(m);

    }

     static  class x{
        int num=5;
    }

}
class student{
    int rollno;
    String name;
    float marks;
    static int ppopulation;

    student(){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
        this.ppopulation+=1;

    }

}