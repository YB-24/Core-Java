package com.yash;

import java.util.Arrays;

public class VarArgs {
    /*
    static int add (int a,int b){   //here a and b are compulsory parameters
        int c = a+b;
        return c;
    }
    static int add (int a,int b,int d){   //here a,b and d are compulsory parameters
        int c = a+b+d;
        return c;
    }
    static int add (int a,int b,int d,int e){   //here a,b,d and e are compulsory parameters
        int c = a+b+d+e;
        return c;
    }
   */

    //instead of writing above methods we can write below VarArgs method
    static int add(int ...arr){        //here parameter is not compulsory but if we write (int x, int ...arr) then 1 parameter i.e. x is compulsory
       //arr is available here as int[] arr
        int sum=0;
        for (int e:arr){
            sum+=e;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 2 num is: " + add(1,3));
        System.out.println("the sum of 3 num is: " + add(1,3,5));    //for 3 nos sum we need to overload add with 3 parameters
        System.out.println("the sum of 4 num is: " + add(1,3,5,8));    //for 4 nos sum we need to overload add with 4 parameters

        //The above problem for variable arguments can be solved by VarArgs instead of method overloading n number of times
        System.out.println("the sum of 1 num is: " + add(7));
        System.out.println("the sum of 0 num is: " + add());

    }
    //Varargs Example
    static void strNum(String a, int b, String ...arr) {    //there will only be one VarArgs array

    }
}
