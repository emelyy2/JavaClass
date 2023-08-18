package ClassesAndObjects;

public class University {

    public long studentCount;
    public int courseCount;
    public String address;
    public int buildingCount;
    public int age;
    public String type;

    public University(long studentCount, int courseCount){ //constructor #1
        this.studentCount = studentCount;
        this.courseCount = courseCount;
    }

    public University(String address, int buildingCount, int age){//constructor #2
        this.address = address;
        this.buildingCount = buildingCount;
    }

    public University(String type){ //constructor #3
        this.type = type;
    }

    public void displayInfo(){
        System.out.println(studentCount);
        System.out.println(courseCount);
        System.out.println(address);
        System.out.println(buildingCount);
        System.out.println(age);
        System.out.println(type);
    }
}
