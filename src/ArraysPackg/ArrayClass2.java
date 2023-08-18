package ArraysPackg;

public class ArrayClass2 {
    public static void main(String[] args) {
        String [] monthNames = {"Jan" , "Feb" , "Mar" , "Apr" , "May",
                                 "Jun" , "Jul" , "Aug" , "Sep", "Oct" , "Nov", "Dec"};

        for(int i = 0; i < monthNames.length; i++) {
            System.out.print(monthNames[i] + ", ");
        }

        int [] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers[4]);

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Index: " + i + " | Value: " + numbers[i]);
        }
        System.out.println("________________________________________________");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " | Value: " + numbers[i]*2);
        }
        System.out.println("________________________________________________");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " | Value: " + numbers[i]+1);
        }


        char [] abc = {'a', 'b', 'c', 'd'};
        for(int i =0; i<abc.length; i++) {
            System.out.print(abc[i]);
        }
        char a;
        for(int i = 'a'; i <= 'z'; i++) {
            a=(char) i;
            System.out.println(a);
        }
        /*char aUpper;
        for(int i = 'A'; i <= 'Z'; i++) {
            aUpper=(char) i;
            System.out.println(aUpper);
        }*/

        //create an array of char and assign all alph values to it
        //from A to Z
        char al;
        char [] alph = new char[26];
        int start = 0;
        for(int i = 'A'; i <= 'Z'; i++) {
            al = (char)i;
            alph[start] = al;
            start++;
        }

        for(int i = 0; i < alph.length; i++) {
            System.out.println("Index: " + i + " Value: " + alph[i]);
        }

        int [] num = new int[5];
        int arrayIndex = 0;

        for (int i = 10; i <=50; i+=10) {
            num [arrayIndex] = i;
            arrayIndex++;

            System.out.println("Index: " + i + " Value: " );
            
        }


    }
}
