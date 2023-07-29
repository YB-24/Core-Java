package com.yash;

// constructors of the thread class Thread ( Runnable r, String name )
class Thre implements Runnable{
    @Override
    public void run(){
        System.out.println("I am a runnable thread");
    }
}
// constructors of the thread class--Thread ( string )
class Thr extends Thread{
    public Thr(String name){
        super(name);
    }
    @Override
  public void run(){
        int i = 32;
      System.out.println("I am a thread" + getName());
  }
}

public class ConstructorsFromThreadClass {
    public static void main(String[] args) {
        System.out.println("-----constructors of the thread class--Thread(String s)-----");
      Thr obj = new Thr("Yash");
      Thr obj1 = new Thr("YB-24");
      obj.start();
      obj1.start();
        System.out.println("name of thread 1 is "+obj.getName());
        System.out.println("name of thread 2 is "+obj1.getName());
        System.out.println("id of thread 1 is "+obj.threadId());
        System.out.println("id of thread 2 is "+obj1.threadId());
        System.out.println("priority of thread 1 is "+obj.getPriority());
        System.out.println("priority of thread 2 is "+obj1.getPriority());

        System.out.println("-----constructors of the thread class--Thread(Runnable r,String name)-----");
        Thre obj2 = new Thre();
        Thread t = new Thread(obj2,"Nik");
        t.start();
        System.out.println("name of Thre is "+t.getName());
        System.out.println("id of Thre is "+t.threadId());

        System.out.println("----------thread priority----------");
        Thr t1 = new Thr("Yash1");
        Thr t2 = new Thr("Yash2");
        Thr t3 = new Thr("Yash3");
        Thr t4 = new Thr("Yash4");
        Thr t5 = new Thr("Yash5");
        t5.setPriority(Thread.MAX_PRIORITY);       //Don't rely much on java thread priority because it's majorly managed by OS
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(8);
        t2.setPriority(3);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
