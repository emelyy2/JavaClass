package OOP.Inheritance;

public class Tiger extends Mammal{

    public static double weight;
    public static String gender;

    public static void main(String[] args) {

        name = "Nala";
        color = "Black & Yellow";
        age = 10;
        specieType = "Mammal";
        height = 9.1;
        weight = 200;
        gender = "Female";
        displayInformation();
        System.out.println(getWeight());
        System.out.println(getGender());
    }


    public static double getWeight(){
        return weight;
    }

    public static String getGender(){
        return gender;
    }

}
