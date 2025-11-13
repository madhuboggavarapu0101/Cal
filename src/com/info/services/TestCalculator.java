package com.info.services;

import com.info.model.Calculator;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n Select operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if(choice == 6){
                System.out.println("Exiting..");
                break;
            }
            System.out.println("Enter First Number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter Second Number");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice){
                case 1:
                    result = calculator.add(num1,num2);
                    break;
                case 2:
                    result = calculator.subtract(num1,num2);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    break;
                case 4:
                    result = calculator.divide(num1,num2);
                    break;
                case 5:
                    result = calculator.modulus(num1,num2);
                    break;
                default:
                    System.out.println("Invalid  choice!");
                    break;
            }
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
