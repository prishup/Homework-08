package javaProgrammes;
/*
Declare one method with return type and parameter and print your name in console.
 */
public class Question_25 {
    public static void main(String[] args) {
        Question_25 t = new Question_25();   //calling method to main method create an object
        System.out.println(t.parameter("Kinjal"));
    }
    public String parameter(String name){  //method for parameter
        return name;                       // written return because of return type

    }

    }

