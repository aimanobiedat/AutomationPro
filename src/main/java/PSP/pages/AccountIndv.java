package PSP.pages;

import PSP.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;


public class AccountIndv extends BasePage {

    public AccountIndv(WebDriver driver) {
        super(driver);
    }


    @FindBy(css= ".btn.btn-primary.buttons-collection.buttons-colvis.addbtn-table")
    private WebElement AddAccountIndButton;

    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/button[1]")
    private WebElement CustomerIndActionButton;


    @FindBy(xpath = "//input[@id='CustomerNumber']")
    private WebElement ProfileIdField;



    @FindBy(css = "#select2-CurrencyId-container")
    private WebElement CurrencyDropDown;


    @FindBy(xpath = "//button[@id='btnGetCustomerInfo']")
    private WebElement GetProfileInfo;



    @FindBy(css = "#select2-ProductId-container")
    private WebElement TypeDropDown;


    @FindBy(xpath = "(//li[@id='select2-ProductId-result-1ei8-1'])[1]")
    private WebElement CloseLoopWallet;

    @FindBy(xpath = "//*[@id=\"select2-ProgramId-container\"]")
    private WebElement AssignedProgramDropDown;

    @FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
    private WebElement AssignedProgram;
    @FindBy(css = "body.ltr.main-body.app.sidebar-mini.sidebar-gone:nth-child(2) span.select2-container.select2-container--default.select2-container--open span.select2-dropdown.select2-dropdown--below span.select2-search.select2-search--dropdown > input.select2-search__field")
    private WebElement searchDropDown;


    @FindBy(xpath = "//*[@id=\"Balance\"]")
    private WebElement BalanceField;

    @FindBy(css ="li > a#next")
    private WebElement NextButton;

    @FindBy(xpath = "//*[@id=\"Address\"]")
    private WebElement AddressField;

    @FindBy(css ="li > a#next")
    private WebElement SubmitKyc;

    @FindBy(xpath = "//*[@id=\"Based on Product 1-1\"]")
    private WebElement BasedOnProductField;

    @FindBy(xpath = "//a[@id='finish']")
    private WebElement FinishButton;

    @FindBy(xpath ="//tbody/tr[1]/td[10]/div[1]/button[1]")
    private WebElement ActionButton;

    @FindBy(xpath = "//a[@class='dropdown-item modal-effect'][normalize-space()='Cash In']")
    private WebElement CashInButton;

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement AccountDetails;

    @FindBy(xpath = "//input[@id='TransactionAmount']")
    private WebElement AmountField;

    @FindBy(xpath = "//button[@id='btnCashInOut']")
    private WebElement SubmitCashIn;

    @FindBy(xpath = "//span[@class='clsFinalConfirm_']")
    private WebElement ConfirmCashInTRX;

    @FindBy(xpath = "//ul[@class='dropdown-menu show']//a[@class='dropdown-item modal-effect'][normalize-space()='Cash Out']")
    private WebElement CashOutButton;



    public WebElement getGetProfileInfo() {
        return GetProfileInfo;
    }



    public WebElement getSearchDropDown() {
        return searchDropDown;
    }
    public WebElement getTypeDropDown() {
        return TypeDropDown;
    }
    public WebElement getCloseLoopWallet() {
        return CloseLoopWallet;
    }

    public WebElement getProfileIdField() {
        return ProfileIdField;
    }

    public WebElement getAddAccountIndButton() {
        return AddAccountIndButton;
    }

    public WebElement getCustomerIndActionButton() {
        return CustomerIndActionButton;
    }

    public WebElement getAssignedProgramDropDown() {
        return AssignedProgramDropDown;
    }

    public WebElement getAssignedProgram() {
        return AssignedProgram;
    }

    public WebElement getBalanceField() {
        return BalanceField;
    }

    public WebElement getNextButton() {
        return NextButton;
    }

    public void setAddressField(WebElement addressField) {
        AddressField = addressField;
    }

    public void setSubmitKyc(WebElement submitKyc) {
        SubmitKyc = submitKyc;
    }

    public WebElement getBasedOnProductField() {
        return BasedOnProductField;
    }

    public WebElement getFinishButton() {
        return FinishButton;
    }

    public WebElement getActionButton() {
        return ActionButton;
    }

    public WebElement getCashInButton() {
        return CashInButton;
    }

    public WebElement getAccountDetails() {
        return AccountDetails;
    }

    public WebElement getAmountField() {
        return AmountField;
    }

    public WebElement getSubmitCashIn() {
        return SubmitCashIn;
    }

    public WebElement getConfirmCashInTRX() {
        return ConfirmCashInTRX;
    }

    public WebElement getCashOutButton() {
        return CashOutButton;
    }



    public WebElement getCurrencyDropDown() {
        return CurrencyDropDown;
    }



    public void AddAccountIndButton( ) {


        AddAccountIndButton.click();
    }

    public void ProfileIdField(){
        ProfileIdField.click();
        ProfileIdField.sendKeys("02231JO9961034222");
    }

    public void GetProfileInfo(){
        GetProfileInfo.click();
    }

    public void TypeDropDown(){
        TypeDropDown.click();



    }

    public void CloseLoopWallet(){
        CloseLoopWallet.click();
    }

    public void AssignedProgramDropDown(){
        AssignedProgramDropDown.click();
    }

    public void AssignedProgram(){
        AssignedProgram.click();
    }

    public void BalanceField(){
        BalanceField.sendKeys("100");
    }

    public void NextButton() {

        //if (NextButton.isDisplayed() && NextButton.isEnabled()) {
        //    NextButton.click();
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", NextButton);



    }
    public void AddressField(){

        AddressField.sendKeys("Amman");
    }

    public void SubmitKyc() {

        if (SubmitKyc.isDisplayed() && SubmitKyc.isEnabled()) {


            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", SubmitKyc);
        }

    }

    public void BasedOnProductField(){

        BasedOnProductField.sendKeys("Based on Product");
    }

    public void FinishButton() {

        /*if (FinishButton.isDisplayed() && FinishButton.isEnabled()) {
            FinishButton.click();*/
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", FinishButton);



    }

    public void ActionButton(){

        ActionButton.click();
    }

    public void CashInButton(){

        CashInButton.click();
    }

    public void AmountField(){
        AmountField.click();

        AmountField.sendKeys("100");

    }

    public void SubmitCashIn(){
        SubmitCashIn.click();
    }
    public void ConfirmCashInTRX (){
      ConfirmCashInTRX.click();
    }

    public void CashOutButton(){

        CashOutButton.click();
    }

    public void AccountDetails(){

        AccountDetails.click();
    }
    public void OpenCurrencyDropDown(){

        CurrencyDropDown.click();
    }


    public void OpenSearchDropDown(){

        searchDropDown.click();
    }





}


