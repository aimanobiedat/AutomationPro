package PSP.smoketest;

import PSP.BaseTest;
import PSP.pages.HomePage;
import org.testng.annotations.Test;

import static PSP.smoketest.ComonTest.validLoginPsp;

public class AccountCorp extends BaseTest {

    @Test(description = "this to test open account corp page ", priority = 1)
    public void openAccountCorp() throws InterruptedException {
        validLoginPsp();
        Thread.sleep(10000);
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(10000);
        homePage.AccountCorpLink();
        Thread.sleep(5000);



    }


}