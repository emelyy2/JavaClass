package ArraysPackg;

public class ArrayDayTwoPartOne {

    public static void main(String[] args) {

        //First way
        int[] num1 = new int[3];
        num1[0] = 10;
        num1[1] = 20;
        num1[2] = 30;
        System.out.println(num1[0]);

        //Second way
        int [] num2 = {10, 20, 30, 40};
        //System.out.println(num1[0] + " | " + num2[0]);
        for(int n : num2) {//for each loop
            System.out.println(n);
        }

        char[] vowels ={'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i <vowels.length; i++){
            System.out.print(vowels[i] + ", ");
        }


        String [] animals = {"Cat", "Dog", "Rabbit", "Pig", "Leopard",
                              "Shark", "Butterfly", "Monkey", "Polar Bear", "Elephant"};
       for (int i = 0; i < animals.length; i++){
           System.out.print(animals[i] + ", ");
       }





    }

}
