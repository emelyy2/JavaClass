package ClassesAndObjects;

public class MyUniversity {

    public static void main(String[] args) {

        University university = new University("NYC");

        university.address = "123 main street NYC 12222";
        university.displayInfo();

        University university2 = new University("NYC", 200, 23);
        university2.displayInfo();
    }
}
