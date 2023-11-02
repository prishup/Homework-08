
package midWeek;

import java.util.Scanner;

/*
9. Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */
public class Question_09 {

    public static void main(String[] args) {
        school(); // calling to main method

    }
    public static void school (){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Number of classes held");// printing a statement
        int classes = scanner.nextInt();//going to next line

        System.out.println("Number of classes attended");// printing a statement
        int classesAttended = scanner.nextInt();//going to next line

        double attendancePercentage = (classesAttended * 100 /classes); //percentage of classes held
        System.out.println("Percentage of class attended - " + attendancePercentage + "%");

        System.out.println("Medical cause or not");
        char medical = scanner.next().charAt(0);

        if ((attendancePercentage >= 75 )|| (medical == 'Y') ){ // condition of medical
            System.out.println("Student is allowed to sit");
        }
        else{
            System.out.println("The student is not allowed to sit");
        }
    }
}