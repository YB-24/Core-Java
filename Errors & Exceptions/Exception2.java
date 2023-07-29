package com.yash;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        int [] arr = {36,58,96,25};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index you want to access");
        int a = sc.nextInt();
        System.out.println("enter number you want to divide the array index with");
        int b = sc.nextInt();

        try {
            System.out.println("the element at index is "+ arr[a]);
            System.out.println("the  division result is "+ 100/b);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred ");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred");
        }catch (Exception e){
            System.out.println("Other Exception occurred "+e);
        }

//----------Nested Try-Catch-----------
        try {
            try {
                try {
                    System.out.println("the element at index is "+ arr[a]);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBoundsException occurred ");
                }
                System.out.println("the  division result is "+ 100/b);
            }catch (ArithmeticException f){
                System.out.println("ArithmeticException occurred");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}