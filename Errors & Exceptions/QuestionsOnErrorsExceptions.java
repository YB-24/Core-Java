package com.yash;

public class QuestionsOnErrorsExceptions {
    public static void main(String[] args) {
        //Que1-Write a java program that prints "HaHa" during Arithmetic exception
        // and "HeHe" during an Illegal argument exception.
        try{
            System.out.println(6/3);
        }catch (ArithmeticException e){
            System.out.println("HaHa");
        }catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        //Que2-
        boolean flag = true;
        int [] arr={3,6,5,7,8,9};
        int b = 12;
        while (flag){
            try {
                arr[b]=0;
                System.out.println("Finally done");
                break;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception Found");
            }b--;
        }
    }
}
