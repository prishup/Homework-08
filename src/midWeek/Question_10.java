package midWeek;

import java.util.Scanner;

/*
10. Write a program to print the sum of two numbers entered by user by defining your
own method.
 */
public class Question_10 {
    public static void main(String[] args) {
        Question_10 t = new Question_10();
        t.number();
    }

    public void number() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");// printing a statement
        int number1 = scanner.nextInt();//going to next line

        System.out.println("Enter the second number");// printing a statement
        int number2 = scanner.nextInt();//going to next line

        System.out.println("Enter the Third number");// printing a statement
        int number3 = scanner.nextInt();//going to next line

        int sum = number1+number2+number3;  //sum of three numbers
        System.out.println("The sum of three number is : " + sum);


    }
}
