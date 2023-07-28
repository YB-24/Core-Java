package com.yash;

 class test{
    public int x = 45;
    protected int y = 46;
     int z = 47;            //default
    private int q = 48;

    public void print(){
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(this.z);
        System.out.println(this.q);
    }
}
public class class1 {

        public int x = 49;
        protected int y = 46;
        int z = 47;
        private int q = 48;

    public static void main(String[] args) {


        test obj = new test();
        obj.print();      //within same class all are accessible

        System.out.println(obj.z);
        System.out.println(obj.x);
        System.out.println(obj.y);
        //System.out.println(obj.q);    //private cant be accessed from different class same package


    }
}
