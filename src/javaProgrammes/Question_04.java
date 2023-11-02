package javaProgrammes;
/*
4. Write if else condition and print your group name in console else others group name.
 */

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        m1();
    }

    public static void m1 (){
        Scanner groupname = new Scanner(System.in); // create a scanner to read a data
        int groupname1 = groupname.nextInt();

        if( groupname1 == 1){
            System.out.println("Agile");
        }else if (groupname1 == 2){
            System.out.println("Code 1");
        }else if (groupname1 == 3){
            System.out.println("Restassured");
        }else if (groupname1 == 4){
            System.out.println("Code");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
