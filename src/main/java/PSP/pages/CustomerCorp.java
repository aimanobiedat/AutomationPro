package PSP.pages;

import PSP.BaseTest;
import dev.failsafe.Timeout;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Instant;
import java.util.List;
import java.util.Random;
import java.time.Duration;


import static PSP.pages.CustomerCorp.RandomTextGenerator.generateRandomText;


public class CustomerCorp extends BasePage {


    public CustomerCorp(WebDriver driver) {
        super(driver);
    }

    public static Integer getRandom() {

        Random random = new Random();
        int y = random.nextInt(1000);
        return y;

    }

    public static class RandomTextGenerator {
        public void main(String[] args) {
            String randomText = generateRandomText(2);
            System.out.println("Random text: " + randomText);
        }

        public static @NotNull String generateRandomText(int length) {
            StringBuilder builder = new StringBuilder();
            Random random = new Random();

            String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int charactersLength = characters.length();

            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(charactersLength);
                char randomChar = characters.charAt(randomIndex);
                builder.append(randomChar);
            }

            return builder.toString();
        }
    }


    public WebElement getAddCustomerCorpButton() {
        return AddCustomerCorpButton;
    }

    @FindBy(css = ".btn.btn-primary.buttons-collection.buttons-colvis.text-white.addbtn-table")
    private WebElement AddCustomerCorpButton;

    public WebElement getType() {
        return Type;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/span[1]/span[1]")
    private WebElement Type;


    public WebElement getCorporateName() {
        return CorporateName;
    }

    public WebElement getCorpNationalityId() {
        return CorpNationalityId;
    }

    public WebElement getLegalForm() {
        return LegalForm;
    }

    public WebElement getCorporateEmail() {
        return CorporateEmail;
    }


    public WebElement getOwnerFirstName() {
        return OwnerFirstName;
    }

    public WebElement getOwnerLastName() {
        return OwnerLastName;
    }

    public WebElement getOwnerPhoneNumber() {
        return OwnerPhoneNumber;
    }

    public WebElement getOwnerEmail() {
        return OwnerEmail;
    }

    public WebElement getCreateCorporate() {
        return CreateCorporateButton;
    }


    @FindBy(xpath = "//input[@id='CORPORATE_NAME']")
    private WebElement CorporateName;

    @FindBy(xpath = "//input[@id='LICENSE_ID']")
    private WebElement CorpNationalityId;

    @FindBy(id = "LEGAL_FORM")
    private WebElement LegalForm;

    @FindBy(xpath = "//input[@id='CORPORATE_EMAIL']")
    private WebElement CorporateEmail;


    @FindBy(xpath = "//input[@id='OWNER_FIRST_NAME']")
    private WebElement OwnerFirstName;

    @FindBy(xpath = "//input[@id='OWNER_LAST_NAME']")
    private WebElement OwnerLastName;

    @FindBy(xpath = "//input[@id='OWNER_PHONE_NUMBER']")
    private WebElement OwnerPhoneNumber;

    @FindBy(xpath = "//input[@id='OWNER_EMAIL']")
    private WebElement OwnerEmail;

    @FindBy(xpath = "//*[@id=\"Job Title\"]")
    private WebElement JobTitle;

    @FindBy(xpath = "//button[@id='submit-AddCustomerCorporate']")

    private WebElement CreateCorporateButton;


    public WebElement getClassification() {
        return Classification;
    }

    public WebElement getMakeAsMerchant() {
        return MakeAsMerchant;
    }

    public WebElement getMakeAsCorp() {
        return MakeAsCorp;
    }


    @FindBy(css = "#select2-Classification-container")
    private WebElement Classification;


    @FindBy(xpath = "//label[contains(text(),'Merchant')]")
    private WebElement MakeAsMerchant;

    @FindBy(xpath = "//label[contains(text(),'Agent')]")
    private WebElement MakeAsCorp;


    public void AddCustomerCorpButton() {


        AddCustomerCorpButton.click();
    }

    public void Type() {

        Type.click();
        Type.click();
    }

    public void Classifications() {


        Classification.click();
        Classification.click();
    }

    public void MakeAsMerchant() {


        MakeAsMerchant.click();
        //MakeAsMerchant.click();//
    }

    public void MakeAsCorp() {


        MakeAsCorp.click();
        //MakeAsMerchant.click();//
    }

    public void CorporateName() {
        CorporateName.click();
        CorporateName.sendKeys("Amazon" + generateRandomText(2));
    }

    public void CorpNationalityId() {
        CorpNationalityId.click();
        CorpNationalityId.sendKeys("12365547" + getRandom());
    }


    public void LegalForm() {

    String file_path="/Users/ACER/Downloads/agent permission (1).xlsx";


        LegalForm.sendKeys(file_path);
    }


    public void CorporateEmail() {
        CorporateEmail.sendKeys("halarmouti" + getRandom() + "@blessedtreeit.com");

    }


    public void OwnerFirstName() {

        OwnerFirstName.sendKeys("hamzehem");

    }

    public void OwnerLastName() {

        OwnerLastName.sendKeys("ARdffd");

    }

    public void OwnerPhoneNumber() {

        OwnerPhoneNumber.sendKeys("+9627931121" + getRandom());

    }

    public void OwnerEmail() {
        OwnerEmail.sendKeys("halarmouti" + getRandom() + "@blessedtreeit.com");

        OwnerEmail.sendKeys(Keys.PAGE_DOWN);

    }

    public void CreateCorpButton() {
                CreateCorporateButton.click();

  }

        }






//       if(CreateCorporateButton.isEnabled()&&CreateCorporateButton.isDisplayed())
//
//
//       CreateCorporateButton.click();
//   }
//
//}

//    CreateCorpButton JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();",CreateCorporateButton);
//       if(CreateCorporateButton.isEnabled()&&CreateCorporateButton.isDisplayed()){
//
//           CreateCorporateButton.click();
//       }

//       List<WebElement> elements = driver.findElements(By.xpath("//button[@id='submit-AddCustomerCorporate']"));
//       if (!elements.isEmpty()) {
//           WebElement element = elements.get(0);
//           element.click();












