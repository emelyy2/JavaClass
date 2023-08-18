package OOP.Encapsulation;

public class JohnClass {

    public static void main(String[] args) {
         PersonalInformation person = new PersonalInformation();

         person.setName("John");
        System.out.println(person.getName());

        person.setEmailAddress("John@example.com");
        System.out.println(person.getEmailAddress());

        person.setAge(66);
        System.out.println(person.getAge());

        person.setCellNumber(123);
        System.out.println(person.getCellNumber());

        person.BOD = "1/23/1997";
        person.zipCode = 1234;

        System.out.println(person.BOD);
        System.out.println(person.zipCode);
    }
}
