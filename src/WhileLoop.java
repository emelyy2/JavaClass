import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*int x = 1, y = 10;
        while(x <= 5 || y >= 5) {
            System.out.println("x: " + x + " y: " + y);
            x++;
            y--;
        }*/

        /*int i = 1;
        while(i < 11) {
            System.out.println("i: " + i);
            i++;
        }*/

        //TASK 2
        /*int i = 10;
        while(i > 0){
            System.out.println("i: " + i);
            i--;
        }*/

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Guess a number between 1 and 5");
        int number = sc.nextInt();
        int secretNumber = rd.nextInt(5) + 1;

        while(number != secretNumber){
            System.out.println("Guess Again: ");
            number = sc.nextInt();
        }
        System.out.println("You guessed it!");












    }
}
