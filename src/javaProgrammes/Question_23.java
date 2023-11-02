package javaProgrammes;
/*
Write java program using for loop and print your name 10 times.
 */

public class Question_23 {
    public static void main(String[] args) {

       Question_23 loopname = new Question_23();
        loopname.name();
    }
    public void name(){
        String myName = "Kinjal";
        int i;
        for (i = 1;  i <= 10; i++){
            System.out.println(i);
            System.out.println(myName);
        }
    }
}
