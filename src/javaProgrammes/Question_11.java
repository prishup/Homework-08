package javaProgrammes;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
other alphabet should be invalid entry.
 */

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {

        m1();
    }
    public static void m1(){
        System.out.println("Enter character between A to F");
            Scanner scanner = new Scanner(System.in);
            char c = scanner.next().charAt(0);  //for write the character

            // using if else syntax
            if (c == 'A') {
                System.out.println("Ahmedabad");
            } else if (c == 'B') {
                System.out.println("Baroda");
            } else if (c == 'C') {
                System.out.println("Cambridge");
            } else if (c == 'D') {
                System.out.println("Delhi");
            } else if (c == 'E') {
                System.out.println("Enfield");
            } else if (c == 'F') {
                System.out.println("Frankfurt");
            } else {
                System.out.println("Invalid Entry");
            }
        }
    }


