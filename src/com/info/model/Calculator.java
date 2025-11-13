package com.info.model;

public class Calculator {
    public  double add(double a, double b){
        return a + b;
    }
    public double subtract(double a, double b){
        return a - b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double divide(double a, double b){
        if (b == 0.0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
    public double modulus(double a, double b){
        return a % b;
    }

}
