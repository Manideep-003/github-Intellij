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
        System.out.println(mani.ppopulation);

//
//        System.out.println(s.marks);
//        System.out.println(s.name);
//        System.out.println(s.rollno);

        student[] students =new student[5];

        int n=x.num;
        System.out.println(x.num);


    }

     class x{
       static int num=21;
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