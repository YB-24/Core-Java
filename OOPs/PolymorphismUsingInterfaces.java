package com.yash;

class cellphone1{
    void call(){
        System.out.println("calling...");
    }
    void pickup(){
        System.out.println("Picking up The call");
    }
}

interface wifi1{
    void getNetwork();
    void connectToNetwork(String a);
    private void search_free_wifi(){            //we can use private methods in interface but they can be accessed through another default method only.
        System.out.println("Hurray! free wifi found");
    }
    default void Free_free_free(){      //we can override default method in implementing class
        search_free_wifi();
        System.out.println("this is a default method");
    }
}
interface music1{
    void playMusic();
    void searchMusic();
}

class SmartPhone1 extends cellphone1 implements wifi1,music1{

    public void getNetwork(){
        String[ ] arr={"3G","4G","5G","Free wifi"};
        for (String a:arr) {
            System.out.println(a);
        }
    }
    public void connectToNetwork(String a){
        System.out.println("Connecting to network: "+ a);

    }
    public void playMusic(){
        System.out.println("Playing Gangum Style");
    }
    public void searchMusic(){
        System.out.println("Searching yo-yo");
    }

}

public class PolymorphismUsingInterfaces {
    public static void main(String[] args) {
        //one person multiple task--polymorphism
        //eg-smartphone can act as camera, music player, recorder, etc

        wifi1 obj = new SmartPhone1();  // only use wifi1 method of smartphone
        SmartPhone1 ob = new SmartPhone1(); //can use all the features

        //obj.playMusic();   --->not allowed
        obj.getNetwork();
        obj.connectToNetwork("5G");
        obj.Free_free_free();

    }
}