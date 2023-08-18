

public class LoopPractice {

    public static void main(String[] args) {
        //Task:
        // Write a program to find the sum
        //of all even numbers between 1 and 100 using a do-while loop.

        int sum = 0;//store the total
        int num = 1;//starting point

        do {
            if (num % 2 == 0) {
                sum += num;//add each number to the sum variable
            }
            num++;
        } while (num <= 100);//condition
        System.out.println("Sum of all even numbers 1-100 is: "
                + sum);

        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);

        //while loop - same scenario

    int x = 0;
    int y = 1;

    while(x <=100)

    {
        if (y % 2 == 0) {
            x += y;
        }
        y++;
    }
    System.out.println(x);

    //Write a Java program to reserve a given string using a while loop

        String text = "Java";
        int textLength = text.length();
        String reverse = "";

        while(textLength > 0){
            reverse += text.charAt(textLength-1);
            textLength --;

        }
        System.out.println(reverse);

        reverse = "";
        int i = text.length();
         do{
             reverse += text.charAt(i-1);
             i--;

         }while (i> 0);
        System.out.println(reverse);



}

}
