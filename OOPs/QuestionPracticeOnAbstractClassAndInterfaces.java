package com.yash;
//Que1-Create an abstract class pen with methods write () and refill () as abstract methods
abstract class Pen{
    abstract void write();
    abstract void refill();
}

//Que2-Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
class FountainPen extends Pen{
   public void write(){
       System.out.println("Writing....");
    }
    public void refill(){
        System.out.println("Go refil yourself");
    }
    public void changeNib(){
        System.out.println("Not enough money");
    }
}

//Que3-Create a class monkey with jump ( ) and bite ( ) methods Create a class human which
      //inherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods
class Monkey{
    public void jump() {
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("biting.....");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();

}
class Human extends Monkey implements BasicAnimal{
    @Override
   public void eat(){
       System.out.println("eating");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping do not disturb");
    }
}
//Que4-Create an interface TV_remote and use it to inherit another interface smart TV_remote
interface TVremote{
    void volumeUP();
    void volumeDown();
    void power();
    void channel();
}
interface SmartTVremote extends TVremote{
    void mouse();
    void youtub();

}


public class QuestionPracticeOnAbstractClassAndInterfaces {
    public static void main(String[] args) {
    //testing Que2
        FountainPen pen = new FountainPen();
        pen.refill();
        pen.changeNib();
        pen.write();

        //testing Que3
        Human hooman = new Human();
        hooman.eat();
        hooman.bite();
        hooman.jump();

        //Que5-Demonstrate polymorphism using monkey class from Q3
        Monkey m =new Human();
        BasicAnimal bA = new Human();
    }
}
