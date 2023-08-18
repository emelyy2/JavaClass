public class StringBuilderClass {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Emely");
        sb.append(" Fuentes");
        System.out.println(sb);

        StringBuilder name = new StringBuilder ("Emely");
        System.out.println(name);
        name.reverse();
        System.out.println(name);

         StringBuilder name1 = new StringBuilder("EMELY");
         name1.insert(5, " FUENTES");
        System.out.println(name1);

    }
}
