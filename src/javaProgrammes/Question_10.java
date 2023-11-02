package javaProgrammes;

import java.util.Scanner;

/*
Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
public class Question_10 {
    public static void main(String[] args) {
        sales();
    }
    public static void sales(){

            Scanner scanner = new Scanner(System.in); //  // create a scanner to read a data
            System.out.println("Enter Sales Id: "); // printing statement for user to enter sales id
            String salesID = scanner.next(); // going to next line
            System.out.println("Enter Seller's Name: ");
            String sellersName = scanner.next();
            System.out.println("Enter Sales Amount: ");
            double salesAmount = scanner.nextDouble();
            System.out.println("Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();


            // Calculation of Commission
            if (salesAmount >= 50000) { // logic given in question
                System.out.println("Commission: " + salesAmount * 35 / 100); // printing a statement is sales amount is >= 50000
            } else if (salesAmount >= 35000) {
                System.out.println("Commission: " + salesAmount * 20 / 100); // printing a statement is sales amount is >= 35000
            } else if (salesAmount >= 20000) {
                System.out.println("Commission: " + salesAmount * 10 / 100); // printing a statement is sales amount is >= 20000
            } else if (salesAmount >= 10000) {
                System.out.println("Commission: " + salesAmount * 5 / 100); // printing a statement is sales amount is >= 10000
            } else if (salesAmount >= 0) {
                System.out.println("Commission: " + salesAmount * 2 / 100); // printing a statement is sales amount is >= 0
            } else {
                System.out.println(salesAmount + " is invalid input"); // printing a statement is sales amount is invalid
            }

        }
        
    }

