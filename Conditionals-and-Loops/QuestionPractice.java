package com.yash;

public class QuestionPractice {
    public static void main(String[] args) {

        //Que 1--Pattern Question
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j = n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //Que 2--Print Table
        int i=10;
        int n1=10;
        while (i>0){
            System.out.println(n1*i);
            i--;
        }

        //Factorial of number
        n1=5;
        int fact=1;
        while (n1>0){
            fact=fact*n1;
            n1--;
        }
        System.out.println(fact);

        //sum of numbers in a table
        i=1;
        int sum =0;
        while(i<=10){
            int mul=8;
            mul = mul * i;
            sum =sum + mul;
            i++;
        }
        System.out.println(sum);

    }

}
