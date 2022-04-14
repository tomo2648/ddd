package com.example.ddd.valueObject.classfile;

public class LastName {

    public String lastName;

    public LastName(String value) {
        if (value.isEmpty()) {
            System.out.println("1文字以上である必要があります。");
        }

        this.lastName = value;
    }
}
