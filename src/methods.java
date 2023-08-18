public class methods {
    //create a method that adds 2 numbers

    public static void add(int i, int j) { //parameters
        System.out.println(i + j + " is the sum of " + i + " and " + j);

    }

    public static double difference(double i, double j) {
       double k = i - j;
        return k;
    }
    //TASK 2
    public static void printMessage(String message, int count) {
        for(int i = 0; i < count; i++){
            System.out.println(message);

        }
    }

    //TASK 3
    public static void swapVariables(int a, int b) {
        int empty;
        empty = a;
        a = b;
        b = empty;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    //TASK 4
     public static void printEvenNumbers(int limit){
        for(int i = 1 ; i <= limit; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
     }

     //TASK 5
     public static void countVowels(String str1){
        int count = 0;
        String str = str1.toLowerCase();
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                     || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;

             }
         }
         System.out.println("number of vowels is: " + count);
     }

      //TASK 6
      // StringBuilder usage
     public static void reverseString (String str2) {
        StringBuilder sb = new StringBuilder(str2).reverse();
         System.out.println(sb);
     }

     //TASK 7
     // Reverse String by making use of loops
    public static void reverseString1(String str3){ //Selenium
        String revStr = ""; //muineleS
        int len = str3.length();//8
        for (int i = len-1; i >= 0; i--) { //7 6 5 4 3 2 1 0 -1
            revStr = revStr + str3.charAt(i); //muineleS

        }
        System.out.println("Reverse string is: " + revStr);

        }


    public static void main(String[] args) {

        add(2, 10);//arguments
        double a = difference(23.55, 5.23);
        System.out.println(a);

        printMessage("Hello", 5);
        printEvenNumbers(20);

        swapVariables(12, 14);

        countVowels("FUentEs");

        reverseString("Romero");

        reverseString1("Java");

    }
}

