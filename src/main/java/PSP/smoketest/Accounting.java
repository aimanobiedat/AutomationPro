package PSP.smoketest;

import PSP.BaseTest;
import PSP.pages.HomePage;
import org.testng.annotations.Test;

import static PSP.smoketest.ComonTest.validLoginPsp;

public class Accounting extends BaseTest {

    @Test(description = "this to test open customer corp page ", priority = 1)
    public void openAccountingDropDown() throws InterruptedException {
        validLoginPsp();
        Thread.sleep(10000);
        HomePage homePage = new HomePage(driver);
        homePage.AccountingDropDown();
        Thread.sleep(10000);
    }

}