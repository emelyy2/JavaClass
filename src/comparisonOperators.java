import java.util.Scanner;

public class comparisonOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println(" Please enter second number");
        int num2 = sc.nextInt();
        boolean b = num1 >= num2;
        System.out.println(b);*/

        System.out.println("Enter your age");
        int age = sc.nextInt();
        boolean b1 = age >= 18 && age <= 65;
        System.out.println(b1);



    }
}
