package PSP.smoketest;
import PSP.BaseTest;
import PSP.pages.CustomerCorp;
import PSP.pages.HomePage;
import PSP.pages.OpenActionCustomerCorp;
import PSP.pages.OpenActionCustomerIND;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.time.Duration;
import static PSP.smoketest.ComonTest.validLoginPsp;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
public class CustomersCorpTest extends BaseTest {

    @Test(description = "this to test open customer corp page ", priority = 1)
    public void openCustomerCorp() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        homePage.customerDropDown();
        homePage.customerCorporateLink();

    }


    @Test(description = "this to test open add customer corp page ", priority = 2)
    public void openAddCustomerCorpPage() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.customerCorporateLink();
        Thread.sleep(2000);
        CustomerCorp customerCorp = new CustomerCorp(driver);
        customerCorp.AddCustomerCorpButton();
    }

    @Test(description = "this to test add customer page ", priority = 3)
    public void addMerchantCustomerCorpSuccessfully() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.customerCorporateLink();
        Thread.sleep(2000);
        CustomerCorp customerCorp = new CustomerCorp(driver);
        Thread.sleep(2000);
        customerCorp.AddCustomerCorpButton();
        Thread.sleep(2000);
        customerCorp.Type();
        Thread.sleep(2000);
        customerCorp.Classifications();
        Thread.sleep(2000);
        customerCorp.MakeAsMerchant();
        Thread.sleep(2000);
        customerCorp.CorporateName();
        customerCorp.CorpNationalityId();
      customerCorp.LegalForm();
        customerCorp.CorporateEmail();
        customerCorp.OwnerFirstName();
        customerCorp.OwnerLastName();
        customerCorp.OwnerPhoneNumber();
        customerCorp.OwnerEmail();
        Thread.sleep(2000);
        customerCorp.CreateCorpButton();
        Thread.sleep(2000);
    }
    @Test(description = "this to test add main account corporate  page ", priority = 3)
    public void addCorpCustomerCorpSuccessfully() throws InterruptedException {
        validLoginPsp();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.customerDropDown();
        Thread.sleep(2000);
        homePage.customerCorporateLink();
        Thread.sleep(2000);
        OpenActionCustomerIND openActionCustomerIND=new OpenActionCustomerIND(driver);
        Thread.sleep(2000);
        openActionCustomerIND.Action();
        Thread.sleep(4000);
        openActionCustomerIND.CustomerIndividualDetails();
        Thread.sleep(5000);
        OpenActionCustomerCorp openActionCustomerCorp=new OpenActionCustomerCorp(driver);
//        openActionCustomerCorp.OpenActionMainAccount();



    }
}








