package OOP.Polymorphism;

public class Countries {
    public static void main(String[] args) {
        Earth e = new Earth();
        int lang = e.languages();
        float pop = e.population();
        int wet = e.weather();
        System.out.println("Languages spoken on Earth: " + lang);
        System.out.println("Earth's population: " + pop + " billion");
        System.out.println("Earth's weather: " + wet + "C");
        System.out.println();


        e = new Africa();
        lang = e.languages();
        pop = e.population();
        wet = e.weather();
        System.out.println("Languages spoken on Africa: " + lang);
        System.out.println("Africa's population: " + pop + " billion");
        System.out.println("Africa's weather: " + wet + "F");
        System.out.println();

        e = new America();
        lang = e.languages();
        pop = e.population();
        wet = e.weather();
        System.out.println("Languages spoken on Africa: " + lang);
        System.out.println("America's population: " + pop + " billion");
        System.out.println("America's weather: " + wet + "F");
    }
}
