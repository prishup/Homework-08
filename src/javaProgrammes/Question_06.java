package javaProgrammes;
/*
6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
*/

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        salary();
    }
    public static void salary (){

        Scanner scanner = new Scanner (System.in); // create a scanner to read a data

        System.out.println("Enter Employee ID"); //printing statement
        double EmployeedID = scanner.nextInt(); // print in next line

        System.out.println("Enter Employee Name");//printing statement
        String Employeename = scanner.next();// print in next line

        System.out.println("Enter Basic Salary");//printing statement
        double Basicsalary = scanner.nextInt();// print in next line


        //calculation
        double HRA = (10 * Basicsalary / 100); //10% of basic salary
        double DA = (8 * Basicsalary / 100);  // 8% of basic salary
        double TA = (9 * Basicsalary / 100);//9% of basic salary
        double pf = (10 * Basicsalary / 100); //20% of basic salary
        double grosssalary = Basicsalary + HRA + DA + TA - pf; //  (given)calculate gross salary

        System.out.println("|             Salary Slip        |");
        System.out.println("|                                |");
        System.out.println("|--------------------------------|");
        System.out.println("|                                |");
        System.out.println("Employee Id     "+EmployeedID+"              |");
        System.out.println("Employee Name    "+Employeename+"          |");
        System.out.println("|                                |");
        System.out.println("|                                |");
        System.out.println("|--------------------------------|");
        System.out.println("Basic Salary     "+Basicsalary+"          |");
        System.out.println("|HRA 10%         "+HRA+"           |");
        System.out.println("|TA 8%           "+TA+"           |");
        System.out.println("|DA 9%            "+DA+"          |");
        System.out.println("|PF - 20&           "+pf+"        |");
        System.out.println("|                                |");
        System.out.println("|--------------------------------|");
        System.out.println("|Gross Salary      "+grosssalary+"        |");
        System.out.println("|================================|");

    }
}
