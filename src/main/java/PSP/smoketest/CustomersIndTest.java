package PSP.smoketest;
import PSP.BaseTest;
import PSP.pages.CustomerIndv;
import PSP.pages.HomePage;
import PSP.pages.OpenActionCustomerIND;
import org.testng.annotations.Test;
import java.time.Duration;
import static PSP.smoketest.ComonTest.validLoginPsp;
import org.openqa.selenium.interactions.Actions;
public class CustomersIndTest extends BaseTest {

    @Test(description = "this to test open customer page ", priority = 1)
   public void openCustomerIndividual() throws InterruptedException {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
      validLoginPsp();
       HomePage homePage = new HomePage(driver);
       Thread.sleep(3000);
       homePage.customerDropDown();
       Thread.sleep(1000);
       homePage.CustomerIndividualLink();}
    @Test(description = "this to test open icon add customer page ", priority = 2)
    public void openAddCustomerIndividual() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.CustomerIndividualLink();
        CustomerIndv customerIndv = new CustomerIndv(driver);
        Thread.sleep(3000);
        customerIndv.OpenAddCustomer();
    }

    @Test(description = "this to test add customer  Indiviudal  " , priority = 3)
    public void addCustomerIndividualSujccessfully() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.CustomerIndividualLink();
        CustomerIndv customerIndv = new CustomerIndv(driver);
        customerIndv.OpenAddCustomer();
        customerIndv.CustomerFirstName();
        customerIndv.CustomerSecondName();
        customerIndv.CustomerThirdName();
        customerIndv.CustomerLastName();
        customerIndv.NationalityNumber();
        customerIndv.CustomerPhoneNumber();
        customerIndv.CustomerNationality();
        Thread.sleep(3000);
       customerIndv.CreateINDButton();
       Thread.sleep(2000);
    }
    @Test(description = "this to test add customer  Indiviudal with create account and cash in , cashout  " , priority = 3)
    public void addCustomerIndividualSuccessfully() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.CustomerIndividualLink();
        Thread.sleep(2000);
        CustomerIndv customerIndv = new CustomerIndv(driver);
        customerIndv.OpenAddCustomer();
        customerIndv.CustomerFirstName();
        customerIndv.CustomerSecondName();
        customerIndv.CustomerThirdName();
        customerIndv.CustomerLastName();
        customerIndv.NationalityNumber();
        customerIndv.CustomerPhoneNumber();
        customerIndv.CustomerNationality();
        Thread.sleep(3000);
        customerIndv.CreateINDButton();
        Thread.sleep(3000);
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
        Thread.sleep(2000);
        openActionCustomerIND.OpenAccountForCustomerInd();
        Thread.sleep(3000);
        openActionCustomerIND.OpenProductDropDown();
        Thread.sleep(2000);
        openActionCustomerIND.OpenSearchDropDown();
        Thread.sleep(3000);
        openActionCustomerIND.chooseCloosLoop();
        openActionCustomerIND.OpenCurrencyDropDown();
        openActionCustomerIND.chooseJordanDinar();
        openActionCustomerIND.OpenFeesProgramDropDown();
        openActionCustomerIND.chooseprogram();
        Thread.sleep(3000);
        openActionCustomerIND.OpenNextButton();
        Thread.sleep(3000);
        openActionCustomerIND.OpenNextButton();
        Thread.sleep(3000);
        openActionCustomerIND.FinishButton();
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        Thread.sleep(5000);
        accountIndv.ActionButton();
        Thread.sleep(3000);
        accountIndv.CashInButton();
        Thread.sleep(1000);
        accountIndv.AmountField();
        Thread.sleep(2000);
        accountIndv.SubmitCashIn();
        Thread.sleep(3000);
        accountIndv.ConfirmCashInTRX();
        Thread.sleep(5000);
        accountIndv.ActionButton();
        Thread.sleep(1000);
        accountIndv.CashOutButton();
        Thread.sleep(1000);
        accountIndv.AmountField();
        accountIndv.SubmitCashIn();
        Thread.sleep(10000);
        accountIndv.ConfirmCashInTRX();

        Thread.sleep(2000);
    }

    @Test(description = "this to test cancel add customer  Indiviudal  with click on yes for confirmation message " , priority = 4)
    public void canceladdCustomerIndividual() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.customerDropDown();
        homePage.CustomerIndividualLink();
        CustomerIndv customerIndv = new CustomerIndv(driver);
        customerIndv.OpenAddCustomer();
        customerIndv.CustomerFirstName();
        customerIndv.CustomerSecondName();
        customerIndv.CustomerThirdName();
        customerIndv.CustomerLastName();
        customerIndv.NationalityNumber();
        customerIndv.CustomerPhoneNumber();
        customerIndv.CustomerNationality();
        Thread.sleep(3000);
        customerIndv.CancelCreateInd();
        Thread.sleep(2000);
        customerIndv.ConfirmationMessageYes();
    }
    @Test(description = "this to test cancel add customer  Indiviudal  with click on no for confirmation message " , priority = 5)
    public void canceladdCustomerIndividualforNo() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.customerDropDown();
        homePage.CustomerIndividualLink();
        CustomerIndv customerIndv = new CustomerIndv(driver);
        customerIndv.OpenAddCustomer();
        customerIndv.CustomerFirstName();
        customerIndv.CustomerSecondName();
        customerIndv.CustomerThirdName();
        customerIndv.CustomerLastName();
        customerIndv.NationalityNumber();
        customerIndv.CustomerPhoneNumber();
        customerIndv.CustomerNationality();
        Thread.sleep(3000);
        customerIndv.CancelCreateInd();
        Thread.sleep(2000);
        customerIndv.ConfirmationMessageNO();
    }


//
    @Test(description = "this to test open action customer individual   ", priority = 4)
    public void OpenActionCustomerIND() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.CustomerIndividualLink();
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
    }
    @Test(description = "this to test open  customr individual details   ", priority = 2)
    public void OpenCustomerIndividualDetails() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
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
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.CustomerIndividualLink();
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
        Thread.sleep(2000);
        openActionCustomerIND.BLockCustomerIndividual();
        Thread.sleep(2000);
        openActionCustomerIND.ConirmationMessageYes();
    }
    @Test(description = "this to test unblock profile customer individual    ", priority =3 )
    public void unBlockProfileCustomerInd() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.CustomerIndividualLink();
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
        Thread.sleep(2000);
        openActionCustomerIND.BLockCustomerIndividual();
        Thread.sleep(2000);
        openActionCustomerIND.ConirmationMessageYes();
    }
    @Test(description = "this to test open account  for customer individual   ", priority = 5)
    public void OpenAccountForCustomerIndividual() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.CustomerIndividualLink();
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
       Thread.sleep(2000);
        openActionCustomerIND.Action();
    Thread.sleep(2000);
        openActionCustomerIND.OpenAccountForCustomerInd();
     Thread.sleep(3000);
     openActionCustomerIND.OpenAccountName();
     Thread.sleep(2000);
        openActionCustomerIND.OpenProductDropDown();
       Thread.sleep(2000);
        openActionCustomerIND.OpenSearchDropDown();
     Thread.sleep(3000);
        openActionCustomerIND.chooseCloosLoop();
        Thread.sleep(3000);
        openActionCustomerIND.OpenCurrencyDropDown();
        Thread.sleep(3000);
        openActionCustomerIND.chooseJordanDinar();
        Thread.sleep(3000);
        openActionCustomerIND.OpenFeesProgramDropDown();
        Thread.sleep(3000);
        openActionCustomerIND.chooseprogram();
        Thread.sleep(3000);
        openActionCustomerIND.OpenNextButton();
        Thread.sleep(3000);
        openActionCustomerIND.OpenNextButton();
        Thread.sleep(3000);
        openActionCustomerIND.FinishButton();
    }

    @Test(description = "this to test  Cash In Successfully for account ", priority = 7)
    public void CashInTransactionSuccessfully() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.AccountsDropdown();
        Thread.sleep(3000);
        homePage.accountIndividualLink();
        Thread.sleep(3000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.ActionButton();
        Thread.sleep(3000);
        accountIndv.CashInButton();
        Thread.sleep(1000);
        accountIndv.AmountField();
        Thread.sleep(2000);
        accountIndv.SubmitCashIn();
        Thread.sleep(3000);
        accountIndv.ConfirmCashInTRX();
        Thread.sleep(5000);
    }

    @Test(description = "this to test  Cash Out Successfully for account ", priority = 9)
    public void CashOutTransactionSuccessfully() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.AccountsDropdown();
        Thread.sleep(3000);
        homePage.accountIndividualLink();
        Thread.sleep(3000);
        PSP.pages.AccountIndv accountIndv = new PSP.pages.AccountIndv(driver);
        accountIndv.ActionButton();
        Thread.sleep(1000);
        accountIndv.CashOutButton();
        Thread.sleep(1000);
        accountIndv.AmountField();
        accountIndv.SubmitCashIn();
        Thread.sleep(10000);
        accountIndv.ConfirmCashInTRX();
        Thread.sleep(3000);

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










