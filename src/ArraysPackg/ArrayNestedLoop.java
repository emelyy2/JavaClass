package ArraysPackg;

public class ArrayNestedLoop {

    public static void main(String[] args) {
        String [] [] twoDArray = {
                {"Mango", "Strawberry", "Peach", "Apple"},
                {"Spinach", "Carrot", "Beans", "lettuce"},
                {"Toyota", "Lexus", "Ford", "Audi"},
                {"Dog", "Cat", "Rhino", "Turtle"},
                {"Sushi", "Hamburger", "Pizza", "Tacos" } };

        for (String [] strings : twoDArray) {
            for (int j = 0; j < 4; j++) {
                System.out.println(strings[j] + " ");
            }

            int [] [] numbers = {
                    {10, 20, 30, 40},
                    {50, 60, 70, 80},
                    {100, 200, 300, 400}
            };
            for(int[] i : numbers){
                for (int j = 0; j <3; j++) {
                    System.out.println(i[j]+ " ");
                }

                char [][] c = {
                        {'a', 'b', 'c', 'd'},
                        {'e', 'f', 'g', 'h'},
                        {'i', 'j', 'k', 'l'},
                        {'m', 'n', 'o', 'p'}
                };
                for(char[] j : c){
                    for(char k = 0; k <=3; k++){
                        System.out.print(j[k]+ " ");
                    }
                }

            }
        }


    }
}
