package com.yash;

abstract class Parent{         //if a class contains atleast one abstract method then we have to make that class abstract
   Parent(){
       System.out.println("i am a parent class constructor");
   }
    public void greet(){
        System.out.println("good morning");
    }
    abstract public void hello();     //method with no implementation is called abstract method.
                                      //Abstract methods cannot have a body
    abstract public void hell2();

}
class child extends Parent{        //if we want to inherit a class from abstract class which can make objects, then we have to overload all
                                   //of the abstract methods in child class or make the inherited class itself abstract which can't make objects
    public void hello(){
        System.out.println("hello world");
    }
    public void hell2(){
        System.out.println("hell2 world");
    }
    public int num(){
        return 5;
    }

}
abstract class child1 extends Parent{

  public void hello(){
      System.out.println("hi  how are you");
  }

}
class grandchild extends child1{          //as we can see that the inherited class which can create objects
                                          //is made from abstract class which is further made from another
                                          //abstract class, should contain all the abstract methods overloaded
                                          //from all abstract classes from which it is inherited.
    public void hello(){
        System.out.println("hello world");
    }
    public void hell2(){
        System.out.println("hell2 world");
    }

}

public class AbstractClasses {
    public static void main(String[] args) {

      // Parent p=new Parent();       //we cannot make objects of abstract class
        child c = new child();
        c.greet();
        c.hello();
        c.hell2();
        Parent p = new child();  //Dynamic method dispatch will work as it is in this case
    }
}