package com.yash;
import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age){                            //it will check the case first if match is found then will execute
            case 10:                            //all the statement below it until break is found
                System.out.println(age+"h");        //switch can take integer,character and string as variable input
                break;
            case 15:
                System.out.println(age+"i");
                break;
            case 20:                                  //if break is not given in particular case then it will
                System.out.println(age+"j");              //contiune to execute until break is found
            case 25:
                System.out.println(age+"k");
                break;
            default:                                   //default is optional
                System.out.println("end");            //default can be placed anywhere but then break is mandatory
        }

        //enhanced switch---break is considered at end of each case automatically
        switch (age) {
            case 10 -> {System.out.println(age + "h");
                System.out.println("kk");
            }
            case 15 -> System.out.println(age + "i");
            case 20 -> System.out.println(age + "j");
            case 25 -> System.out.println(age + "k");
            default -> System.out.println("end");
        }
    }
}
