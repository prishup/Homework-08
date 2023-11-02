package javaProgrammes;
/*
21. Write a Java program to sum values of an array.
 */public class Question_21 {
    public static void main(String[] args) {
        number();
    }
    public static void number(){
        int[] array = new int[]{1,2,3,4,6}; //array
        int sum = 0;
        for (int i = 0; i< array.length; i++){   //  using loop and formula for array length
            sum = sum + array[i];

        }
        System.out.println(sum);
    }

}
