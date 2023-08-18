package OOP.Abstraction;

public class Shape2 extends Drawing{
    @Override
    void drawing() {
        System.out.println("Painting  a portrait of NYC");
    }

    @Override
    int numberOfPaintings() {
        return 5;
    }

    @Override
    void nameOfPainter(String name) {
        System.out.println("Name is: " + name);
    }
}
