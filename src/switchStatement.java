import java.util.Random;
import java.util.Scanner;

public class switchStatement {

    public static void main(String[] args) {

        /*int num = 2;
        switch(num){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("unknown");

        }*/

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Please enter your grade:");
        String grade = sc.nextLine().toUpperCase();

        switch(grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Great");
                break;
            case "C":
                System.out.println("Okay");
                break;
            case "D":
                System.out.println("You can do better");
                break;
            case "F":
                System.out.println("Something needs to change");
                break;
                default:
                    System.out.println("Invalid letter grade");
        }*/

        /*System.out.println("Please enter a month number:");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");

        }*/

        /*Random rand = new Random();
        int i = rand.nextInt(10);

        System.out.println("Please enter a number: ");
        int userInput = sc.nextInt();
        if(i == userInput){
            System.out.println("Congrats, you guessed right!");
        }else if(userInput >i){
            System.out.println("Your guess is high");
        }else if(userInput <i){
            System.out.println("Your guess is low");
        }else{
            System.out.println("Invalid input");
        }
        System.out.println("randomly generated number is " +i);
        System.out.println("your number is " + userInput);
        */

        System.out.print("Please enter first number: ");
        double numOne = sc.nextDouble();

        System.out.print("Please enter second number: ");
        double numTwo = sc.nextDouble();

        sc.nextLine();
        System.out.print("Please enter arithmetic operator: ");
        String operator = sc.nextLine();

        switch(operator){
            case "+":
                System.out.println(numOne + numTwo);
                break;
            case "-":
                System.out.println(numOne - numTwo);
                break;
            case "*":
                System.out.println(numOne * numTwo);
                break;
            case "/":
                System.out.println(numOne / numTwo);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
