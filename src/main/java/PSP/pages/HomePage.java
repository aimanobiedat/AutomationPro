package PSP.pages;
import PSP.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCustomerDropDown() {

            return CustomerDropDown;
        }

        public void setCustomerDropDown(WebElement customerDropDown) {
            CustomerDropDown = customerDropDown;
        }

        public WebElement getInternalAccount() {
            return InternalAccount;
        }

        @FindBy(xpath= "//span[contains(text(),'Internal Accounts')]")
        private WebElement InternalAccount;


    public WebElement getTransactions() {
        return TransactionsLink;
    }

        @FindBy(xpath= "//span[contains(text(),'Transactions')]")
        private WebElement TransactionsLink;

        @FindBy(xpath = "(//span[normalize-space()='Customers'])[1]")
        private WebElement CustomerDropDown;

        public WebElement getIndividualLink() {
            return CustomerIndividualLink;
        }

        @FindBy(xpath = "//a[@href='/Customer/Individual']")
        private WebElement CustomerIndividualLink;

        public WebElement getCustomerIndividualLink() {
            return CustomerIndividualLink;
        }

        public WebElement getCorporateLink() {
            return CustomerCorporateLink;
        }

        public WebElement getAccountsDropdown() {
            return AccountsDropdown;
        }

        public WebElement getAccountIndividuaLink() {
            return AccountIndividuaLink;
        }

        public WebElement getAccountCorpLink() {
            return AccountCorpLink;
        }

        public WebElement getBusinessConfigDropDown() {
            return BusinessConfigDropDown;
        }

        public WebElement getProfileClassificationLink() {
            return ProfileClassificationLink;
        }

        public WebElement getFeesProgram() {
            return FeesProgram;
        }

        public WebElement getCustomerCorporateLink() {
            return CustomerCorporateLink;
        }

        @FindBy(xpath = "//body/div[1]/div[3]/div[4]/aside[1]/div[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]")
        private WebElement CustomerCorporateLink;


        @FindBy (css = "body.ltr.main-body.app.sidebar-mini.is-expanded:nth-child(2) div.horizontalMenucontainer " +
                "div.page:nth-child(4) div.sticky.is-expanded:nth-child(4) aside.app-sidebar.sidebar-scroll.ps.open " +
                "div.main-sidemenu.is-expanded ul.side-menu.open li.slide.Account:nth-child(4) > a.side-menu__item")
        private WebElement AccountsDropdown;

        @FindBy (css = "a[href='/Account/Individual']")
        private WebElement AccountIndividuaLink;

        @FindBy (css = "a[href='/Account/Corporate']")
        private WebElement AccountCorpLink;


        @FindBy (xpath = "//span[normalize-space()='Business Configurations']")
        private WebElement BusinessConfigDropDown;

        @FindBy(xpath = "//a[normalize-space()='Profile Classifications']")
        private WebElement ProfileClassificationLink;

    @FindBy(xpath = "//a[normalize-space()='Fees Program']")
        private WebElement FeesProgram;

    public WebElement getBulkManagmentDropDown() {
        return BulkManagmentDropDown;
    }

    @FindBy(xpath = "//span[contains(text(),'Bulk Management')]")
        private WebElement BulkManagmentDropDown;

    public WebElement getBillersDropDown() {
        return BillersDropDown;
    }

    public WebElement getAgentsLink() {
        return AgentsLink;
    }

    public WebElement getAccountingDropDown() {
        return AccountingDropDown;
    }

    public WebElement getReportsLink() {
        return ReportsLink;
    }

    @FindBy(xpath = "//span[contains(text(),'Billers')]")
    private WebElement BillersDropDown;


    @FindBy(xpath = "//span[contains(text(),'Agents')]")
    private WebElement AgentsLink;

    @FindBy(xpath = "//span[contains(text(),'Accounting')]")
    private WebElement AccountingDropDown;

    @FindBy(xpath = "//span[contains(text(),'Reports')]")
    private WebElement ReportsLink;

    public WebElement getNotificationsLink() {
        return NotificationsLink;
    }

    public WebElement getAnnouncementLink() {
        return AnnouncementLink;
    }

    @FindBy(xpath = "//span[contains(text(),'Notifications')]")
    private WebElement NotificationsLink;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/aside/div[1]/ul/li[13]/a")
    private WebElement AnnouncementLink;









//        public HomePage(WebDriver driver) {
//
//            PageFactory.initElements(driver, this);
//        }


        public void customerDropDown( ) {

            CustomerDropDown.click();
        }

    public void  BulkManagmentDropDown( ) {

       BulkManagmentDropDown.click();
    }

        public void AccountsDropdown( ) {

            AccountsDropdown.click();
        }

        public void CustomerIndividualLink( ) {

            CustomerIndividualLink.click();
        }

    public void TransactionsLink( ) {

       TransactionsLink.click();
    }
    public void ProfileClassificationLink( ) {

        ProfileClassificationLink.click();
    }


        public void customerCorporateLink( ) {

            CustomerCorporateLink.click();
        }


        public void internalAccount() {

            InternalAccount.click();
        }


        public void accountIndividualLink( ) {
           AccountIndividuaLink.click();
        }

        public void AccountCorpLink( ) {

            AccountCorpLink .click();
        }

        public void buisnessConfigDropDown(){

            BusinessConfigDropDown.click();
        }
        public void setFeesProgram( ) {

            FeesProgram .click();
        }

        public void BillersDropDown(){
            BillersDropDown.click();
        }

    public void AgentsLink(){
        AgentsLink.click();
    }

    public void AccountingDropDown(){
        AccountingDropDown.click();
    }

    public void ReportsLink(){

            ReportsLink.click();
    }


    public void NotificationsLink(){

        NotificationsLink.click();
    }

    public void AnnouncementLink(){

        AnnouncementLink.click();
    }








    }


