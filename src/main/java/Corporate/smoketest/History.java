package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class History extends Base {
    @Test(description = "this to test open History  page ", priority = 1)
    public void OpenHistoryPage() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        homePage.HistoryLink();
        Thread.sleep(1000);
    }
}