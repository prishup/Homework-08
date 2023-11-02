package midWeek;

import java.util.Scanner;

/*
11. Write a program to print a string entered by user.
 */
public class Question_11 {

    public static void main(String[] args) {
      Question_11 t = new Question_11();
      t.text();
    }
    public void text(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any String ");
        String name = scanner.nextLine();

        System.out.println("String name is : " + name);

    }
}
