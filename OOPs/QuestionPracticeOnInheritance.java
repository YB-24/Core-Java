package com.yash;

//Que-Create a class circle and use inheritance to create another class cylinder from it
class circle{
    float radius;
    circle(float radius) {              //when parametrized constructor is made then we need to create default constructor
        this.radius = radius;           //as it is not made automatically in this case or use super keyword to call parameterized constructor.
    }
    public double perimeter_circle() {
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }
    public double area_circle() {
        double area = Math.PI*radius*radius;
        return area;
    }
}
class cylinder extends circle{
    float  height;
    cylinder(float radius,float height) {
        super(radius);
        this.height = height;
    }
    public double area_cylinder(){
        return perimeter_circle()*height+2*area_circle();
    }
    public double volume_cylinder(){
        return area_circle()*height;
    }
}

public class QuestionPracticeOnInheritance {
    public static void main(String[] args) {
     //testing que
        cylinder obj = new cylinder(4.5f,6.39f);
        System.out.println(obj.area_cylinder());
        System.out.println(obj.volume_cylinder());

    }
}
