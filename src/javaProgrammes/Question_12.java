package javaProgrammes;
/*
12. Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class Question_12 {

    public static void main(String[] args) {
        m1();

    }
    public static void m1() {
        System.out.println("Enter character between A to F");
        Scanner scanner = new Scanner(System.in);
        String cityname = scanner.next();

        switch (cityname) {
            case "A":
                System.out.println("Ahemdabad");
                break;

            case "B":
                System.out.println("Baroda");
                break;

            case "C":
                System.out.println("Cambridge");
                break;

            case "D":
                System.out.println("Delhi");
                break;

            case "E":
                System.out.println("Enfield");
                break;

            case "F":
                System.out.println("Frankfurt");

                default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}

