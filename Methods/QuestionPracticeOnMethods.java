package com.yash;

public class QuestionPracticeOnMethods {
    //Que1-Write a Java method to print the multiplication table of a number n.
    static void table(int n){
        for (int i = 1;i<11;i++){
            System.out.println(n + " * " +i+" = "+n*i);
        }
    }

    //Que2-Write a program using functions to print the following pattern:
    //      *
    //     **
    //    ***
    //   ****
    static void pattern(int p){
        for (int i=1;i<=p;i++){
            for (int j=1;j<=p;j++){
               if(j<=p-i) {
                   System.out.print(" ");
               } else {
                   System.out.print("*");
               }
            }
            System.out.println();
        }
    }

    //Que3-Write a recursive function to calculate the sum of first n natural numbers.
    static int sum(int n) {
        if (n<=-1){
            return 0;
        }else {
            return n+sum(n-1);
        }
    }

    //Que4-Write a function to print the following pattern:
    //    ****
    //    ***
    //    **
    //    *
    static void Pattern2(int n){
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Que5-Write a function to print the nth term of the Fibonacci series using recursion.
    static int fibonnacci (int n){
        if (n == 1) {
            return 0;
        } else if (n==2) {
            return 1;
        }else {
            return fibonnacci(n-1)+fibonnacci(n-2);
        }
    }

    //Que6-Write a function to find the average of a set of numbers passed as arguments.
    static float avg(float ...arr){
        float average=0;
        for (float a:arr){
            average+=a;
        }
        return average/arr.length;
    }

    //Que7-Repeat problem 4 using Recursion.
    static int pattern3(int n){
        if (n>0) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
            return pattern3(n - 1);
        }else {
            return 0;
        }
    }

    //Que8-Repeat problem 2 using Recursion.
    static void pattern4(int n,int num){
        if (n>0){
            space(n-1);
            star(num-n+1);
            System.out.println();
            pattern4(n-1,num);
        }
    }

     static void star(int num) {
        if (num>0){
            System.out.print("*");
            star(num-1);
        }
    }

    static void space(int i) {
        if (i>0){
            System.out.print(" ");
            space(i-1);
        }

    }

    //Que9-Print the following Pattern using recursion
    // *
    // **
    // ***
    // ****
    static void pattern5(int n){
        if (n>0){
            pattern5(n-1) ;
            for (int i = 0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       table(6);
       pattern(6);
       System.out.println("the sum of first n natural numbers are "+sum(100));
       Pattern2(6);
       System.out.println("the nth term of fibonacci series is "+fibonnacci(8));
        System.out.println("the average of numbers is "+ avg(56,57,58,59,60));
        pattern3(6);
        pattern4(6,6);
        pattern5(4);
    }
}
