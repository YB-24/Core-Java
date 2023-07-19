package com.yash;

public class Operators {
    public static void main(String[] args) {
        int age=32;
        //Relational Operators
        if(age==18){
            System.out.println("You Can participate");
        }
        if (age>=18){                       //similarly <=,>,<
            System.out.println("You Can participate");
        }
        if (age!=32){
            System.out.println("hurray");
        }

        //logical  operators
        if(true && true){          //&&--logical and, ||--or , !--not
            System.out.println("God");
        }
    }
}
