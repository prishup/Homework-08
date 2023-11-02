package javaProgrammes;
/*
24. Write java program using for loop and print surname 9 times.
 */
public class Question_24 {
    public static void main(String[] args) {
        Question_24 t = new Question_24();
        t.m1();
    }
    public void m1(){
        String surname = "Shah";
        int i;
        for (i = 1; i <= 9; i++){
            System.out.println(i);
            System.out.println(surname);

        }
    }
}
