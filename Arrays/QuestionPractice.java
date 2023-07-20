package com.yash;
import java.util.Scanner;
public class QuestionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Que1-Create an array of 5 floats and calculate their sum.
        float [] num = {23.2f,25.6f,65.3f,56.65f,89.36f};
        float sum=0.0f;
        for (float v : num) {
            sum = sum + v;
        }
        System.out.println(sum);

        //Que2-Write a program to find out whether a given float is present in an array or not.
        //considering above array
        float num1 = sc.nextFloat();
        boolean a=false;
        for (float z:num){
            a = (num1==z);
            if (a){
                System.out.println("Number Found");
                break;
            }
        }
        if (!a){
            System.out.println("number not found");
        }

        //Que3-Calculate the average marks from an array containing marks of all students in physics using a for-each loop
        int[] marks= {65,66,67,68,69,70};
        float sum1=0;
        for (int element:marks) {
            sum1=sum1+element;
        }
        sum1= sum1/ marks.length;
        System.out.println(sum1);

        //Que4-Create a Java program to add two matrices of size 2x3
        int [][] mat1={{2,3,4},
                       {5,6,7}};
        int [][] mat2={{ 7, 8, 9},
                       {12,13,14}};
        int[][] mat3 = new int[2][3];
        for (int i =0;i<mat1.length;i++){
            for (int j = 0;j<mat1[i].length;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }

        //Que5-Write a Java program to reverse an array.
        int[] reverse = {1,2,3,4,5,6,7,8,9};
        int temp;
        for (int i =0; i<(reverse.length/2);i++){
            temp=reverse[i];
            reverse[i]=reverse[reverse.length-i-1];
            reverse[reverse.length-i-1]=temp;
        }
        for (int element:reverse) {
            System.out.print(element + " ");
        }
        System.out.println();

        //Que6-Write a Java program to find the maximum element in an array.
        //considering marks array
        int max=0;
        for (int i =0; i<marks.length;i++){
            if (marks[i]>max){
                max=marks [i];
            }
        }
        System.out.println("max value is " + max);

        //Que7-Write a Java program to find whether an array is sorted or not.
        int[] unSorted = {1,3,5,17,9,10};
        boolean t1 = false,t2=false;
        for (int i = 0;i<unSorted.length-1;i++){
            t1=unSorted[i]<unSorted[i+1];
            if (!t1) {
                break;
            }
        }
        for (int i = 0;i<unSorted.length-1;i++){
            t2=unSorted[i]>unSorted[i+1];
            if (!t2){
                break;
            }
        }
        if (t1 || t2) {
            System.out.println("Sorted  in ascending/descending order");
        }else {
            System.out.println("unsorted");
        }
    }
}
