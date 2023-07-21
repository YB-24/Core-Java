package com.yash;

public class Methods {      //functions inside class is known as methods
    static int logic(int x,int y){         //static is used as inside the static main method we do not
        int z;                             //need to create an object of class to use it we can directly call the method
        if (x>y){                          //The static keyword is used to share the same variable or method of a given class
            z=x+y;
        }else {
            z=(x+y)*5;
        }
        return z;
    }

    int add(int x,int y){                //we need to create object of class to use it inside the psvm
        int z;
        z=x+y;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = logic(a,b);                   //direct calling of static logic method inside static main
        int a1=9;
        int b1 = 3;
        int c1;
        c1=logic(a1,b1);                     //copy of a1 and b1 is passed to x and y so changes in x and y in
                                            //logic method will not change a1 and b1 in main method in this case**
        System.out.println(c + " " + c1);

        Methods obj = new Methods();           //creating object of class
        int c3= obj.add(a,b);                  //using nonstatic method add via that object of class
        System.out.println(c3);
        int c4= obj.power(6);               //we can use previously created object as well as can create new one
        System.out.println(c4);

    }
    int power(int a){
        int z=add(1,2);      //directly use nonstatic method in other nonstatic method
        int q = logic(3,4);     //directly use static method in other nonstatic method
        z=z*q*a;
        return z;
    }
}
