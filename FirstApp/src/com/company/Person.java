package com.company;

public class Person {
    public static void display(String name, int dob, String Region){
        if (dob<0){
            System.out.println("Your age is invalid");
        }else {
            System.out.println("Your \"Name\" is " + name);
            System.out.println("Your \"Age\" is " + (2021-dob));
            System.out.println("Your \"Nationality\" is " + Region);

        }
    }
}
