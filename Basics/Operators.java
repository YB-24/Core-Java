package com.yash;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int a1=6+6-3;
        System.out.println(a1);
        int a2=6*6/3;
        System.out.println(a2);
        int a3=18%3;
        System.out.println(a3);
        int a4=3;
        a4++;
        System.out.println(a4);
        a4--;
        System.out.println(a4);
        //Assignment operators
        int a5=6;
        System.out.println(a5);
        a5+=6;
        System.out.println(a5);
        a5-=3;
        System.out.println(a5);
        a5*=6;
        System.out.println(a5);
        a5/=3;
        System.out.println(a5);
        a5%=2;
        System.out.println(a5);

        //Comparison Operators
        System.out.println(a1==a5);
        System.out.println(a1>=a5);
        System.out.println(a1<=7);

        //Logical Operators
        System.out.println(34>4 && 0>3);
        System.out.println(34>4 || 0>3);
        System.out.println(!(0>3));

        //Bitwise Operators
        System.out.println(2&3);
        System.out.println(2|3);
    }
}
