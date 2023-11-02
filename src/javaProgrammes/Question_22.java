package javaProgrammes;
/*
22. Write a Java program to calculate the average value of array elements.
 */public class Question_22 {

    public static void main(String[] args) {
        maths();
    }
    public static void maths(){

        int[] numeric = {1, 28, 3, 40,  67, 7, 89, 9, 10, 65, 12};
        int length = numeric.length;
        int sum = 0;
        for (int i = 0; i <numeric.length; i++) {
            sum += numeric[i];
        }
        double average = (sum / length);  //to calculate the average
        System.out.println("Average of array is : " + average);
    }

}
