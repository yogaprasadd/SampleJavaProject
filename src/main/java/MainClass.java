package com.yogaprasad;

public class MainClass {
    public String sayHello() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        System.out.println(mainClass.sayHello());  // Using the sayHello method
    }
}

