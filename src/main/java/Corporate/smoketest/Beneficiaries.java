package Corporate.smoketest;

import org.testng.annotations.Test;
import Corporate.Base;
import Corporate.pages.HomePage;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class Beneficiaries extends Base {

    @Test(description = "this to test open Beneficiaries List page ", priority = 1)
    public void OpenABeneficiariesListPage() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        homePage.ResourcesList();
        Thread.sleep(1000);
        homePage.BeneficiariesListLink();
        Thread.sleep(10000);
    }


}