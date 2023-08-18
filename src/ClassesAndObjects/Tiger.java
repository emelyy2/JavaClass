package ClassesAndObjects;

public class Tiger {
    public static void main(String[] args) {

        Animal tiger = new Animal("Sherkhan", "Orange/Black",
                "Wild", 3, 180.50);
        tiger.displayInfo();

        Animal dog = new Animal("Rex", "Brown",
                "Home Animal", 4, 134.5);
        dog.displayInfo();

        Animal cow = new Animal("Mumu", "Black & White",
                "Home", 5, 220.7);
        cow.displayInfo();
    }
}
