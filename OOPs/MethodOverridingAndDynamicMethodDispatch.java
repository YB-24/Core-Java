package com.yash;

class Phone{
    public int a;
    public void turningOn(){
        System.out.println("The Has now started");
    }
    public void time(int a){
        this.a=a;                  //here this is used to differentiate between parameter and local variable
        System.out.println("The time is: "+a);
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("playing the music....");
     }
     @Override                                           //Method Override--exact same method in parent class
     public void time(int a){
         System.out.println("The time on smartphone is: " + a);
     }
}

public class MethodOverridingAndDynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        Smartphone obj2 = new Smartphone();
        obj1.time(6);
        obj2.time(6);

        //Dynamic Method Dispatch
        Phone obj3 = new Smartphone();  //parent class can reference child class object but vice-versa is not true
        //Smartphone obj4 = new Phone();  //invalid
        obj3.time(6);                  //as object is of child class the overridden method of child will run
        //obj3.music();                 //invalid as other methods except overridden will not execute

    }
}
