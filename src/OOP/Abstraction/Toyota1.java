package OOP.Abstraction;

public class Toyota1 extends Car1{
    @Override
    void starting() {
        System.out.println("Starting Toyota car");
    }

    @Override
    void driving() {
        System.out.println("Driving Toyota car");
    }

    @Override
    void stopping() {
        System.out.println("Stopping Toyota car");
    }

    @Override
    void parking() {
        System.out.println("Parking Toyota car");
    }

    public static void main(String[] args) {
        Toyota1 toyota = new Toyota1();
        toyota.starting();
        toyota.driving();
        toyota.stopping();
        toyota.parking();
    }
}
