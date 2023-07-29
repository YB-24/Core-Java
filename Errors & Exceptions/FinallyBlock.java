package com.yash;

public class FinallyBlock {
    public static int div(){
        int a=6;
        int b=0;
        try {
            int c = a/b;         //generally anything below return is not executed but finally block will be executed
            return c;
        }catch (Exception e){               //We can use try with finally block with/without catch block
            System.out.println(e);
        }
        finally {
            System.out.println("I am a Finally block, I will be executed at ant cost");
        }
        return 0;
    }
    public static void main(String[] args) {
        //A finally block always executes, regardless of whether an exception is thrown.
        //finally should have atleast a try block, catch is optional
        System.out.println(div());
        int d=18;
        int c=9;
        while (true){
            try {
                System.out.println("the div with c="+c+ " of d is: "+d/c);
            }catch (Exception e){
                System.out.println(e);
                break;
            }finally {
                System.out.println("I am finally block");     //the finally block will run even after break statement
            }
            c--;
        }
    }
}
