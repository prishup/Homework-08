package midWeek;
/*
1. Take 10 integers from keyboard using loop and print their average value on the screen.
 */

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        m1();

    }
    public static void m1(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        for (int i = 1; i<=10; i++) {
            System.out.println("Enter Number " + i + "=");
            int number1 = scanner.nextInt();
            number += number1;
        }

           int average = (number/10);
            System.out.println("Average is -" + average);
        }

    }


