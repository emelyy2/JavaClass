package OOP.Polymorphism;

public class AnotherMathClass extends MathClass{

    @Override
    public int addNumber(int x, int y) {
        return super.addNumber(x, y);
    }

    @Override
    public double addNumber(int x, double y) {
        return super.addNumber(x, y);
    }

    @Override
    public float addNumber(float x, float y) {
        return super.addNumber(x, y);
    }

    @Override
    public double addNumber(double x, double y) {
        return super.addNumber(x, y);
    }

    public static void main(String[] args) {
        AnotherMathClass add = new AnotherMathClass();
        int i = add.addNumber(2, 2);
        System.out.println(i + " ");
    }
}
