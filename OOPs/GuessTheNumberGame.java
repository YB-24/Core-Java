package com.yash;
import java.util.Random;
import java.util.Scanner;

//Que-Create a class Game, which allows a user to play "Guess the Number" game once.
//Game should have the following methods:
//Constructor to generate the random number
//takeUserInput() to take a user input of number
//isCorrectNumber() to detect whether the number entered by the user is true
//getter and setter for noOfGuesses
//Use properties such as noOfGuesses(int), etc to get this task done!
class game {
    private int id;
    private int userNum;
    private int count=0;
    int getnum(){
        return id;
    }
    game(){
     Random r = new Random();
        id=r.nextInt(100);
    }
    void takeUserInput(int a){
        userNum=a;
        count++;
    }
    int getCount(){
        return count;
    }
    void isCorrect(){
        if (id==userNum){
            System.out.println("You have guessed the number correctly");
        } else if (id>userNum) {
            System.out.println("Smaller Guess");
        }else {
            System.out.println("bigger guess");
        }
    }

}
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        game user1 = new game();
        while (true){
            System.out.println("Input user number or press 0 to exit game");
            int n = sc.nextInt();
            if (n==0){
                break;
            }
            user1.takeUserInput(n);
            user1.isCorrect();
            if(user1.getnum()==n){
                System.out.println("the number of times the user tried is: "+ user1.getCount());
                break;
            }
        }

    }
}