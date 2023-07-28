import com.yash.class1;

class test4 extends class1{
    public void printf() {              //public and protected allowed in subclass different package
        System.out.println(x);
        System.out.println(y);
        //System.out.println(z);
        //System.out.println(q);
    }
}

public class class2 {
    public static void main(String[] args) {
        class1 obj1 = new class1();
        System.out.println(obj1.x);      //only public allowed in world
        //System.out.println(obj1.y);
        //System.out.println(obj1.z);
        //System.out.println(obj1.q);
    }
}
