package OOP.Encapsulation;

public class LoginPage {

    private String userName;
    private String password;

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        if(userName.equals("UserOne")) {
            this.userName = userName;
        }else{
            this.userName = "Invalid UserName";
        }

    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        if(password.equals("Password1")){
            this.password = password;
        }else{
            this.password = "Invalid Password";
        }

    }

}
