package ArraysPackg;

import java.util.Arrays;

public class ArraysMethods {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 2, 0, 8, 7, 5, 6, 1};

        //sort() - sorts the elements of an array
        for (int n : numbers) {
            System.out.print(n + ", ");
        }
        System.out.println("                              ");
        Arrays.sort(numbers);
        for (int n : numbers) {
            System.out.print(n + ", ");
        }

        System.out.println("                              ");
        String [] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : days) {
            System.out.print(day);
        }
        Arrays.sort(days);
        System.out.println("                                ");
        for(String day : days){
            System.out.println(day+ ", ");
        }

        //Task
        char [] values = {'z', 'a', 'w', 'b', 'x', 'c'};
        for (char v: values) {
            System.out.print(v+ ", ");
        }
        Arrays.sort(values);
        System.out.print("   ");
        for(char v: values){
            System.out.print(v+ ", ");
        }

        //equals() - compares two arrays for equality
        int [] array1 = {1, 2, 3, 4, 5, 6, 7};
        int [] array2 = {1, 2, 3, 4, 5, 6, 7};
        boolean result = Arrays.equals(array1, array2);
        System.out.println(result);

        //length() - returns the length of the array
        int [] array3 = {1, 2, 3, 4, 6, 88, 776, 443};
        System.out.println(array3.length);
        Arrays.toString(array3);

        // toString() - returns the string representation
        //String str = Arrays.toString(array);
    }
}