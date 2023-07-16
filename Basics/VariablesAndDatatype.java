package com.yash;

public class VariablesAndDatatype {
    public static void main(String[] args) {
        int num;          //declaration of variable
        num=25;           //initialization of  variable
        int num1=36;      //declaration and initialization of variable

        //rules for variable names
        int yash,Yash;       //Case sensitive
        // int 1yash;        //invalid as name should not start with integer
        //int void;          //invalid as it should not be a keyword
        //int num ber;       //invalid as whitespaces are not allowed
        int $;               //can contain $,_,alphabet,numbers following above conditions
        //int _;             //invalid
        int $_;
        int n1um_;
        int _1;
        int nu_mber;
        int _$;

        //primitive datatypes
        byte age=24;
        int ag=6553455;
        short a=22;
        long world = 5656565655565L;   //l or L has to be used
        char ch = 'B';
        float f=23.32654f;             //f or F has to be used
        double d=2325444.354789;       //d or D is optional
        double dd=2325444.354788D;
        boolean b = true;


        String str = "Yash";
    }
}
