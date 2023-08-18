package OOP.Abstraction;

public abstract class Vehicle {

    abstract void moveForward();
    abstract void moveBackward();
    abstract void turnLeft();
    abstract void turnRight();

    public void drive(){ //regular method
        System.out.println("Driving");
    }
}
