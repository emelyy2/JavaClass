package ArraysPackg;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int [] [] numbers2 = { {1, 2, 3}, {4, 5, 6},
                                {7, 8, 9}, {10, 11, 12} };//4 index(elements)
        System.out.println(numbers2[0] [0]);
        System.out.println(numbers2[0][2]);
        System.out.println(numbers2[2][2]);

        String [] [] days = { {"Sun", "Say"}, {"Mon", "Tue", "Wed", "Thu", "Fri"} };
        System.out.println(days[1][0]);

        String [] [] fiveElements = { {"Mango", "Strawberry", "Peach", "Apple", "Pineapple"},
                                      {"Spinach", "Carrot", "Beans", "peas", "lettuce"},
                                      {"Toyota", "Lexus", "Ford", "Audi", "BMW"},
                                      {"Dog", "Cat", "Rhino", "Turtle", "Lion"},
                                      {"Sushi", "Spaguetti", "Hamburger", "Pizza", "Tacos" } };

        System.out.println(fiveElements[0][0]);
        System.out.println(fiveElements[1][0]);
        System.out.println(fiveElements[2][0]);
        System.out.println(fiveElements[3][0]);
        System.out.println(fiveElements[4][0]);


        System.out.println(fiveElements[0][4]);
        System.out.println(fiveElements[1][4]);
        System.out.println(fiveElements[2][4]);
        System.out.println(fiveElements[3][4]);
        System.out.println(fiveElements[4][4]);


    }
}
