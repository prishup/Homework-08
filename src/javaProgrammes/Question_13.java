package javaProgrammes;
/*
13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else)
 */

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        maths();

    }

    public static void maths() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter any one symbol from (+, -, *, /): ");  // print statement to enter a data by user
        char symbol = scanner.next().charAt(0);

        if (symbol == '+') { // condition

            System.out.println(" Answer: " + (firstNumber + secondNumber)); // print result according to given condition

        } else if (symbol == '-') {

            System.out.println("Answer: " + (firstNumber - secondNumber));

        } else if (symbol == '*') {

            System.out.println("Answer: " + (firstNumber * secondNumber));

        } else if (symbol == '/') {
            System.out.println("Answer: " + (firstNumber / secondNumber));

        }
        else
            System.out.println("Invalid output"); // Maths Logic


        }
    }
