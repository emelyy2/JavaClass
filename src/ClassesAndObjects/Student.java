package ClassesAndObjects;

public class Student { //TASK: create a class called Student
    public String name;
    public int age;
    public String gender;
    public int year;
    public String course;

    //Create a constructor to assign values to the attributes
    public Student(String name, int age, String gender, int year, String course){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
        this.course = course;
    }

    //create a method to display the information
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Year: " + year);
        System.out.println("Course: " + course);
    }

    //create main method to initialize obj of Student - new
    //assign values to params
    //call display info method

    public static void main(String[] args) {

        Student s = new Student("Sofia", 27, "Female",
                2023, "SDET");
        s.displayInfo();
    }

}
