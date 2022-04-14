package com.example.ddd.valueObject.classfile;

public class FullName {
    public String firstName;
    public String lastName;

    public FirstName firstName2;
    public LastName lastName2;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

}
