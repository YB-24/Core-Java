package com.yash;

class Employee{           //there will only be one public class with same name as file name
                          //by default all the attributes and methods in user defined class is non_static
                          //we can make it static by using static keyword before declaring them
                          //if we use static for attributes,methods or both then there is no need to create object as the same will be modified.
                          //for eg--if we use static for salary then the salary for both objects will be same as per last modified(nik in this case)
    int id;     //attribute 1
    String name;  //attribute 2
    int salary;     //attribute 3
    public void getInfo(){                     //method 1
        System.out.println("the employee id is: "+ id);
        System.out.println("the employee name is " + name);
    }
    public int getSalary(){                   //method 2
        return salary;
    }
}

public class JavaClass {
    public static void main(String[] args) {
     Employee yash = new Employee();  //instantiation of a new employee object
     Employee nik = new Employee();  //instantiation of a new employee object

        //setting attributes for yash
       yash.name="YB-24";
        yash.id=11;
        yash.salary=35;

        //setting attributes for nik
        nik.id=12;
        nik.name="no";
        nik.salary=12;

        //Printing the attributes via sout
        System.out.println(yash.name);
        System.out.println(yash.id);
        System.out.println(yash.salary);

        //printing the attributes via methods
        nik.getInfo();
        System.out.println(nik.getSalary());

    }
}
