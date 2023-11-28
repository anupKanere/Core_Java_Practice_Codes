package com.app;

class MyClass {
    

    public MyClass() {
        System.out.println("This is the default constructor.");
    }
    
    {
        System.out.println("This is the init block.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
    }
}
