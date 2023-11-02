package javaProgrammes;
/*14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
5 separately.
*/

public class Question_14 {
    public static void main(String[] args) {
        m1();

    }
    public static void m1() {
        System.out.println("Number divided by 3= ");
        for (int i = 1; i <= 100; i++) { //loop
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Number divided by 5 = ");
        for (int i = 1; i <= 100; i++) { //loop
            if (i % 5 == 0) {
                System.out.println(i);
            }

        }
    }
}

