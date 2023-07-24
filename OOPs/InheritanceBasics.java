package com.yash;

class Base{
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Derived extends Base{                    //class subclass(child) extends superclass(parent)---syntax
    public int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
public class InheritanceBasics {
    public static void main(String[] args) {
        //creating a base object
        Base user1 = new Base();
        user1.setX(6);
        System.out.println(user1.getX());
        //user1.setZ(6);                      //we cannot access derived class methods and attributes from base class
        //System.out.println(user1.getZ());

        //creating a derived class object
        Derived user2 = new Derived();
        user2.setY(6);                      //we can access base class methods and attributes from derived class
        System.out.println(user2.getY());
        user2.setZ(9);
        System.out.println(user2.getZ());
    }
}
//Class attributes are the variables defined directly in the class that are shared by all objects of the class