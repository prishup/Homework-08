package javaProgrammes;
/*3. Declare multidimensional array and store 5 countries and their capital and print them in
console.
*/

public class Question_03 {
    public static void main(String[] args) {
        m1();

    }

    public static void m1() {
        String[][] country = {{"India", "USA", "UK" ," Germany","Austalia"},
                {"Delhi","WDC","London",   "Berlin","Canberra"}};                 //for multidimensial array
        System.out.println("Countries and Capitals:");

        for (int i = 0; i<country[0].length;i++){
            System.out.println("Country: "+ country[0][i] + " , Capitals: " + country[1][i] );
            }

    }
}


