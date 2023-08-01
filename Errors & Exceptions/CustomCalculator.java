package com.yash;

/*Que-You have to create a custom calculator with following operations:
1. + -> Addition
2. - -> Subtraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions:
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max Input Exception if any of the inputs is greater than 100000
4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Exception-Invalid Input";
    }
}
class DivisionException extends Exception{
    @Override
    public String toString() {
        return "Exception-Cannot divide by 0";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Exception-inputs is greater than 100000 ";
    }
}
class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString() {
        return "Exception-input greater than 7000 ";
    }
}

class Calculator{
    public float Equation(int a,String b,int c) throws InvalidInputException,MaxInputException,DivisionException,MaxMultiplierReachedException{

if (b.equals("+")||b.equals("-")||b.equals("*")||b.equals("/"))   {
        if (a>100000||c>100000){
            throw new MaxInputException();
        }
        if (b.equals("+")){
            return a+c;
        }
        if (b.equals("-")){
            return a-c;
        }
        if (b.equals("*")){
            if (a>7000||c>7000){
                throw new MaxMultiplierReachedException();
            }
            return a*c;
        }
        if (b.equals("/")){
            if (c==0){
                throw new DivisionException();
            }
            return a/c;
        }
}else {
    throw new InvalidInputException();
}
        return -1;
    }
}
public class CustomCalculator {
    public static void main(String[] args) {
     Calculator obj = new Calculator();
       try {
           float a = obj.Equation(70,"/",8);
           System.out.println(a);
       }catch (Exception e){
           System.out.println(e);
       }finally {
           System.out.println("End of Program");
       }
    }
}