import java.util.Scanner;

public class IfElsePractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOne, numTwo, numThree, numFour, numFive;

        System.out.print("Please enter number 1: ");
        numOne = sc.nextInt();
        System.out.print("Please enter number 2: ");
        numTwo = sc.nextInt();
        System.out.print("Please enter number 3: ");
        numThree = sc.nextInt();
        System.out.print("Please enter number 4: ");
        numFour = sc.nextInt();
        System.out.print("Please enter number 5: ");
        numFive = sc.nextInt();

        //variables to count odd and even number
        int odd = 0, even=0;

        if(numOne % 2 == 0){
            even++;
        }else{
            odd++;
        }

        if(numTwo % 2 == 0){
            even++;
        }else{
            odd++;
        }

        if(numThree % 2 == 0){
            even++;
        }else{
            odd++;
        }

        if(numFour % 2 == 0){
            even++;
        }else{
            odd++;
        }

        if(numFive % 2 == 0){
            even++;
        }else{
            odd++;
        }

        System.out.println("Total number of odd: " + odd);
        System.out.println("Total number of even: " + even);


    }
}
