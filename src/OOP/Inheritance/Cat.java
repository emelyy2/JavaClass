package OOP.Inheritance;

public class Cat  extends Animal{
    public static void main(String[] args) {
        makeSoud();
        run();
        jump();

    }
    public static void makeSoud(){
        System.out.println("Cat making sound");
    }

    public static void run(){
        System.out.println("Cat running!");
    }

    public static void jump(){
        System.out.println("Cat jump!");
    }
}
