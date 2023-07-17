package com.yash;

public class Strings {
    public static void main(String[] args) {

        String name = new String("Yash");        //as string is a class we have to make an
        System.out.println(name);                       // object of it before use
        String name1 = "yash";                          //as java provides special functionality we can
        System.out.println(name1);                      //treat string as datatype
        System.out.println(name+name1);                 //concatenation of strings

        //Different ways to print in java
        int a = 5;
        float b = 36.25f;
        char c= 'a';
        String s = "Yash Bagul";
        System.out.printf("The integer is %d,floating number is %8.2f and character is %c\n ",a,b,c); //like C lang
        System.out.format("The integer is %d,floating number is %f and string is %s ",a,b,s);

    }
}
