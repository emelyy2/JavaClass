package ArraysPackg;

public class ArrayClass {
    public static void main(String[] args) {


        //assign 5 values of your fav fruits
        String [] favFruits = new String[5];
        favFruits[0] = "Apple";//element
        favFruits[1] = "Orange";
        favFruits[2] = "Grape";
        favFruits[3] = "Banana";
        favFruits[4] = "Mango";
        //access the elements by index position
        System.out.println(favFruits[0]);//index
        System.out.println(favFruits[1]);
        System.out.println(favFruits[2]);
        System.out.println(favFruits[3]);
        System.out.println(favFruits[4]);

        String [] favFruits2 = {"Apple", "Orange", "Grape",
                "Banana", "Mango"};
        System.out.println(favFruits2[0]);
        System.out.println(favFruits2[1]);
        System.out.println(favFruits2[2]);
        System.out.println(favFruits2[3]);
        System.out.println(favFruits2[4]);

        /*System.out.println("Before " + favFruits[1]);
        favFruits[0] = "Peach";
        System.out.println("After " + favFruits[0]);*/

        //Array int FIRST APPROACH
        int [] number = new int [7];
        number[0] =1;
        number[1]= 2;
        number[2]= 3;
        number[3]= 4;
        number[4]= 5;
        number[5]= 6;
        number[6]= 7;
        System.out.println(number[4]);

        //int array 2ND APPROACH
        int [] number2 = {1,2,3,4,5,6,7};
        System.out.println(number2[4]);


        //array char 1ST APPROACH
        char[] alphabet = new char[4];
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';
        alphabet[3] = 'd';
        System.out.println(alphabet[3]);

        //array char 2ND APPROACH
        char [] alphabet2 = {'a', 'b', 'c', 'd'};
        System.out.println(alphabet2[3]);

        //array double 1ST APPROACH
        double[] d = new double[3];
        d[0] = 1.99;
        d[1] = 2.99;
        d[2] = 3.99;
        System.out.println(d[2]);

        //SECOND APPROACH
        double[] d2 = { 1.99, 2.99, 3.99 };
        System.out.println(d2[2]);

         String[] monthNames = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(monthNames[0]);

    }
}
