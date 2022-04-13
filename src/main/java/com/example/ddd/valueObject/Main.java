package com.example.ddd.valueObject;

import com.example.ddd.FullName;

public class Main {

    public static void main(String[] args) {
        String fullName1 = "naruse masanobu";
        System.out.println(fullName1);

        String[] tokens = fullName1.split(" ");
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);

        FullName fullName2 = new FullName("john", "smith");
        System.out.println("" + fullName2.getFirstName());
    }
}