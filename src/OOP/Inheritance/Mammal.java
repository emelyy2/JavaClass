package OOP.Inheritance;

public class Mammal extends NewAnimal{

    public static void main(String[] args) {

        name = "Leoparda";
        color = "Gray";
        age = 18;
        specieType = "Mammal";
        height = 8.1;
    }

    public static void displayInformation(){
        System.out.println(getName());
        System.out.println(getColor());
        System.out.println(getAge());
        System.out.println(getSpecieType());
        System.out.println(getHeight());
    }
}
