package OOP.Inheritance;

public class Toyota extends Car{

    public static String country;
    public static String engineType;

    public static void main(String[] args) {
        make = "Toyota";
        model = "Prius";
        year = 2023;
        color = "Silver";
        tireSize = 16;
        engineSize = 1.8;
        country = "Japan";
        engineType = "Hybrid";
        displayInformation();
    }

    public static void displayInformation() {

        System.out.println(getMake());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getColor());
        System.out.println(getTireSize());
        System.out.println(getEngineSize());
        System.out.println(getCountry());
        System.out.println(getEngineType());
    }

    public static String getCountry() {
        return country;
    }

    public static String getEngineType() {
        return engineType;
    }

}
