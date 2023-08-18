package OOP.Encapsulation;

public class UserOne {

    public static void main(String[] args) {

        LoginPage login = new LoginPage();

        login.setuserName("UserOne");
        login.setpassword("Password1");
        System.out.println(login.getuserName() + " " + login.getpassword());
    }
}
