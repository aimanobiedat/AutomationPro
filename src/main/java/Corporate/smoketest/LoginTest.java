package Corporate.smoketest;
import org.testng.annotations.Test;
import Corporate.Base;
import Corporate.pages.LoginCorp;

public class LoginTest extends Base {

    @Test(description = "this it to test login functionality", priority = 1)
    public void loginSuccessfully() {


        LoginCorp loginCorp = new LoginCorp(driver);
        loginCorp.UserNameField ();
        loginCorp.PasswordFiled();
        loginCorp.LoginButton();
        loginCorp.OTP();


    }


}



