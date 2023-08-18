package OOP.Inheritance;

public class Ford extends Car{

    public static String country;
    public static String packageType;

    public static void main(String[] args) {
        make = "Ford";
        model = "F150";
        year = 2023;
        color = "White";
        tireSize = 25;
        engineSize = 5.7;
        String country = "United States";
        displayInformation();
    }

    public static void displayInformation(){

        System.out.println(getMake());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getColor());
        System.out.println(getTireSize());
        System.out.println(getEngineSize());
        System.out.println(getCountry());
        System.out.println(getPackageType());
    }

    public static String getCountry(){
        return country;
    }

    public static String getPackageType(){
        return packageType;
    }


}
