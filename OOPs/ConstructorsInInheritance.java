package com.yash;

class Base1{
    Base1(){
        System.out.println("This is a parent class constructor");
    }
    Base1(int a){
        System.out.println("This is a parent class overloaded constructor with a as: "+a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(2);    //to call the constructor with parameters from the parent class, we use the super keyword.
        System.out.println("This is a child class constructor");
    }
    Derived1(int a,String b){
        super();
        System.out.println("This is a child class overloaded constructor with a and b as:" + a+b);
    }
}
class DerivedOfDerived1 extends Derived1{
    DerivedOfDerived1(){
        super(6,"Yash");
        System.out.println("This is a grandson class constructor");
    }
}
public class ConstructorsInInheritance {
    public static void main(String[] args) {
        System.out.println("----------For Base1 Class Constructor call----------");
        Base1 obj = new Base1();
        System.out.println("----------For Derived1 Class Constructor call----------");
       Derived1 obj1 = new Derived1();
        System.out.println("----------For DerivedOfDerived1 Class Constructor call----------");
        DerivedOfDerived1 obj2 = new DerivedOfDerived1();
    }
}
