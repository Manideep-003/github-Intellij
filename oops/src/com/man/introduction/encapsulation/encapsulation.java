package com.man.introduction.encapsulation;

public class encapsulation {
    public static void main(String[] args) {
       car c=new car();
       c.setCarno(1201);
        c.setName("tyota");
        System.out.println(c.getName()+" "+c.getnumber());
    }

}
 class car{
    private int carno;
    private String name;
    public void setCarno(int carno){
        this.carno=carno;
    }
     public void setName(String name){
         this.name=name;
     }
     public int getnumber(){
        return carno;
     }
     public String getName(){
        return name;
     }


 }