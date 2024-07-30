package PSP.smoketest;
import PSP.BaseTest;
import PSP.pages.Login;
import org.testng.annotations.Test;
public class ComonTest extends BaseTest {
       @Test

    public static void validLoginPsp(){

        Login login = new Login(driver);
        login.UserNameField ();
        login.PasswordFiled();
        login.LoginButton();
        login.OTP();


    }
}
