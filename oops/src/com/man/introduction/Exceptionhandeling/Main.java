package com.man.introduction.Exceptionhandeling;

 class Maini {
    public static void main(String[] args) {
        int a=3;
        int b=0;
        try {
//            divide(a,b);
            String name="mani";
            if(name.equals("mani")){
                throw new nyexception("name is mani");
            }
        }catch (nyexception e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always be executed");
        }
    }
   static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
