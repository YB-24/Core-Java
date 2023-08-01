package com.yash;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
       ArrayList<Integer> l1 = new ArrayList<>(6);
       ArrayList<Integer> l2 = new ArrayList<>();

       l2.add(32);
       l2.add(72);
       l2.add(62);
       l2.add(52);
       l2.add(2);

       l1.add(6);
       l1.add(6);
       l1.add(9);
       l1.add(7);
       l1.add(4);
       l1.add(8);

       l1.add(4,11);

        l1.remove(5);

        System.out.println(l1.contains(8));

        l1.addAll(6,l2);

        l1.set(2,566);

        ArrayList<Integer> l3;
        l3 = (ArrayList<Integer>)l1.clone();
           l3.add(6);

        System.out.println(l1);
        System.out.println(l3);

        System.out.println(l1.indexOf(6));

        System.out.println(l1.lastIndexOf(8));

        System.out.println(l1.subList(0,6));

         l1.forEach(element ->System.out.print((element+2)+"  "));
        System.out.println();
        System.out.println();

        Iterator<Integer> it = l1.iterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }
    }
}