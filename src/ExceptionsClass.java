
import java.util.Scanner;

public class ExceptionsClass {

    public static void main(String[] args) {

        /*try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e){
            System.out.println("something went wrong" + e.getMessage());

        }*/
        try {
            String text = "Hello";
            System.out.println(text.charAt(6));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Invalid input");
        }

        try {
            int result = 10 / 0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Invalid input");
        }finally{
            System.out.println("This is finally block");
        }



    }
}
