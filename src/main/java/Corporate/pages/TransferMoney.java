package Corporate.pages;

import Corporate.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class TransferMoney extends Base {




    public TransferMoney(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    public static Integer getRandom(){

        Random random = new Random();
        int y = random.nextInt(1000);
        return y;

    }



    //--------------------------------------Click on TransferMoneyPage----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/aside[1]/div[1]/ul[1]/li[3]/a[1]")
    private WebElement MoneyServices;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[4]/aside[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
    private WebElement TransferMoneyPage;

    //Get
    public WebElement getMoneyServices() {
        return MoneyServices;
    }
    public WebElement getTransferMoneyPage() {
        return TransferMoneyPage;
    }



    //-----------------------Actions ------------------------------

    public void TransferMoneyPage() throws InterruptedException {


        MoneyServices.click();
        Thread.sleep(1000);

        TransferMoneyPage.click();
    }









    //--------------------------------------Click on FromAccount List ----------------------------------------//
    //Find the element List
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/span[1]/span[1]/span[1]/span[1]")
    private WebElement FromAccountList;
    //Find the element Search
    @FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")
    private WebElement FromAccountSearch;

    //Get
    public WebElement getFromAccountList() {
        return FromAccountList;
    }

    public WebElement getFromAccountSearch() {
        return FromAccountSearch;
    }



    //----------------------------ACTIONS----------------------------

    public void FromAccountList(String FromAccount) throws InterruptedException {


       // MoneyServices.click();
        FromAccountList.click();
        Thread.sleep(1000);
        FromAccountSearch.sendKeys(FromAccount);
        Thread.sleep(1000);

        FromAccountSearch.sendKeys(Keys.ENTER);

    }



    //--------------------------------------Click on ToAccountList ----------------------------------------//
    //Find the element List
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/span[1]")
    private WebElement ToAccountList;
    //Find the element Search
    @FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")
    private WebElement ToAccountListSearch;

    //Get
    public WebElement getToAccountList() {
        return ToAccountList;
    }

    public WebElement getToAccountListSearch() {
        return ToAccountListSearch;
    }



    //------------------------------ ACTIONS ------------------------

    public void ToAccountList(String ToAccount) throws InterruptedException {


        // MoneyServices.click();
        ToAccountList.click();
        Thread.sleep(1000);
        ToAccountListSearch.sendKeys("0210740069573883");
        Thread.sleep(1000);

        ToAccountListSearch.sendKeys(Keys.ENTER);

    }










    //--------------------------------------Click on AmountField----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")
    private WebElement AmountField;

    //Get
    public WebElement getAmountField() {
        return AmountField;
    }



    //------------------------------------------------------------

    public void AmountField(String amount) {


        AmountField.sendKeys(amount);
    }
    public void AmountField() {


        AmountField.sendKeys("10");
    }





    //--------------------------------------Click on NoteField----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[2]/input[1]")
    private WebElement NoteField;

    //Get
    public WebElement getNoteField() {
        return NoteField;
    }



    //------------------------------------------------------------

    public void NoteField(String note) {


        NoteField.sendKeys(note);
    }
    public void NoteField() {


        NoteField.sendKeys("Test Note");
    }





    //--------------------------------------Click on Transfer Button----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/button[1]")
    private WebElement TransferButton;

    //Get
    public WebElement getTransferButton() {
        return TransferButton;
    }



    //------------------------------------------------------------

    public void TransferButton() {


        TransferButton.click();
    }




    //--------------------------------------ConnfirmTransferMoneyPopup----------------------------------------//
    //Find the element
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[9]/button[2]")
    private WebElement ConnfirmTransferMoneyPopup;

    //Get
    public WebElement getConnfirmTransferMoneyPopup() {
        return ConnfirmTransferMoneyPopup;
    }



    //------------------------------------------------------------

    public void ConnfirmTransferMoneyPopup() {


        ConnfirmTransferMoneyPopup.click();
    }



}




