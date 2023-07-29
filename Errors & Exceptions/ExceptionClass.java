package com.yash;

import java.util.Scanner;

class MyException extends Exception{
    @Override
   public String toString(){
       return "I am tostring()";
   }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try {
                throw new MyException();
              //  throw new ArithmeticException("This is an arithmetic exception");
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e);
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        System.out.println("The program is ended");
    }
}