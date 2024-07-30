package PSP.smoketest;

import PSP.BaseTest;
import PSP.pages.HomePage;
import org.testng.annotations.Test;

import static PSP.smoketest.ComonTest.validLoginPsp;

public class AccountIndv extends BaseTest {

    @Test(description = "this to test open customer corp page ", priority = 1)
    public void openAccountIndividual() throws InterruptedException {
        validLoginPsp();
        Thread.sleep(2000);
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(2000);
        homePage.accountIndividualLink();
        Thread.sleep(2000);




    }


    @Test(description = "this to test open add Account Ind page ", priority = 2)
    public void openAddAccountIndPage() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(1000);
        homePage.accountIndividualLink();
        Thread.sleep(1000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.AddAccountIndButton();



    }

    @Test(description = "this to test add Account page ", priority = 3)
    public void addAccountIndSuccessfully() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(1000);
        homePage.AccountsDropdown();
        Thread.sleep(1000);
        homePage.accountIndividualLink();
        Thread.sleep(1000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.AddAccountIndButton();
        Thread.sleep(1000);
        accountIndv.ProfileIdField();
        Thread.sleep(1000);
        accountIndv.GetProfileInfo();
        Thread.sleep(3000);
        accountIndv.TypeDropDown();
        Thread.sleep(1000);
        accountIndv.OpenCurrencyDropDown();
        Thread.sleep(3000);
        accountIndv.OpenSearchDropDown();

    }

    @Test(description = "this to test open Actions for account ", priority = 4)
    public void openAccountIndActions() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(10000);
        homePage.accountIndividualLink();
        Thread.sleep(10000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.ActionButton();

        Thread.sleep(10000);


    }

    @Test(description = "this to test open  account details ", priority = 5)
    public void openAccountIndDetails() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(10000);
        homePage.accountIndividualLink();
        Thread.sleep(10000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.ActionButton();
        accountIndv.AccountDetails();

        Thread.sleep(10000);


    }


    @Test(description = "this to test open Cash In popup for account ", priority = 6)
    public void openCashInPopup() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(10000);
        homePage.accountIndividualLink();
        Thread.sleep(10000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.ActionButton();
        accountIndv.CashInButton();

        Thread.sleep(10000);


    }

    @Test(description = "this to test  Cash In Successfully for account ", priority = 7)
    public void CashInTransactionSuccessfully() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(10000);
        homePage.accountIndividualLink();
        Thread.sleep(10000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.ActionButton();
        Thread.sleep(1000);
        accountIndv.CashInButton();
        Thread.sleep(1000);
        accountIndv.AmountField();
        accountIndv.SubmitCashIn();
        Thread.sleep(10000);
        accountIndv.ConfirmCashInTRX();

        Thread.sleep(10000);


    }

    @Test(description = "this to test open Cash Out popup for account ", priority = 8)
    public void openCashOutPopup() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(10000);
        homePage.accountIndividualLink();
        Thread.sleep(10000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.ActionButton();
        accountIndv.CashOutButton();


        Thread.sleep(10000);


    }

    @Test(description = "this to test  Cash Out Successfully for account ", priority = 9)
    public void CashOutTransactionSuccessfully() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(10000);
        homePage.accountIndividualLink();
        Thread.sleep(10000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.ActionButton();
        Thread.sleep(1000);
        accountIndv.CashOutButton();
        Thread.sleep(1000);
        accountIndv.AmountField();
        accountIndv.SubmitCashIn();
        Thread.sleep(10000);
        accountIndv.ConfirmCashInTRX();

        Thread.sleep(10000);


    }

}








