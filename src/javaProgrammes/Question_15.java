package javaProgrammes;
/*
15. Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {

        m1();
    }
    public static void m1(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Value");

        char ch = scanner.next().charAt(0);
        if (Character.isDigit(ch)) {                 //formula to find is it number or not
            System.out.println("It's Number");    //printing statement
        } else if (Character.isAlphabetic(ch)) {  //formula to find is it Alphabet or not
            System.out.println("It's a Alphabet");
        } else {
            System.out.println("It's a symbol");
        }

    }
}

