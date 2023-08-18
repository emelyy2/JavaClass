
public class LoopsPresentation {

    public static void main(String[] args) {

        //Write a program that prints out odd numbers in a decending way

         //for loop
        /*for(int i = 49; i >= 1; i-=2){
            if(i % 2 != 0){
            }
            System.out.print(i + " ");
        }

          //while loop
        int j = 49;
        while(j >= 1){
            if (j % 2 != 0){
                System.out.print("-" + j );
                j-=2;
            }
        }

        int k = 49;

         // do-  while loop
        do{
            if (k % 2 != 0){
                System.out.print(" , " + k );
                k-=2;
            }

        } while (k >= 1);*/

        //nested for loop
        for(int l = 1; l <= 3; l++) {
            //inner loop
        for(int m =1; m <= 10; m++){
            System.out.println(l+ " * " +m+ " = " + (l*m));
            }
            System.out.println(" ");
        }

}
}
