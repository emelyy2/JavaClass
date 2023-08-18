public class calculator {

    //1.Create a method that does addition
    public static void add(int a, int b){
        System.out.println(a + b);

    }
    //2. Create a method that deducts one number from another one
    public void deduct(int a, int b){
        System.out.println(a - b);

    }

    //3. Create a method that multiplies 2 numbers
    public static int multiply(int a, int b){
        return a * b;
    }

    //4. Create a method that divides 2 numbers
    public int divide (float a, float b){
        int c = (int) (a / b);//casting
        return c;
    }

    //5. calculate Area of a Circle
    public double calculateCircleArea(double radius){
        double area= 3.14159 * (radius * radius);
        return area;
    }
    //Check if a String is Palindrome
    public static boolean isPalindrome(String str){


        String rev = "";
        for(int i = str.length() -1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.toLowerCase().equals(rev.toLowerCase())){
            return true;
        }else{
            return false;
        }

    }

    public static double convertToLbs(double kg){
        double lbs = kg * 2.20462;
        return lbs;
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = celsius * 9/5 + 32;
        return fahrenheit;
    }


}

class ArithmeticOperations {

    public static void main(String[] args) {


// c is the object of the calculator class
        calculator c = new calculator();//Instantiation of the calculator class
        calculator.add(500,20);//calling static method

        //calling non-static method
        c.divide(354,3456345);

        calculator.multiply(3, 6);// calling static method

        c.deduct(325, 100);//calling non-static method

        System.out.println(c.calculateCircleArea(20));//non-static method

        System.out.println(calculator.isPalindrome("Madam"));//STATIC METHOD

        System.out.println(calculator.convertToLbs(55));

        System.out.println(calculator.celsiusToFahrenheit(20));



    }
}
