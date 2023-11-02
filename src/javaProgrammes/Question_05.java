package javaProgrammes;
/*
5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        result();
    }
    public static void result() {

        Scanner scanner = new Scanner(System.in);                         // create a scanner to read a data
        //Input student details
        System.out.println("Enter Student's Name: ");                         // printing a statement
        String Name = scanner.nextLine();                                     // going to next line
        System.out.println("Enter Roll Number: ");                             // printing a statement
        int rollNo = scanner.nextInt();                                        // going to next line
        System.out.println("Enter Math marks: ");                              // printing a statement
        double Math = scanner.nextDouble();                                    // going to next line
        System.out.println("Enter Science marks: ");                           // printing a statement
        double Science = scanner.nextDouble();                                 // going to next line
        System.out.println("Enter English marks: ");                          // printing a statement
        double English = scanner.nextDouble();                                // going to next line

//      // marks should be between 0 to 100 for each subject (condition given)
        if (Math < 0 || Math > 100) {
            System.out.println("Invalid Input");
        }
        if (Science < 0 || Science > 100) {
            System.out.println(("Invalid Input"));
        }
        if (English < 0 || English > 100) {
            System.out.println(("Invalid Input"));}


            // Calculate percentage and result
            double totalMarks = Math + Science + English;
            double percentage = (totalMarks / 300) * 100;
            //  result
            System.out.println("Percentage " + percentage); // print statement}
            String result = " ";
            if (percentage >= 35) {
                System.out.println("Pass"); //given condition
            } else {
                System.out.println("Fail");
            }

            // Grade calculation
            String Grade = "";
            if (percentage <= 100 && percentage >= 80) {  // //given condition
                Grade = "A+";
            } else if (percentage < 80 && percentage >= 60) { //given condition
                Grade = "A";
            } else if (percentage < 60 && percentage >= 50) { //given condition
                Grade = "B";
            } else if (percentage < 50 && percentage >= 35) { //given condition
                Grade = "C";
            } else {

            }

            //Printing a Mark sheet
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|            Mark Sheet        |");
            System.out.println("|______________________________|");
            System.out.println("|   Name      : " + Name + "           |");
            System.out.println("|   Roll No.  : " + rollNo + "         |");
            System.out.println("|______________________________|");
            System.out.println("|   Subjects  :        Marks   |");
            System.out.println("|______________________________|");
            System.out.println("|   Math      : " + Math + "            |");
            System.out.println("|   Science   : " + Science + "         |");
            System.out.println("|   English   : " + English + "         |");
            System.out.println("|______________________________|");
            System.out.println("|    Total : " + totalMarks + "         | ");
            System.out.println("|______________________________|");
            System.out.println("| Percentage :" + percentage + "         |");
            System.out.println("|    Result  : " + result + "           |");
            System.out.println("|    Grade   : " + Grade + "            |");
            System.out.println("|______________________________|");
        }
    }


