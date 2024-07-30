package PSP.pages;
import PSP.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.Random;
public class CustomerIndv extends BasePage {
    public CustomerIndv(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddCustomerIndButton() {
        return AddCustomerIndButton;
    }

    public WebElement getCustomerIndActionButton() {
        return CustomerIndActionButton;
    }

    @FindBy(xpath = "//a[@class='btn btn-primary buttons-collection buttons-colvis addbtn-table']//*[name()='svg']")
    private WebElement AddCustomerIndButton;

    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/button[1]")
    private WebElement CustomerIndActionButton;


    public WebElement getCustomerFirstName() {
        return CustomerFirstName;
    }

    public WebElement getCustomerSecondName() {
        return CustomerSecondName;
    }


    public WebElement getCustomerThirdName() {
        return CustomerThirdName;
    }

    public WebElement getCustomerLastName() {
        return CustomerLastName;
    }

    public WebElement getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public WebElement getCustomerNationality() {
        return CustomerNationality;
    }

    public WebElement getCancelCreateIndvButton() {
        return CancelCreateIndvButton;
    }

    public WebElement getConfirmationmessageyesforcancel() {
        return confirmationmessageyesforcancel;
    }


    public WebElement getConfirmationmessageNoforcancel() {
        return confirmationmessageNoforcancel;
    }


    @FindBy(xpath = "//input[@id='FIRST_NAME']")
    private WebElement CustomerFirstName;

    @FindBy(xpath = "//input[@id='SECOND_NAME']")
    private WebElement CustomerSecondName;

    @FindBy(xpath = "//input[@id='THIRD_NAME']")
    private WebElement CustomerThirdName;


    @FindBy(xpath = "//input[@id='LAST_NAME']")
    private WebElement CustomerLastName;


    @FindBy(xpath = "//input[@id='PHONE_NUMBER']")
    private WebElement CustomerPhoneNumber;

    @FindBy(xpath = "//span[@title='Jordan']")
    private WebElement CustomerNationality;


    public WebElement getNationalityNumber() {
        return NationalityNumber;
    }

    @FindBy(xpath = "//input[@id='ID_NUMBER']")
    private WebElement NationalityNumber;

    public WebElement getCreateButton() {
        return CreateIndvButton;
    }

    @FindBy(xpath = "//button[@id='submit-AddCustomerIndividual']")
    private WebElement CreateIndvButton;


    @FindBy(xpath = "//button[@id='cancel-AddCustomerIndividual']")
    private WebElement CancelCreateIndvButton;


    @FindBy(xpath = "//button[normalize-space()='Yes']")
    private WebElement confirmationmessageyesforcancel;


    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[6]/button[1]")
    private WebElement confirmationmessageNoforcancel;


    public void CustomerFirstName() {

        CustomerFirstName.click();
        CustomerFirstName.sendKeys("ahmadAutomation");
    }

    public void CustomerSecondName() {

        CustomerSecondName.click();
        CustomerSecondName.sendKeys("second");
    }


    public void CustomerThirdName() {

        CustomerThirdName.click();
        CustomerThirdName.sendKeys("ahmad");
    }

    public void CustomerLastName() {

        CustomerLastName.click();
        CustomerLastName.sendKeys("lastAutomationtest");
    }

    public void CustomerPhoneNumber() {

        CustomerPhoneNumber.click();
        CustomerPhoneNumber.sendKeys("+962" +getRandom() + "1367685");
    }


    public void CustomerNationality() {

        CustomerNationality.click();
        CustomerNationality.click();
    }

    public void NationalityNumber() {

        NationalityNumber.click();
        NationalityNumber.sendKeys("12514" + getRandom() + "78");
    }

    public void OpenAddCustomer() {

        AddCustomerIndButton.click();
    }

    public void CreateINDButton() {


//        if (CreateIndvButton.isDisplayed() && CreateIndvButton.isEnabled()) {
//
//            CreateIndvButton.click();
//        }

        CreateIndvButton.click();


    }

    public void CancelCreateInd() {
        if (CancelCreateIndvButton.isDisplayed() && CancelCreateIndvButton.isEnabled()) {

            CancelCreateIndvButton.click();
        }

    }


    public void ConfirmationMessageYes() {




        if (confirmationmessageyesforcancel.isDisplayed() && confirmationmessageyesforcancel.isEnabled()) {

            confirmationmessageyesforcancel.click();
        }


    }

    public void ConfirmationMessageNO() {
        if (confirmationmessageNoforcancel.isDisplayed() && confirmationmessageNoforcancel.isEnabled()) {

            confirmationmessageNoforcancel.click();
        }


    }
}


