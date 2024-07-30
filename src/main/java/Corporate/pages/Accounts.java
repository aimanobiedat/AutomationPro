package Corporate.pages;

import Corporate.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;


public class Accounts extends Base {

    public Accounts(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    public static Integer getRandom(){

        Random random = new Random();
        int y = random.nextInt(1000);
        return y;

    }

    //--------------------------------------Click on CORPORTE Card----------------------------------------//
    //Find the element
    @FindBy(xpath = "//*[@id=\"diagram\"]/div/div/div/div/div/div[1]/div[1]/section")
    private WebElement AddMainCorporateCard;

    //Get
    public WebElement getAddMainCorporateCard() {
        return AddMainCorporateCard;
    }
    //Actions

    public void AddMainCorporate() {


        AddMainCorporateCard.click();
    }



    //-------------------------------------- Action corporate card actions (Tree)----------------------------------------//
    //Find the element AccountName Feild
    @FindBy(xpath = "//*[@id=\"diagram\"]/div/div/div/div/div/div[1]/div[1]/section/div[2]/span")
    private WebElement CorporateCardActionsButton ;


    //Get
    public WebElement getCorporateCardActionsButton() {
        return CorporateCardActionsButton;
    }

    //Actions

    public void CorporateCardActionsButton() {

        AddMainCorporateCard.click();
       // Thread.sleep(1000);
        CorporateCardActionsButton.click();
    }


    //-------------------------------------- Fill all feilds----------------------------------------//
    //Find the element AccountName Feild
    @FindBy(xpath = "//*[@id=\"diagram\"]/div/div/div/div/div/div[1]/div[1]/section/div[2]/span")
    private WebElement CorporateCardActions ;


    //Get
    public WebElement getCorporateCardActions() {
        return CorporateCardActions;
    }

    //Actions

    public void CorporateCardActions() {


        CorporateCardActions.click();
    }












    //-------------------------------------- Click on add main corporate actions----------------------------------------//
    //Find the element AccountName Feild
    @FindBy(xpath = "/html/body/div[3]/ul/li[4]")
    private WebElement ClickOnAddMainCorporate ;


    //Get
    public WebElement getClickOnAddMainCorporate() {
        return ClickOnAddMainCorporate;
    }

    //Actions

    public void ClickOnAddMainCorporate() {


        ClickOnAddMainCorporate.click();
    }





    //-------------------------------------- AccountName ----------------------------------------//
    //Find the element Currency Feild
    //List

    @FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/section[1]/div[1]/div[2]" +
            "/input[1]")
    private WebElement AccountName;



    //Get


    public WebElement getAccountName() {
        return AccountName;
    }

    //Actions

    public void EnterAccountName(String EnterName) {



        AccountName.sendKeys(EnterName);
    }
    //Over loading if does not enter value execute the following metohd ..
    public void EnterAccountName() {
        AccountName.sendKeys("Auotomation Name");
    }




    //-------------------------------------- Chose Product----------------------------------------//
    //Find the element AccountName Feild
    //List
    @FindBy(xpath = "//*[@id=\"select2-ProductId-container\"]")
    private WebElement List ;

    //Item---------------
    @FindBy(xpath = "//*[@id=\"select2-ProductId-results\"]/li[1]")
    private WebElement ChoseProduct ;


    //Get


    public WebElement getList() {
        return List;
    }
    public WebElement getChoseProduct() {
        return ClickOnAddMainCorporate;
    }

    //Actions

    public void ChoseProduct() {


        List.click();
        ChoseProduct.click();
    }





    //-------------------------------------- Chose Currency----------------------------------------//
    //Find the element Currency Feild
    //List
    @FindBy(xpath = "//*[@id=\"select2-CurrencyId-container\"]")
    private WebElement CurrencyList ;

    //Item---------------
    @FindBy(xpath = "//body[1]/span[1]/span[1]/span[2]/ul[1]/li[2]")
    private WebElement ChoseCurrency ;


    //Get


    public WebElement getCurrencyList() {
        return CurrencyList;
    }
    public WebElement getChoseCurrency() {
        return ChoseCurrency;
    }

    //Actions

    public void ChoseCurrency ()throws InterruptedException {


        CurrencyList.click();
        Thread.sleep(1000);

        ChoseCurrency.click();
    }








    //-------------------------------------- Chose FeesProgram----------------------------------------//
    //Find the element Currency Feild
    //List
    @FindBy(xpath = "//*[@id=\"wizard1-p-0\"]/div[6]/div[2]/span")
    private WebElement FeesProgramList ;

    //Item---------------
    @FindBy(xpath = "//*[@id=\"select2-ProgramId-results\"]/li")
    private WebElement ChoseFeesProgram ;


    //Get


    public WebElement getFeesProgramList() {
        return FeesProgramList;
    }
    public WebElement getChoseFeesProgram() {
        return ChoseFeesProgram;
    }

    //Actions

    public void ChoseFeesProgram() {


        FeesProgramList.click();

        ChoseFeesProgram.click();
    }






    //-------------------------------------- NextButtonAccount  FeesProgram----------------------------------------//
    //Find the element Currency Feild
    //List
    @FindBy(xpath = "//*[@id=\"next\"]")
    private WebElement NextButtonAccount ;



    //Get


    public WebElement getNextButtonAccount() {
        return NextButtonAccount;
    }

    //Actions

    public void ClickNextButtonAccount() {



        NextButtonAccount.click();
    }





    //-------------------------------------- Based On Wallet Prdouct ----------------------------------------//
    //Find the element Currency Feild
    //List

    @FindBy(xpath = "//*[@id=\"BasedOnWalletPrdouct2\"]")
    private WebElement BasedOnWalletPrdouct;








    //Get


    public WebElement getBasedOnWalletPrdouct() {
        return BasedOnWalletPrdouct;
    }

    //Actions

    public void EnterBasedOnWalletPrdouct(String BasedOnWallet) {



        BasedOnWalletPrdouct.sendKeys(BasedOnWallet);
    }
    //Over loading if does not enter value execute the following metohd ..
    public void EnterBasedOnWalletPrdouct() {

        BasedOnWalletPrdouct.sendKeys("Automations Test");
    }








    //-------------------------------------- Finish ButtonAccount  FeesProgram----------------------------------------//
    //Find the element Currency Feild
    //List
    @FindBy(xpath = "//*[@id=\"finish\"]")
    private WebElement FinishButtonAccount ;



    //Get


    public WebElement getFinishtButtonAccount() {
        return FinishButtonAccount;
    }

    //Actions

    public void ClickFinishButtonAccount() {



        FinishButtonAccount.click();
    }


































//*[@id="select2-CurrencyId-result-aqqh-51"]

//*[@id="select2-ProductId-results"]/li[1]























   /* @FindBy(xpath= "//*[@id=\"diagram\"]/div/div/div/div/div/div[1]/div[1]/section/div[2]/span")
    private WebElement AccountListButton2;

    public WebElement getAccountListButton() {
        return AccountListButton2;
    }
    public void AccountListButtonC() {


        AccountListButton2.click();
    }




    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/button[1]")
    private WebElement CustomerIndActionButton;


    public WebElement getProfileIdField() {
        return ProfileIdField;
    }

    @FindBy(xpath = "//input[@id='CustomerNumber']")
    private WebElement ProfileIdField;

    public WebElement getGetProfileInfo() {
        return GetProfileInfo;
    }

    @FindBy(xpath = "//button[@id='btnGetCustomerInfo']")
    private WebElement GetProfileInfo;

    public WebElement getTypeDropDown() {
        return TypeDropDown;
    }

    @FindBy(css = "#select2-ProductId-container")
    private WebElement TypeDropDown;

    public WebElement getCloseLoopWallet() {
        return CloseLoopWallet;
    }

    @FindBy(xpath = "//li[normalize-space()='Close loop wallet']")
    private WebElement CloseLoopWallet;

    @FindBy(xpath = "//*[@id=\"select2-ProgramId-container\"]")
    private WebElement AssignedProgramDropDown;

    @FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
    private WebElement AssignedProgram;
//--------------------------------------ADD SUP CORPORTE----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html/body/div[3]/ul/li[4]")
    private WebElement AddMainCorporateButton;

    //Get
    public WebElement getAddMainCorporateButton() {
        return AddMainCorporateButton;
    }
    //Actions

    public void AddMainCorporate() {


        AddMainCorporateButton.click();
    }



    //-------------------------------------- Fill ADD SUP CORPORTE----------------------------------------//
    //Find the element AccountName Feild
    @FindBy(xpath = "//*[@id=\"nickName\"]")
    private WebElement AccountNameFeild;


    //Get
    public WebElement getAccountNameFeild() {
        return AccountNameFeild;
    }
    //Actions

    public void AccountNameFeild() {


        AccountNameFeild.sendKeys("Aoutomation");
    }

    //-----------Product List---
    @FindBy(xpath = "//*[@id=\"select2-ProductId-container\"]")
    Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"nickName\"]")));
    private WebElement DropdownProductList;


    //Get
    public WebElement getDropdownProductList() {
        return DropdownProductList;
    }
    //Actions

    public void SelectDropdownProductList() throws InterruptedException {
       // int index=0;
        DropdownProductList.click();
        Thread.sleep(2000);

        Select dropdown = new Select(DropdownProductList);
        DropdownProductList.click();
        Thread.sleep(2000);
        dropdown.selectByValue("Close loop wallet");
        DropdownProductList.click();

        // dropdown.selectByIndex(2);

        //WebElement  ( dropdown.selectByIndex(2));







    }


















    @FindBy(xpath = "//*[@id=\"Balance\"]")
    private WebElement BalanceField;

    @FindBy(css ="li > a#next")
    private WebElement NextButton;


    @FindBy(xpath = "//*[@id=\"Address\"]")
    private WebElement AddressField;

    @FindBy(css ="li > a#next")
    private WebElement SubmitKyc;


    //hamzeh




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

    @FindBy(xpath = "//*[@id=\"Based on Product 1-1\"]")
    private WebElement BasedOnProductField;


    @FindBy(xpath = "//a[@id='finish']")
    private WebElement FinishButton;


    public WebElement getActionButton() {
        return ActionButton;
    }

    @FindBy(xpath ="//tbody/tr[1]/td[9]/div[1]/button[1]")
    private WebElement ActionButton;

    public WebElement getCashInButton() {
        return CashInButton;
    }

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/ul[1]/li[2]/a[1]")
    private WebElement CashInButton;

    public WebElement getAccountDetails() {
        return AccountDetails;
    }

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement AccountDetails;


    public WebElement getAmountField() {
        return AmountField;
    }

    public WebElement getSubmitCashIn() {
        return SubmitCashIn;
    }

    @FindBy(xpath = "//input[@id='TransactionAmount']")
    private WebElement AmountField;

    @FindBy(xpath = "//button[@id='btnCashInOut']")
    private WebElement SubmitCashIn;

    public WebElement getConfirmCashInTRX() {
        return ConfirmCashInTRX;
    }

    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    private WebElement ConfirmCashInTRX;


    public WebElement getCashOutButton() {
        return CashOutButton;
    }

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/ul[1]/li[3]/a[1]")
    private WebElement CashOutButton;





















    /*public void AccountListButton( ) {


        AccountListButton.click();
    }

    public void ProfileIdField(){
        ProfileIdField.click();
        ProfileIdField.sendKeys("EB3D7150");
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
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", NextButton);



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
            FinishButton.click();
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

        AmountField.sendKeys("1");

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
    }*/
}


