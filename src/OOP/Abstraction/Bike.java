package OOP.Abstraction;

public class Bike extends Vehicle{
    @Override
    void moveForward() {
        System.out.println("Bike moving forward");
    }

    @Override
    void moveBackward() {
        System.out.println("Bike moving backward");
    }

    @Override
    void turnLeft() {
        System.out.println("Bike turning left");
    }

    @Override
    void turnRight() {
        System.out.println("Bike turning right");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.moveForward();
        bike.moveBackward();
        bike.turnLeft();
        bike.turnRight();
        bike.drive();
    }
}
