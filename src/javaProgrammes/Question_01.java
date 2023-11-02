package javaProgrammes;
/*1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)
*/

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to test");
        int number = scanner.nextInt();

        //ternary operator to check number
        //  variable = (condition) ? expressionTrue : expressionFalse;         syntax of ternary operator
        String result =( number % 2 == 0 )?"Even" : "Odd";
        System.out.println(number + " is " + result);

    }
}
