package javaProgrammes;

import java.util.Scanner;

/*
19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
 */public class Question_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number");  //printing statement
        int number = scanner.nextInt();


        if(number ==0){                    //condition
            System.out.println( "zero" );
        }
        else if (number >0){
            System.out.println( "POSITIVE");
        }
        else if (number <0){
            System.out.println( "NEGATIVE");
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }
}