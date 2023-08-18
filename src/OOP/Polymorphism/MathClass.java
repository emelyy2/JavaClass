package OOP.Polymorphism;

public class MathClass { //Compile Time-Method Overloading
//same name, different parameters

    public String print(String a){
        return a;
    }


    public int addNumber(int x, int y){
        return x + y;
    }

    public double addNumber(double x, double y){
        return x + y;
    }

    public float addNumber(float x, float y){
        return x + y;

    }
    public double addNumber(int x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        MathClass add = new MathClass();
        System.out.println(add.addNumber(2, 2));
        System.out.println(add.addNumber(2.2, 3.3));
        System.out.println(add.addNumber(4.5f, 3.9f));
        System.out.println(add.addNumber(10, 20.5));

        System.out.println(add.print("Java"));


    }

}
