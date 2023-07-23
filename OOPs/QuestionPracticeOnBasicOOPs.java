package com.yash;

//Que1-Create a class Employee with the following properties and methods:
  //Salary (property) (int)
  //getSalary (method returning int)
  //name (property) (String)
  //getName (method returning String)
  //setName (method changing name)
class employ{             //Any member of a class mentioned without any access specifier then it is considered as Default. The Default will act as public within the same package and acts as private outside the package.
    int salary;
    String name;
    int getSal(){
        return salary;
    }
    String getName(){
        return name;
    }
    String setName(String a){
        name =a;
        return name;
    }
}

//Que2-Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class cellphone {
    public void ringing(){
        System.out.println("Ringing Please pick up your phone");
    }
    void vibrating(){
        System.out.println("the phone is on silent please unmute your self ");
    }
}

//Que3-Create a class Rectangle with a method to initialize its side, calculating area, perimeter etc.
class rectangle{
    int area;
    int perimeter;
    int a,b;
    void sides(int c,int d){
        a=c;
        b=d;
        System.out.println("the entered sides are "+a+" "+b);
    }
    int area_rect(){
        area=a*b;
        return area;
    }
    int getPerimeter_rect(){
        perimeter=2*(a+b);
        return perimeter;
    }
}

public class QuestionPracticeOnBasicOOPs {
    public static void main(String[] args) {
        //Testing Que1
        employ yashb= new employ();
        yashb.name="Yash";
        yashb.salary=1200000;
        System.out.println(yashb.getSal());
        System.out.println(yashb.getName());
        yashb.setName("Hash");
        System.out.println(yashb.getName());

        //Testing Que2
        cellphone samsun = new cellphone();
        samsun.ringing();
        samsun.vibrating();

        //Testing Que3
        rectangle nik = new rectangle();
        nik.sides(17,19);
        System.out.println(nik.area_rect());
        System.out.println(nik.getPerimeter_rect());

    }
}
