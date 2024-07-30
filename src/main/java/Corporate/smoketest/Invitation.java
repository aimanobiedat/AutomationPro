package Corporate.smoketest;

import Corporate.Base;
import Corporate.pages.HomePage;
import org.testng.annotations.Test;

import static Corporate.smoketest.ComonTest.validLoginCorp;

public class Invitation extends Base {


    Corporate.pages.Invitation invitation = new Corporate.pages.Invitation(driver);

    @Test(description = "this to test open Card Holder  page ", priority = 1)
    public void OpenInvitationPage() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        //homePage.AccountsList();
        Thread.sleep(2000);
        homePage.ResourcesList();
        Thread.sleep(2000);
        Corporate.pages.Invitation invitation = new Corporate.pages.Invitation(driver);
        invitation.InvitationPage();
        Thread.sleep(1000);
        invitation.AddInvitationButton();
        Thread.sleep(1000);
        invitation.InvitationFirstName();
        Thread.sleep(1000);
        invitation.InvitationLastName();
        Thread.sleep(1000);
        invitation.HolderEmail();
        Thread.sleep(1000);
        invitation.HolderPhoneNumber();
        Thread.sleep(2000);
        invitation.SendInvitationButton();









      driver.quit();
    }

    @Test(description = "this to test open Card Holder  page ", priority = 2)
    public void OpenInvitationDetails() throws InterruptedException {
        validLoginCorp();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        //homePage.AccountsList();
        Thread.sleep(2000);
        homePage.ResourcesList();
        Thread.sleep(2000);
        Corporate.pages.Invitation invitation = new Corporate.pages.Invitation(driver);
        invitation.InvitationPage();

        Thread.sleep(1000);
        invitation.ActionButton();
        Thread.sleep(2000);
        invitation.InvitationDetails();
        Thread.sleep(2000);


        invitation.OpenTheInvitationForm();
        Thread.sleep(2000);
        //invitation.ConfirmThePhone();











      // driver.quit();
    }



}
