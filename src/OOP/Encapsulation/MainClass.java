package OOP.Encapsulation;

public class MainClass {

    public static void main(String[] args) {

        BankAccount johnAccount = new BankAccount();

        johnAccount.setAccountNumber("65997465659");
        johnAccount.setAccountBalance(100);
        johnAccount.setCustomerName("John");
        johnAccount.setCustomerEmailAddress("john@example.com");
        johnAccount.setCustomerPhoneNumber("53496969");

        System.out.println("Account # " + johnAccount.getAccountNumber());
        System.out.println("AccountBalance # " + johnAccount.getAccountBalance());
        System.out.println("CustomerName # " + johnAccount.getCustomerName());
        System.out.println("CustomerEmailAddress # " + johnAccount.getCustomerEmailAddress());
        System.out.println("CustomerPhoneNumber # " + johnAccount.getCustomerPhoneNumber());


        johnAccount.deposit(850);
        System.out.println("AccountBalance # " + johnAccount.getAccountBalance());

        johnAccount.withdraw(150);
        johnAccount.withdraw(50);
        johnAccount.withdraw(120);
        johnAccount.withdraw(23.99);
        System.out.println("AccountBalance # " + johnAccount.getAccountBalance());

        johnAccount.withdraw(750);
        System.out.println("AccountBalance # " + johnAccount.getAccountBalance());
    }
}
