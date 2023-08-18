package ClassesAndObjects;

public class Husky {

    public static void main(String[] args) {
        Dog husky = new Dog();

        husky.name = "Hunter";
        husky.breed = "Husky";
        husky.color = "White";
        husky.age = 3;
        husky.size = "Medium";

        husky.bark();
        husky.eat();
        husky.run();
        husky.play();
        husky.breed();
        husky.color();
        husky.age();
        husky.size();

    }
}
