package Corporate.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Corporate.Base;



    public class HomePage extends Base {




        @FindBy(xpath= "/html/body/div[1]/div[3]/div[4]/aside/div[1]/ul/li[2]/a/span")
        private WebElement AccountsList;
        @FindBy(xpath= "/html/body/div[1]/div[3]/div[4]/aside/div[1]/ul/li[2]/ul/li[1]/a")
        private WebElement AccountsLink;

        @FindBy(xpath= "//span[contains(text(),'History')]")
        private WebElement HistoryLink;

        @FindBy(xpath= "/html/body/div[1]/div[3]/div[4]/aside/div[1]/ul/li[2]/ul/li[2]/a")
        private WebElement LinkedAccountLink;
        @FindBy(xpath = "(//a[@class='side-menu__item search'])[3]")
        private WebElement ResourcesList;



        @FindBy(xpath= "/html[1]/body[1]/div[1]/div[3]/div[4]/aside[1]/div[1]/ul[1]/li[3]/a[1]")
        private WebElement TransferMoneyLink;

        @FindBy(xpath= "//span[contains(text(),'Request Money')]")
        private WebElement RequestMoneyLink;

        @FindBy(xpath= "//span[contains(text(),'Invoicing')]")
        private WebElement InvoicingLink;

        @FindBy(xpath= "//span[contains(text(),'Pay Bills')]")
        private WebElement PayBillsDropdown;

        @FindBy(xpath= "/html[1]/body[1]/div[1]/div[3]/div[4]/aside[1]/div[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]")
        private WebElement BeneficiariesListLink;

        @FindBy(xpath= "//span[contains(text(),'Bulk TRX')]")
        private WebElement BulkTRXLink;

        @FindBy(xpath= "//span[contains(text(),'Reports')]")
        private WebElement ReportsLink;



        public WebElement getAccountsList() {
            return AccountsList;
        }
        public WebElement getAccountsLink() {
            return AccountsLink;
        }

        public WebElement getHistoryLink() {
            return HistoryLink;
        }

        public WebElement getLinkedAccountLink() {
            return LinkedAccountLink;
        }

        public WebElement getTransferMoneyLink() {
            return TransferMoneyLink;
        }

        public WebElement getRequestMoneyLink() {
            return RequestMoneyLink;
        }

        public WebElement getInvoicingLink() {
            return InvoicingLink;
        }

        public WebElement getPayBillsDropdown() {
            return PayBillsDropdown;
        }

        public WebElement getBeneficiariesListLink() {
            return BeneficiariesListLink;
        }
        public WebElement getResourcesList() {
            return ResourcesList;
        }

        public WebElement getBulkTRXLink() {
            return BulkTRXLink;
        }

        public WebElement getReportsLink() {
            return ReportsLink;
        }







        public HomePage(WebDriver driver) {

            PageFactory.initElements(driver, this);
        }


        public void AccountsList( ) {

            AccountsList.click();
        }
        public void AccountsLink( ) {

            AccountsLink.click();
        }

        public void HistoryLink( ) {

            HistoryLink.click();
        }

        public void LinkedAccountLink( ) {

            LinkedAccountLink.click();
        }

        public void TransferMoneyLink( ) {

            TransferMoneyLink.click();
        }
        public void RequestMoneyLink( ) {

            RequestMoneyLink.click();
        }
        public void InvoicingLink( ) {

            InvoicingLink.click();
        }

        public void BeneficiariesListLink( ) {

            BeneficiariesListLink.click();
        }

        public void BulkTRXLink( ) {

            BulkTRXLink.click();
        }

        public void  ReportsLink( ) {

            ReportsLink.click();
        }
        public void  ResourcesList( ) {

            ResourcesList.click();
        }


        public void customerDropDown() {
        }

        public void CustomerIndividualLink() {
        }
    }


