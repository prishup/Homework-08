package midWeek;

import java.util.Scanner;

/*
4. Take values of length and breadth of a rectangle from user and check if it is square or not.
 */
public class Question_04 {
    public static void main(String[] args) {
        maths();

    }
    public static void maths(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the length of a rectangle");
        double length = scanner.nextDouble();

        System.out.println("Enter the breadth of a rectangle");
        double  breadth = scanner.nextDouble();

        if(length == breadth){
            System.out.println("square");
        }
        else{
            System.out.println("not a square");
        }
    }
}
