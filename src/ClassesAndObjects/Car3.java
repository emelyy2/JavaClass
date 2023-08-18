package ClassesAndObjects;

public class Car3 {
    String make;//class attributes
    int age;
    String model;

    public Car3(String make, int age, String model) {//taking params

        this.make = make;
        this.age = age;
        this.model = model;
    }
    public void displayInf(){
        System.out.println(make);
        System.out.println(age);
        System.out.println(model);
    }

    public static void main(String[] args) {
        Car3 car = new Car3("Ford", 1, "F150");
        car.displayInf();
        Car3 benz = new Car3("bmw", 1, "X5");

        benz.displayInf();
    }
}
