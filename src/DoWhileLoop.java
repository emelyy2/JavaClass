
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        /*int l = 10;
        do {
            System.out.println(l);
            l--;
        } while (l > 0);


        int k = 1;
        do {
            System.out.println("Emely");
            k++;
        } while (k <= 20);*/

        Scanner sc = new Scanner(System.in);

        String actualpwd = "Admin987";
        String UserInput = "";

        do {
        System.out.println("Please enter your password: ");
        UserInput = sc.nextLine();
        if(UserInput.equals(actualpwd)) {
            System.out.println("Login successful");
        }else{
            System.out.println("Incorrect password");}
        }while(!actualpwd.equals(UserInput));


       /* int h = 1;
        System.out.print("Please enter your name:");
        String name = sc.nextLine();
        do {
            System.out.println(h + " " + name);
            h++;
        } while (h <= 5);*/


        /*int i = 0;
        do {
            System.out.println("Please enter a number: ");
            i = sc.nextInt();
            if(i < 0){
                break;
            }
        }while(true);*/

        //numbers in reverse
        /*int n = 50;
        for (int i = 50; i >= 0 ; i--){
            System.out.println(i);
        }*/











    }
}
