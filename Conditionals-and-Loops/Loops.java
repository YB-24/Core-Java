package com.yash;

public class Loops {
    public static void main(String[] args) {

        //While loops
        int i = 10;
        while(i>0){                 //while will run until condition[always boolean] inside is true
            System.out.println(i);
            i--;
        }

        //do while loop-- will execute atleast once in any case
        int b = 0;
        do {
            b++;
            System.out.println(b);
        }while (b<10);

        //for loop--syntax--(initialization;condition;increment/decrement)
        for(int v=0;v<=10;v++){
            System.out.println(v);
        }

        //break statement--brings control out of loop
        //continue statement--skips current iteration of loop it is part of by not executing the code below it
        int z=1;
        while (z<11){
            if (z%2==0){
                z++;
                continue;
            }
            if (z==9){
                break;
            }
            System.out.println(z);
            z++;
        }

    }
}
