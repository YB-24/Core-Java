package com.yash;

//Que1-Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
class greet1 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

//Que2-Add a sleep method in the welcome thread of question 1 to delay its execution for 2000ms.
class greet2 extends Thread{
    @Override
    public void run(){
       try{
           Thread.sleep(2000);
       }catch (Exception e){
           System.out.println(e);
       }
        while (true) {
            System.out.println("Welcome");
        }
    }
}

public class QuestionPracticeOnThreads {
    public static void main(String[] args) {
        greet1 ob1 = new greet1();
        greet2 ob2 = new greet2();
        //Que3-Demonstrate getPriority() and setPriority() methods in Java threads.
        //Que4-How do you get the state of a given thread in Java?
        System.out.println(ob1.getState());
        ob1.setPriority(9);
        ob2.setPriority(4);
        System.out.println(ob1.getPriority());
        System.out.println(ob2.getPriority());
        ob1.start();             //only the code in run will execute
        ob2.start();
    }
}
