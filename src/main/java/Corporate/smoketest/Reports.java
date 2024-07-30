package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class Reports extends Base {

    @Test(description = "this to test open Reports  page ", priority = 1)
    public void OpenReports() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        homePage.ReportsLink();
        Thread.sleep(1000);
    }
}
