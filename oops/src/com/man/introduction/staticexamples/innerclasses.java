package com.man.introduction.staticexamples;

public class innerclasses {
       static class test{
        String name;
      public test(String name){
          this.name=name;
      }
    }

    public static void main(String[] args) {
//          innerclasses i=new innerclasses();
//          innerclasses.test x=i.new test("mani");
//        to inplement this u need to fix the outer class  to non static

        test a=new test("mani");
        test b=new test("akhi");
        System.out.println(a.name);
        System.out.println(b.name);


// Class = Blueprint
// Instance = Actual object created from the class
// now calling thew upper method
        test1 a1=new test1("mani");
        test1 b1=new test1("akhi");
        System.out.println(a1.name);
        System.out.println(b1.name);
    }
}
class test1{
    static  String name;
    public  test1(String name){
        this.name=name;
    }
}