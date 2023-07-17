package com.yash;

public class StringFunctions {
    public static void main(String[] args) {
        String name = " Yash Bagul ";
        int length = name.length();    //Every Whitespaces inside " " are also counted
        System.out.println(length);
        System.out.println(name.length());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.trim());   //removes trailing and leading spaces

        System.out.println(name.substring(4));  //returns string from index 4 [index starts from 0]
        System.out.println(name.substring(4,8));         //returns string from index 4 to 7

        System.out.println(name.replace('a','z'));     //replace a character in entire string
        System.out.println(name.replace("sh","hs"));  //replace a group character in entire string
        System.out.println(name.replace("sh","s"));

        System.out.println(name.startsWith(" Ya"));    //returns boolean //spaces are also considered
        System.out.println(name.endsWith("ul "));      //returns boolean //spaces are also considered

        System.out.println(name.charAt(2));           //returns character at index 2

        System.out.println(name.indexOf("Ba"));       //returns index of B where Ba is found first in the string
                                                      //otherwise -1 is returned
        System.out.println(name.indexOf("Ba",6));       //returns index of B where Ba is found after
                                                                    // 6th index(included) in the string, otherwise -1
        System.out.println(name.lastIndexOf("ag"));             //searches from end to start
        System.out.println(name.lastIndexOf("ag",5));  //returns last index before index 5

        System.out.println(name.equals(" Yash Bagul "));   //casesensitive and space are considered
                                                           //Exact same hona chahiye
        System.out.println(name.equalsIgnoreCase(" yaSh BaGul ")); //caseInsensitive but spaces are considered

        System.out.println(name.contains(" "));   //checks whether a string contains a sequence of characters
                                                  //spaces are also considered
        //Escape sequence--a way to use ",\,',etc in string
        System.out.println("you are a \"BAD\" boy");
        System.out.println("you are a \'BAD\' boy");
        System.out.println("you are a \\BAD\\ boy");
        System.out.println("for tab use \t which leaves 8 frames");
        System.out.println("for enter use \n which leaves entire line");
    }

}
