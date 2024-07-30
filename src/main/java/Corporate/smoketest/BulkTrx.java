package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class BulkTrx extends Base {

    @Test(description = "this to test open BulkTRX page ", priority = 1)
    public void OpenABulkTRXPage() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        homePage.BulkTRXLink();
        Thread.sleep(10000);
    }

}
