package com.info.model;

import java.util.Scanner;

public class QuizApp {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] questions = {
                    "1. Who invented Java?",
                    "2. What is the extension of Java files?",
                    "3. Which keyword creates an object?",
                    "4. Which operator checks equality?"
            };

            String[][] options = {
                    {"1. Microsoft", "2. Apple", "3. Sun Microsystems", "4. Google"},
                    {"1. .txt", "2. .java", "3. .class", "4. .pdf"},
                    {"1. class", "2. new", "3. object", "4. make"},
                    {"1. =", "2. > ", "3. !=", "4. =="}
            };

            int[] answers = {3, 2, 2, 4};

            int score = 0;

            System.out.println(" SIMPLE QUIZ ");
            System.out.println("--------------------");

            for (int i = 0; i < questions.length; i++) {
                System.out.println("\n" + questions[i]);

                for (int j = 0; j < 4; j++) {
                    System.out.println(options[i][j]);
                }

                System.out.print("Your answer (1-4): ");
                int choice = sc.nextInt();

                if (choice == answers[i]) {
                    System.out.println(" Correct!");
                    score++;
                } else {
                    System.out.println(" Wrong.");
                }
            }

            System.out.println("\n===== RESULT =====");
            System.out.println("Score: " + score + " / " + questions.length);

            sc.close();
        }
}
