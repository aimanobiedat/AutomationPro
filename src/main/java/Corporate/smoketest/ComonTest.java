package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.LoginCorp;
import org.testng.annotations.Test;

public class ComonTest extends Base {

       @Test

    public static void validLoginCorp(){

        LoginCorp loginCorp = new LoginCorp(driver);
        loginCorp.UserNameField ();
        loginCorp.PasswordFiled();
        loginCorp.LoginButton();
        loginCorp.OTP();


    }
}
