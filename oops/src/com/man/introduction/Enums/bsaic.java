package com.man.introduction.Enums;

public class bsaic {
    enum week implements A{
        monday,tuesday,wednesday,thursday,friday,saturday,sunday;
        //these are enum constants
        //public,static and final
        //scince its final you can create child enums
        //type is week
        week(){
            System.out.println("constructor called for"+" "+this);
        }
        //this is not public or protected only private or default
        //why? dont want to create objects
        //this is not to the enum concept thats why
        //internally : public static final week monday=new week();
    }

    public static void main(String[] args) {
        week weeek;
        weeek=week.monday;
        //values() method
        //ordinal() method
        //value() method
         System.out.println(weeek.ordinal());
        System.out.println(week.valueOf("monday"));
    }
}
