package javaProgrammes;
/*
9. Write java program using for loop and print your group name 10 times.
 */
public class Question_09 {
    public static void main(String[] args) {
        Question_09 t = new Question_09();
        t.name();
    }
    public void name() {
        String groupname = "Agile";
        int i;
        for (i = 1; i <= 10; i++){
            System.out.println(i);
            System.out.println(groupname);
        }

    }
}


