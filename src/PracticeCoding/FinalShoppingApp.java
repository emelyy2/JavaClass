package PracticeCoding;

import java.util.Scanner;

public class FinalShoppingApp {

    public static void main(String[] args) {
        shoppingApp(3);
    }

    public static void shoppingApp(int itemNumber){

        Scanner sc = new Scanner(System.in);
        double price = 0;
        double total = 0;
        String [] itemName = new String[itemNumber];
        int index = 0;

        for(int i = 1; i <= itemNumber; i++){
            System.out.println("Enter item #" + i + " ");
            itemName[index] = sc.nextLine();
            System.out.println("Enter price for " + itemName[index] + " ");
            price = sc.nextDouble();
            total += price;
            sc.nextLine();
            index++;

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
            System.out.println("      08/05/2023  11:35 AM              ");
            System.out.println("ITEM                     AMT");

            for(String item : itemName){
                System.out.println(item + "................." + price);
            }
            System.out.println("Total..................................$" + total);
        }
    }
}
