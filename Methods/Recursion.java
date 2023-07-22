package com.yash;

public class Recursion {           //a function can call itself in java
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else {
            return n * factorial(n-1);
        }
        }

    static int factorial_iterative(int n){
        int fact=1;
        if (n>0){
        for(int i = 1;i<=n;i++){
            fact*=i;
        }
        }
        return fact;
        }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("the factorial of n is "+factorial(n));
        System.out.println("the factorial using iterative approach is " + factorial_iterative(n));
    }
}
