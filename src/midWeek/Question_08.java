package midWeek;

import java.util.Scanner;

/*
8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
 */
public class Question_08 {
    public static void main(String[] args) {
        school();

    }
    public static void school (){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Number of classes held"); // printing a statement
        int classes = scanner.nextInt(); //going to next line

        System.out.println("Number of classes attended");// printing a statement
        int classesAttended = scanner.nextInt(); //going to next line

        double attendancePercentage = (classesAttended * 100 /classes); //percentage of classes held
        System.out.println("Percentage of class attended - " + attendancePercentage + "%");// printing a statement

        if (attendancePercentage >= 75){
            System.out.println("Student is allowed to sit");
        }
        else{
            System.out.println("The student is not allowed to sit");
        }
    }

}

