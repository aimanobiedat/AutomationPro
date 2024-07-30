package PSP.smoketest;

import PSP.BaseTest;
import PSP.pages.HomePage;
import org.testng.annotations.Test;

import static PSP.smoketest.ComonTest.validLoginPsp;

public class Reports extends BaseTest {

    @Test(description = "this to test open customer corp page ", priority = 1)
    public void openReports() throws InterruptedException {
        validLoginPsp();
        Thread.sleep(10000);
        HomePage homePage = new HomePage(driver);
        homePage.ReportsLink();
        Thread.sleep(10000);


    }

}