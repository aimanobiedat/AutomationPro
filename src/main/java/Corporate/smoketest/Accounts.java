package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import java.time.Duration;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class Accounts extends Base {


    @Test(description = "this to test open Accounts list page ", priority = 1)
    public void OpenAccountsPage() throws InterruptedException {

        validLoginCorp();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        HomePage homePage = new HomePage(driver);
        homePage.AccountsList();
        homePage.AccountsLink();

        Thread.sleep(1000);
    }

    @Test(description = "this to test open Accounts list page ", priority = 2)
    public void CreateMainAcccount() throws InterruptedException {

        validLoginCorp();
        Corporate.pages.Accounts accounts = new Corporate.pages.Accounts(driver);
        Thread.sleep(1000);
        accounts.CorporateCardActionsButton();
        accounts.ClickOnAddMainCorporate();
        Thread.sleep(1000);
        //EnterAccountName
        accounts.EnterAccountName("AutomationsAccount");
        Thread.sleep(1000);

        accounts.ChoseProduct();
        Thread.sleep(3000);

        accounts.ChoseCurrency();
        Thread.sleep(1000);
     accounts.ClickNextButtonAccount();
        Thread.sleep(1000);
        accounts.EnterBasedOnWalletPrdouct("Test");


        accounts.ClickFinishButtonAccount();































        //*[@id="wizard1-p-0"]/div[2]/div[2]/span

      //  driver.findElement(By.xpath("//*[@id=\"select2-ProductId-results\"]/li[1]").
//Thread.sleep(1000);
     //   driver.findElement(By.xpath("//*[@id=\"diagram\"]/div/div/div/div/div/div[3]/div/section/div[2]/span")).click();
//
   //    driver.findElement(By.xpath("//*[@id=\"select2-ProductId-results\"]/li[1]").click();

       // accounts.actionss();
///html/body/div[3]/ul/li[5]
     //   accounts.CorporateCardActions();
        //Thread.sleep(1000);

      //  Corporate.pages.Accounts accounts = new Corporate.pages.Accounts(driver);
       /* accounts.AccountListButtonC();
        Thread.sleep(1000);
        accounts.AddMainCorporate();
        //Thread.sleep(2000);
        accounts.SelectDropdownProductList();
        // Accounts accounts =new Corporate.Accounts(driver);
      //  accounts.CustomerIndActionButton();*/


      //  Thread.sleep(1000);







    }



}








