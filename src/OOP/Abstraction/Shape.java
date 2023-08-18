package OOP.Abstraction;

public class Shape extends Drawing{
    @Override
    void drawing() {
        System.out.println("Drawing Circles");
    }

    @Override
    int numberOfPaintings() {
        return 50;
    }

    @Override
    void nameOfPainter(String name) {
        System.out.println("Name is: " + name);
    }
}
