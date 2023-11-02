package midWeek;
/*
5. Take two int values from user and print greatest among them.
 */

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Question_05 t = new Question_05();  //create object
      t.m1();                                // calling method to main method

    }
    public  void m1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first int value");
        int value = scanner.nextInt();

        System.out.println("Enter the second int value");
        int value1 = scanner.nextInt();

        int formulaOfGreatest = Math.max(value,value1); //formula of greatest value

        System.out.println("Greatest value is " + formulaOfGreatest);





    }
}



