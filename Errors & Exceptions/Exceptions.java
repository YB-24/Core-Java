package com.yash;

public class Exceptions {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("the result is "+ c);
        }catch (Exception e){
            System.out.println("the division failed because "+e);
        }
        System.out.println("end of program");
    }
}
