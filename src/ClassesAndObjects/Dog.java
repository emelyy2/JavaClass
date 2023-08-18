package ClassesAndObjects;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    String size;

    public void bark(){
        System.out.println(name + " is barking");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void run(){
        System.out.println(name + " is running");
    }

    public void play(){
        System.out.println(name + " is playing");
    }

    public void breed(){
        System.out.println("The breed is: " + breed);
    }

    public void color(){
        System.out.println("The color is: " + color);
    }

    public void age(){
        System.out.println("The age is: " + age);
    }

    public void size(){
        System.out.println("The size is: " + size);
    }

}
