package ArraysPackg;

import java.util.Arrays;

public class ArraysPresentation {

    public static void main(String[] args) {

        //First Approach
        int[] a = new int[5]; //declaration and instantiation
        a[0]= 10; // initialization
        a[1]= 20;
        a[2]= 70;
        a[3]= 40;
        a[4]= 50;
        System.out.println(a[4]);//specification

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + ", ");
        }

        //Second Approach
        System.out.println();
        char [] c = {'a', 'b', 'c', 'd', 'e',};
        System.out.println(c[2]);//specific element


        for(int j = 0; j<c.length; j++){
            System.out.print(c[j] + ", ");//for loop
        }

        System.out.println();
        for(char k : c){
            System.out.print(k + "  ");//for each loop
        }

        //two dimensional array

        String [] [] dimensional = { {"QA", "Developer" , "Business Analyst"},
                                     {"Joseph", "Luke", "Steph"} };


        System.out.println();
        System.out.println(dimensional[0][1]);
        System.out.println(dimensional[1][2]);



        for (String [] d : dimensional) {
            for (int j = 0; j < 3; j++) {
                System.out.println(d [j] + " ");
            }

    }

}}
