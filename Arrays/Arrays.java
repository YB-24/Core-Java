package com.yash;

public class Arrays {
    public static void main(String[] args) {
        //arrays are used to store similar type of data and have contiguous memory allocation
        //The size of the array can not be increased at run time therefore we can store only a fixed size of elements in array
        //there are three main ways to use arrays
        //1st method
        int[] marks = new int[5];  //declaration and memory allocation
                                   //marks is reference which is pointing to object in memory location
        //initialization
        marks[0] = 23;
        marks[1] = 73;
        marks[2] = 83;
        marks[3] = 263;
        marks[4] = 234;

        //2nd method
        int[] books;    //declaration
        books = new int[2];  //memory allocation
        //initialization
        books[0] = 32;

        //3rd method
        String[] name = {"yash", "nikhil", "harry", "kunal"};  //declaration, memory allocation and initialization

        //printing of particular element in array
        System.out.println(marks[3]);
        System.out.println(books[1]);
        System.out.println(name[1]);

        //length of array
        float[] marks1 = {36.25f,23.25f,23.25f,48.3f,58.65f};
        System.out.println(marks1.length);
        System.out.println(marks1[2]);

        //printing all the elements in an array(for loop method)
        for (int i = 0;i<marks1.length;i++){
            System.out.println(marks1[i]);
        }

        //printing all the elements in an array(for loop enhanced method)(for each loop)
        for (String element : name ) {
            System.out.println(element);
        }
        for (float element:marks1){
            System.out.println(element);
        }

    }
}
