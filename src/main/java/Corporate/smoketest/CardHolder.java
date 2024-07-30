package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class CardHolder extends Base {


    @Test(description = "this to test open Card Holder  page ", priority = 1)
    public void OpenLinkedAccounts() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        //homePage.AccountsList();
        Thread.sleep(2000);
        homePage.ResourcesList();
        Thread.sleep(1000);
        Corporate.pages.CardHolder holder = new Corporate.pages.CardHolder(driver);


        holder.CardHolderPage();
        Thread.sleep(1000);
        holder.AddCardHolderButton();
        Thread.sleep(1000);
        holder.FirstName("hamzeh");
        Thread.sleep(1000);
        holder.SecondName();
        Thread.sleep(1000);
        holder.LastName();
        Thread.sleep(1000);
        holder.NationalityNumber();
        Thread.sleep(1000);
        holder.PhoneNumber();
        Thread.sleep(1000);
        holder.ClickOnCreateButton();


        //holder.CardHolderDetailsPage();









    }
}