package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class LinkedAccounts extends Base {

    Corporate.pages.LinkedAccounts LinkAccounts = new Corporate.pages.LinkedAccounts(driver);
    @Test(description = "this to test open Linked Accounts  page ", priority = 1)
    public void OpenLinkedAccounts() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        homePage.AccountsList();
        Thread.sleep(2000);
        homePage.LinkedAccountLink();
        Thread.sleep(1000);}


    @Test(description = "this to Add Linked Account   ", priority = 2)
    public void AddLinkedAccount() throws InterruptedException {

        Thread.sleep(1000);

        LinkAccounts.AddLinkedAccountsButton();
        Thread.sleep(1000);

        LinkAccounts.EnterLinkAccountNumber();
        LinkAccounts.AddAccountBtn();
        Thread.sleep(1000);



    }
}