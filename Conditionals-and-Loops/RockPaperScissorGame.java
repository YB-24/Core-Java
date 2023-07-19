package com.yash;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
  Random in = new Random();
  int gh = in.nextInt(1,3);
        System.out.println("enter your choice\n1-rock\n2-paper\n3-scissor");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        System.out.println("The Pc choice is:- " + gh);
        switch (ch){
            case 1:
                if (gh==1){
                    System.out.println("Draw");
                }
                else if (gh==2){
                    System.out.println("PC wins");
                }
                else{
                    System.out.println("User wins");
                }
                break;
            case 2:
                if (gh==1){
                    System.out.println("User wins");
                }
                else if (gh==2){
                    System.out.println("Draw");
                }
                else{
                    System.out.println("PC wins");
                }break;
            case 3:
                if (gh==1){
                    System.out.println("PC wins");
                }
                else if (gh==2){
                    System.out.println("User wins");
                }
                else{
                    System.out.println("Draw");
                }
        }


   }
}