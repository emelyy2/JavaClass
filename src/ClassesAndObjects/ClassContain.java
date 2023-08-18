package ClassesAndObjects;

public class ClassContain {
    //Instance Variables-
    //within the class but outside of any method
    int y = 20;

    //Local Variables
    //Inside the method
    public static void main(String[] args) {
        Car car = new Car();//instance
        car.make = "BMW";
        car.color = "blue";
        car.door = 2;
        car.tire = 4;
        car.engineSize = 6.0;
        car.model = "i8";

        System.out.println(car.make);
        System.out.println(car.color);
        System.out.println(car.door);
        System.out.println(car.tire);
        System.out.println(car.engineSize);
        System.out.println(car.model);
    }

    public static void printName(String name) {
        String name2 = "Emely";
    }
}
