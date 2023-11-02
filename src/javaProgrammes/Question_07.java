package javaProgrammes;
/*
7. Write a java program to input any number and find out if it’s odd or even.
 */

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner to read a data
        System.out.println("Input Any Number");
        int number = scanner.nextInt();
        if (number %  2 == 0){        //condition
            System.out.println( number + " is an even number." );
        } else{
            System.out.println( number + " is an odd number." );
        }
    }
}

//or we can use ternary operator