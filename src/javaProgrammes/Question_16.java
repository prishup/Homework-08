package javaProgrammes;
/*Write a Java program which input any number between 1 to 7 and it print The Daysname
MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
number is out of selection Print message “Week contains 1 to 7 days”
*/
import java.util.Scanner;

public class Question_16 {

    public static void main(String[] args) {
      weekdays();
    }

    public static void weekdays() {
        System.out.println("Enter number 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
                                                    //using switch
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("sunday");
            default:
                System.out.println("Week contains 1 to 7 Days");
                break;


        }
    }
}


