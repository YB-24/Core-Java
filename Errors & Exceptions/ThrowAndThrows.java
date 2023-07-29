package com.yash;

class MyNewException extends Exception{
    @Override
    public String toString() {
        return "Radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can't be negative 1";
    }
}

public class ThrowAndThrows {
    public static int division(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static double areaCircle(int r) throws MyNewException {
        if(r<0){
            throw new MyNewException();
        }
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        try {
            float c = division(6,0);
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Exception "+e);
        }

        try {
            System.out.println(areaCircle(-6));
        }catch (Exception e){
            System.out.println(e);     //toString() will be executed
            System.out.println(e.getMessage());
        }
        System.out.println("End of Program");
    }
}