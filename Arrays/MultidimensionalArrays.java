package com.yash;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int [] marks1 = new int[5];        //1D Array
        int [][] marks2 = new int[2][3];   //2D Array
        int [][][] marks;                  //3D Array

        marks2[0][0]=2;
        marks2[0][1]=3;
        marks2[0][2]=4;
        marks2[1][0]=5;
        marks2[1][1]=25;
        marks2[1][2]=26;

        System.out.println(marks2.length);      //prints how many arrays are there in marks2 i.e first box[] number
        System.out.println(marks2[0].length);   //prints how many arrays are there in index 0 of marks2 i.e second box[] number
        //System.out.println(marks3[0][1].length);

        //printing all elements in array
        for (int i=0; i<marks2.length;i++){
            for (int j=0;j<marks2[i].length;j++){
                System.out.print(marks2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
