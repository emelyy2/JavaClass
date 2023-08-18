import java.util.Scanner;

public class AidaClass {
    public static void main(String[] args) {

        //Write a program that takes an integer input (n)
        // from the user and prints a pattern using nested loops.
        // The pattern should be a right-angled triangle,
        // as shown below, using asterisks (*).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();//moves to the next line
        }
    }
}
        //Write a program that prints the multiplication table from 1 to 10
        // using nested loops. The output should display the multiplication
        // of numbers from 1 to 10 for each value from 1 to 10.

       /*for (int k = 1; k <= 5; i++) {
            System.out.print(i);
            for (int j=1; j <= 3; j++) {
                System.out.print(j);



    } */

