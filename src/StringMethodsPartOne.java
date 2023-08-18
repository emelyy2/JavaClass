import java.util.Scanner;

public class StringMethodsPartOne {
    public static void main(String[] args) {

        String name = "Emely";
        System.out.println("Total number: " + name.length());

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Please enter a text: ");
        String text = sc.nextLine().toLowerCase();
        System.out.println(text);*/

        /*System.out.println("Please enter a text: ");
        char text = sc.nextLine().charAt(0);
        System.out.println("First character is " + "" + text);*/

        /*System.out.println("Enter a text: ");
        String str = sc.nextLine();
        System.out.println(str.charAt(0)+ " " + str.charAt(str.length()-1));


        System.out.println("Enter a text: ");
        String text = sc.nextLine();
        char first = text.charAt(0);
        char last = text.charAt(text.length()-1);
        System.out.println(text.replace(first, 'A').replace(last, 'Z'));*/

        //substring
        String text1 = "Emely";
        System.out.println(text1.substring(2));

        //compareTo
        String str1 = "Hello";
        String str2 = "world";
        System.out.println(str1.compareTo(str2));

        System.out.println("Hello  \\and welcome to Tech Nova");








    }
}
