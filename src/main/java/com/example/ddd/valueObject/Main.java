package com.example.ddd.valueObject;

import com.example.ddd.valueObject.classfile.FullName;

public class Main {

    public static void main(String[] args) {
        String fullName1 = "naruse masanobu";
        System.out.println(fullName1);

        String[] tokens = fullName1.split(" ");
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);

        FullName fullName2 = new FullName("john", "smith");
        System.out.println("" + fullName2.getFirstName());

        // リスト2.7
        String greet = "こんにちは";
        System.out.println(greet);

        greet = "Hello";
        System.out.println(greet);

        // リスト2.11
        // 数字の変更
        int num = 0;
        num = 1;

        // 文字の変更
        String c = "0";
        c = "b";

        // 文字列の変更
        String greet2 = "こんにちは";
        greet2 = "Hello";

        // リスト2.13
        System.out.println(0 == 0);
        System.out.println(0 == 1);
        System.out.println("a" == "a");
        System.out.println("a" == "b");
        System.out.println("hello" == "hello");
        System.out.println("hello" == "こんにちは");

        // リスト2.14
        FullName nameA = new FullName("masanobu", "naruse");
        FullName nameB = new FullName("masanobu", "naruse");

        // 別個のインスタンス同士の比較
        System.out.println(nameA.equals(nameB));
        // ↑ インスタンスを構成する属性が等価なのでtrue
    }
}
