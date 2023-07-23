package com.yash;

class MyMainEmployee{
     int id;
    private String name;
    int sal;
    //instead of using setters to modify the variables we can use constructors
    //It is a special type of method which is used to initialize(give value to) the object at time of creation.
    //constructor has same name as the class name and has no return type not even void
    //It can not be abstract, static, final, and synchronized
    //constructors can be overloaded
    MyMainEmployee(){                // If there is no constructor in a class, compiler automatically creates a default constructor.
        System.out.println("this is default constructor which has no parameters and defined by me");
    }
    MyMainEmployee(int a,String b){
        id=a;
        name=b;
    }

}
public class Constructors {
    public static void main(String[] args) {
    MyMainEmployee obj = new MyMainEmployee();
    MyMainEmployee obj2 = new MyMainEmployee(6,"yash");
    obj2.sal=56000;
    obj.sal=6000;
        System.out.println(obj2.sal);
        System.out.println(obj.sal);

    }
}
