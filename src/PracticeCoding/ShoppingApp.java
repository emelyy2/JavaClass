package PracticeCoding;

import java.util.Scanner;

public class ShoppingApp {

    public static void main(String[] args) {
        shoppingApp(2);
    }

    public static void shoppingApp(int itemNumber){

        Scanner sc = new Scanner(System.in);
        String item = "";
        double price = 0;
        double total = 0;

        int indexIncrement = 0;

       for(int i = 1; i <= itemNumber; i++){
           System.out.print("Enter item # " + i + ": ");
           item = sc.nextLine();
           System.out.print("Enter price for " + item + ": ");
           price = sc.nextDouble();
           total += price;
           sc.nextLine();

           //itemName[indexIncrement] += item;
           indexIncrement++;

       }
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

        System.out.println("Total...... " + total);
        //System.out.println(itemName[0]);
        //stem.out.println(itemName[1]);


    }
}

