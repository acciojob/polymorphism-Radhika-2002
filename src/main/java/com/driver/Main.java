// Main.java
package com.driver;

public class Main {
    // Task 1: create a public static nested class Product
    public static class Product {
        // Task 3: create a method to calculate product of two integers
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: create an overloaded method to calculate product of three integers
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: create an overloaded method to calculate product of two doubles
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: create object of Product in Main function called p
        Product p = new Product();

        // Task 3: call method product(int x, int y) from Main using Product class
        // object p
        System.out.println("Product of 5 and 3: " + p.product(5, 3));

        // Task 4: call overloaded method product(int x, int y, int z) from Main using
        // Product class object p
        System.out.println("Product of 2, 3, and 4: " + p.product(2, 3, 4));

        // Task 5: call overloaded method product(double x, double y) from Main using
        // Product class object p
        System.out.println("Product of 2.5 and 3.5: " + p.product(2.5, 3.5));
    }
}
