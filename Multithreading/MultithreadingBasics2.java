package com.yash;

class Thread3 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("i am thread 3");
        }
    }
}
class Thread4 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("i am thread 4");
        }
    }
}

public class MultithreadingBasics2 {
    public static void main(String[] args) {
        Thread3 bullet1 = new Thread3();
        Thread gun1 = new Thread(bullet1);
        Thread4 bullet2 = new Thread4();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
