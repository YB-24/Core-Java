package com.yash;

interface Bicycle{
    int a=5;                    //constants are allowed in interface and its access modifier is final so we can't change it in main method
     void speedUp(int a);
    void slowDown(int b);
}

interface Horn{
    void horn1();
    void horn2();
}

//we can implement one, two or more interfaces in a class
//class should contain every abstract method of interfaces with body and their access modifier should be public
class Hero implements Bicycle,Horn{
    int speed=40;
public int a=32;     //we can redefine constant in implementing class in such manner.
    public void speedUp(int a){
        speed+=a;
        System.out.println("now the speed is: "+speed);
    }
    public void slowDown(int b){
        speed-=b;
        System.out.println("now the speed is: "+speed);
    }
   public void horn1(){
       System.out.println("poo pee poo pee");
   }
   public void horn2(){
       System.out.println("poo poo poo");
   }
}

public class Interfaces {
    public static void main(String[] args) {
//interfaces are primarily group of related methods with no body except for private and default methods
// interface in java is mainly a collection of abstract methods.
// There is no need to write abstract keyword before declaring methods in an interface because an interface is implicitly abstract.
//An interface cannot contain a constructor (as it cannot be used to create objects)

        Hero obj = new Hero();
        obj.horn2();
        obj.speedUp(20);
        obj.speed=30;
        System.out.println(obj.a);   //we can view the constant but can't modify it in main method
    }
}