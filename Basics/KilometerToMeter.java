package com.yash;
import java.util.Scanner;

public class KilometerToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in kilometers=");
        float km = sc.nextFloat();
        System.out.println("The value in meters=  " + km*1000);
    }

}


