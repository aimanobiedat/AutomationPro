package PSP.smoketest;
import PSP.BaseTest;
import PSP.pages.HomePage;
import PSP.pages.OpenActionCustomerIND;
import org.testng.annotations.Test;
import static PSP.smoketest.ComonTest.validLoginPsp;
public class OpenActionCustomerINDTest extends BaseTest {
    @Test(description = "this to test open action customer individual   ", priority = 1)
    public void OpenActionCustomerIND() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.customerDropDown();
        homePage.CustomerIndividualLink();
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
    }


    @Test(description = "this to test open  customr individual details   ", priority = 2)
    public void OpenCustomerIndividualDetails() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.customerDropDown();
        homePage.CustomerIndividualLink();
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
        openActionCustomerIND.CustomerIndividualDetails();
    }


    @Test(description = "this to test block profile customer individual    ", priority =3 )
    public void BlockProfileCustomerInd() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.customerDropDown();
        homePage.CustomerIndividualLink();
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
        Thread.sleep(2000);
        openActionCustomerIND.BLockCustomerIndividual();
        Thread.sleep(2000);
        openActionCustomerIND.ConirmationMessageYes();
    }
    @Test(description = "this to test open account for customer individual   ", priority = 4)
    public void OpenAccountForCustomerIndividual() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.customerDropDown();
        homePage.CustomerIndividualLink();
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
        Thread.sleep(2000);
        openActionCustomerIND.OpenAccountForCustomerInd();
    }

    @Test(description = "this to test Change history customer individual    ", priority = 5)
    public void ChangeHistoryCustomerInd() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.customerDropDown();
        homePage.CustomerIndividualLink();
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
        Thread.sleep(2000);
        openActionCustomerIND.ChangeHistoryCustomerIndividual();
    }


}













