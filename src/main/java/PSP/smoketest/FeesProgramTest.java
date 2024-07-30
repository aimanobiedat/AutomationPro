package PSP.smoketest;
import PSP.BaseTest;
import PSP.pages.FeesProgram;
import PSP.pages.HomePage;
import org.testng.annotations.Test;
import java.time.Duration;
import static PSP.smoketest.ComonTest.validLoginPsp;
public class FeesProgramTest extends BaseTest {
    @Test(description = "this is to test to Add fees program", priority = 1)
    public void openFeesPorgram() throws InterruptedException{
        validLoginPsp();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        HomePage homePage= new HomePage(driver);
        Thread.sleep(2000);
        homePage.buisnessConfigDropDown();
        Thread.sleep(3000);
        homePage.setFeesProgram();
        FeesProgram feesProgram=new FeesProgram(driver);
        Thread.sleep(2000);
        feesProgram.createprogram();
        Thread.sleep(3000);
        feesProgram.AddProgramName();
        Thread.sleep(3000);
        feesProgram.AddProgramNameAR();
        Thread.sleep(2000);
        feesProgram.OpenCustomerCatogry();
        Thread.sleep(3000);
        feesProgram.OpenSearchDropDown();
        Thread.sleep(3000);
        feesProgram.ChooseCatogry();
        Thread.sleep(2000);
        feesProgram.OpenCustomerType();
        Thread.sleep(2000);
        feesProgram.ChooseCustomerType();
        Thread.sleep(2000);
        feesProgram.OpenCustomerClassification();
        Thread.sleep(2000);
        feesProgram.ChooseClassification();
        Thread.sleep(2000);
        feesProgram.OpenProduct();
        Thread.sleep(2000);
        feesProgram.ChooseProduct();
        Thread.sleep(2000);
        feesProgram.OpenCurrency();
        Thread.sleep(2000);
        feesProgram.ChooseCurrency();
        Thread.sleep(7000);
        feesProgram.CreateProg();
        Thread.sleep(2000);



    }


}


