package com.yash;

class MyEmployee{
     private int id;
    private String name;

    private void setName(String a){        //setter (if private is not used)
        name=a;
    }
    void twofunc(String b){               //if not mentioned access modifier is default
        setName(b);
    }
    void setId(int n){               //setter--which sets value--name starts with set
        id = n;
    }
    int getId(){                      //getter--which gets value--name starts with get
        return id;
    }
    String getName(){                    //getter
        return name;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee user = new MyEmployee();
        //user.id=32;        //--->below statements will not be used to set/get the values as the access modifier is private
        //user.name="Yash";  //--->we can get or set their values only via methods(get and set in this case)
        //System.out.println(user.id);
        //System.out.println(user.name);

        //user.setName("nik");    //if setName method is made private then make another method which calls setName and provides its required parameter
        user.twofunc("nik");
        user.setId(6);
        System.out.println(user.getId());
        System.out.println(user.getName());

    }
}
