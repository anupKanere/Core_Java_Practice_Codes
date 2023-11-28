package com.app;

public class StaticNestedClass {

    static class NestedClass {
        public static void main(String[] args) {
            System.out.println("Inside the main method of the static nested class.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method of the main class.");
    }
}

