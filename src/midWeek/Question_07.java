package midWeek;
/*
7. Take input of age of 3 people by user and determine oldest and youngest among
them.
 */

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Question_07 t = new Question_07();
        t.Age();
    }

    public void Age() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Age");
        int age = scanner.nextInt();

        System.out.println("Enter the Age");
        int age1 = scanner.nextInt();

        System.out.println("Enter the Age");
        int age2 = scanner.nextInt();

        int oldest = Math.max(Math.max(age,age1),age2); //formula of find greatest value from more than 2 numbers
        int youngest = Math.min(Math.min(age,age1),age2); //formula of find less value from more than 2 numbers

        System.out.println("The oldest person is :" + oldest + " years old");
        System.out.println("The youngest person is :" + youngest + " years old");

    }
}




