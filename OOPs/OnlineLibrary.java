package com.yash;
//Que-You have to implement a library using Java Class "Library"
//      Methods: addBook, issueBook, returnBook, showAvailableBooks
//      Properties: Array to store the available books,
//      Array to store the issued books

import java.util.Scanner;

class Library{
    public String[] availableBooks = new String[100];
    public String[] issuedBooks= new String[100];
    int noOfAvailableBooks =1;
    int[] existingBookEmptyTracker =new int[100];
    int existingBookEmptySpaceCounter =0;
    int[] issuedBookEmptyTracker =new int[100];
    int issuedBookEmptySpacesCounter =0;
    int noOfIssuedBooks =1;

    public void addBook(String a){
           if (existingBookEmptySpaceCounter>=0 && existingBookEmptyTracker[0]!=0 ){
               existingBookEmptySpaceCounter--;
            if ((existingBookEmptyTracker[existingBookEmptySpaceCounter])!=0){
                availableBooks[(existingBookEmptyTracker[existingBookEmptySpaceCounter])]=a;
                noOfAvailableBooks++;
            }existingBookEmptyTracker[existingBookEmptySpaceCounter]=0;
           }else {
                availableBooks[noOfAvailableBooks]=a;
                noOfAvailableBooks++;
            }
    }
    public void showAvailableBooks(){
        System.out.println("The number of available books are: "+(noOfAvailableBooks -1));
        System.out.println("The number of issued books are: "+(noOfIssuedBooks -1));
        System.out.println("The Available books are the ones without \"--issued\" tag");
        for (int i=1;i<=noOfAvailableBooks;i++) {
            System.out.println(i+" "+availableBooks[i]);
        }
        System.out.println("The issued books are the ones without \"--returned\" tag");
        for (int i=1;i<=noOfIssuedBooks;i++) {
            System.out.println(i+" "+issuedBooks[i]);
        }
    }
    public void issueBook(String b){
        for (int i = 1; i< 100; i++){
            if (availableBooks[i]==b && !(availableBooks[i].endsWith(" --issued"))){
                if (issuedBookEmptySpacesCounter>=0 && issuedBookEmptyTracker[0]!=0 ){
                    issuedBookEmptySpacesCounter--;
                if (issuedBookEmptyTracker[issuedBookEmptySpacesCounter]!=0){
                    issuedBooks[(issuedBookEmptyTracker[issuedBookEmptySpacesCounter])]=b;

                }issuedBookEmptyTracker[issuedBookEmptySpacesCounter]=0;
                }else {
                issuedBooks[noOfIssuedBooks]=b;
                }
                existingBookEmptyTracker[existingBookEmptySpaceCounter]=i;
                noOfIssuedBooks++;
                existingBookEmptySpaceCounter++;
                availableBooks[i]+=" --issued";
                noOfAvailableBooks--;
                break;
            }
        }
    }
    public void returnBook(String c){
        for (int i=0;i<issuedBooks.length;i++){
            if (c==issuedBooks[i] && !(issuedBooks[i].endsWith(" --returned")) ){
                issuedBooks[i]+=" --returned";
                noOfIssuedBooks--;
                issuedBookEmptyTracker[issuedBookEmptySpacesCounter]=i;
                issuedBookEmptySpacesCounter++;
                addBook(c);
            }
        }
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        Library user=new Library();
        Scanner sc = new Scanner(System.in);
        //The code users can try as per own need.the demo is shown below
        user.addBook("Nilesh");
        user.addBook("Ramesh");
        user.addBook("Jayesh");
        user.addBook("Suresh");
        user.addBook("Somesh");
        user.addBook("Rajesh");
        user.issueBook("Jayesh");
        user.issueBook("Somesh");
        user.addBook("Nikhil");
        user.addBook("Yash");
        user.returnBook("Somesh");
        user.returnBook("Jayesh");
        user.showAvailableBooks();
    }
}