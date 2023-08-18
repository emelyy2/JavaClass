import java.util.Scanner;

public class reviewScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*String firstName;
        String lastName;
        String DOB;
        String address;

        System.out.print("Enter your first name: ");
        firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        lastName = input.nextLine();

        System.out.print("Enter your DOB: ");
        DOB = input.nextLine();

        System.out.print("Enter your address");
        address = input.nextLine();

        System.out.print("Full Name is: " + firstName + " " + lastName);
        System.out.print("Date of Birth:  " + DOB);
        System.out.print("Address: " + address);*/

        String item1, item2, item3, item4, item5;
        float price1, price2, price3, price4, price5;
        int total;

        System.out.print("Enter item#1: ");
        item1 = input.nextLine();
        System.out.print("Enter price for  " + item1 + ": ");
        price1 = input.nextFloat();

        input.nextLine();


        System.out.print("Enter item#2: ");
        item2 = input.nextLine();
        System.out.print("Enter price for  " + item2 + ": ");
        price2 = input.nextFloat();

        input.nextLine();

        System.out.print("Enter item#3: ");
        item3 = input.nextLine();
        System.out.print("Enter price for  " + item3 + ": ");
        price3 = input.nextFloat();

        input.nextLine();

        System.out.print("Enter item#4: ");
        item4 = input.nextLine();
        System.out.print("Enter price for  " + item4 + ": ");
        price4 = input.nextFloat();

        input.nextLine();

        System.out.print("Enter item#5: ");
        item5 = input.nextLine();
        System.out.print("Enter price for  " + item5 + ": ");
        price5 = input.nextFloat();

        System.out.println("                           ");

        System.out.println("              RECEIPT               ");
        System.out.println("                                    ");
        System.out.println("         FRESH MARKET STORE                ");
        System.out.println(" 123 Main Street, New York, NY 1111               ");
        System.out.println("       +1 (233) 444 33222");
        System.out.println("     freshmarket@shopping.com");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println(" ***********************************");
        System.out.println("                             ");
        System.out.println("      06/28/2023  7:08 PM              ");
        System.out.println("QTY   ITEM                     AMT");
        System.out.println("_______________________________________");
        System.out.println("1. " + item1 + "              " + price1);
        System.out.println("2. " + item2 + "              " + price2);
        System.out.println("3. " + item3 + "              " + price3);
        System.out.println("4. " + item4 + "              " + price4);
        System.out.println("5. " + item5 + "              " + price5);
        total = (int) (price1+price2+price3+price4+price5);
        System.out.println("TOTAL       "  + "             " + total);
        System.out.println("______________________________________");
        System.out.println("          THANKS FOR SHOPPING       ");
        System.out.println("            HAVE A NICE DAY           ");
        System.out.println("*************************************");
        System.out.println("*************************************");

        String name;
        String make;
        String model;
        int year;

        System.out.print("What kind of car do you have? ");
        name = input.nextLine();

        System.out.print("Enter you car make: ");
        make = input.nextLine();

        System.out.print("Enter your car model: ");
        model = input.nextLine();

        System.out.print("Enter your car year: ");
        year = input.nextInt();

        System.out.println("Verify the information provided is correct: " + name +  " " + make + " " + model + " " + year);





    }
}
