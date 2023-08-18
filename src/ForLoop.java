import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        /*int m = 5;
        for (int i = 1; i <= m; i++) {
            System.out.println(i + " Java is fun");
        }

        //TechNova
        String str = "TechNova";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String name = sc.nextLine();

            System.out.println("First letter is: " + name.charAt(0));
        System.out.println("The length of name is: " + name.length());

        for (int i = 0; i < name.length(); i++) {
            System.out.println("Verically printed: " + name.charAt(i));
        }*/

        //Create a for loop program to print out from 1 to 50
        /*int  a= 50;
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }

        //Print out from 50 to 100
        int b = 100;
        for (int i = 50; i <= b; i++) {
            System.out.println(i);
        }*/

        //TASK 3
        //even number: n % 2 == 0
        /*int n = 10;
        int sum = 0; //placeholder or empty basket

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println("even number: " + i);
                sum += i; // sum = sum+1
            }

        }
        System.out.println("Total: " + sum);

        for (int i = 0; i < 10; i++) {
            if (i == 4){
                break;
            }
            System.out.println(i);
        }


        int sum1 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("sum1 = " + sum1);
            System.out.println("i = " + i);
            sum1 += i;

        }
        System.out.println(sum1);*/


        //Fibonacci Series
        /*int a = 1, b = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop number: " + i);
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            int temporarySum = a + b;
            System.out.println("temporarySum = " + temporarySum);
            a = b;
            b = temporarySum;
        }*/

        //how to swap the values of 2 variables
        /*int g = 5; int k = 3;
        int empty;
        empty = g;
        g = k;
        k = empty;
        System.out.println("g = " + g);
        System.out.println("k = " + k);*/

        //how to swap values without a third variable
        /*int g = 500;
        int k = 3;
        g = g + k; //g = 500 + 3 = 503
        k = g - k; //k = 503 - 3 = 500
        g = g - k; //g = 503-500
        System.out.println("g = " +g);
        System.out.println("k = " +k);
    }*/

        //iterate from 1 to 10 and print iteration number
        //ski iteration number 5
        //terminate loop on iteration num 8
       /* for (int i = 1; i <= 10; i++){

        if(i == 5){
        continue;//skip particular iteration
        }else if(i == 8){
            break;//terminate loop on iteration num 8
        }
            System.out.println("iteration number: " +i);

        }

        int i = 0;
        while ( i < 10){
            if (i == 4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }*/


     // Print Odd numbers
        /*int  a= 50;
        for (int i = 1; i <= a; i++) {
            if(i % 2 == 0 ){
                continue;

            }
            System.out.println(i);
        }

        int i = 1;
        while(i < 50){
            i++;

            if(i % 2 == 0){
            continue;
        }
            System.out.println(i);

}*/

        String str ="Java is fun and interesting";//Jv s fn nd ntrstng

        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                continue;//skip
            }

        System.out.println(str.charAt(i));




}}}
