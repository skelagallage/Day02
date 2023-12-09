package com.ucsc.automation.string;

public class StringEx {
    public static void main(String[] args) {
        String a = "Cat";
        String b = "Cat";

        String c = new String("Dog");
        String d = new String("Dog");

        System.out.println(a == b);
        System.out.println(c == d);
    }
}
