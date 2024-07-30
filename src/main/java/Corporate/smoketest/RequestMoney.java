package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class RequestMoney extends Base {
    @Test(description = "this to test open Request Money  page ", priority = 1)
    public void OpenRequestMoney() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        homePage.RequestMoneyLink();
        Thread.sleep(1000);
    }
}