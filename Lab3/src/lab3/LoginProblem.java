package lab3;

class Login
{
    private String userName, password;
    
    Login()
    {   
        System.out.println("Before set username & password");
        System.out.println("Please enter your user_name & password");
        System.out.println("=====================================");
    }
    
    Login(String user_name, String password)
    {
        this.userName = user_name;
        this.password = password;
        
        System.out.println("After set username & password");
        System.out.println("You are logged in");
    }
}

public class LoginProblem {

    public static void main(String[] args) {
        Login login = new Login();
        Login login2 = new Login("chayan", "123455");
    }
    
}
