package com.yash;
import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt() ;
        //if statement---we can add as many as we need
        if(age>18){
            System.out.println("You Can participate");
        }
        //if else statement
        if (age>=21){
            System.out.println("You can get Married");
        }else {
            System.out.println("You have to wait");
        }
        //if-else_if-else(optional)
        if (age>=21){
            System.out.println("You can get Married");    //sequential checking is done
        }else if (age<=18){                               //if at first, condition is satisfied then others are not checked
            System.out.println("You have to wait");       //we can add more else_if as per need
        }else{
            System.out.println("No marriage");
        }

    }
}
