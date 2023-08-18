package OOP.Abstraction;

public class UserOne extends LoginPage{
    @Override
    void username() {
        System.out.println("Admin");
    }

    @Override
    void password() {
        System.out.println("admin123");
    }

    public static void main(String[] args) {
        UserOne userOne = new UserOne();
        userOne.username();
        userOne.password();

    }
}
