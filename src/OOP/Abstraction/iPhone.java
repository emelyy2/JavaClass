package OOP.Abstraction;

public class iPhone implements Phone{
    @Override
    public void text() {
        System.out.println("Hello there!");
    }

    @Override
    public void call() {
        System.out.println("Somebody is calling from iphone");

    }

    @Override
    public void ring() {
        System.out.println("Ring ring!");

    }
}
