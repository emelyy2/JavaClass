package ClassesAndObjects;

public class Car2 { //Class
        public String color;//declared
        public String make;
        public String model;

        public Car2(){ //Constructor
            color = "Red";
            make = "Benz";
            model = "s63";
        }

        public  void displayInfo(){ // initialize
            System.out.print("Make: " + make + " model: " + model +
                    " color: " + color);
        }

        public static void main(String[] args){ //main method
            Car2 car = new Car2();
            car.displayInfo();
        }

    }

