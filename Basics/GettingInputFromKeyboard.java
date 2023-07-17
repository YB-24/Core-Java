package com.yash;
import java.util.Scanner;

public class GettingInputFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        System.out.println("Enter any floating number");
        float f =sc.nextFloat();
        System.out.println("Enter a word to store");
        String s1 = sc.next();             //it stores just first word of line
        System.out.println("Enter a line");
        String s2 = sc.nextLine();         //it Stores entire line
        System.out.println("Enter anything and check whether its integer or not");
        boolean b = sc.hasNextInt();       //it checks whether integer has been entered or not
        System.out.println("the number is:- " + num);
        System.out.println("the float value is:- " + f);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(b);
    }

}
