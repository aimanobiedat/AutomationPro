package PSP.smoketest;
import PSP.BaseTest;
import PSP.pages.Login;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest {
    @Test(description = "this it to test login functionality", priority = 1)
    public void loginSuccessfully() throws InterruptedException {


        Login login = new Login(driver);
        login.UserNameField ();
        login.PasswordFiled();
        login.LoginButton();
        login.OTP();
        Thread.sleep(2000);



    }


}



