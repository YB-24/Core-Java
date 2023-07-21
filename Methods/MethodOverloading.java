package com.yash;

public class MethodOverloading {

    //void return type
    static void greet (){
        System.out.println("Good Morning!!");
    }

    //Passing Primitive datatype as well as string in method will not change original data in main method only a copy will be passed and that copy will be modified
    static int change(int a){
        a=68;
        return a;
    }

    //passing array and object in method will pass the reference so the original data in main will change
    static int change1(int[] arr){
        arr[0]=23;
        return arr[0];
    }

    //Method Overloading-- two or more methods can have same name but should have different parameters
                           //it will not work if return_type is different but parameters are same

    static void hello(){
        System.out.println("no parameters");
    }
    static void hello(int a){
        System.out.println("one integer parameter " +a );
    }
    static void hello(String a){
        System.out.println("one string parameter "+a);
    }
    static void hello(int a ,String b){
        System.out.println("two parameters int and string "+b+" "+a);
    }
    static void hello(int a ,int b){
        System.out.println("two parameters int and int "+b+" "+a);
    }


    public static void main(String[] args) {
        greet();

        int x = 36;
        change(x);
        System.out.println("The Value of x after change is: " + x);

        int [] array = {15,28,26,35,68,70};
        change1(array);
        System.out.println("the value of array[0] after change1 is: " + array[0]);

        hello();
        hello(3);
        hello("school");
        hello(6,5);
        hello(6,"yes");

    }
}