package com.yash;

//Interfaces can extend other interfaces
interface ParentInterface {
   void func();
   void func1();
   default void use(){
       System.out.println("default method is also used");
   }
}
interface ChildInterface extends ParentInterface{
        void func3();
        void func4();
}
class Test implements ChildInterface{
   public void func(){
       System.out.println("func0");
   }
   public void func1(){
       System.out.println("func1");
   }
  public   void func3(){
      System.out.println("func3");
  }
   public void func4(){
       System.out.println("func4");
   }
}
public class InheritanceInInterfaces {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.func1();
        obj.func4();
        obj.use();
    }
}