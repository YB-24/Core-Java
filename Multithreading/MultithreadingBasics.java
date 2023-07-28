package com.yash;

class Thread1 extends Thread{
    @Override
    public void run(){
   int i = 0;
        while (i<4000){
            System.out.println("i am thread 1 ");
            System.out.println("good");
            i++;
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
   int i = 0;
        while (i<4000){
            System.out.println("i am thread 2 ");
            System.out.println("bad");
            i++;
        }
    }
}
public class MultithreadingBasics {
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        Thread2 obj1 = new Thread2();
        obj.start();            //both run method will run one after another repeatedly
        obj1.start();
    }
}
