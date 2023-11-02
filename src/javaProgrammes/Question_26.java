package javaProgrammes;
/*26. Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
 */

public class Question_26 {
    public static void main(String[] args) {
        reverse();
    }
    public static void reverse(){
        String name = "Kinjal";
        char[] reversename = name.toCharArray(); //formula for reverse a word
        System.out.println(name);
        int i;
        for (i= reversename.length-1; i>=0; i--){
            System.out.print(reversename[i]);
        }
    }
}
