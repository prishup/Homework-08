package javaProgrammes;
/*
20. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Question_20 {
    public static void main(String[] args) {
       m1();

    }
     public static void m1(){
         int[] numericarray = {2, 89, 93, 85, 48, 28};
         String[]stringarray = {"Wembley", "Harrow", "Stanmore", "Kingsbury" , "Queensbury"};
         System.out.println(Arrays.toString(numericarray));   // printing statement
         Arrays.sort(numericarray);                           //formula for sort numbers array
         System.out.println("sorted numeric array :"+Arrays.toString(numericarray));
         System.out.println(Arrays.toString(stringarray));
         Arrays.sort(stringarray);                         //formula for sort string array

         System.out.println("sorted string array :"+Arrays.toString(stringarray));  //printing statement
     }
}
