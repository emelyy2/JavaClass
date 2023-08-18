package ClassesAndObjects;

public class Students {

    String name;
    int age;
    char grade;

    public Students(String name, int age, char grade){ //constructor
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
    }

    public static void main(String[] args) {
        Students st = new Students("Emely", 27, 'A');
        st.displayInfo();

    }
}
