package javaProgrammes;
/*
Declare array and store any 5 countries and print them in console.
 */

public class Question_02 {
    public static void main(String[] args) {
        Question_02 t = new Question_02(); //create an object
        t.m1(); // method calling to main method
    }
    public void m1 (){
        String[] country = {"india" ,"united Kingdom","Greece","Italy" ,"USA"}; //array
        System.out.println("country");
        int i;
        for (i = 0; i<= 5;  i++){
            System.out.println(country[i]);
        }
    }
}
