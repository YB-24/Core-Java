package com.yash;

class threads1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("*** thread 1 ***");
            i++;
        }
    }
}
class threads2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("*** thread 2 ***");
            i++;
        }
        try {
            threads2.sleep(3555);           //The sleep() method is useful to put a thread to sleep for a specified amount of time.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        threads1 obj1 = new threads1();
        threads2 obj2 = new threads2();
        obj1.start();
        try {
            obj1.join();             //waits for complete execution of thread obj1
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();

    }
}
