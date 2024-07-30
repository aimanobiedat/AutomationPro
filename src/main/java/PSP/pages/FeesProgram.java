package PSP.pages;
import PSP.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Random;
public class FeesProgram extends BasePage {


    public FeesProgram(WebDriver driver) {
        super(driver);
    }

//    public static Integer getRandom() {
//        Random random = new Random();
//        int y = random.nextInt(1000);
//        return y;
//
//    }

    @FindBy(id = "ProgramName")

    private WebElement ProgramName;


    public WebElement getProgramName() {
        return ProgramName;
    }

    public void AddProgramName() {

        ProgramName.sendKeys("aymanemad");
    }

    @FindBy(id = "ProgramNameAr")

    private WebElement ProgramNameAr;


    public WebElement getProgramNameAr() {
        return ProgramNameAr;
    }

    public void AddProgramNameAR() {

        ProgramNameAr.sendKeys("برنامج ايمن ");
    }


    @FindBy(id = "select2-CustomerCategoryId-container")

    private WebElement CustomerCatogty;


    public WebElement getCustomerCatogty() {
        return CustomerCatogty;
    }

    public void OpenCustomerCatogry() {

        CustomerCatogty.click();
    }


    @FindBy(className = "select2-search__field")
    private WebElement SearchDropdown;

    public WebElement SearchDropdown() {

        return SearchDropdown;
    }

    public void OpenSearchDropDown() {

        SearchDropdown.click();
    }

    public void ChooseCatogry() {

        SearchDropdown.sendKeys("Individual");
        SearchDropdown.sendKeys(Keys.ENTER);
    }


    @FindBy(xpath = "//*[name()='path' and contains(@d,'M417.4,224')]")

    private WebElement CreateProgram;


    public WebElement getCreateProgram() {
        return CreateProgram;
    }

    public void createprogram() {

        CreateProgram.click();
    }


    @FindBy(id = "select2-CustomerTypeId-container")
    private WebElement CustomerType;

    public WebElement getCustomerType() {

        return CustomerType;
    }

    public void OpenCustomerType() {

        CustomerType.click();
    }


    @FindBy(id = "select2-CustomerClassificationId-container")
    private WebElement CustomerClassification;

    public WebElement getCustomerClassification() {

        return CustomerClassification;
    }

    public void OpenCustomerClassification() {

        CustomerClassification.click();
    }

    @FindBy(id = "select2-RelatedProductId-container")
    private WebElement product;

    public WebElement getProduct() {

        return product;
    }

    public void OpenProduct() {

        product.click();
    }


    @FindBy(id = "select2-CurrencyId-container")

    private WebElement Currency;

    public WebElement getCurrency() {

        return Currency;
    }

    public void OpenCurrency() {

        Currency.click();
    }

    @FindBy(css = "button[class='btn btn-primary button-icon mb-1 btnSubmit']")
    private WebElement Createprogram;

    public WebElement getCreateprogram() {

        return Createprogram;
    }

    public void CreateProg() {


            Createprogram.click();

        }


    public void ChooseCustomerType() {

        SearchDropdown.sendKeys("person");
        SearchDropdown.sendKeys(Keys.ENTER);
    }


    public void ChooseClassification() {

        SearchDropdown.sendKeys("aaa");
        SearchDropdown.sendKeys(Keys.ENTER);
    }

    public void ChooseProduct() {

        SearchDropdown.sendKeys("Close Loop Wallet");
        SearchDropdown.sendKeys(Keys.ENTER);
    }

    public void ChooseCurrency() {

        SearchDropdown.sendKeys("Jordanian Dinar");
        SearchDropdown.sendKeys(Keys.ENTER);



    }
}

