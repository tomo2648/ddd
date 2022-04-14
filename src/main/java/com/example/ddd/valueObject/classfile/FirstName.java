package com.example.ddd.valueObject.classfile;

public class FirstName {

    public String firstName;

    public FirstName(String value) {
        if (value.isEmpty()) {
            System.out.println("1文字以上である必要があります。");
        }

        this.firstName = value;
    }

}
