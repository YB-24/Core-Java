package com.yash;
import java.util.Scanner;
public class BoardPercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your english marks:- ");
        float E=sc.nextFloat();
        System.out.println("Enter your maths marks:- ");
        float M = sc.nextFloat();
        System.out.println("Enter your Physics marks:- ");
        float P = sc.nextFloat();
        System.out.println("Enter your Chemistry marks:- ");
        float C = sc.nextFloat();
        System.out.println("Enter your hindi marks:- ");
        float H = sc.nextFloat();
        System.out.println("enter Max marks of each subject");
        float maxMarks = sc.nextFloat();

        System.out.println("the percentage is:-  " + (E+M+P+C+H)*100/(5*maxMarks));


    }
}
