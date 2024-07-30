package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class TransferMoney extends Base {


    Corporate.pages.TransferMoney TransferMoney = new Corporate.pages.TransferMoney(driver);
    @Test(description = "this to test open Transfer  page ", priority = 1)
    public void OpenTransferMoney() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
     //   homePage.TransferMoneyLink();
        Thread.sleep(1000);


        //TransferMoney page Object

        Thread.sleep(2000);

       TransferMoney.TransferMoneyPage();
    }




    @Test(description = "this to test  Transfer Money ", priority = 2)
      public void CreateTransferMoney() throws InterruptedException {

        Thread.sleep(1000);
        TransferMoney.FromAccountList("0210740061332881");
        Thread.sleep(1000);
        TransferMoney.ToAccountList("0210740052611221");
        Thread.sleep(2000);
        TransferMoney.AmountField();
        Thread.sleep(1000);
       // TransferMoney.NoteField();
        Thread.sleep(1000);
        TransferMoney.TransferButton();
        TransferMoney.ConnfirmTransferMoneyPopup();





        Thread.sleep(4000);
        driver.quit();}







}