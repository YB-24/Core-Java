package com.yash;

class cellphone{
    void call(){
        System.out.println("calling...");
    }
    void pickup(){
        System.out.println("Picking up The call");
    }
}

interface wifi{
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
interface music{
    void playMusic();
    void searchMusic();
}

class SmartPhone extends cellphone implements wifi,music{

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
//    public void Free_free_free(){
//        System.out.println("This is overridden method");
//    }
}

public class ExampleAndDefaultMethodInInterface {
    public static void main(String[] args) {
        SmartPhone use1 = new SmartPhone();
        use1.call();
        use1.pickup();
        use1.getNetwork();
        use1.connectToNetwork("4G");
        use1.playMusic();
        use1.Free_free_free();
    }
}