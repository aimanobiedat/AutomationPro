package PSP.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenActionCustomerIND extends BasePage {
    public OpenActionCustomerIND(WebDriver driver) {
        super(driver);

    }



    public WebElement getAction() {

        return Action;
    }

    @FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/button[1]//*[name()='svg']")
    private WebElement Action;

    @FindBy(className= "select2-search__field")
    private WebElement SearchDropdown;
    public WebElement SearchDropdown() {

        return SearchDropdown;
    }
    public void OpenSearchDropDown(){

        SearchDropdown.click();
    }



    @FindBy(xpath = "//input[@id='nickName']")
    private WebElement AccountName;
    public WebElement getAccountName(){

        return AccountName;
    }

    public void OpenAccountName(){

        AccountName.sendKeys("Ayman");
        AccountName.sendKeys(Keys.PAGE_DOWN);
   }



//    public WebElement getAccountName() {
//
//        return AccountName;
//    }
//    private WebElement AccountName;
//    @FindBy(AccountName= "select2-ProductId-container")
//
//
//    public void OpenAccountName(){
//
//        AccountName.sendKeys("Ayman");
//    }





    @FindBy(id= "select2-ProductId-container")
    private WebElement product;
    public WebElement getProduct() {

        return product;
    }
    public void OpenProductDropDown(){
        product.click();

    }


    @FindBy(id= "select2-CurrencyId-container")
    private WebElement currency;
    public WebElement getCurrency() {

        return currency;
    }
    public void OpenCurrencyDropDown(){

        currency.click();
    }
    @FindBy(id= "select2-ProgramId-container")
    private WebElement FeesProgram;
    public WebElement getFeesProgram() {

        return FeesProgram;
    }
    public void OpenFeesProgramDropDown(){

        if(FeesProgram.isEnabled()&& FeesProgram.isDisplayed())

        FeesProgram.click();
    }
    @FindBy(id ="next")
    private WebElement NextButton;


    public WebElement getNextButton() {

        return NextButton;
    }
    public void OpenNextButton() {
        if (NextButton.isDisplayed() && NextButton.isEnabled()) {


       NextButton.click();
        }
    }
    @FindBy(id ="finish")
    private WebElement Finish;



    public WebElement getFinishButton() {

        return Finish;
    }
    public void FinishButton() {
        if (Finish.isDisplayed() && Finish.isEnabled()) {


            Finish.click();
        }
    }

    public void chooseCloosLoop() throws InterruptedException {

        SearchDropdown.sendKeys("Close loop wallet");
        Thread.sleep(2000);
        SearchDropdown.sendKeys(Keys.ENTER);

    }


    public void chooseJordanDinar() throws InterruptedException {

        SearchDropdown.sendKeys("Jordanian Dinar");
        Thread.sleep(2000);
        SearchDropdown.sendKeys(Keys.ENTER);

    }
    public void chooseprogram() throws InterruptedException {

        SearchDropdown.sendKeys("new fees");
        Thread.sleep(2000);
        SearchDropdown.sendKeys(Keys.ENTER);
    }


    public void Action() {

 Action.click();
    }


    public WebElement getCustomerIndDetails() {

        return CustomerIndDetails;
    }

    @FindBy(linkText = "Customer Details")
    private WebElement CustomerIndDetails;


    public void CustomerIndividualDetails() {

        CustomerIndDetails.click();
    }


    public WebElement BlockCustomerInd() {

        return BlockCustomer;
    }

    @FindBy(xpath = "//ul[@class='dropdown-menu show']//a[@id='block']")
    private WebElement BlockCustomer;


    public void BLockCustomerIndividual() {

        BlockCustomer.click();
    }

    public WebElement getConfirmationmessageYes() {

        return Confirmationmessage;
    }

    @FindBy(css = ("body.ltr.main-body.app.sidebar-mini.swal2-shown.swal2-height-auto:nth-child(2) div.swal2-container.swal2-center.swal2-backdrop-show div.swal2-popup.swal2-modal.swal2-icon-warning.swal2-show div.swal2-actions > button.swal2-confirm.swal2-styled.swal2-default-outline"))
    private WebElement Confirmationmessage;


    public void ConirmationMessageYes() {

        Confirmationmessage.click();
    }

    public WebElement getChangeHistoryCustomerIND() {

        return ChangeHistoryCustomer;
    }

   @FindBy(xpath = "//ul[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Changes History']")
    private WebElement ChangeHistoryCustomer;


    public void ChangeHistoryCustomerIndividual() {

        ChangeHistoryCustomer.click();
    }


    public WebElement getOpenAccountIndiviual() {

        return OpenAccountInd;
    }

    @FindBy(linkText = "Open Account")
    private WebElement OpenAccountInd;


    public void OpenAccountForCustomerInd() {

        OpenAccountInd.click();
    }

    }


