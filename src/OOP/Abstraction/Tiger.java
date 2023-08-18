package OOP.Abstraction;

public class Tiger extends Animal{

    public static void main(String[] args) {
        displayInfo();

    }

    static void displayInfo(){
        Tiger tiger = new Tiger();
        tiger.setName("Sherkhan");
        tiger.setAge(4);
        tiger.setWeight(180.0);
        tiger.eat();
        tiger.makeSound();
        tiger.breath();
        tiger.run();
    }

    @Override
    void eat() {
        System.out.println(getName() + " eat meat");
    }

    @Override
    void makeSound() {
        System.out.println(getName()+ " makes the sound Grrrr");
    }

    @Override
    void breath() {
        System.out.println(getName()+ " breath");
    }

    @Override
    void run() {
        System.out.println(getName()+ " can run");
    }
}
