package javaProgrammes;

import java.util.Scanner;

/*
8. Write a java program to get numbers from users and print whether it is positive or negative.
 */
public class Question_08 {
    public static void main(String[] args) {
        numbers();
    }
    public static void numbers(){
        Scanner scanner = new Scanner(System.in); // create a scanner to read a data
        System.out.println("Enter Any Number");
        int number = scanner.nextInt();

        if(number >= 0){   //condition
            System.out.println(number +" is a positive number."); //printing statement
        }
        else if (number < 0){      //condition
            System.out.println(number +" is a negative number.");//printing statement
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
